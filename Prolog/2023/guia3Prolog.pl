%Ejercicio 3
%elimina_primero([CAR|CDR],ELEM,R)

eliminar_elem([],_,[]).

eliminar_elem([ELEM|CDR],ELEM,CDR):- !.
eliminar_elem([CAR|CDR],ELEM,L):-
    eliminar_elem(CDR,ELEM,L1),
    L = [CAR|L1].

%Ejercicio 4


agregar_nuevo(ELEM,[],[ELEM]):- !.

agregar_nuevo(ELEM,[ELEM|CDR],[ELEM|CDR]):- !.

agregar_nuevo(ELEM,[CAR|CDR],L):-
    agregar_nuevo(ELEM,CDR,L1),
    L = [CAR|L1].

%Ejercicio 5

semejanza([],[],0).
semejanza([],[_|CDR],COUNT):- semejanza([],CDR,COUNTR), COUNT is COUNTR-1.
semejanza([_|CDR],[],COUNT):- semejanza(CDR,[],COUNTR), COUNT is COUNTR-1, !.

semejanza([ELEM|CDR1],[ELEM|CDR2],COUNT):-
    semejanza(CDR1,CDR2,COUNTR),
    COUNT is COUNTR + 1, !.

semejanza([CAR1|CDR1],[CAR2|CDR2],COUNT):-
    CAR1 \= CAR2,
    semejanza(CDR1,CDR2,COUNTR),
    COUNT is COUNTR-1, !.

%Ejercicio 6

dic([sanar, hola, sabana, sabalo, prueba, computadora, cartera, mate, termo, mesa, silla, sarna]).

encontrar(WORD,[WORD|_],[WORD]):- !.
encontrar(_,[],[]).

encontrar(WORD,[CAR|CDR],[[CAR,COUNT]|L2]):- 
    atom_chars(CAR,X), atom_chars(WORD,Y),
    semejanza(X,Y,COUNT),
    COUNT > 0,
    encontrar(WORD,CDR,L2), !.

encontrar(WORD,[_|CDR],L):- 
    encontrar(WORD,CDR,L).

buscar(WORD,L):- dic(L2), encontrar(WORD,L2,L).

%EJercicio 7 

%reemplazar(elementoAReemplazar,reemplazo,numeroDeAparicion,cantidadDeVeces,Lista)
reemplazar(_,_,_,[]).
reemplazar(ELEM,REEM,NAP,CAV,[CAR|CDR]):- 
    reemplazar(ELEM,REEM,NAP,CAV,CDR).

reemplazar(ELEM,REEM,NAP,CAV,[CAR|CDR]):- %Reemplaza sin restriccion
    ELEM == CAR,
    CAV == -1,
    NAP == 1,
    reemplazar(ELEM,REEM,NAP,CAV,CDR2),
    CDR = CDR2,
    CAR is REEM.

reemplazar(ELEM,REEM,NAP,_,[REM|CDR]):- %Caso pasa porque no le toca
    NAP >= 1,
    NAP2 is NAP-1,
    reemplazar(ELEM,REEM,NAP2,CAV,CDR2),
    CDR is CDR2.

reemplazar(ELEM,REEM,NAP,CAV,[CAR|CDR]):- %Caso reemplaza pero tiene restriccion
    CAR == ELEM,
    CAV > 0,
    NAP == 1,
    CAR =/= ELEM,
    CAV2 is CAV-1,
    reemplazar(ELEM,REEM,NAP2,CAV2,CDR2),
    CDR is CDR2.

