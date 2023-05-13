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
semejanza([_|CDR],[],COUNT):- semejanza(CDR,[],COUNTR), COUNT is COUNTR-1.

semejanza([ELEM|CDR1],[ELEM|CDR2],COUNT):-
    semejanza(CDR1,CDR2,COUNTR),
    COUNT is COUNTR + 1.

semejanza([CAR1|CDR1],[CAR2|CDR2],COUNT):-
    CAR1 \= CAR2,
    semejanza(CDR1,CDR2,COUNTR),
    COUNT is COUNTR-1.