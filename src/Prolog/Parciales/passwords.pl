% La cátedra de TecProg les solicita a sus alumnos que creen un programa en el paradigma logico llamado "passValidator" que se encargue de
% validar una contraseña de usuario. La salida de la función debe ser un string que indique si la clave ingresada no cumple con alguna de las
% condiciones, especificando cada una, o en caso contrario, notificar que la clave es válida.
% Las condiciones que debe cumplir la misma son:
% • La clave debe ser un string. LISTO
% • La clave debe contener entre 8 y 12 caracteres. LISTO
% • La clave debe contener al menos una letra mayúscula. LISTO
% • La clave NO debe contener secuencias de 3 números ascendentes o descendentes. LISTO

%Necesito una funcion que checkee si es un string

%Necesito una funcion que se fije que la pass tenga mas de 7 y menos de 12 

%Necesito una que cuente la cantidad de numeros que hay

get_length([], 0).
get_length([_|CDR], COUNT):-
    get_length(CDR, COUNT1),
    COUNT is COUNT1 + 1.

check_length(CHARS):-
    get_length(CHARS, X),
    X > 7, X < 13.

check_mayus([]):-false,!.
check_mayus([_|CDR]):- check_mayus(CDR).
check_mayus([CAR|_]):-
    char_type(CAR, alpha),
    char_type(CAR, upper),!.

tiene_numero([]) :- false.
tiene_numero([CAR|_]):-
    char_type(CAR, digit).
tiene_numero([_|CDR]):-
    tiene_numero(CDR).

tiene_secuencia([CAR1, CAR2, CAR3|_]):-
    char_type(CAR1, digit),
    char_type(CAR2, digit),
    char_type(CAR3, digit),
    number_chars(NUM1, [CAR1]),
    number_chars(NUM2, [CAR2]),
    number_chars(NUM3, [CAR3]),
    X2 is NUM1 + 1,X3 is NUM2 + 1,
    NUM2 == X2 , NUM3 == X3 .
tiene_secuencia([CAR1, CAR2, CAR3|_]):-
    char_type(CAR1, digit),
    char_type(CAR2, digit),
    char_type(CAR3, digit),
    number_chars(NUM1, [CAR1]),
    number_chars(NUM2, [CAR2]),
    number_chars(NUM3, [CAR3]),
    X2 is NUM1 - 1,X3 is NUM2 - 1,
    NUM2 == X2 , NUM3 == X3 .
tiene_secuencia([_|CDR]):-
    tiene_secuencia(CDR).

passValidator(WORD):-
    string(WORD),
    string_chars(WORD, CHARLIST),
    tiene_numero(CHARLIST),
    not(tiene_secuencia(CHARLIST)),
    check_mayus(CHARLIST),
    check_length(CHARLIST).