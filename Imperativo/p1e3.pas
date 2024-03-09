program programa;

const dimf = 8;

type
	genero = 1..8;
	pelicula = record
		cod:integer;
		gen:genero;
		puntaje:real;
	end;
	
	lista = ^nodo;
	
	nodo = record
		dato:pelicula;
		sig:lista;
	end;
	vGenero = array [genero] of integer;
procedure leer(var p: pelicula);
begin
	with p do begin
		write('Ingrese el codigo de pelicula: '); readln(cod);
		write('Ingrese el genero de la pelicula: '); readln(gen);
		write('Ingrese el puntaje: '); readln(puntaje);
	end;
end;

procedure agregarNodo(var l: lista; dato: pelicula);
var nue: lista;
begin
	new(nue); nue^.dato:=dato; nue^.sig:=nil;
	if(l = nil)then l:= nue
	else begin
		nue^.sig:=l;
		l:=nue;
	end;
end;

procedure procesar(var l: lista);
var dato: pelicula;
begin
	leer(dato);
	while(dato.cod <> -1) do
	begin
		agregarNodo(l,dato);
		leer(dato);
	end;
end;

procedure inicializarVector(var v: vGenero);
var i: integer;
begin
	for i:= 1 to dimf do
		v[i]:=0;
end;

procedure generarVectorMaximos(var v: vGenero; l: lista);
var aux: lista;
begin
	aux:=l;
	while(aux <> nil) do begin
		if(l^.dato.puntaje > v[l^.dato.gen])then
			v[l^.dato.gen]:= l^.dato.cod;
	end;
end;

procedure ordenarVector(var v: vGenero);
var i, j: integer; item: integer;
begin
	for i:= 1 to dimf do begin
		item:= v[i];
		j:=i-1;
		while((j <> 0) and (v[i]>item))do begin
			v[j+1]:= v[j];
			j:=j-1;
		end;
		v[j+1]:=item;
	end;
end;

function codigoMayor(l: lista): integer;
var cod: integer; puntaje: real; aux: lista;
begin
	aux:=l;
	cod:= 0; puntaje:= 0;
	while(aux <> nil)do begin
		if(l^.dato.puntaje > puntaje) then begin
			puntaje:= l^.dato.puntaje;
			cod:= l^.dato.cod;
		end;
	end;
	codigoMayor:=cod;
end;

function codigoMenor(l: lista): integer;
var cod: integer; puntaje: real; aux: lista;
begin
	aux:=l;
	cod:= 0; puntaje:= 999;
	while(aux <> nil)do begin
		if(l^.dato.puntaje < puntaje)then begin
			puntaje:= l^.dato.puntaje;
			cod:= l^.dato.cod;
		end;
	end;
	codigoMenor:= cod;
end;

procedure menorMayor(l: lista);
var codMayor, codMenor: integer;
begin
	codMayor:= codigoMayor(l);
	codMenor:= codigoMenor(l);
	writeln('El codigo menor es: ', codMenor);
	writeln('El codigo mayor es: ', codMayor);
end;

VAR l: lista; v: vGenero;
BEGIN
	l:=nil;
	procesar(l);
	generarVectorMaximos(v,l);
	menorMayor(l);
END.
