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
