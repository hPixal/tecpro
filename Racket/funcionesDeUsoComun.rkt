;GENERAL PORPUSE FUNCTIONS
;Author: Nahuel Julián Gareis
;
;University: Universidad Nacional del Litoral
;College: Facultad de Ingeniería y Ciencias Hídricas

;Concatenar

(define concatenar ( lambda (l1 l2)
                      (if (empty? l1 )
                          l2
                          (cons (car l1) (concatenar (cdr l1) l2))
                          )))

;test: (concatenar '(1 2 3) '(4 5 6))

;Reversa

(define reversa (lambda (l1)
                  (if (empty? l1)
                      l1
                      (concatenar (reversa (cdr l1)) (list (car l1))) ;REQUIERE CONCATENAR
                      )))

(define reversa (lambda (l1)
                  (if (empty? l1)
                      l1
                      (reversa-aux l1 '())
                      )))


(define reversa-aux (lambda (l1 rtn)
                      (if (empty? l1)
                          rtn
                          (reversa-aux (cdr l1) (cons (car l1) rtn))
                          )))

;test: (reversa '(1 2 3 4))

;Remover Elemento

(define removerElemento(lambda (elem l1)
                         (if (empty? l1)
                             l1
                             (removerElemento-aux elem l1 '())
                             )))

(define removerElemento-aux(lambda (elem l1 rtn)
                             (if (empty? l1)
                                 (reversa rtn) ;REQUIERE REVERSA, SI NO IMPORTA EL ORDEN NO USAR REVERSA
                                 (if (equal? elem (car l1))
                                     (removerElemento-aux elem (cdr l1) rtn)
                                     (removerElemento-aux elem (cdr l1) (cons (car l1) rtn))
                                     ))))

;test: (removerElemento 3 '(1 3 2 3 4)) 

;Profundidad de un arbol

(define profundidad( lambda ( list )
                          (if (empty? list)
                              0
                              (profundidad-aux list 0)
                              )))

(define profundidad-aux(lambda (list count)
                           (if (empty? list)
                               count
                               (let ((fst (car list)) (rst (cdr list)))
                                 (if (list? fst)
                                     (let ((fprof (profundidad-aux fst (+ count 1)))
                                           (nprof (profundidad-aux rst count)))
                                           (if (< fprof nprof)
                                               nprof
                                               fprof ))
                                     (profundidad-aux rst count)
                                     )))))

;test : (profundidad '(1 ( 2 3 ) 4 ( 5 ( 6 ( 7 () ) ) ) ) )

;Obtener elemento

(define obtenerElemento (lambda (l1 it)
                           (if (empty? l1)
                               l1
                               (let((i (sqrt (* it it))))
                                 (if (equal? i 1)
                                   (car l1)
                                   (obtenerElemento (cdr l1) (- i 1))
                                   )))))

;test: (obtenerElemento '( 1 2 3 4 5 6 ) '3)

;Esta presente

(define estaPresente(lambda (elem l1)
                   (if (empty? l1)
                       #f
                       (if (equal? elem (car l1))
                           #t
                           (estaPresente elem (cdr l1))
                           ))))

;test: (estaPresente '3 '( 1 2 3 4 ) )

;Reversa Recursiva

(define rReversa(lambda ( l1 )
                      (if (empty? l1)
                          l1
                          (rReversa-aux l1 '())
                          )))

(define rReversa-aux(lambda (list nlist)
                 (if (empty? list)
                     nlist
                     (let ((fst (car list)) (rst (cdr list)))
                       (if (list? fst)
                           (rReversa-aux rst (cons (rReversa-aux fst '()) nlist))
                           (rReversa-aux rst (cons fst nlist))
                           )))))

;test: (rReversa '( 1 ( 2 3 ) (4 ( 5 ( 6 ) ) 7 ( 8 9 ) ) ) )

;Largo de una lista

(define largo(lambda (list)
               (if (empty? list)
                   0
                   (largo-aux list 0)
                   )))

(define largo-aux(lambda(list aux)
                (if (empty? list)
                    aux
                    (largo-aux (cdr list) (+ aux 1))
                    )))

;test: (largo '( 1 2 3 4)) 

;Aplanar

(define aplanar ( lambda ( ls )
                   (if (empty? ls)
                       ls
                       (let ((fst (car ls)) (rst (cdr ls)))
                         (if (list? fst)
                             (concatenar (aplanar fst) (aplanar rst))
                             (concatenar (cons fst '()) (aplanar rst))
                             )))))

;test: (aplanar '(0 (1 2 3) ( (4 5 6)) ((((7 8 (9)) 10))) 11))

;Obtener ultimo elemento

(define obtenerUltimo(lambda (list)
                 (if (empty? list)
                     list
                     (obtenerUltimo-aux list 0)
                     )))


(define obtenerUltimo-aux(lambda (list last)
                     (if (empty? list)
                         last
                         (obtenerUltimo-aux (cdr list) (car list))
                         )))


;test: (obtenerUltimo '( 1 2 3 4 ))

;Rotado de barril (Barrel-shift)

(define rotar(lambda (dir list) ;DIR TIENE QUE SER 'IZQ O 'DER
                         (if (equal? dir 'der)
                             (cons (car (reversa list)) (reversa (cdr (reversa list)))) ;REQUIERE REVERSA
                             (if (equal? dir 'izq)
                                 (concatenar (cdr list) (cons (car list) '()))
                                 list
                                 ))))

;test: (rotar 'izq '(1 2 3 4))
;test2: (rotar 'der '(1 2 3 4))

;Obtener mayor valor

(define obtenerMayor(lambda (list)
                      (if (empty? list)
                          list
                          (obtenerMayor-aux list (car list))
                          )))

(define obtenerMayor-aux(lambda(list cmax)
                           (if (empty? list)
                               cmax
                               (let ((fst (car list)) (rst (cdr list)))
                                 (if (> fst cmax)
                                     (obtenerMayor-aux (cdr list) fst)
                                     (obtenerMayor-aux (cdr list) cmax)
                                     )))))

;test: (obtenerMayor '( 1 2 3 4 5 6 4 3 2 1))

;Obtener menor
(define obtenerMenor(lambda (list)
                      (if (empty? list)
                          list
                          (obtenerMenor-aux list (car list))
                          )))

(define obtenerMenor-aux(lambda(list cmax)
                           (if (empty? list)
                               cmax
                               (let ((fst (car list)) (rst (cdr list)))
                                 (if (< fst cmax)
                                     (obtenerMenor-aux (cdr list) fst)
                                     (obtenerMenor-aux (cdr list) cmax)
                                     )))))

;test: (obtenerMenor '( 1 2 3 4 5 6 4 3 2 1))

(define anadirAlFinal( lambda ( elem list )
                        (if (empty? list)
                            (cons elem list)
                            (concatenar list (cons elem '()))
                            )))
;test: (anadirAlFinal 1 '( 1 2 3 4 ))

;Peso de una palabra

(define pesoPalabra(lambda (palabra)
                  (if (null? palabra)
                      0
                      (+ (char->integer (car palabra)) (pesoPalabra (cdr palabra)))
                      )))

;Ordena


                   
                   

;OPERACIONES 2D

(define-struct pos2D ( x y ))
(define t1 (make-pos2D 2 4))
(define t2 (make-pos2D 4 5))

;test: (define t1 (make-pos2D 2 4))
;      (define t2 (make-pos2D 4 5))

(define mostrar( lambda ( pos )
                  (display (pos2D-x pos))
                  (display " ")
                  (display (pos2D-y pos))
                  ))

;Distancia entre dos puntos

(define distancia(lambda (a b)
                  (let((dist (sqrt (+ (* (pos2D-y b) (pos2D-y b)) (* (pos2D-x a) (pos2D-x a))))))
                   dist
                   )))
;Resta

(define resta(lambda (p1 p2)
               (make-pos2D (- (pos2D-x p1) (pos2D-x p2)) (- (pos2D-y p1) (pos2D-y p2)))
               ))
;test: (distancia t1 t2)

;Suma

(define suma(lambda (p1 p2)
               (make-pos2D (+ (pos2D-x p1) (pos2D-x p2)) (+ (pos2D-y p1) (pos2D-y p2)))
               ))
;test: (mostrar (suma t1 t2))

;Sustituir
(define sustituir(lambda (elem remp list)
                     (if (null? list)
                         list
                         (if (eqv? (car list) elem)
                             (cons remp (sustituir elem remp (cdr list)))
                             (cons (car list) (sustituir elem remp (cdr list)))
                             ))))

;test: (sustituir 'a 'x '( a b c d e f g a ))

;ValorAbsolutoLista

(define listaAbsoluta( lambda ( list )
                        (map absolutoElemento list)
                        ))

(define absolutoElemento( lambda ( elem )
                          (sqrt ( * elem elem))
                          ))

;Multiplicacion

(define multiplicacion(lambda (p1 p2)
               (make-pos2D (* (pos2D-x p1) (pos2D-x p2)) (* (pos2D-y p1) (pos2D-y p2)))
               ))

;test: (mostrar (multiplicacion t1 t2))

;Producto Punto

(define productoPunto( lambda ( p1 p2 )
                        (+ (* (pos2D-x p1) (pos2D-x p2)) (* (pos2D-y p1) (pos2D-y p2)))
                        ))
;test: (productoPunto t1 t2)

;Producto Cruz

(define productoCruz( lambda ( p1 p2 )
                       (make-pso2D (* (pos2D-x p1) (pos2D-y p2)) (* (pos2D-y p1) (pos2D-x p2) '-1))
                       ))
;test: (mostrar (productoCruz t1 t2))


;Centro de gravedad

(define gravedad(lambda ( ls )
                  (if (null? ls)
                      0
                      (gravedad-auz (cdr ls) (car ls ) 1)
                      )))

(define gravedad-aux(lambda ( ls acum div )
              (if (null? ls)
                  (let ((pos (make-pos2D (/ (pos2D-x acum) div) (/ (pos2D-y acum) div))))
                    pos)
                  (gravedad-aux (cdr ls)
                        (make-pos2D (+ (pos2D-x acum) (pos2D-x (car ls))) (+ (pos2D-y acum) (pos2D-y (car ls))))
                        (+ div 1))
                  )))

;test: (mostrar (gravedad '(t1 t2)))

;Contar elemento

(define contarElemento-aux(lambda ( elem count ls)
                    (if (null? ls)
                        count
                        (if (= (car ls) elem)
                            (contarElemento-aux elem (+ count 1) (cdr ls))
                            (contarElemento-aux elem count (cdr ls))))))


(define contarElemnto(lambda ( elem ls )
                    (if (null? ls)
                        0
                        (contarElemento-aux elem 0 ls ))))

