#lang racket

(define distance2d (lambda (p1 p2)
    (let ((x1 (car p1)) (x2 (car p2)) (y1 (cdr p1)) (y2 (cdr p2)))
        (let ((x (- x2 x1)) (y (- y2 y1)))
            (let (( xx (* x x)) (yy (* y y)))
            (sqrt (+ xx yy))
            )
        )
    )
))

(define maxInList-r(lambda (ls maxElem)
    (if (null? ls)
        maxElem
        (let ((first (car ls)) (rest (cdr ls)))
            (if (< maxElem first)
                (maxInList-r rest first)
                (maxInList-r rest maxElem)
            )
        
        )
    )

))

(define maxInList(lambda(ls)
    (if (null? ls)
        0
        (maxInList-r ls 0)
    )
))

(define max-distance-r(lambda (ls)
    (if (null? (cdr ls))
        '()
        (let ((first (car ls)) (rest (cdr ls))) 
            (cons 
            (maxInList (map (lambda(aux) (distance2d first aux)) rest))
            (max-distance-r rest))
        )
    )
))

(define max-distance(lambda (ls)
    (if (null? ls)
        0
        (maxInList (max-distance-r ls ))
    )
))

(max-distance '((1 . 1) (1 . 2) (2 . 2) (2 . 1) (1 . 1)))
;(maxInList '( 1 2 3 4 5 6 7 8 18))

(define getWeight-r (lambda (word weigthAcum)
    (if (null? word)
        weigthAcum
        (getWeight-r (cdr word) (+ (char->integer (car word)) weigthAcum))
    )
))

(define getWeight (lambda (word)
    (if (null? word)
        0
        (getWeight-r (string->list word) (char->integer (car (string->list word))))
    )

))

(define eliminateElem(lambda (ls elem)
    (if (null? ls)
        '()
        (let ((first (car ls)) (rest (cdr ls)))
            (if (equal? first elem) 
                (eliminateElem (cdr ls) elem)
                (cons first (eliminateElem (cdr ls) elem))
            )

        )
    )
))

(define isItHeavier(lambda ( string1 string2 )
    (if (< (getWeight string1) (getWeight string2))
        #t
        #f
    )
))



(define obtenerMinimo(lambda (ls minimo)
    (if (null? ls)
        minimo
        (let ((first (car ls)) (rest (cdr ls)))
            (if (< (getWeight first) (getWeight minimo))
                (obtenerMinimo rest first)
                (obtenerMinimo rest minimo)
            )
        )
    )
))

(define getSortedList(lambda (ls rtn)
    (if (null? ls)
        rtn
            (let ((minimo (obtenerMinimo (cdr ls) (car ls))))
                (getSortedList (eliminateElem ls minimo) (cons minimo rtn))
            )
        )
    ))

(define ordenarASCII(lambda (ls)
    (if(null? ls)
        ls
        (getSortedList ls '())
    )
))

(ordenarASCII '("moto" "folleto" "zzzz" "aaaa" "zzzzzzzzzzzz"))

;;(obtenerMinimo '("moto" "aaa") "zzz")

;;(eliminateElem '("a" "b" "c") "b")