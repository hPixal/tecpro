;Ejercicio 1


(define factorial(lambda (x)
    (if(< x 1)
    1
    (factorialrec x 1))))

(define factorialrec(lambda (x acumulador)
    (if(< x 1)
    acumulador
    (factorialrec ( x) (* acumulador x)))))

;Ejercicio 2

(define tamano (lambda (x)
    (if(null? x)
       1
       (tamanorec x 0))))

(define tamanorec (lambda (ls tm)
     (if(null? ls)
       tm
       (tamanorec (cdr ls) (+ tm 1)))))

;Ejercicio 3

(define count-elemrec(lambda ( elem count ls)
                    (if (null? ls)
                        count
                        (if (= (car ls) elem)
                            (count-elemrec elem (+ count 1) (cdr ls)) 
                            (count-elemrec elem count (cdr ls))))))
                            

(define count-elem(lambda ( elem ls )
                    (if (null? ls)
                        0
                        (count-elemrec elem 0 ls ))))
;Ejercicio 4

(define subst(lambda ( compare replace list )
               (if (null? list)
                        0
                        (subst-rec compare replace list '() ))))

(define subst-rec(lambda (compare replace list nlist)
                   (if (null? list)
                        nlist
                        (if (= compare (car list))
                             (subst-rec compare replace (cdr list) (cons replace nlist) )
                             (subst-rec compare replace (cdr list) (cons (car list) nlist) ) )
                        )
                   )
  )

;Ejercicio 5
;(define agrupar(lambda ( atomos )
;                 (if (null? atomos )
;                       0
;                        (agrupar-rec atomos ())
;                        )))
;
;(define agrupar-rec(lambda ( atomos nlista )
;                     (if (

;Ejercicio 6

(define (concatenar l1 l2)
  (if (empty? l1)
      l2
      (cons (car l1) (concatenar (cdr l1) l2))
  )
)

;Ejercicio 7

(define primer-num (lambda (ls)
                     (if (null? ls)
                         null                            
                         (let ((num (car ls)) (resto (cdr ls)))
                           (if (number? num)
                               num                         
                               (primer-num resto) 
                               )))))
;Ejercicio 8
(define attach-at-end (lambda (x ls)
                        (if (null? ls)
                            (cons x ())
                             (let ((primero (car ls)) (resto (cdr ls)))
                               (cons primero (attach-at-end x resto))))))
;Ejercicio 9
                         
                        