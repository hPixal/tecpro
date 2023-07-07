f(a, 2).
f(a, 3).
f(b, 2).
f(b, 4).
f(c, 1).
f(c, 2).

#f(X,1) X = C
#f(X) = ERROR
#f(a,X) X = 2
#f(c,1) = true.
#f(X,Y). 
#X = a,
#Y = 2 .
#f(2,a). false

padre(leonicio,alberto).
padre(leonicio,geronimo).
padre(alberto,juan).
padre(alberto,luis).
padre(geronimo,luisa).
hermano(A,B):- padre(C,A) , padre(C,B).
nieto(A,B):- padre(A,C), padre(C,B).

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


