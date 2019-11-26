package icc.operaciones;

import icc.*;


public class Orden{

    public boolean mayor(int x, int y){// Se ingresan dos valores enteros y se devuelve un valor logico en funcion del mayor
	return x > y;
    }
    public boolean menor(int x, int q){//Se ingresan dos valores enteros y se devuelve un valor logico  en funcion del menor
	return x < q;
    }
    public boolean igual(int m, int n){//Se ingresan dos valores enteros y se devuelve un valor logico en funcion del igual 
	return m==n;
    }
    public boolean mayorIgual(int n, int x){//Se ingresan dos valores int y se devuelve un valor logico en funcion del mayor o igual
	return n>=x;
    }
    public boolean menorIgual(int w, int s){//Se ingresan dos valores int y se devuelve un valor logico en funcion del mayor o Igual
	return w<=s;
    }



}
