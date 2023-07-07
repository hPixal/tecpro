diccionario('hola').
diccionario('hoja').
diccionario('hija').

% Quiero una funcion que valide la lista

validar([]).
validar([CAR|CDR]):-
    not(number(CAR)),
    validar(CDR).

% Quiero una funcion que dada una lista de caracteres checkee si se puede formar una palabra dada

se_forma(_,[]):-!.
se_forma([CAR|CDR],L1):-
    eliminarNCaracteres(CAR,L1,L2,1),
    se_forma(CDR,L2).
    

% Quiero una funcion que si un caracter esta en la lista, lo elimine de la misma.

eliminarNCaracteres(_,[],[],_).
eliminarNCaracteres(ELEM,[ELEM|CDR],L,N):-
    N \= 0,
    N2 is N-1,
    eliminarNCaracteres(ELEM,CDR,L1,N2),
    L = L1,!.
eliminarNCaracteres(ELEM,[ELEM|CDR],L,N):-
    N == 0 ,
    eliminarNCaracteres(ELEM,CDR,L1,N),
    L = [ELEM|L1],!.
eliminarNCaracteres(ELEM,[CAR|CDR],L,N):-
    CAR \= ELEM,
    eliminarNCaracteres(ELEM,CDR,L1,N),
    L = [CAR|L1],!.

% Quiero una funcion que resuelva los datos para pasarselos.

formaPalabras(L,RES):-
    validar(L),
    diccionario(RES),
    atom_chars(RES,L2),
    se_forma(L,L2).