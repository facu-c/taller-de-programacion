program p1e2;

const
	dimf = 300;
	corte = -1;
type
	rango = 1..dimf;
	oficinas = record
		codigo:integer;
		dni:integer;
		valor:real;
	end;
	vOficina = array[rango] of oficinas;

procedure leer(var o: oficinas);
begin
	with o do begin
		write('Ingrese el codigo: '); readln(codigo);
		if( codigo <> corte ) then begin
			write('Ingrese el DNI: '); readln(dni);
			write('Ingrese el valor de la oficina: '); readln(valor);
		end;
	end;
end;

procedure cargarDatoVector(var v: vOficina; var diml:integer; valor: oficinas);
begin
	diml:=diml+1;
	v[diml]:=valor;
end;

procedure cargarVector(var v: vOficina; var diml:integer);
var o: oficinas;
begin
	diml:=0;
	leer(o);
	while(diml<dimf) and (o.codigo <> corte )do begin
		cargarDatoVector(v,diml,o);
		leer(o);
	end;
end;

procedure insercion(var v: vOficina; diml:integer);
var i,j: integer; item:oficinas;
begin
	for i:= 2 to diml do begin
		item:= v[i];
		j:= i-1;
		while(j>0)and(v[j].codigo>item.codigo)do begin
			v[j+1]:=v[j];
			j:=j-1;
		end;
		v[j+1]:=item;
	end;
end;

procedure seleccion(var v: vOficina; diml: integer);
var j,i,pos: integer; item:oficinas;
begin
	for i:= 1 to diml-1 do begin
		pos:=i;
		for j:= i+1 to diml do
			if(v[j].codigo<v[pos].codigo)then pos:=j;
		item:= v[pos];
		v[pos]:=v[i];
		v[i]:=item;
	end;
end;

procedure imprimir(v: vOficina; diml: integer);
var i: integer;
begin
	for i:= 1 to diml do begin
		write('El codigo es: '); writeln(v[i].codigo);
	end;
end;

VAR
	v: vOficina; diml: integer;
BEGIN
	cargarVector(v,diml);
	//insercion(v,diml);
	seleccion(v,diml);
	imprimir(v,diml);
END.

