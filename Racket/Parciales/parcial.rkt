(define tabla '(("Pablo" ((POO . 75) (FUNCIONAL . 66) (LOGICO . 89)) () )
               ("Federico" ((POO . 75)(FUNCIONAL . 90)(LOGICO . 45)) ((LOGICO . 60)) )
               ("Franco" ((POO . 50)(FUNCIONAL)(LOGICO . 89)) ((POO . 40)) )
               ("Gabriel" ((POO . 35)(FUNCIONAL)(LOGICO)) () )
               ))

(define concatenar ( lambda (l1 l2)
                      (if (empty? l1 )
                          l2
                          (cons (car l1) (concatenar (cdr l1) l2))
                          )))
;test: (concatenar '(1 2 3) '(4 5 6))

(define aplanar ( lambda ( ls )
                   (if (empty? ls)
                       ls
                       (let ((fst (car ls)) (rst (cdr ls)))
                         (if (list? fst)
                             (concatenar (aplanar fst) (aplanar rst))
                             (concatenar (cons fst '()) (aplanar rst))
                             )))))
;test: (aplanar '(0 (1 2 3) ( (4 5 6)) ((((7 8 (9)) 10))) 11))

(define promedio( lambda (lista) ;wrapper
                   (if ( empty? lista )
                       0
                       (promedio-aux lista 0 0)
                       )))

(define promedio-aux( lambda ( lista acum div )
                       (if (empty? lista)
                           (/ acum div)
                           (promedio-aux (cdr lista) (+ acum (car lista)) (+ div 1)))
                           ))
;test: (promedio '( 5 5 6 7 5 5))

(define mayorQue(lambda(lista elem)
                  (if(empty? lista)
                     #t
                     (let ((prm (car lista)) (rst (cdr lista)))
                       (if (< prm elem)
                           #f
                           (mayorQue rst elem)
                           )))))
;test (menorQue '( 4 3 4 4) '4 ) 
                  
(define regulariza(lambda ( lista )
                    (let((prom (promedio lista)))
                      (if (mayorQue lista 39) ;39 porque con 40 está bien
                          (if (> prom 49) ;49 porque con 50 de prom se regulariza
                              #t
                              #f)
                          #f)
                      )))

;test (regulariza '( 40 40 50 40))
(define filtrarLista(lambda (lista)
                      (if (empty? lista)
                          '()
                          (filtrarLista-aux lista )
                          )))

(define filtrarLista-aux(lambda (lista )
                      (if (empty? lista)
                          lista
                          (if (empty? (cdr lista))
                              (cons (cdr (car lista)) '())
                              (let ((prm (car lista)) (rst (cdr lista)))
                                (if (pair? prm)
                                    (cons (cdr prm) (filtrarLista rst))
                                    '()
                                    ))))))

;test (filtrarLista '((POO . 75) (FUNCIONAL . 66) (LOGICO . 89)))

(define checkearCondicion-aux( lambda ( nombre notas )
                                (let (( susNotas (filtrarLista notas)))
                                  (if (regulariza susNotas)
                                      (if (> (promedio susNotas) 70)
                                          'PROMOCIONA
                                          'REGULARIZA)
                                      'LIBRE)
                                  )))

;test (checkearCondicion-aux "Pablo" '((POO . 75) (FUNCIONAL . 66) (LOGICO . 89))

(define checkearCondicion( lambda ( tabla )
                            (let ((lista (aplanar tabla)))
                              (let((fst (car lista))(rst (cdr lista)))
                                (if (pair? fst)
                                    (checkearCondicion rst)
                                    (concatenar (cons fst '())
                                                ( cons (checkearCondicion-aux rst) (checkearCondicion rst)) 
                                    ))))))
;test (checkearCondicion tabla)
#|
(aplanar tabla)|#