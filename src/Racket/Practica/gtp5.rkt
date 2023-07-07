;ejercicio 1

(define mreverse( lambda ( list )
                   (if (empty? list)
                       list
                       (mreverse-aux list '())
                       )))

(define mreverse-aux( lambda ( list rlist)
                       (if (empty? list)
                           rlist
                           (let ((fst (car list)) (rst (cdr list)))
                             (mreverse-aux rst (cons fst rlist))
                             ))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(define concatenar(lambda (l1 l2)
                        (if (empty? l1)
                        l2
                        (cons (car l1) (concatenar (cdr l1) l2))
                        )))
                                            
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(define concatenar-reverse(lambda (l1 l2)
                                 (concatenar-reverse-aux (mreverse l1) (mreverse l2))))

(define concatenar-reverse-aux(lambda ( l1 l2)
                               (if (empty? l1)
                                   l2
                                   (concatenar-reverse-aux (cdr l1) (cons (car l1 ) l2 ))
                                   )))
                            
;Ejercicio 2

(define pertenece ( lambda ( elem l1 )
                    (if (empty? l1)
                        #f
                        (if (equal? elem (car l1))
                            #t
                            (pertenece elem (cdr l1))
                            ))))

(define doblePertenece ( lambda (elem l1 l2)
                          (if (and (pertenece elem l1) (pertenece elem l2))
                              #t
                              #f
                              )))
;Ejercicio 3

(define cant-der( lambda (elem l1)
                   (if (empty? l1)
                       0
                       (if (equal? elem (car l1))
                           (contar (cdr l1))
                           (cant-der elem (cdr l1))
                           ))))

(define contar( lambda (l1)
                 (if (empty? l1)
                     0
                     (contar-aux l1 0)
                     )))

(define contar-aux (lambda ( l1 count)
                     (if ( empty? l1)
                         count
                         (contar-aux (cdr l1) (+ count 1))
                         )))

(define cant-izq(lambda( elem l1)
                  (if (empty? l1)
                       0
                       (cant-izq-aux elem l1 0)
                       )))

(define cant-izq-aux(lambda ( elem l1 count)
                      (if (empty? l1)
                          0
                          (if (equal? elem (car l1))
                              count
                              (cant-izq-aux elem (cdr l1) (+ count 1))
                              ))))
                  
;Ejercicio 4

(define add-if( lambda( elem list)
                 (if(isPresent elem list)
                    list
                    (cons elem list)
                    )))

(define isPresent(lambda (elem list)
                   (if (empty? list)
                       #f
                       (if (equal? elem (car list))
                           #t
                           (isPresent elem (cdr list))
                           ))))

;Ejercicio 6

(define get-profundidad( lambda ( list )
                          (if (empty? list)
                              0
                              (get-profundidad-aux list 0)
                              )))

(define get-profundidad-aux(lambda (list count)
                           (if (empty? list)
                               count
                               (let ((fst (car list)) (rst (cdr list)))
                                 (if (list? fst)
                                     (let ((fprof (get-profundidad-aux fst (+ count 1)))
                                           (nprof (get-profundidad-aux rst count)))
                                           (if (< fprof nprof)
                                               nprof
                                               fprof ))
                                     (get-profundidad-aux rst count)
                                     )))))

;Ejercicio 7

(define aplanar ( lambda ( ls )
                   (if (empty? ls)
                       ls
                       (let ((fst (car ls)) (rst (cdr ls)))
                         (if (list? fst)
                             (concatenar (aplanar fst) (aplanar rst))
                             (concatenar (cons fst '()) (aplanar rst))
                             )))))

;Ejercicio 8

(define getLast(lambda (list)
                 (if (empty? list)
                     list
                     (getLast-aux list 0)
                     )))


(define getLast-aux(lambda (list last)
                     (if (empty? list)
                         last
                         (getLast-aux (cdr list) (car list))
                         )))

(define rotar(lambda (dir list)
                         (if (equal? dir 'der)
                             (cons (getLast list) (mreverse (cdr (mreverse list))))
                             (if (equal? dir 'izq)
                                 (concatenar (cdr list) (cons (car list) '()))
                                 list
                                 ))))

;Ejercicio 9

(define calcula-cuadrados( lambda (l1)
                            (if(empty? l1)
                               0
                               (calcula-cuadrados-aux l1 '())
                               )))

(define calcula-cuadrados-aux(lambda(l1 rtn)
                               (if (empty? l1)
                                   (mreverse rtn)
                                   (calcula-cuadrados-aux (cdr l1) (cons (* (car l1) (car l1)) rtn))
                                   )))
                                   
                             
;Ejercicio 10
                                         
(define resta-lista(lambda (l1 l2)
                     (if (empty? l2)
                         l1
                         (if (empty? l1)
                             l1
                             (resta-lista-aux l1 l2 '())
                             ))))

(define resta-lista-aux(lambda (l1 l2 rtrn)
                         (if (empty? l1)
                             (mreverse rtrn)
                             (let ((fst (car l1))(rst (cdr l1)))
                               (if (isPresent fst l2)
                                   (resta-lista-aux rst l2 rtrn)
                                   (resta-lista-aux rst l2 (cons fst rtrn))
                                   )))))
;Ejercicio 11

(define suma-lista(lambda (l1 l2)
                     (if (empty? l2)
                         l1
                         (if (empty? l1)
                             l1
                             (suma-lista-aux l1 l2)
                             ))))

(define suma-lista-aux(lambda (l1 l2)
                        (if(empty? l1)
                           l2
                           (if (isPresent (car l1) l2)
                               (suma-lista-aux (cdr l1) l2)
                               (suma-lista-aux (cdr l1) (cons (car l1) l2))
                               ))))

