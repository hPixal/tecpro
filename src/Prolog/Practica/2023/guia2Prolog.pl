%Ejercicio 1
factorial(0,1).
factorial(ELEM,F) :-
    ELEM>0,
    N1 is ELEM-1,
    factorial(N1,F1),
    F is ELEM * F1.

%Ejercicio 2
contar([],_,0).

contar([ELEM|CDR],ELEM,COUNT) :-
    contar(CDR,ELEM,COUNTR),
    COUNT is COUNTR + 1.

contar([CAR|CDR],ELEM,COUNT) :-
    CAR =\= ELEM,
    contar(CDR,ELEM,COUNT).

%Ejercicio 3
contarElementos([],0).
contarElementos([_|CDR],COUNT):-
    contarElementos(CDR,COUNTR),
    COUNT is COUNTR + 1.

%Ejercicio 4
suma([],0).
suma([CAR|CDR],SUM):-
    suma(CDR,SUMR),
    SUM is SUMR + CAR.

%Ejercicio 5
positivo([],[]).

positivo([CAR|CDR],LS):-
    CAR > 0,
    positivo(CDR,LSR),
    LS = [CAR|LSR].

positivo([CAR|CDR],LS):-
    CAR =< 0,
    positivo(CDR,LS).


%Ejercicio 6
suma_lista([],[],[]).

suma_lista([CAR1|CDR1],[CAR2|CDR2],LS):-
    NCAR is CAR1 + CAR2,
    suma_lista(CDR1,CDR2,LS2),
    LS = [NCAR|LS2].

%Ejercicio 7
eliminar_elem([],[],_).

eliminar_elem([ELEM|CDR],LS,ELEM):-
    eliminar_elem(CDR,LS,ELEM).

eliminar_elem([CAR|CDR],LS,ELEM):-
    CAR =\= ELEM,
    eliminar_elem(CDR,LS1,ELEM),
    LS = [CAR|LS1].

eliminar_dup([],[]).

eliminar_dup([CAR|CDR],LS):-
    eliminar_dup(CDR,LS2),
    eliminar_elem(LS2,LS1,CAR),
    LS = [CAR|LS1].

%Ejercicio 9
insertar(CAR,[],[CAR]).
insertar(ELEM,[CAR|CDR],[ELEM,CAR|CDR]):-
     CAR > ELEM. 
insertar(ELEM,[CAR|R1],[CAR|R2]):- 
    insertar(ELEM,R1,R2). 


%Ejercicio 10
ordenar([],[]).
ordenar([CAR|CDR],LS):-
    ordenar(CDR,LS2),
    insertar(CAR,LS2,LS).

%Ejercicio 11


%Concatenar
concatenar([],L2,L2).
concatenar([CAR|L1],L2,[CAR|L3]):-
    concatenar(L1,L2,L3).

aplanar([],[]).

aplanar([CAR|CDR],L) :-
    aplanar(CAR,L1),
    aplanar(CDR,L2),
    concatenar(L1,L2,L).

aplanar(L,[L]).

%Ejercicio 12
