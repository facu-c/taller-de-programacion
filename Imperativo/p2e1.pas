program untitled;


//Constantes
const corte = 0;

//Tipos de datos
type
	socios = record
		num: integer;
		nombre: string;
		edad:integer;
	end;
	
	arbol = ^nodo;
	
	nodo = record
		dato:socios;
		HI:arbol;
		HD:arbol;
	end;
	
//Procesos
procedure leerInfo(var s: socios);
begin
	with s do begin
		write('Ingresar numero: '); readln(num);
		if(num <> 0)then
		begin
			write('Ingresar nombre: '); readln(nombre);
			write('Ingresar edad: '); readln(edad);
		end;
	end;
end;

procedure cargarArbol(var a:arbol; dato:socios);
begin
	if(a = nil)then
	begin
		new(a); a^.dato:=dato; a^.HI:=nil; a^.HD:=nil;
	end
	else if(a^.dato.num >= dato.num)then begin
		cargarArbol(a^.HI,dato);
	end
	else
		cargarArbol(a^.HD,dato);
end;

procedure leerCargar(var a:arbol);
var dato: socios;
begin
	leerInfo(dato);
	while(dato.num <> 0)do begin
		cargarArbol(a,dato);
		leerInfo(dato);
	end;
end;

function codigoMayor(a: arbol): integer;	// ENCUENTRO EL CODIGO MAYOR, RETORNO SOLO EL DATO NO EL NODO
begin
	if(a = nil) then codigoMayor := -1	  //EN CASO DE NO TENER NINGUN VALOR, RETORNO -1
	else if( a^.HD = nil )then codigoMayor:= a^.dato.num	//SI YA NO HAY NODOS DERECHOS, QUIERE DECIR QUE LLEGUÉ AL ÚLTIMO Y EL MAYOR
	else codigoMayor:= codigoMayor(a^.HD);	//AVANZO EN CASO DE NO FINALIZAR LOS NODOS DERECHOS
end;

function socioMenor(a: arbol) :arbol;	//ENCUENTRO EL SOCIO CON EL CODIGO MENOR, RETORNO EL NODO, NO EL DATO
begin
	if(a = nil) then socioMenor:= nil	//EN CASO NO TENER NINGUN SOCIO, ASIGNO NIL PARA NO HACER UN LOOP
	else if( a^.HI = nil ) then socioMenor := a 	//SI EL SIGUIENTE HIJO IZQUIERDO ES NIL ENTONCES LLEGUE AL NODO CON EL CODIGO MENOR
	else socioMenor := socioMenor(a^.HI); 	//AVANZO EN CASO DE TODAVIA NO ENCONTRAR EL ULTIMO NODO IZQUIERDO
end;

procedure socioMayorEdad(a: arbol; var edad: integer);	//ENCUENTRO EL SOCIO CON LA MAYOR EDAD (TENGO QUE RECORRER TODO EL ARBOL)
begin
	if( a <> nil )then begin // EL CASO BASE ES HABER LLEGADO A NIL, POR CADA RAMA DEL NODO
		socioMayorEdad(a^.HI,edad);	// *1  VOY RECORRIEDO TODOS LOS HIJOS IZQUIERDOS
		if(a^.dato.edad > edad)then edad:= a^.dato.edad;	//REALIZO LA COMPARACION Y ASIGNO
		socioMayorEdad(a^.HD, edad); //RECORRO LOS HIJOS DERECHOS - QUE AL VOLVER A ENTRAR VOLVERA A RECORRER SUS HIJOS IZQUIERDOS *1
	end;
end;

procedure aumentarEdad(a: arbol);	//En consecuencia con el anterior proceso recorro todos los nodos y los aumento en 1 en la edad
begin
	if( a <> nil)then begin
		aumentarEdad(a^.HI);
		a^.dato.edad:= a^.dato.edad + 1;
		aumentarEdad(a^.HD);
	end;
end;

function existeValor(a: arbol; valor: integer): boolean;	//BUSCO SI EXISTE EL VALOR QUE ESTOY INGRESANDO
begin
	if( a = nil )then existeValor:= false //CASO BASE DE QUE NO EXISTA Y TERMINE EL ARBOL
	else if( a^.dato.num = valor ) then existeValor:= true //CASO BASE DE QUE LO ENCUENTRE
	else if(valor < a^.dato.num )then existeValor:= existeValor(a^.HI,valor) //SI ES EL CODIGO QUE ESTOY BUSCANDO ES MENOR AL NODO ACTUAL, BUSCO POR EL HIJO IZQUIERDO
	else existeValor:= existeValor(a^.HD,valor); //SI ES MAYOR, BUSCO POR EL HIJO DERECHO
end;

VAR a: arbol; codigo: integer; menorSocio: arbol; edadMayor: integer; valor: integer;
BEGIN
	leerCargar(a);
	codigo:=0;
	codigo:=codigoMayor(a);
	menorSocio:=socioMenor(a);
	socioMayorEdad(a, edadMayor);
	aumentarEdad(a);
	writeln('El socio de codigo mayor es: ', codigo, ', el socio de codigo menor es: ', menorSocio^.dato.num,', la mayor edad es: ', edadMayor);
	write('Ingrese el codigo de socio a buscar: '); readln(valor);
	write(existeValor(a,valor));
	
END.

