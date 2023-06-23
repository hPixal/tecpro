#lang racket
#|
    Se conocen los alimentos con su valor calórico, el instituto argentino de nutrición (IAN) desea conocer cuales serían las dietas posibles para
    un día de una persona que padece diabetes de tipo 1 y puede consumir hasta 500 calorías en total, una dieta para carnívoros y otra para
    vegetarianos. La lista de los alimentos se debe mostrar de menor calorías a mayor. Por lo tanto, el procedimiento recibe una lista de listas,
    cada lista contiene el alimento, el grupo al que pertenece y su valor calórico y debe retornar dos listas con los alimentos ordenados de
    menor a mayor, según su valor calórico y no superar las 500 Calorías. una lista para carnívoros y otra para vegetarianos, teniendo en cuenta
    que los carnívoros no consumen vegetales y los vegetarianos no consumen carne, aunque hay alimentos que consumen "ambos" y se
    consideran para carnívoros como para vegetarianos.
    EJ.:
    PROCEDIMIENTO
    (dieta '(("papa" "vegetariano" 80) ("milanesa de carne" "carnívoro" 150) ("jugo de naranja" "vegetariano" 70) ("calabaza" "vegetariano" 90)
    ("costeleta" "carnívoro" 180) ("tiramisú" "ambos" 150) ("pastas" "ambos" 100) ("gaseosa" "ambos" 220) ("pan" "ambos" 110) ("chocolate"
    "ambos" 400) ("espárragos" "vegetariano" 60) ("empanadas de carne" "carnívoro" 200))
    RESULTADO
    (("espárragos" "jugo de naranja" "papa" "calabaza" "pastas") ("pastas" "pan" "milanesas de carne"))
|#

; Quiero una funcion que haga ("papa" "vegetariano" 80) => "vegetariano"
; Quiero una funcion que haga ("papa" "vegetariano" 80) => 80
; Quiero una funcion que haga ("papa" "vegetariano" 80) => "papa"
; Quiero una funcion que me devuelve el menu de veggies y ambos o carnivoros y ambos
; Quiero una funcion que ordene de menor a mayor en calorias
; Quiero una funcion que dada una lista devuelva la misma lista pero que no supere una x cantidad de calorias.
; Quiero el wrapper.

(define obtenerTipo(lambda (elem)
    (if (empty? elem)
        null
        (car (cdr elem))
    )
))

;(obtenerTipo '("papa" "vegetariano" 80))

(define obtenerCalorias(lambda (elem)
    (if (empty? elem)
        null
        (car (cdr (cdr elem)))
    )
))

(define obtenerNombre(lambda (elem)
    (if (empty? elem)
        null
        (car elem)
    )
))

;(obtenerCalorias '("papa" "vegetariano" 80))

(define obtenerListaTipo (lambda (lista tipo)
    (if (empty? lista)
        '()
        (let ((carTipo (obtenerTipo (car lista))))
            (if (equal? carTipo tipo)
                (cons (car lista) (obtenerListaTipo (cdr lista) tipo))
                (if (equal? carTipo "ambos")
                    (cons (car lista) (obtenerListaTipo (cdr lista) tipo))
                    (obtenerListaTipo (cdr lista) tipo)
                )
            )

        )
    )
))

;(obtenerListaTipo '(("papa" "vegetariano" 80) ("milanesa de carne" "carnívoro" 150) ("jugo de naranja" "vegetariano" 70) ("calabaza" "vegetariano" 90)
;    ("costeleta" "carnívoro" 180) ("tiramisú" "ambos" 150) ("pastas" "ambos" 100) ("gaseosa" "ambos" 220) ("pan" "ambos" 110) ("chocolate"
;    "ambos" 400) ("espárragos" "vegetariano" 60) ("empanadas de carne" "carnívoro" 200)) "vegetariano")

;'(("papa" "vegetariano" 80) ("jugo de naranja" "vegetariano" 70) ("calabaza" "vegetariano" 90) ("tiramisú" "ambos" 150) ("pastas" "ambos" 100) ("gaseosa" "ambos" 220) ("pan" "ambos" 110) ("chocolate" "ambos" 400) ("espárragos" "vegetariano" 60))

(define (ordenar-menor-a-mayor lista)
  (if (null? lista)
      '()
      (insertar-en-orden (car lista) (ordenar-menor-a-mayor (cdr lista)))))


(define (insertar-en-orden elemento lista-ordenada)
  (if (null? lista-ordenada)
      (list elemento)
      (if (< (obtenerCalorias elemento) (obtenerCalorias (car lista-ordenada)))
          (cons elemento lista-ordenada)
          (cons (car lista-ordenada) 
                (insertar-en-orden elemento 
                                   (cdr lista-ordenada))))))

;(ordenar-menor-a-mayor '(("papa" "vegetariano" 80) ("jugo de naranja" "vegetariano" 70) ("calabaza" "vegetariano" 90) ("tiramisú" "ambos" 150) ("pastas" "ambos" 100) ("gaseosa" "ambos" 220) ("pan" "ambos" 110) ("chocolate" "ambos" 400) ("espárragos" "vegetariano" 60)) )

(define listaPeroNoSupera-aux(lambda (lista cantidad acum)
    (if (empty? lista)
        '()
        (if (< (+ acum (obtenerCalorias (car lista))) cantidad)
            (cons (car lista) (listaPeroNoSupera-aux (cdr lista) cantidad (+ acum (obtenerCalorias (car lista)))))
            '()
        )
    )
))

(define listaPeroNoSupera(lambda (lista cantidad)
    (listaPeroNoSupera-aux lista cantidad 0)
))

;(listaPeroNoSupera (ordenar-menor-a-mayor '(("papa" "vegetariano" 80) ("jugo de naranja" "vegetariano" 70) ("calabaza" "vegetariano" 90) ("tiramisú" "ambos" 150) ("pastas" "ambos" 100) ("gaseosa" "ambos" 220) ("pan" "ambos" 110) ("chocolate" "ambos" 400) ("espárragos" "vegetariano" 60))) 500)

(define listaSoloNombres(lambda (lista)
    (if (empty? lista)
        '()
        (cons (obtenerNombre (car lista)) (listaSoloNombres (cdr lista)))
    )
))

;(listaSoloNombres '(("papa" "vegetariano" 80) ("jugo de naranja" "vegetariano" 70) ("calabaza" "vegetariano" 90) ("tiramisú" "ambos" 150) ("pastas" "ambos" 100) ("gaseosa" "ambos" 220) ("pan" "ambos" 110) ("chocolate" "ambos" 400) ("espárragos" "vegetariano" 60)))

(define dieta(lambda (lista calorias)
    (let ( (listaVeggie (ordenar-menor-a-mayor (obtenerListaTipo lista "vegetariano"))) (listaCarniv (ordenar-menor-a-mayor (obtenerListaTipo lista "carnívoro"))) )
        (cons (listaSoloNombres (listaPeroNoSupera listaVeggie calorias)) (cons (listaSoloNombres (listaPeroNoSupera listaCarniv calorias)) '()))
    )
))

(dieta '(("papa" "vegetariano" 80) ("milanesa de carne" "carnívoro" 149) ("jugo de naranja" "vegetariano" 70) ("calabaza" "vegetariano" 90)
    ("costeleta" "carnívoro" 180) ("tiramisú" "ambos" 150) ("pastas" "ambos" 100) ("gaseosa" "ambos" 220) ("pan" "ambos" 110) ("chocolate"
    "ambos" 400) ("espárragos" "vegetariano" 60) ("empanadas de carne" "carnívoro" 200)) 500)