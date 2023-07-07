#lang racket
#| Dada una entrada de datos que sea una lista de listas, en donde el primer elemento es el día de la semana, 
después una lista con el menú del día y por último una lista con opciones de reemplazo. Las listas del menú 
diario son listas impropias en donde el 1er elemento es el tipo de comida y el 2do la cantidad de calorías para esa comida, 
la AUSENCIA de alguna comida se interpreta como una lista de un solo elemento (con el tipo).

( ("Lunes" ((DESAYUNO . 120)(ALMUERZO . 280)(MERIENDA . 110)(CENA . 220)) ((ALMUERZO . 380)) )  --> 730
  ("Martes" ((DESAYUNO . 120)(ALMUERZO)(MERIENDA . 90)(CENA . 250)) ((ALMUERZO . 295)) )        --> 460
  ("Miércoles" ((DESAYUNO . 125)(ALMUERZO . 270)(MERIENDA . 95)(CENA . 290)) ((CENA . 220)) )   --> 780
  ("Jueves" ((DESAYUNO . 130)(ALMUERZO . 270)(MERIENDA . 120)(CENA . 280)) ((MERIENDA . 70)) )  --> 800
  ("Viernes" ((DESAYUNO . 120)(ALMUERZO . 275)(MERIENDA . 115)(CENA . 270)) () )                --> 780
)

( ("Lunes" ((DESAYUNO . 120)(ALMUERZO . 280)(MERIENDA . 110)(CENA . 220)) ((ALMUERZO . 380)) ) --> 730
  ("Martes" ((DESAYUNO . 120)(ALMUERZO)(MERIENDA . 90)(CENA . 250)) ((ALMUERZO . 295)) ) --> 460
  ("Miércoles" ((DESAYUNO . 125)(ALMUERZO . 270)(MERIENDA . 95)(CENA . 290)) ((CENA . 220)) ) --> 780
  ("Jueves" ((DESAYUNO . 130)(ALMUERZO . 270)(MERIENDA . 120)(CENA . 280)) ((MERIENDA . 70)) ) --> 800
  ("Viernes" ((DESAYUNO . 120)(ALMUERZO . 275)(MERIENDA . 115)(CENA . 270)) () ) --> 780
)


Se desea que programen una función utilizando el paradigma funcional que reciba como parámetros de entrada 
un máximo de calorías diaria y la lista anterior, que procese cada elemento para verificar si es posible 
alterar el menú fijo del día con alguna opción de reemplazo siempre y cuando la cantidad de calorías diaria 
no sea superior al máximo de calorías por día.
* El resultado dependerá de la cantidad de calorías máximas por cada semana.
* Solo se podrá reemplazar una sola comida por día.

El resultado debe ser una lista con el siguiente formato cuando el máximo de calorías permitido es 800:
( ("Lunes" ((DESAYUNO . 120)(ALMUERZO . 280)(MERIENDA . 110)(CENA . 220)) ) --> 730 (sin reemplazo)
  ("Martes" ((DESAYUNO . 120)(ALMUERZO . 295)(MERIENDA . 90)(CENA . 250)) ) --> 755 (con reemplazo)
  ("Miércoles" ((DESAYUNO . 125)(ALMUERZO . 270)(MERIENDA . 95)(CENA . 220)) ) --> 710 (con reemplazo)
  ("Jueves" ((DESAYUNO . 130)(ALMUERZO . 270)(MERIENDA . 70)(CENA . 280)) ) --> 750 (con reemplazo)
  ("Viernes" ((DESAYUNO . 120)(ALMUERZO . 275)(MERIENDA . 115)(CENA . 270)) ) --> 780 (sin reemplazo)
)

El resultado debe ser una lista con el siguiente formato cuando el máximo de calorías permitido es 900:
( ("Lunes" ((DESAYUNO . 120)(ALMUERZO . 380)(MERIENDA . 110)(CENA . 220)) ) --> 830 (con reemplazo)
  ("Martes" ((DESAYUNO . 120)(ALMUERZO . 295)(MERIENDA . 90)(CENA . 250)) ) --> 755 (con reemplazo)
  ("Miércoles" ((DESAYUNO . 125)(ALMUERZO . 270)(MERIENDA . 95)(CENA . 220)) ) --> 710 (con reemplazo)
  ("Jueves" ((DESAYUNO . 130)(ALMUERZO . 270)(MERIENDA . 70)(CENA . 280)) ) --> 750 (con reemplazo)
  ("Viernes" ((DESAYUNO . 120)(ALMUERZO . 275)(MERIENDA . 115)(CENA . 270)) ) --> 780 (sin reemplazo)
)

( ("Lunes" ((DESAYUNO . 120)(ALMUERZO . 280)(MERIENDA . 110)(CENA . 220)) "Martes" ((DESAYUNO . 120)(ALMUERZO . 295)(MERIENDA . 90)(CENA . 250)) "Miércoles" ((DESAYUNO . 125)(ALMUERZO . 270)(MERIENDA . 95)(CENA . 220)) "Jueves" ((DESAYUNO . 130)(ALMUERZO . 270)(MERIENDA . 70)(CENA . 280)) "Viernes" ((DESAYUNO . 120)(ALMUERZO . 275)(MERIENDA . 115)(CENA . 270)) ))


(("Lunes" ((DESAYUNO . 120)(ALMUERZO . 380)(MERIENDA . 110)(CENA . 220))  
  "Martes" ((DESAYUNO . 120)(ALMUERZO . 295)(MERIENDA . 90)(CENA . 250))  
  "Miércoles" ((DESAYUNO . 125)(ALMUERZO . 270)(MERIENDA . 95)(CENA . 220))  
  "Jueves" ((DESAYUNO . 130)(ALMUERZO . 270)(MERIENDA . 70)(CENA . 280))  
  "Viernes" ((DESAYUNO . 120)(ALMUERZO . 275)(MERIENDA . 115)(CENA . 270)) )

ACLARACIONES: No pueden utilizar funciones predefinidas de racket, con excepción de las que vimos en clases para validar o convertir string, listas, char, vectores, etc. Ante la duda pregunten. |#

(define obtenerCalorias-aux(lambda (l1 acum)
    (if (empty? l1)
        acum
        (obtenerCalorias-aux (cdr l1) (+ acum (cdr (car l1))))
    )
))

(define obtenerCalorias(lambda (l1)
    (if (empty? l1)
        0
        (obtenerCalorias-aux l1 0)
    )
))

;; (obtenerCalorias '((DESAYUNO . 120) (ALMUERZO . 380) (MERIENDA . 110) (CENA . 220)) )

(define obtenerReemplazo(lambda (l1 l2 max calActual)
        (if (empty? l1)
            l1
            (if (< calActual max)
                l1
                (if (> (cdr (car l1)) (cdr (car l2)))
                    (cons (car l2) (obtenerReemplazo (cdr l1) (cdr l2) max (- calActual (- (cdr (car l1)) (cdr (car l2))))))
                    (cons (car l1) (obtenerReemplazo (cdr l1) (cdr l2) max calActual ))
                )
            )
        )
))

;; (obtenerReemplazo '((DESAYUNO . 120) (ALMUERZO . 380) (MERIENDA . 110) (CENA . 220)) '((DESAYUNO . 120)(ALMUERZO . 280)(MERIENDA . 110)(CENA . 220)) 800 830 )


(define saludable(lambda (l1 l2 maxCAL)
    (if (empty? l1)
        '()
        (if (> (obtenerCalorias (car (cdr l1))) maxCAL)
            (cons 
                (cons (car l1) (obtenerReemplazo (car (cdr l1)) (car (cdr l2)) maxCAL (obtenerCalorias l1))) 
                    saludable( (cdr (cdr l1)) (cdr (cdr l2)) maxCAL))
            (cons 
                (cons (car l1) (car (cdr l1))) 
                    (saludable  (cdr (cdr l1)) (cdr (cdr l2)) maxCAL))
        )
    
    
    )
))

(saludable '("Lunes" ((DESAYUNO . 120)(ALMUERZO . 280)(MERIENDA . 110)(CENA . 220)) "Martes" ((DESAYUNO . 120)(ALMUERZO . 295)(MERIENDA . 90)(CENA . 250))) '("Lunes" ((DESAYUNO . 120)(ALMUERZO . 280)(MERIENDA . 110)(CENA . 220)) "Martes" ((DESAYUNO . 120)(ALMUERZO . 200)(MERIENDA . 90)(CENA . 200))) 800 )
;;'("Lunes" '((DESAYUNO . 120)(ALMUERZO . 280)(MERIENDA . 110)(CENA . 220)) "Martes" '((DESAYUNO . 120)(ALMUERZO . 295)(MERIENDA . 90)(CENA . 250)))
;;( ("Lunes" '((DESAYUNO . 120)(ALMUERZO . 280)(MERIENDA . 110)(CENA . 220)) "Martes" '((DESAYUNO . 120)(ALMUERZO . 295)(MERIENDA . 90)(CENA . 250)) "Miércoles" '((DESAYUNO . 125)(ALMUERZO . 270)(MERIENDA . 95)(CENA . 220)) "Jueves" '((DESAYUNO . 130)(ALMUERZO . 270)(MERIENDA . 70)(CENA . 280)) "Viernes" '((DESAYUNO . 120)(ALMUERZO . 275)(MERIENDA . 115)(CENA . 270)) ))

