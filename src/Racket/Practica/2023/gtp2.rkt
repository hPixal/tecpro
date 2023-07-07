#!/usr/bin/racket
#lang racket

(let ((r (/ (* 7 a) b) ))  (+ r (/ (* 3 a) b) r ))

(let ((p (list '(a b c))))
    (cons (car p) (cdr p)))

(let ((a 'a) (b 'b))
    (list (let ((c 'c)) 
        (cons c b))
            (let ((d 'd)) 
                (cons a d))))


(let ((x '((a b) c)))
   (cons (let ((c (cdr x)))
       (car c))
       (let ((ab (car x)))
           (cons (let ((b (cdr ab)))
               (car b))
                   (cons (let ((a (car ab)))
                       a)
                           (cdr ab))))))

(define area (lambda (radio)
    (let ((pi 3.1416))
        (* radio radio pi)
        )))

(define perimetro (lambda (radio)
    (let ((pi 3.1416))
        (* 2 pi radio))))

(define circlestuff (lambda (radio)
    (let ((pi 3.1416))
        (list (area radio) (perimetro radio)))))

(define distance2d (lambda (x y)
    (let ((x2 (abs (* (car x) (car y)))) (y2 (abs (* (car (cdr y)) y))))
        (sqrt x2 y2))))