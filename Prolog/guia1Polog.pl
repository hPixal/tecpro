progenitor(tomás, juan).
progenitor(ana, tomás).
progenitor(juan, marcos).
progenitor(alicia, juan).


%Guía de Trabajos prácticos numero uno 

%EJercicio nro 1
f(a, 2).
f(a, 3).
f(b, 2).
f(b, 4).
f(c, 1).
f(c, 2).
% f(X, 1).
%f(x).
%f(a,X).
%f(c,1).
%f(X,Y)
%f(2,a).
% f(X, Y), f(X, 4).

%Ejercicio nro 2
padre(geronimo,esteban).
macho(geronimo). macho(esteban).
padre(leonocido, alberto). 
macho(leonocido). macho(alberto).
padre(leonocido, geronimo).
macho(geronimo).
padre(alberto, juan). 
macho(alberto). macho(juan).
padre(alberto, luis).
macho(luis).
padre(geronimo, luisa).
macho(geronimo).
hermano(X,Y):- padre(Z,X), padre(Z,Y).
nieto(A,B):- padre(C,A), padre(B,C).

padre(P,H):- progenitor(P,H), macho(P).
madre(M,H):- progenitor(M,H), hembra(M).
abuela(A,N):-  madre(A,X), progenitor(X,N).
abuelo(A,N):- padre(A,X), progenitor(X,N).
tatarAbuela(A,TN):- madre(A,H1), progenitor(H1,H2), progenitor(H2,TN).
hermanxs(P,H):- madre(M,H), madre(M,P), padre(X,H), padre(X,P),P \= H.

%Ejercicion nro 3

menu('Bombones de jamón', 'Locro', 'Dulce de batata').
menu('Bombones de jamón', 'Locro', 'Alfajor norteño').
menu('Tarta de Atún', 'Atados de repollo', 'Dulce de batata').
menu('Tarta de Atún', 'Pollo romano con hierbas y vino', 'Flan').
menu('Volovanes de atún', 'Matambre con espinacas y parmesano', 'Torta moka').
menu('Buñuelos de bacalao', 'Pollo romano con hierbas y vino', 'Alfajor norteño').

ruta(santafe, parana).
ruta(parana, corrientes).
ruta(santafe, cordoba).
ruta(santafe, coronda).
ruta(santafe, rosario).
ruta(rosario, capital).
ruta(rosario, mardelplata).
ruta(capital, cordoba).
