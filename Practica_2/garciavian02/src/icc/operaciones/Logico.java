package icc.operaciones;

import icc.*;


public class  Logico{
	public boolean not(boolean x){ // Funcion publica  not, regresa el valor de la operacion logica not
	return !x;
	}

	public boolean and(boolean a, boolean l ){//Funcion public and, regresa el valor de la operacion logica and &&
	return a && l;
	}

	public boolean or(boolean e, boolean i){//Funcion public or, devuelve el valor logico de la operacion logica or 
	return e || i;
	}

	public boolean xor(boolean a, boolean l){ // Funcion publica xor, devuelve el valor logico del o - exclusivo
	return a ^ l;

	}



}
