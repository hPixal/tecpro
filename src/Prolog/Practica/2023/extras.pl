%Busqueda recursiva 
lookfor([ELEM|_],ELEM).
lookfor([CAR|CDR],ELEM) :-
    CAR \= ELEM,
    lookfor(CDR,ELEM).

%Esta ordenada
isSorted([]).
isSorted([_]).
isSorted([FST,SCD|CDR]):-
    FST > SCD,
    isSorted([SCD|CDR]).


%Concatenar
concatenar([],L2,L2).
concatenar([CAR|CDR],L2,R):-
    concatenar(CDR,L2,R2),
    R = [CAR|R2].