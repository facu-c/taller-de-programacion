{
* 1.- Se desea procesar la información de las ventas de productos de un comercio (como máximo
50).
Implementar un programa que invoque los siguientes módulos:
a. Un módulo que retorne la información de las ventas en un vector. De cada venta se conoce el
día de la venta, código del producto (entre 1 y 15) y cantidad vendida (como máximo 99
unidades). El código debe generarse automáticamente (random) y la cantidad se debe leer. El
ingreso de las ventas finaliza con el día de venta 0 (no se procesa).
b. Un módulo que muestre el contenido del vector resultante del punto a).
c. Un módulo que ordene el vector de ventas por código.
d. Un módulo que muestre el contenido del vector resultante del punto c).
e. Un módulo que elimine, del vector ordenado, las ventas con código de producto entre dos
valores que se ingresan como parámetros.
f. Un módulo que muestre el contenido del vector resultante del punto e).
g. Un módulo que retorne la información (ordenada por código de producto de menor a
mayor) de cada código par de producto junto a la cantidad total de productos vendidos.
h. Un módulo que muestre la información obtenida en el punto g).}

program puntoUno;
const
	dimF = 50;
type
	unidades = 1..99;
	codProd = 1..15;
	venta = record
		dia: integer;
		cod: codProd;
		cant: unidades;
	end;
	ventaDos = record
		cod: codProd;
		cant: unidades;
	end;
	vVentas = array[1..dimF] of venta;
	vVentasDos = array[1..dimF] of ventaDos;
	
procedure mostrarVector(v:vVentas; diml:integer);
var i:integer;
begin
	for i:=1 to diml do begin
		writeln(v[i].dia);
		writeln(v[i].cod);
		writeln(v[i].cant);
		writeln;
	end;
end;

procedure codigoPar( v: vVentas; diml: integer; var v2:vVentasDos; var diml2: integer);
var i:integer;	venta: ventaDos;
begin
	diml2:=0;
	for i:= 1 to diml do begin
		if(v[i].cod mod 2 = 0) then begin
			venta.cod:=v[i].cod;
			venta.cant:=v[i].cant;
			diml2:=diml2+1;
			v2[diml2]:=venta;
		end;
	end;
end;

procedure leerVenta(var v:venta);
var cod:integer;
begin
	writeln('ingrese el dia'); readln(v.dia);
	if(v.dia <> 0)then begin
		cod:= random(15) + 1;
		writeln('el codigo es: ', cod);
		v.cod:=cod;
		writeln('ingrese la cantidad: ');
		readln(v.cant);
	end;
end;

procedure ordenarVector(var v:vVentas; diml:integer; var v2:vVentasDos; var diml2:integer);
var i,j:integer; item:venta;
begin
	for i:= 2 to diml do begin
		item:=v[i];
		j:=i-1;
		while(j>0) and (v[j].cod>item.cod)do begin
			v[j+1]:=v[j];
			j:=j-1;
		end;
		v[j+1]:=item;
	end;
	codigoPar(v,diml,v2,diml2);
	mostrarVector(v,diml);
end;
procedure eliminar(var v: vVentas; var diml: integer; pos: integer);
var
  i: integer;
begin
  for i := pos to diml - 1 do
    v[i] := v[i + 1];
  diml := diml - 1;
end;

procedure eliminarVector(var v: vVentas; var diml: integer; valorUno: integer; valorDos: integer);
var
  i: integer;
begin
  i := 1;
  while (i <= diml) and (v[i].cod <= valorDos) do
  begin
    if (v[i].cod > valorUno) and (v[i].cod < valorDos) then
    begin
      eliminar(v, diml, i);
      // No incrementar 'i' aquí porque 'eliminar' ya reduce 'diml'
    end
    else
      // Solo incrementar 'i' si no se elimina ningún elemento
      i := i + 1;
  end;
  mostrarVector(v, diml);
end;


procedure procesarVentas(var v: vVentas; var diml: integer; var v2:vVentasDos; var diml2:integer);
var vp:venta;
begin
	diml:=0;
	leerVenta(vp);
	while (diml<dimF) and (vp.dia <> 0 ) do begin
		writeln('');
		diml:=diml+1;
		v[diml]:=vp;
		leerVenta(vp);
	end;
	writeln('');
	mostrarVector(v,diml);
	ordenarVector(v,diml,v2,diml2);
end;

var
	diml,diml2:integer; v:vVentas; valorUno,valorDos:integer; v2:vVentasDos;
begin
	procesarVentas(v,diml,v2,diml2);
	writeln('ingrese el primer valor: '); readln(valorUno);
	writeln('ingrese el valor dos: '); readln(valorDos);
	eliminarVector(v,diml,valorUno,valorDos);
end.
