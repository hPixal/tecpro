%% Se quiere implementar un predicado lógico para conocer la facturación de entradas de cada sala de película de un cine. La representación de las salas de cine deberán tener un nombre y la disposición de asientos en una lista de listas para simular una matriz.
%% Los asientos vacíos se representan con 0, ocupados general con 1, jubilado con 2 y niño con 3, no se debe considerar los pasillo. Las entradas generales hoy tienen un valor de $500, los jubilados pagan $350 y los niños $250, sería deseable que encuentre una manera de parametrizar estos valores ya que con la inflación que hay en argentina es probable que el precio cambie semana a semana.
%% El resultado debe ser la cantidad facturada por tipo y el total general por cada sala. Y la función principal solo recibe un parámetro libre para devolver el resultado, el resto de los datos los debe sacar de la base de conocimientos, por lo tanto deberá encontrar el mejor modelo de la base de conocimientos para el problema en cuestión.
%% No se pueden utilizar funciones predefinidas.
%% 
%% Ejemplo de sala, 4 filas y 7 asientos:
%% 
%% Sala 1, [[0, 0, 0, 1, 1, 0, 0],
%% 
%% 	[1, 1, 0, 1, 3, 2, 0],
%% 
%% 	[0, 0, 1, 3, 3, 1, 0],
%% 
%%  	[0, 0, 0, 2, 2, 0, 0],
%% 
%% 	]
%% 
%% Ejemplo de predicado: 
%% 
%% cine(Resultado).
%% 
%% Resultado = ["Sala 1", [
%% 
%% 	["Generales", 3000],
%% 
%% 	["Jubilados", 2000],
%% 
%% 	["Niños", 1000],
%% 
%% 	["Total", 6000]
%% 
%% 	]]
%% 
%% Resultado = ["Sala 2", [
%% 
%% 	["Generales", 3000],
%% 
%% 	["Jubilados", 2000],
%% 
%% 	["Niños", 1000],
%% 
%% 	["Total", 6000]
%% 
%% 	]]
%% 
%% Resultado = ["Sala 3", [
%% 
%% 	["Generales", 3000],
%% 
%% 	["Jubilados", 2000],
%% 
%% 	["Niños", 1000],
%% 
%% 	["Total", 6000]
%% 
%% 	]

% Quiero una funcion que recorrar el un arreglo y obtenga lo obtenido para una categoria de boleto especifica
% Otra que haga lo mismo que la de arriba pero para cualquier tipo de entrada
% Quiero una funcion que recorra una matriz le saque los vectores y entonces le mande esta lista

entrada(0,0).
entrada(1,500).
entrada(2,350).
entrada(3,250).

sala("Sala 1",[[0, 0, 0, 1, 1, 0, 0],
               [1, 1, 0, 1, 3, 2, 0],
               [0, 0, 1, 3, 3, 1, 0],
               [0, 0, 0, 2, 2, 0, 0]]).

sala("Sala 2",[[0, 1, 0, 1, 1, 0, 0],
               [1, 1, 0, 1, 3, 2, 0],
               [0, 0, 1, 3, 3, 1, 0],
               [0, 3, 3, 2, 2, 0, 0]]).


getPrecioTotalLISTA([],_,0).
getPrecioTotalLISTA([PARAM|CDR],PARAM,ACUM):-
    entrada(PARAM,PRECIO),
    getPrecioTotalLISTA(CDR,PARAM,ACUM2),
    ACUM is ACUM2 + PRECIO, !.
    
getPrecioTotalLISTA([CAR|CDR],PARAM,ACUM):-
    CAR \= PARAM,
    getPrecioTotalLISTA(CDR,PARAM,ACUM), !.

getPrecioTotalMATRIZ([],_,0).
getPrecioTotalMATRIZ([CAR|CDR],PARAM,PRECIO):-
    getPrecioTotalLISTA(CAR,PARAM,PRECIO2),
    getPrecioTotalMATRIZ(CDR,PARAM,PRECIO3),
    PRECIO is PRECIO2 + PRECIO3.


obtenerListaPrecios(L,RESPUESTA):-
    getPrecioTotalMATRIZ(L,1,PRECIOGENERAL),
    GENERALES = ["GENERALES :",PRECIOGENERAL],
    getPrecioTotalMATRIZ(L,2,PRECIOJUBILADOS),
    JUBILADOS = ["JUBILADOS :",PRECIOJUBILADOS],
    getPrecioTotalMATRIZ(L,3,PRECIONINOS),
    NINOS     = ["NIÑOS     :",PRECIONINOS],
    PRECIOTOTAL is PRECIOGENERAL + PRECIONINOS + PRECIOJUBILADOS,
    TOTAL     = ["TOTAL     :",PRECIOTOTAL],
    RESPUESTA = [GENERALES,JUBILADOS,NINOS,TOTAL].

cine(X):-
    sala(NOM,L),
    obtenerListaPrecios(L,RES),
    X = [NOM,RES].
    
