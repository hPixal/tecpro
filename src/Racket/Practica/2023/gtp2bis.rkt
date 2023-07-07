#!/usr/bin/racket
#lang racket

;; Ejercicio 1 

;; original (+ (/ (* 7 a) b) (/ (* 3 a) b) (/ (* 7 a) b))

(let ((x (/ (* 7 a) b)) (y (/ (* 3 a) b)))
    (+ x y x))

;; original  (cons (car (list a b c)) (cdr (list a b c)))

(let ((x (list a b c)))
    (cons (car x) (cdr x)))

;;(let ((x 9))
;;  (* x ;; 9 * 6
;;      (let ((x (/ x 3)))
;;          (+ x x)))) ;;Salida 6

;; La respues es 54

;; Orginal
;;(let ((x 'a) (y 'b))
;;  (list (let ((x 'c)) (cons x y))
;;      (let ((y 'd)) (cons x y))))

(let ((x 'a) (y 'b))
  (list (let ((z 'c)) (cons x y))
      (let ((y 'd)) (cons z y))))

;; Original
;;(let ((x '((a b) c)))
;;(cons (let ((x (cdr x)))
;;      (car x))
;;     (let ((x (car x)))
;;      (cons (let ((x (cdr x)))
;;          (car x))
;;         (cons (let ((x (car x)))
;;              x)
;;            (cdr x))))))

(let ((x '((a b) c)))
(cons (let ((w (cdr x)))
      (car w))
     (let ((z (car x)))
      (cons (let ((w (cdr z)))
          (car w))
         (cons (let ((y (car z)))
              y)
            (cdr z))))))

(let ((f (lambda (x) x)))
    (f 'a))

(let ((f (lambda x x)))
    (f 'a))

(let ((f (lambda (x . y) x)))
    (f 'a))

(let ((f (lambda (x . y) y)))
    (f 'a))

;; Ejercicio 5

(let ((suma (lambda (x y) (+ x y))))
    (suma 2 2))

(let ((resta (lambda (x y) (- x y))))
    (resta 2 2))

(let ((por (lambda (x y) (* x y))))
    (por 2 2))

;; Ejercicio 6

(let ((shorter (lambda (x y)
    (if (< (length x) (length y))
        x
        (if (> (length x) (length y))
            y
            x
        )))))
    (shorter '(a b) '(c d e)))


(define area (lambda (radio) 
    (let((pi 3.1416))
        (* pi (* radio radio))
    )
))
(area 3)


(define perimetro (lambda (radio) 
    (let((pi 3.1416))
        (* pi radio 2)
    )
))
(perimetro 1)

(define circlestuff (lambda (radio)
    (cons (perimetro radio) (area radio))
))

(define distance2d (lambda (p1 p2)
    (let ((x1 (car p1)) (x2 (car p2)) (y1 (cdr p1)) (y2 (cdr p2)))
        (let ((x (- x2 x1)) (y (- y2 y1)))
            (let (( xx (* x x)) (yy (* y y)))
            (sqrt (+ xx yy))
        )
    )
)
)
)

(define proximo-r (lambda (p l m)
    (if (null? l)
    m
    (let ((m2 (distance2d p (car l))))
        (if (> m m2)
        (proximo-r p (cdr l) m2)
        (proximo-r p (cdr l) m))
        ))
    ) 
)


(define proximo (lambda (p l)
    (let ((min (distance2d p (car l))))
        (proximo-r p (cdr l) min)
    )
))

;; (proximo '(1 . 1) '( (2 . 2) (3 . 3) ( 4 . 4) ))