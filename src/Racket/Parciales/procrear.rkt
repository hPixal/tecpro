#lang racket
#|
La municipalidad de ciudad de Santa Fe necesita realizar un ranking
de las personas que se han postulado para el sorteo de viviendas que
esta realizando el departamento de Habitat a través de lineas de créditos provinciales.

Las personas que se anoten deben cargar su nombre y sus últimos 3 recibos de sueldos,
el promedio salarial de los participantes debe estar comprendido entre 55.000 y 63.000,
quienes no se encuentre dentro de ese rango deben ser descartados, y el orden del ranking es de manera descendente,
desde quien tiene el promedio salarial mas alto al mas bajo.

Ejemplos:

(ranking '( ("Federico" . (45000 60000 65000)) ("Virginia" . (60000 62000 65000))
            ("Gabriel" . (34000 40000 42000))  ("Mariano" . (54000 59000 63000) )
            ("Lucia" . (46000 55000 78000))    ("Pablo" . (76000 75000 79000)   )
           )

RTA: (("Virginia" . 62333,33) ("Lucia" . 59666,67) ("Mariano" . 58666,67) ("Federico" . 56666,67))
|#

; Quiero una funcion saque el promedio tal que '(1 2 3) = > 2
; Quiero una funcion que me obtenga el valor acumulado para el promedio
; Quiero una funcion que me diga por cuanto tengo de dividir el promedio
; Quiero una funcion que me devuelva el nombre
; Quiero una funcion que checkee si el valor promedio se encuentra en el rango esperado
; Quiero una funcion que me haga la devolucion

(define cuenta(lambda (lista)
    (if (empty? lista)
        0
        (+ (cuenta (cdr lista)) 1)
    )
))

(cuenta '(1 2 3))

(define obtenerAcumulada(lambda (lista)
    (if (empty? (cdr lista)) 
        (car lista)
        (+  (car lista) (obtenerAcumulada (cdr lista)))
    )
))

(obtenerAcumulada '(1 2 3))

(define calcularPromedio(lambda (valores)
    (if (empty? valores)
        0
        (/ (obtenerAcumulada valores) (cuenta valores))
    )
)) 

(calcularPromedio '(1 2 3))

(define obtenerNombre(lambda (elemento)
    (if (empty? elemento)
        null
        (car elemento)
    )
))

;(obtenerNombre  '("Lucia" . (46000 55000 78000)))

(define checkRango(lambda (elemento)
    (and (< (calcularPromedio (cdr elemento)) 63000) (> (calcularPromedio (cdr elemento)) 53000))
))

;(checkRango '("Lucia" . (46000 55000 78000)))

(define obtenerListas(lambda (lista)
    (if (empty? lista)
        '()
        (if (checkRango (car lista ))
            (cons (cons (obtenerNombre (car lista)) (calcularPromedio (cdr (car lista)))) (obtenerListas (cdr lista)))
            (obtenerListas (cdr lista))
        )
    )
))

(define ordenar (lambda (lista)
                  (if (null? lista)
                      '()
                      (insertar-en-orden (car lista) (ordenar (cdr lista))))))

(define insertar-en-orden (lambda (elemento lista-ordenada)
                            (if (null? lista-ordenada)
                                (list elemento)
                                (if (> (cdr elemento) (cdr(car lista-ordenada)))
                                    (cons elemento lista-ordenada)
                                    (cons (car lista-ordenada) (insertar-en-orden elemento (cdr lista-ordenada)))))))

(define procrear(lambda (lista)
    (ordenar (obtenerListas lista))
))

(procrear '( ("Federico" . (45000 60000 65000)) ("Virginia" . (60000 62000 65000))
            ("Gabriel" . (34000 40000 42000))  ("Mariano" . (54000 59000 63000) )
            ("Lucia" . (46000 55000 78000))    ("Pablo" . (76000 75000 79000)   )
           ))
