; Ejercicio 1 :

;(+ (/ (* 7 a) b) (/ (* 3 a) b) (/ (* 7 a) b))
(define a 4)
(define b 60)
(let((x (/ (* 7 a) b)) (y (/ (* 3 a) b)) )
(+ x y x))

; (cons (car (list a b c)) (cdr (list a b c)))
;(define c 70)
;(let ((x (list "d" "e" "f")))
;  (cons ( car ( x )) ( cdr ( x ))))

;Ejercicio 2 :

(let ((x 9)) ; x se define como 9
  (* x ; se multiplica x por la salida del segundo let
     (let ((x (/ x 3))) ; en este let renombramos a x como 9/3
       (+ x x)))) ; la salida del segundo let el la suma de dos veces 3
; Conclusión esto terminarata siendo la multiplicacion de 6*9

; El valor es 54

; Ejercicio 3 :


; Apartado a

"Apartado a"
(let ((x 'a) (y 'b))
  (list (let ((z 'c)) (cons z y))
        (let ((j 'd)) (cons x j))))


; Apartado b


"Apartado b"
(let ((x '((a b) c)))
  (cons (let ((x (cdr x)))
          (car x))
        (let ((z (car x)))
          (cons (let ((j (cdr z)))
                  (car j))
                (cons (let ((i (car x)))
                        x)
                      (cdr x))))))
; Ejercicio 4

"Apartado a"
(let ((f (lambda (x) x)))
  (f 'a))
(let ((f (lambda x x)))
  (f 'a))
(let ((f (lambda (x . y) x)))
     (f 'a))
(let ((f (lambda (x . y) y)))
     (f 'a))

; Ejercicio 5

(define change_op (lambda (ecu )
                    (let ((parametro1 (car ecu))
                          (operador (car ( cdr ( ecu ) )))
                          (parametro2 ( car ( cdr ( cdr ( ecu ))))))
                      (list parametro1 operador parametro2))))

;Ejercicio 6
                    
(define shorter (lambda ( lista1 lista2 )
                  (let((tamano1 (Length lista1)))
                       (tamano2 (Length lista2))
                       (if (tamano1 > tamano2)
                           (tamano1)
                           (tamano2)))))
;Ejercicio 7

(define area (lambda ( radio )
               (let((pi 3.1416 ))
                 (* radio  radio pi))))

;Ejercicio 8

(define perimetro (lambda ( radio)
                    (let((pi 3.1416 ))
                      (* 2 pi radio ))))

;Ejercicio 9

(define circlestuff (lambda (radio)
                      (let((per (perimetro radio))
                           (ar (area radio)))
                      (cons ar ( cons per () )))))
                           

                               