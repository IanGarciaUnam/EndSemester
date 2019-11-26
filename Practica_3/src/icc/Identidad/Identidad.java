package icc;
import icc.*;


/*
*@author Ian Israel Garcia Vazquez
*
*/

public class Identidad {




public String curp(String apellidoPaterno, String apellidoMaterno, String Nombre, int year, int month, int day, String sexo ){//la funcion curp genera el CUrp con las variables aquí solicitadas, apellido paterno, ap materno, nombre, sexo, año, mes, dia, sexo


String apellido_Paterno = apellidoPaterno.toUpperCase();//Convierte el Stringrecibido en Mayúsculas
	String apellido_Materno = apellidoMaterno.toUpperCase();//COnvierte el String recibido en Mayúsculas
	String Nombre_n = Nombre.toUpperCase();//Convierte el String Recibido en mayúsculas
	String dia, mes, anio,se, sexo_1;//Se inicializa las variables String dia, mes, anio
	se = sexo.toUpperCase();//Convierte el String Recibido en Mayúsculas
	StringBuilder s = new StringBuilder(apellido_Paterno);//Este objeto permite concatenar cadenas en una previamente construida
	StringBuilder sb = new StringBuilder();
	dia="";//Inicializa la variable dia
	mes = "";//Inicializa la variable mes
	StringBuilder tempo = new StringBuilder();//Permite construir cadenas de texto
	tempo.ensureCapacity(10);//El máximo de capacidad sera de 10 caracteres
	anio = Integer.toString(year);//convierte el int year a String 
	mes = mes.format("%02d", month);//Convierte a String el Int Month
	dia = dia.format("%02d",day);;//Agrega el formato 0X para las cifras enteras
	anio = anio.format("%02d",year);//Agrega el formato 0X para las cifras enteras	
	tempo.append(anio);//Se agrega la cadena anio
	
	tempo.append(mes);//Se concatena la cadena mes
	tempo.append(dia);//Se concatena la cadena dia

	s.append(apellido_Paterno);//Se agrega la cadena de apellido Paterno
	s.delete(2,s.length());//Se elimina todo despues del segundo caracater
	s.append(apellido_Materno);//Se concatena la cadena apellido_Materno
	s.delete(3, s.length());//Se elimina todo a partir del tercer caracter
	s.append(Nombre_n);//Se concatena la cadena Nombre_n
	s.delete(4, s.length());//Se elimina todo a partir del 4to Caracter 
	s.append(tempo.toString());//Inserta la segunda concatenacion en la primera, antes conviertiendola a un String
	s.append(se);//Se concatena la cadena contenida en la variable sexo en s
	return s.toString();//retorna el StringBuilder s, convertido en String.
}
}


