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

(define agrupar-r (lambda (ls aux elem presente)
                    (if (null? ls)
                        aux
                        (let ((first (car ls)) (rest (cdr ls)))
                          (if (equal? first elem )
                              (agrupar-r rest (cons elem aux) elem presente)
                              (if (elemntoPresente first presente)
                                  (agrupar-r rest aux elem presente)
                                  (list (agrupar-r rest aux elem (cons first presente))
                                        (agrupar-r rest (cons first '()) first (cons first presente)))
                                  )
                              )
                          )
                        )
                    ))

(define agrupar (lambda (ls)
                  (if (null? ls)
                      '()
                      (agrupar-r ls '() (car ls) (cons (car ls) '()))
                      )
                  ))