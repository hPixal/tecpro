;GENERAL PORPUSE FUNCTIONS
;Author: Nahuel Julián Gareis
;
;University: Universidad Nacional del Litoral
;College: Facultad de Ingeniería y Ciencias Hídricas

;Concatenar

(define concatenar ( lambda (l1 l2)
                      (if (empty? l1 )
                          l2
                          (cons (car l1) (concatenar (cdr l1) l2))
                          )))

;test: (concatenar '(1 2 3) '(4 5 6))

;Reversa

(define reversa (lambda (l1)
                  (if (empty? l1)
                      l1
                      (concatenar (reversa (cdr l1)) (list (car l1))) ;REQUIERE CONCATENAR
                      )))

(define reversa (lambda (l1)
                  (if (empty? l1)
                      l1
                      (reversa-aux l1 '())
                      )))


(define reversa-aux (lambda (l1 rtn)
                      (if (empty? l1)
                          rtn
                          (reversa-aux (cdr l1) (cons (car l1) rtn))
                          )))

;test: (reversa '(1 2 3 4))

;Remover Elemento

(define removerElemento(lambda (elem l1)
                         (if (empty? l1)
                             l1
                             (removerElemento-aux elem l1 '())
                             )))

(define removerElemento-aux(lambda (elem l1 rtn)
                             (if (empty? l1)
                                 (reversa rtn) ;REQUIERE REVERSA, SI NO IMPORTA EL ORDEN NO USAR REVERSA
                                 (if (equal? elem (car l1))
                                     (removerElemento-aux elem (cdr l1) rtn)
                                     (removerElemento-aux elem (cdr l1) (cons (car l1) rtn))
                                     ))))

;test: (removerElemento 3 '(1 3 2 3 4)) 

;Profundidad de un arbol

(define profundidad( lambda ( list )
                          (if (empty? list)
                              0
                              (profundidad-aux list 0)
                              )))

(define profundidad-aux(lambda (list count)
                           (if (empty? list)
                               count
                               (let ((fst (car list)) (rst (cdr list)))
                                 (if (list? fst)
                                     (let ((fprof (profundidad-aux fst (+ count 1)))
                                           (nprof (profundidad-aux rst count)))
                                           (if (< fprof nprof)
                                               nprof
                                               fprof ))
                                     (profundidad-aux rst count)
                                     )))))

;test : (profundidad '(1 ( 2 3 ) 4 ( 5 ( 6 ( 7 () ) ) ) ) )

;Obtener elemento

(define obtenerElemento (lambda (l1 it)
                           (if (empty? l1)
                               l1
                               (let((i (sqrt (* it it))))
                                 (if (equal? i 1)
                                   (car l1)
                                   (obtenerElemento (cdr l1) (- i 1))
                                   )))))

;test: (obtenerElemento '( 1 2 3 4 5 6 ) '3)

;Esta presente

(define estaPresente(lambda (elem l1)
                   (if (empty? l1)
                       #f
                       (if (equal? elem (car l1))
                           #t
                           (estaPresente elem (cdr l1))
                           ))))

;test: (estaPresente '3 '( 1 2 3 4 ) )

;Reversa Recursiva

(define rReversa(lambda ( l1 )
                      (if (empty? l1)
                          l1
                          (rReversa-aux l1 '())
                          )))

(define rReversa-aux(lambda (list nlist)
                 (if (empty? list)
                     nlist
                     (let ((fst (car list)) (rst (cdr list)))
                       (if (list? fst)
                           (rReversa-aux rst (cons (rReversa-aux fst '()) nlist))
                           (rReversa-aux rst (cons fst nlist))
                           )))))

;test: (rReversa '( 1 ( 2 3 ) (4 ( 5 ( 6 ) ) 7 ( 8 9 ) ) ) )

;Largo de una lista

(define largo(lambda (list)
               (if (empty? list)
                   0
                   (largo-aux list 0)
                   )))

(define largo-aux(lambda(list aux)
                (if (empty? list)
                    aux
                    (largo-aux (cdr list) (+ aux 1))
                    )))

;test: (largo '( 1 2 3 4)) 

;Aplanar

(define aplanar ( lambda ( ls )
                   (if (empty? ls)
                       ls
                       (let ((fst (car ls)) (rst (cdr ls)))
                         (if (list? fst)
                             (concatenar (aplanar fst) (aplanar rst))
                             (concatenar (cons fst '()) (aplanar rst))
                             )))))

;test: (aplanar '(0 (1 2 3) ( (4 5 6)) ((((7 8 (9)) 10))) 11))

;Obtener ultimo elemento

(define obtenerUltimo(lambda (list)
                 (if (empty? list)
                     list
                     (obtenerUltimo-aux list 0)
                     )))


(define obtenerUltimo-aux(lambda (list last)
                     (if (empty? list)
                         last
                         (obtenerUltimo-aux (cdr list) (car list))
                         )))


;test: (obtenerUltimo '( 1 2 3 4 ))

;Rotado de barril (Barrel-shift)

(define rotar(lambda (dir list) ;DIR TIENE QUE SER 'IZQ O 'DER
                         (if (equal? dir 'der)
                             (cons (car (reversa list)) (reversa (cdr (reversa list)))) ;REQUIERE REVERSA
                             (if (equal? dir 'izq)
                                 (concatenar (cdr list) (cons (car list) '()))
                                 list
                                 ))))

;test: (rotar 'izq '(1 2 3 4))
;test2: (rotar 'der '(1 2 3 4))

;Obtener mayor valor

(define obtenerMayor(lambda (list)
                      (if (empty? list)
                          list
                          (obtenerMayor-aux list (car list))
                          )))

(define obtenerMayor-aux(lambda(list cmax)
                           (if (empty? list)
                               cmax
                               (let ((fst (car list)) (rst (cdr list)))
                                 (if (> fst cmax)
                                     (obtenerMayor-aux (cdr list) fst)
                                     (obtenerMayor-aux (cdr list) cmax)
                                     )))))

;test: (obtenerMayor '( 1 2 3 4 5 6 4 3 2 1))

;Obtener menor
(define obtenerMenor(lambda (list)
                      (if (empty? list)
                          list
                          (obtenerMenor-aux list (car list))
                          )))

(define obtenerMenor-aux(lambda(list cmax)
                           (if (empty? list)
                               cmax
                               (let ((fst (car list)) (rst (cdr list)))
                                 (if (< fst cmax)
                                     (obtenerMenor-aux (cdr list) fst)
                                     (obtenerMenor-aux (cdr list) cmax)
                                     )))))

;test: (obtenerMenor '( 1 2 3 4 5 6 4 3 2 1))

(define anadirAlFinal( lambda ( elem list )
                        (if (empty? list)
                            (cons elem list)
                            (concatenar list (cons elem '()))
                            )))
;test: (anadirAlFinal 1 '( 1 2 3 4 ))

;Peso de una palabra

(define pesoPalabra(lambda (palabra)
                  (if (null? palabra)
                      0
                      (+ (char->integer (car palabra)) (pesoPalabra (cdr palabra)))
                      )))                   

;OPERACIONES 2D

(define-struct pos2D ( x y ))
(define t1 (make-pos2D 2 4))
(define t2 (make-pos2D 4 5))

;test: (define t1 (make-pos2D 2 4))
;      (define t2 (make-pos2D 4 5))

(define mostrar( lambda ( pos )
                  (display (pos2D-x pos))
                  (display " ")
                  (display (pos2D-y pos))
                  ))

;Distancia entre dos puntos

(define distancia(lambda (a b)
                  (let((dist (sqrt (+ (* (pos2D-y b) (pos2D-y b)) (* (pos2D-x a) (pos2D-x a))))))
                   dist
                   )))
;Resta

(define resta(lambda (p1 p2)
               (make-pos2D (- (pos2D-x p1) (pos2D-x p2)) (- (pos2D-y p1) (pos2D-y p2)))
               ))
;test: (distancia t1 t2)

;Suma

(define suma(lambda (p1 p2)
               (make-pos2D (+ (pos2D-x p1) (pos2D-x p2)) (+ (pos2D-y p1) (pos2D-y p2)))
               ))
;test: (mostrar (suma t1 t2))

;Sustituir
(define sustituir(lambda (elem remp list)
                     (if (null? list)
                         list
                         (if (eqv? (car list) elem)
                             (cons remp (sustituir elem remp (cdr list)))
                             (cons (car list) (sustituir elem remp (cdr list)))
                             ))))

;test: (sustituir 'a 'x '( a b c d e f g a ))

;ValorAbsolutoLista

(define listaAbsoluta( lambda ( list )
                        (map absolutoElemento list)
                        ))

(define absolutoElemento( lambda ( elem )
                          (sqrt ( * elem elem))
                          ))

;Multiplicacion

(define multiplicacion(lambda (p1 p2)
               (make-pos2D (* (pos2D-x p1) (pos2D-x p2)) (* (pos2D-y p1) (pos2D-y p2)))
               ))

;test: (mostrar (multiplicacion t1 t2))

;Producto Punto

(define productoPunto( lambda ( p1 p2 )
                        (+ (* (pos2D-x p1) (pos2D-x p2)) (* (pos2D-y p1) (pos2D-y p2)))
                        ))
;test: (productoPunto t1 t2)

;Producto Cruz

(define productoCruz( lambda ( p1 p2 )
                       (make-pso2D (* (pos2D-x p1) (pos2D-y p2)) (* (pos2D-y p1) (pos2D-x p2) '-1))
                       ))
;test: (mostrar (productoCruz t1 t2))


;Centro de gravedad

(define gravedad(lambda ( ls )
                  (if (null? ls)
                      0
                      (gravedad-auz (cdr ls) (car ls ) 1)
                      )))

(define gravedad-aux(lambda ( ls acum div )
              (if (null? ls)
                  (let ((pos (make-pos2D (/ (pos2D-x acum) div) (/ (pos2D-y acum) div))))
                    pos)
                  (gravedad-aux (cdr ls)
                        (make-pos2D (+ (pos2D-x acum) (pos2D-x (car ls))) (+ (pos2D-y acum) (pos2D-y (car ls))))
                        (+ div 1))
                  )))

;test: (mostrar (gravedad '(t1 t2)))

;Contar elemento

(define contarElemento-aux(lambda ( elem count ls)
                    (if (null? ls)
                        count
                        (if (= (car ls) elem)
                            (contarElemento-aux elem (+ count 1) (cdr ls))
                            (contarElemento-aux elem count (cdr ls))))))


(define contarElemnto(lambda ( elem ls )
                    (if (null? ls)
                        0
                        (contarElemento-aux elem 0 ls ))))


(define (ordenar lista)
  (cond ((null? lista) '())
        (else (let ((minimo (apply min lista)))
                (cons minimo
                      (ordenar (remove minimo lista)))))))

(define length2
  (lambda (l)
    (if (null? l)
        0
        (+ (length2 (cdr l)) 1))))

; función que cuenta un elemento en una lista.
(define count-elem
  (lambda (e l)
    (if (null? l)
        0
        (let ((p (car l)) (q (cdr l)))
          (if (eqv? p e)
              (+ 1 (count-elem e q))
              (count-elem e q))))))

(define contar ; cuenta la cantidad de un elemento en una lista de listas.
  (lambda (ls e)
    (if (null? ls)
        0
        (if (list? (car ls))
            (+ (contar (car ls) e) (contar (cdr ls) e))
            (if (eqv? (car ls) e)
                (+ 1 (contar (cdr ls) e))
                (contar (cdr ls) e))))))

; función que reemplaza un elemento x por otro y, en una lista.
(define subst
  (lambda (a b l)
    (if (null? l)
        ()
        (let ((p (car l)) (q (cdr l)))
          (if (eqv? p a)
              (cons b (subst a b q))
              (cons p (subst a b q))
              )))))

; función que elimina un elemento dado de una lista.
(define eliminar
  (lambda (e ls)
    (if (null? ls)
        ()
        (let ((p (car ls)) (q (cdr ls)))
            (if (equal? e p)
                (eliminar e q)
                (cons p (eliminar e q)))))))

(define eliminar ; elimina un elemento dado de una lista de listas.
  (lambda (ls e)
    (if (null? ls)
        ()
        (if (list? (car ls))
            (cons (eliminar (car ls) e) (eliminar (cdr ls) e))
            (if (eqv? (car ls) e)
                (eliminar (cdr ls) e)
                (cons (car ls) (eliminar (cdr ls) e)))))))

; función que agrupa los elementos iguales en sublistas.
(define agrupar
  (lambda (lista)
    (if (null? lista)
        ()
        (cons (vector->list (make-vector (count-elem (car lista) lista) (car lista)))
              (agrupar (eliminar (car lista) (cdr lista)))))))

; función que concatena dos listas.
(define concatenar
  (lambda (l1 l2)
    (if (null? l1)
        l2           
        (let ((p (car l1)) (q (cdr l1)))
          (if (null? q)    
              (cons p l2)   
              (cons p (concatenar q l2)))))))

; función que inserta un elemento al final de una lista.
(define attach-at-end
  (lambda (e l)
    (if (null? l)
        (cons e ())
        (let ((p (car l)) (q (cdr l)))
          (cons p (attach-at-end e q))))))

; función que devuelve la lista de las distancias entre cada punto, tomado de a pares consecutivos.
(define distancias
  (lambda (l)
    (if (null? l)
        ()
        (let ((p (car l)) (r (cdr l)))
          (if (null? r)
              ()
              (let ((q (car r)))
                (cons (distance2d p q) (distancias r))))))))

; sintaxis de struct: definición e instanciacion. 
(define-struct punto (x y))
(define e1 (make-punto 1 1))
(define e2 (make-punto 2 3))
(define e3 (make-punto 2 0))

(define-struct point3d (x y z))
(define a1 (make-point3d 1 1 1))
(define a2 (make-point3d 2 2 2))
(define a3 (make-point3d 3 3 3))

; función que retorna distancia entre dos puntos con struct.
(define dist
  (lambda (p1 p2)
    (let ((x1 (punto-x p1)) (x2 (punto-x p2)) (y1 (punto-y p1)) (y2 (punto-y p2)))
         (sqrt (+ (* (- x2 x1) (- x2 x1)) (* (- y2 y1) (- y2 y1)))))))

; función que retorna centro de gravedad entre los puntos de una lista.
(define sum_point ; sumo los x, y, z entre los puntos.
  (lambda (lista)
    (if (null? lista)
        '(0 0 0)
        (let ((p (car lista)) (r (cdr lista)))
             (map + (list (point3d-x p) (point3d-y p) (point3d-z p)) (sum_point r))))))

(define div_l ; divido por el largo de la lista (cantidad de puntos)
  (lambda (lista)
    (map (lambda (x) (/ x (length lista))) lista)))

(define gravc ; wrapper
  (lambda (lista)
    (if (null? lista)
        (display "Lista vacía")
        (let ((suma (sum_point lista)))
              (div_l suma)))))

; función para calcular la distancia máxima entre dos puntos de una lista CON MAP Y STRUCT.
(define dist_list ; creo lista de distancias
  (lambda (p1 ls)
    (map (lambda (x) (dist p1 x)) ls)))

(define max_list ; obtengo mayor de la lista
  (lambda (ls)
    (if (null? ls)
        0
        (let ((p (car ls)) (q (max_list (cdr ls))))
          (if (< p q)
              q
              p)))))

(define concatenar_max ; concateno las listas de distancias
  (lambda (lista)
      (let ((p (car lista)) (q (cdr lista)))
        (if (null? q)
          ()
          (concatenar (dist_list p q) (concatenar_max q))))
            ))

(define dist_max ; wrapper
  (lambda (lista)
    (if (null? lista)
        "Lista vacía."
        (max_list (concatenar_max lista))
            )))

; función para contar caracteres de un archivo.
(define char_count
  (lambda (i)
    (define ch (read-char i))
      (if (eof-object? ch)
          0
          (+ 1 (char_count i)))))

; función para contar palabras de un archivo.
(define word_count
  (lambda (i)
    (define w (read i))
    (if (eof-object? w)
        0
        (+ 1 (word_count i)))))

; sintaxis para llamar a funcion con archivo.
(define i (open-input-file "prueba.txt")) ; abro puerto p/ leer caracteres
;(char_count i) ; llamo a la función para contar.
(close-input-port i) ; cierro puerto así reseteo el cursor.

(define i (open-input-file "prueba.txt")) ; abro puerto p/ leer palabra
;(word_count i) ; llamo a la función para contar.
(close-input-port i)

; función para leer por pantalla un archivo.
(define read_file
  (lambda (i)
    (define rd (read-line i))
    (if (eof-object? rd)
        (display "\n")
        (and (display rd) (read_file i)))))

; función que crea un archivo y le escribe adentro.
(define o (open-output-file "saludo.txt"))
(display "hola" o)
(write-char #\space o)
(display 'mundo! o)
(newline o)
(close-output-port o)
    
; función para revertir una lista completamente, sin map.
(define fullreverse-list
  (lambda (lista)(define (ordenar-menor-a-mayor lista)
  (if (null? lista)
      '()
      (insertar-en-orden (car lista) (ordenar-menor-a-mayor (cdr lista)))))


(define (insertar-en-orden elemento lista-ordenada)
  (if (null? lista-ordenada)
      (list elemento)
      (if (< elemento (car lista-ordenada))
          (cons elemento lista-ordenada)
          (cons (car lista-ordenada) 
                (insertar-en-orden elemento 
                                   (cdr lista-ordenada))))))


    (if (null? lista)
        '()
        (if (list? (car lista))
            (concatenar (fullreverse-list (cdr lista)) (list (fullreverse-list (car lista))))
            (if (null? (cdr lista))
                lista
                (concatenar (fullreverse-list (cdr lista)) (list (car lista))))))
                   ))

; función para revertir lista completamente, con map. (usa inv)       
(define fullreverse-list ; invertir listas anidadas con map
  (lambda (ls)
    (inv (map (lambda (e) (if (list? e)
                                   (fullreverse-list e) e)) ls))))

; función para invertir una lista sin lista auxiliar.
(define inv ; invertir sin lista auxiliar (optimo)
  (lambda (ls)
    (if (null? ls)
        '()
        (concatenar (inv (cdr ls)) (cons (car ls) '())))))

; función para verificar que un elemento permanezca a una lista.
(define pertenece
  (lambda (e l)
    (if (null? l)
        #f
        (let ((p (car l)) (r (cdr l)))
          (if (eqv? e p)
              #t
              (pertenece e r))))))

; función para obtener el menor de una lista.
(define menor
  (lambda (ls)
    (let ((elem1 (car ls)))
      (if (= (length ls) 1)
          elem1
          (let ((elem2 (menor (cdr ls))))
            (if (< elem2 elem1)
                elem2
                elem1))))))

; función para ordenar una lista de menor a mayor (para mayor a menor, cambio el let).
(define ordenar
  (lambda (ls)
    (if (null? ls)
        ()
        (let ((m (menor ls)))
        (cons m (ordenar (eliminar m ls)))))))                

; función para obtener el mayor de una lista.
(define mayor
  (lambda (ls)
    (let ((elem1 (car ls)))
      (if (= (length ls) 1)
          elem1
          (let ((elem2 (mayor (cdr ls))))
            (if (> elem2 elem1)
                elem2
                elem1))))))

; función para obtener profundidad de una lista (cantidad de paréntesis)
(define get-profundidad
  (lambda (e)
    (if (null? e)
        0
        (if (list? e)
            (+ 1 (mayor (map (lambda (x) (get-profundidad x)) e)))
            -1))))

; función para quitar los paréntesis de una lista (aplanar)
(define aplanar
  (lambda (ls)
    (if (null? ls)
        ()
        (let ((p (car ls)) (r (cdr ls)))
          (if (list? p)
              (concatenar (aplanar p) (aplanar r))
              (cons p (aplanar r))
    )))))

(define last-elem ; función para obtener ultimo elemento.
  (lambda (ls)
    (let ((p (car ls)) (r (cdr ls)))
      (if (null? r)
          p
          (last-elem r))
    )))
  
(define first-elems ; función para obtener todos los elementos menos el último.
  (lambda (ls)
    (let ((p (car ls)) (r (cdr ls)))
      (if (null? (cdr ls))
        ()
        (cons p (first-elems r))
    ))))

; función para obtener profundidad de un árbol
(define profundidad
  (lambda (ls)
    (if (null? ls)
        0
        (if (null? (cdr ls))
            1
            (let  ((izq (profundidad (cadr ls))) (der (profundidad (caddr ls))))
              (if (> izq der)
                  (+ 1 izq)
                  (+ 1 der)))))))

(define pesopalabra-aux ; función para obtener el peso de cada palabra.
  (lambda (ls)
    (if (null? ls)
      0
      (let ((p (car ls)) (r (cdr ls)))
        (+ (char->integer p) (pesopalabra-aux r)))))) ; paso char a integer para obtener peso ascii de cada caracter.

(define pesopalabra ; wrapper para peso palabra.
  (lambda (st)
     (pesopalabra-aux (string->list st)))) ; paso string a lista para operar con car y cdr.

(define menor  ; encuentro el elemento de menor peso ascii.
  (lambda (ls)
    (if (null? ls)
        ()
        (let ((p (car ls)) (q (cdr ls)))
          (if (null? q)
              p
              (if (< (pesopalabra p) (pesopalabra (car q)))
                  (menor (cons (car ls) (cddr ls)))
                  (menor (cdr ls))))))))
     
(define ordenar  ; construyo la lista con el elem de menor peso ascii, lo elimino  y uso el resto p/ recursividad.
  (lambda (ls)
    (if (null? ls)
        ()
        (cons (menor ls) (ordenar (eliminar (menor ls) ls)))
        )))

; XOR
(define xor
  (lambda (a b)
    (if (or (and (not a) b) (and (not b) a))
        #t
        #f)))

; ORDENAR 
(define (ordenar-menor-a-mayor lista)
  (if (null? lista)
      '()
      (insertar-en-orden (car lista) (ordenar-menor-a-mayor (cdr lista)))))


(define (insertar-en-orden elemento lista-ordenada)
  (if (null? lista-ordenada)
      (list elemento)
      (if (< elemento (car lista-ordenada))
          (cons elemento lista-ordenada)
          (cons (car lista-ordenada) 
                (insertar-en-orden elemento 
                                   (cdr lista-ordenada))))))

