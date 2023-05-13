%Ejercicio 1
factorial(0,1).
factorial(N,F) :-
    N>0,
    N1 is N-1,
    factorial(N1,F1),
    F is N * F1.

%Ejercicio 2
contar(_,[],0).
contar(ELEM,[ELEM|CDR],C):- contar(ELEM,CDR,C1), C is C1 + 1.
contar(ELEM,[_|CDR],C):- contar(ELEM,CDR,C).

%Ejercicio 3
cantidad([],0).
cantidad([_|CDR],CANT):- cantidad(CDR,CANT1), CANT is CANT1 + 1.

%Ejercicio 4
suma([],0).
suma([CAR|CDR],X):- suma(CDR,X1), X is X1 + CAR.

%Ejercicio 5
positivo([],[]).
positivo([CAR|CDR],[CAR|L]):- CAR >= 0, positivo(CDR,L). 
positivo([CAR|CDR],L):-  positivo(CDR,L). 


%Ejercicio 6
suma_lista([],[],[]).
suma_lista([CAR1|CDR1],[CAR2|CDR2],[L1|S]):- L1 is CAR1 + CAR2,suma_lista(CDR1,CDR2,S).

%Ejercicio 7
eliminar_dup([],)