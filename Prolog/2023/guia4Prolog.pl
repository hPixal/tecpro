%Ejercicio 1
%Tablero es 8*8
posicion(a,1).
posicion(b,2).
posicion(c,3).
posicion(d,4).
posicion(e,5).
posicion(f,6).
posicion(g,7).
posicion(h,8).

amenazaTorre(POSX,_,POSX,_).
amenazaTorre(_,POSY,_,POSY).

amenazaAlfil(POSX,POSY,FINX,FINY):-
    RESX is POSX-FINX,
    RESY is POSY-FINY,
    RESX == RESY.
amenazaAlfil(POSX,POSY,FINX,FINY):-
    RESX is POSX-FINX,
    RESY is POSY-FINY,
    RESX == -RESY.

alfil(CASX,CASY,ALFILX,ALFILY):-
    posicion(CASX,CX),
    posicion(ALFILX,AX),
    amenazaAlfil(CX,CASY,AX,ALFILY).

torre(CASX,CASY,ALFILX,ALFILY):-
    posicion(CASX,CX),
    posicion(ALFILX,AX),
    amenazaTorre(CX,CASY,AX,ALFILY).

reina(CASX,CASY,ALFILX,ALFILY):-
    posicion(CASX,CX),
    posicion(ALFILX,AX),
    amenazaTorre(CX,CASY,AX,ALFILY).

reina(CASX,CASY,ALFILX,ALFILY):-
    posicion(CASX,CX),
    posicion(ALFILX,AX),
    amenazaAlfil(CX,CASY,AX,ALFILY).

%Ejercicio 2
vio(jose,['Misterio a Bordo', 'The Perfection', 'Otro día para matar','Barreras','Yo soy Sam','Inspection']).
vio(maria,['Quizás para siempre','A pesar de todo','La casa del Lago','Barreras']).
vio(pedro,['Barreras', 'Otro día para matar', 'Yo soy Sam','A pesar de todo']).

esta_presente(ELEM,[ELEM|_]):- !.
esta_presente(ELEM,[CAR|CDR]):-
              ELEM \= CAR,
              esta_presente(ELEM,CDR).

coincide([],_,0).
coincide([CAR|CDR],L2,COUNT):-
    esta_presente(CAR,L2),
    coincide(CDR,L2,COUNTR),
    COUNT is COUNTR+1.
coincide([CAR|CDR],L2,COUNT):-
    not(esta_presente(CAR,L2)),
    coincide(CDR,L2,COUNT).

recomendar(NOM,L):- 
    vio(NOM,L1),
    vio(NOM2,_),
    NOM2 \= NOM,
    vio(NOM2,L2),
    coincide(L1,L2,COUNT),
    COUNT > 2,
    recomendar_aux(L1,L2,L).

recomendar_aux([],_,[]).

recomendar_aux([CAR1|CDR1],[CAR2|CDR2],L):-
    not(esta_presente(CAR1,[CAR2|CDR2])),
    recomendar_aux(CDR1,CDR2,L1),
    L = [CAR1|L1].

recomendar_aux([CAR1|CDR1],[CAR2|CDR2],L):-
    esta_presente(CAR1,[CAR2|CDR2]),
    recomendar_aux(CDR1,CDR2,L).

%Ejercicio 3
esta_presente(ELEM,[ELEM|_]):- !.
esta_presente(ELEM,[CAR|CDR]):-
              ELEM \= CAR,
              esta_presente(ELEM,CDR).

tiene_repetidos([CAR,CAR|_]):- !.
tiene_repetidos([CAR,CAR2|CDR]):-
    	CAR \= CAR2,
    	tiene_repetidos([CAR2|CDR]).

interseccion([],_,[]).
interseccion([CAR|CDR],C2,L):-
    not(tiene_repetidos([CAR|CDR])),
    not(tiene_repetidos(C2)),
    esta_presente(CAR,C2),
    interseccion(CDR,C2,L2),
    L = [CAR|L2].

interseccion([CAR|CDR],C2,L):-
	not(tiene_repetidos([CAR|CDR])),
    not(tiene_repetidos(C2)),
    not(esta_presente(CAR,C2)),
    interseccion(CDR,C2,L). 

union([],C2,C2).
union([CAR|CDR],C2,L):-
	not(tiene_repetidos([CAR|CDR])),
    not(tiene_repetidos(C2)),
    union(CDR,C2,L1),
    L = [CAR|L1].

diferencia([],L,L).
diferencia(L,[],L).
diferencia([],[],[]).
diferencia([CAR1|CDR1],[CAR2|CDR2],L):-
    not(tiene_repetidos([CAR1|CDR1])),
    not(tiene_repetidos([CAR2|CDR2])),
    not(esta_presente(CAR1,CDR2)),
    not(esta_presente(CAR2,[CAR1|CDR1])),
    diferencia(CDR1,CDR2,L1),
    L = [CAR1,CAR2|L1].
diferencia([CAR1|CDR1],[CAR2|CDR2],L):-
    not(tiene_repetidos([CAR1|CDR1])),
    not(tiene_repetidos([CAR2|CDR2])),
    not(esta_presente(CAR1,[CAR2|CDR2])),
    esta_presente(CAR2,[CAR1|CDR1]),
    diferencia(CDR1,CDR2,L1),
    L = [CAR1|L1].
diferencia([CAR1|CDR1],[CAR2|CDR2],L):-
    not(tiene_repetidos([CAR1|CDR1])),
    not(tiene_repetidos([CAR2|CDR2])),
    esta_presente(CAR1,[CAR2|CDR2]),
    not(esta_presente(CAR2,[CAR1|CDR1])),
    diferencia(CDR1,CDR2,L1),
    L = [CAR2|L1].
diferencia([CAR1|CDR1],[CAR2|CDR2],L):-
    not(tiene_repetidos([CAR1|CDR1])),
    not(tiene_repetidos([CAR2|CDR2])),
    esta_presente(CAR1,[CAR2|CDR2]),
    esta_presente(CAR2,[CAR1|CDR1]),
    diferencia(CDR1,CDR2,L).