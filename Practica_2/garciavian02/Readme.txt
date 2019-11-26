Ian Israel Garcia Vazquez 
 No. de Cuenta:317097364
----------------------------------------------------------------------------------------------------------------------------------------->
1. Si M es una clase con una función estática r y además P es una clase en un paquete distinto a M con una funcion no estatica s ¿Cuál seria la linea de código si s quiere invocar a r? Ninguna funcion tiene parametros 

Se debe de crear un objeto  es decir 

import  ElotroPaquete.M;
public class P(){

public void s(){

M.r();
}
}

2. ¿Y si r no fuera estática?
import  ElotroPaquete.M;

import  ElotroPaquete.M;
public class P(){
M m =new M();
public void s(){

m.r();
}
}



3.¿Que representa la suma de objetos tipo String?
Una concatenación de cadenas de texto, que se convierten en una sola

