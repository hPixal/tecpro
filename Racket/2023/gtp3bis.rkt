#lang racket
;; Escriba la funcion factorial

(define factorial (lambda (x)
    (if (> x 0)
    (* x (factorial (- x 1)))
    1)
))

;; Cuenta Repetidos

(define cuentaRep-r (lambda (ls elem rep)
    (if (null? ls)
    rep
        (let ((aux (car ls)) (rest (cdr ls)))
            (if (equal? aux elem)
            (cuentaRep-r rest elem (+ rep 1))
            (cuentaRep-r rest elem rep))
        )
    )
))

(define cuentaRep (lambda (ls elem)
    (if (null? ls)
    0
    (cuentaRep-r (cdr ls) elem 0)
    )
))

;; reemplaza "c" con "k" en la lista

(define invierte-r(lambda (x aux)
    (if (null? x)
        aux
        (invierte-r (cdr x) (cons (car x) aux))
    )
))

(define invierte(lambda (x)
    (if (null? x)
        '()
        (invierte-r x '())
    )
))

(define subst-r (lambda (ls x y aux)
    (if (null? ls)
        aux
        (let ((first (car ls)) (rest (cdr ls)))
            (if (equal? x first)
                (subst-r rest x y (cons y aux)) 
                (subst-r rest x y (cons first aux))
            )
        ))
    )
)

(define subst (lambda (ls x y)
    (if (null? ls)
        '()
        (invierte (subst-r ls x y '()))
    )
))

;;lista atomos compuestos

(define elemntoPresente (lambda (x ls)
                          (if (equal? ls '())
                              #f
                              (if (equal? (car ls) x ) 
                                  #t
                                  (elemntoPresente x (cdr ls))
                                  )   
                              )
                          ))

(define miniLista-r(lambda (x ls rtn)
    (if (null? ls)
        rtn
        (define ((first (car ls)) (rest (cdr ls)))
            (if (equal? first x)
                (miniLista-r x rest (cons first rtn))
                (miniLista-r x rest rtn)
            )

        )
    )
))

(define miniLista(lambda(x ls)
    (if (null? ls)
        (cons x '())
        (miniLista-r x ls '())
    )
))

(define agrupar-r(lambda (ls rtn prst)
    (if (null? ls)
        rtn
        (if (elemntoPresente (car ls) prst)
            (agrupar-r (cdr ls) rtn prst)
            (agrupar-r (cdr ls) (cons (miniLista (car ls) ls) rtn) (cons (car ls) prst))
        )
    )
))

(define agrupar (lambda (ls)
    (if (null? ls)
        '()
        (agrupar-r ls '() '())
    )
))

;;invierto primera, invierto segunda, construyo primera y segunda y despues invierto

(define inverse(lambda (l1 rtn)
    (if (null? l1)
        rtn
        (inverse (cdr l1) (cons (car l1) rtn))
    )
))


(define concatenar (lambda (l1 l2)
    (if (null? l1)
        l2           
        (let ((first1 (car l1)) (rest1 (cdr l1)))
          (if (null? rest1)    
              (cons first1 l2)   
              (cons first1 (concatenar q l2)))))
))

(define primerNum(lambda (l1)
    (if (null? l1)
        0
        (if (number? (car l1))
            (car l1)
            (let ((carl1 (car l1)))
                (if (list? carl1)
                    (primerNum carl1) ;; carl1 equals (car l1)
                    (primerNum (cdr l1))
                )    
            )
        )
    )
))

(define aplanar (lambda ( ls )
                   (if (empty? ls)
                       ls
                       (let ((fst (car ls)) (rst (cdr ls)))
                         (if (list? fst)
                             (concatenar (aplanar fst) (aplanar rst))
                             (concatenar (cons fst '()) (aplanar rst))
                             )))))

(define attach-at-end (lambda (l1 l2)
    (aplanar (list l2 l1))
))

(define boolToNumber(lambda (n)
                       (if (equal? n "V")
                           1
                           0
                       )
))

(define convertir-r(lambda (ls rtn)
    (if (null? ls)
        rtn
        (let ((first (car ls)) (rest (cdr ls)))
            (convertir-r (cdr rest) (cons (
                (cond 
                [(equal? first "T") (map string->number (car rest))]
                [(equal? first "B") (map symbol->number (car rest))]
                [(equal? first "D") (map abs (car rest))]
                [(display "NaN")]
                )
            ) rtn))
        )
    )
))

(define convertir(lambda (ls)
    (convertir-r ls '())
))

(define distancias-r(lambda( ls rtn )
    (if (null? (cdr ls))
        rtn
        (let ((firstDot (car ls)) (secondDot (car (cdr ls))) (rest (cdr ls)))
          (let ((x1 (car firstDot)) (x2 (car secondDot)) (y1 (cdr firstDot)) (y2 (cdr secondDot)))
	        (let ((diffX (* (- x1 x2 ) (- x1 x2))) (diffY (* (- y1 y2) (- y1 y2))))
	         (distancias-r rest (cons (sqrt (+ diffX diffY)) rtn))
            )
          )
        )
    )
))


(define distancias (lambda (ls)
    (if (null? ls) 
	'()
	(distancias-r ls '())
    )
))
