% Se debe implementar un predicado en PROLOG que resuelva 
% el calculo del dinero que una persona debe pagar o recibir en una peña.
% 
% Las personas que compran cosas para la peña pueden pagar 
% con o sin billetera santa fe, en caso de abonar con billetera, 
% a lo que compro se le debe considerar un descuento del 30%, 
% en caso contrario se considera el monto gastado al 100%.
% 
% El monto que deberá pagar cada uno sera la suma de todo lo que se 
% compro (con y sin descuento) dividido la cantidad de personas que asisten.
% 
% Para el calculo de lo que debe pagar o recibir una persona deben considerar:
% 
%     La persona que SI pago con billetera deberá pagar o recibir dinero 
%     dependiendo de la cantidad que hayan gastado con el descuento.
%     La persona que NO pago con billetera deberá pagar o recibir dinero 
%     dependiendo de la cantidad que hayan gastado.
%     La persona que no compro nada deberá pagar el total del monto.
% 
% El predicado recibirá una lista con las personas que participan en la peña 
% y deberá devolver una lista de listas, donde cada lista tendrá 3 elementos: 
% el nombre de la persona, si debe pagar o recibir dinero, y la cantidad.
% 
% Deberá plantear una base de conocimientos con los datos necesario para resolver el problema.
% 
% No se pueden utilizar predicados predefinidos. (Ante la duda preguntar!!!)
% 
% Ejemplo:
% pablo gasto $4500 y pago con billetera.
% gabriel gasto $1450 y NO pago con billetera
% federico gasto $800 y pago con billetera
% franco gasto $800 y NO pago con billetera
% peña([juan, agustin, franco, pablo, gabriel, ulises, federico], Resultado).
% Resultado = [
% [juan, paga, 851.4285714285714],
% [agustin, paga, 851.4285714285714],
% [franco, paga, 51.428571428571445],
% [pablo, recibe, 2298.5714285714284],
% [gabriel, recibe, 598.5714285714286],
% [ulises, paga, 851.4285714285714],
% [federico, paga, 291.42857142857144] ]

paga(pablo,4500,1).
paga(gabriel,1450,0).
paga(federico,800,1).
paga(franco,800,0).

obtenerBruto([],0,0).
obtenerBruto([CAR|CDR],ACUM,COUNT):-
    paga(CAR,GASTADO,0),
    obtenerBruto(CDR,ACUM1,COUNT1),
    ACUM is ACUM1 + GASTADO,
    COUNT is COUNT1 + 1.

obtenerBruto([CAR|CDR],ACUM,COUNT):-
    paga(CAR,GASTADO,1),
    obtenerBruto(CDR,ACUM1,COUNT1),
    ACUM is ACUM1 + GASTADO*7/10,
    COUNT is COUNT1 + 1.

obtenerBruto([CAR|CDR],ACUM,COUNT):-
    not(paga(CAR,_,_)),
    obtenerBruto(CDR,ACUM,COUNT1),
    COUNT is COUNT1 + 1.

debePagar([],_,[]).

debePagar([CAR|CDR],TOT,L):-
    paga(CAR,GASTADO,1), %caso con billetera y recibe
    GASTOREAL is GASTADO*7/10 - TOT,
    0 < GASTOREAL,
    debePagar(CDR,TOT,L1),
    L = [[CAR,recibe,GASTOREAL]|L1].

debePagar([CAR|CDR],TOT,L):- %caso con billetera y debe
    paga(CAR,GASTADO,1),
    GASTOREAL is GASTADO*7/10 - TOT,
    0 >= GASTOREAL,
    debePagar(CDR,TOT,L1),
    L = [[CAR,paga,GASTOREAL]|L1].

debePagar([CAR|CDR],TOT,L):-
    paga(CAR,GASTADO,0), %caso sin billetera y debe
    GASTOREAL is GASTADO - TOT,
    0 >= GASTOREAL,
    debePagar(CDR,TOT,L1),
    L = [[CAR,paga,GASTOREAL]|L1].

debePagar([CAR|CDR],TOT,L):-
    paga(CAR,GASTADO,0), %caso sin billetera y recibe
    GASTOREAL is GASTADO - TOT,
    0 < GASTOREAL,
    debePagar(CDR,TOT,L1),
    L = [[CAR,recibe,GASTOREAL]|L1].

debePagar([CAR|CDR],TOT,L):-
    not(paga(CAR,_,_)), %caso no puso nada
    debePagar(CDR,TOT,L1),
    L = [[CAR,paga,TOT]|L1].

peña(L,R):- 
    obtenerBruto(L,ACUM,COUNT),
    TOT is ACUM/COUNT,
    debePagar(L,TOT,R).