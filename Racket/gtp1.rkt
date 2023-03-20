;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;ejercicio 1

a)
( + 7 ( * 2 -1/3) -10.7)
b)
( / (* 7/3 5/9) (- 5/8 2/3))
c)
( + 1 ( / 3 ( + 2 ( / 1 ( + 5 1/2)))))
d)
( * 1 ( * -2 ( * 3 ( * -4 ( * 5 ( * -6 7 ))))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;ejercicio 2

(cons 'car '+) : (car . +) 
(list 'esto '(es muy fácil)) : (esto (es muy facil))
(cons 'pero '(se está complicando...)) : (pero se está complicando...) 
(cons '(y ahora no se que ) 'hizo) : ((y ahora no se que). hizo)
(quote (+ 7 2)) : (+ 7 2)
(cons '+ '(10 3)) : (+ 10 3)
(car '(+ 10 3)) : +
(cdr '(+ 10 3)) : (10 3)
cons : #<procedure:cons>
(quote (cons (car (cdr (7 4))))) : (cons (car (cdr (7 4))))
(quote cons) : cons
(car (quote (quote cons))) : quote
(+ 2 3) : 5
(+ '2 '3) : 5
(+ (car '(2 3)) (car (cdr '(2 3)))) : 5
((car (list + - * /)) 2 3) : 5

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; ejercicio 3

"Composición para devolver b:"
(car (cdr (car '((a b) (c d)))))

"Composición para devolver c:"
(car (car (cdr '((a b) (c d)))))

"Composición para devolver d:"
(car (cdr (car (cdr '((a b) (c d))))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; ejercicio 4 (realizar solo 4 ejemplos)


(cdr (car (cdr '((a b) (c d)))))  =  (d)

(car (cdr (car (cdr '((a b) (c d))))))  =  d

(car (car '((a b) (c d)))) = a

(car (car (cdr '((a b) (c d))))) = c

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; ejercicio 5
list genera la lista I (+ - * /), cdr de I devuelve la lista II (- * /),
luego cdr de II devuelve la lista III (* /) y car de III devuelve *, entonces
finalmente queda (* 5 5) = 25
