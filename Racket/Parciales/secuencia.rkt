#lang racket
#|
Cree un programa llamado "makematrix" que permita armar la siguiente matriz:
((0 0 0 0 1)
(0 0 0 1 2)
(0 0 1 2 3)
(0 1 2 3 4)
(1 2 3 4 5))

Ejemplo: (makematrix 5) --> ((0 0 0 0 1) (0 0 0 1 2) (0 0 1 2 3) (0 1 2 3 4) (1 2 3 4 5))

|#

; Quiero una funcion que yo le de un n y un j , j < n tal que funcion (j,n) = > (0,..,j-2,j-1,j)

#|
   lo que voy a hacer es una lista que yo le paso n j y count, count va a contar hasta 0  desde j 
   entones si n = 4 y j = 2  => (2 1 0 0 )
   a esta salida la voy a invertir despues

|#

(define concatenar ( lambda (l1 l2)
                      (if (empty? l1 )
                          l2
                          (cons (car l1) (concatenar (cdr l1) l2))
                          )))

(define inv (lambda (ls)
    (if (null? ls)
        '()
        (concatenar (inv (cdr ls)) (cons (car ls) '())))))

(define obtenerCoef(lambda (cn)
    (if (< cn 0)
        0
        cn
    )
))

(define obtenerLista (lambda (n j cn)
    (if (equal? (- j cn) (- n 1))
        (cons (obtenerCoef cn) '())
        (cons (obtenerCoef cn) (obtenerLista n j (- cn 1)))
    )
))

(define crearListaAux(lambda (n j)
    (if (equal? j 0)
        '()
        (cons (inv (obtenerLista n j j)) (crearListaAux n (- j 1)))
    )
))

(define crearLista(lambda (n)
    (inv (crearListaAux n n))
))

(crearLista 3)
(crearLista 4)
(crearLista 5)
(crearLista 6)