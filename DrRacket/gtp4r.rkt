;Ejercicio 1
#| 
(define-struct pos2D ( x y ))

(define distancia(lambda (a b)
                  (let((suma (sqrt (+ (* (pos2D-y b) (pos2D-y b)) (* (pos2D-x a) (pos2D-x a))))))
                      suma)))

;Ejercicio 2

(define gravedad(lambda ( ls )
                  (if (null? ls)
                      0
                      (grav (cdr ls) (car ls ) 1)
                      )
                  )
  )

(define grav(lambda ( ls acum div )
              (if (null? ls)
                  (let ((pos (make-pos2D (/ (pos2D-x acum) div) (/ (pos2D-y acum) div))))
                    pos)
                  (grav (cdr ls)
                        (make-pos2D (+ (pos2D-x acum) (pos2D-x (car ls))) (+ (pos2D-y acum) (pos2D-y (car ls))))
                        (+ div 1))
                  )))

;Ejercicio 3

(define getMax(lambda ( ls)
                 (if (null? ls)
                     0
                     (getMaxRec (car ls) (cdr ls)))))
(define getMaxRec(lambda ( min ls )
                (if (null? ls)
                    min
                    (getMaxRec ( if(< min (car ls)) (car ls) min ) (cdr ls))
                    )))

(define maxDist(lambda ( ls elem )
                 (getMax (map (lambda(x) (distancia x elem)) ls))
                 ))

;Ejercicio 4

(define contarPalabrasArchivo(lambda (file)
                              (let ((i (open-input-file file)))
                                (word_count i 0)
                                (close-input-port i)
                                )
                               )
  )

(define contarLetrasArchivo(lambda (file)
                             (let ((i (open-input-file file)))
                               (char_count i 0)
                               )
                             )
  )

(define char_count(lambda (cursor count)
                    (let ((char (read-char cursor)))
                      (if (eof-object? char)
                          count
                          (char_count cursor (+ count 1))
                          )
                      )
                    )
  )

(define contarPalabrasArchivo(lambda (file)
                              (let ((i (open-input-file file)))
                                (word_count i 0)
                                )
                               )
  )

(define word_count( lambda (cursor count)
                     (let(( word (read cursor)))
                          (if (eof-object? word)
                              count
                              (word_count cursor (+ count 1))
                              )
                          )
                       )
 )

;Ejercicio 5

(define mostrarArchivo(lambda ( file )
                        (let(( i (open-input-file file)))
                          (displayFile i))))

(define displayFile(lambda (cursor)
                     (define line (read-line cursor))
                       (if (eof-object? line)
                           (display "  ")
                           (and (display line) (displayFile cursor)))))

;Ejercicio 6

|#
;Ejercicio 7

(define freverse(lambda ( list ) ;Wrapper
                      (if (empty? list)
                          list
                          (freverse-aux list '())
                          )))

(define freverse-aux(lambda (list nlist)
                 (if (empty? list)
                     nlist
                     (let ((fst (car list)) (rst (cdr list)))
                       (if (list? fst)
                           (freverse-aux rst (cons (freverse-aux fst '()) nlist))
                           (freverse-aux rst (cons fst nlist))
                           )))))

(freverse '(1 (2 3 4 (4 5) (3 (5 6)) 4)) )
                           
(define mreverse( lambda ( list )
                   (if (empty? list)
                       list
                       (mreverse-aux list '())
                       )))

(define mreverse-aux( lambda ( list rlist)
                       (if (empty? list)
                           rlist
                           (let ((fst (car list)) (rst (cdr list)))
                             (mreverse-aux rst (cons fst nlist))
                             ))))
;Ejercicio 8

;(define app2list(lambda ( el1 el2)
                   

;(app2list '( 1 2) '( 3 4))
                                                
                                 
                         





                                
                        

                  
                  