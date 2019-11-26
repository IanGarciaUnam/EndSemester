package icc.interfaz;
import icc.bits.*;
import java.util.*;
public class Interfaz{

/**
*@author Ian_Garcia
*run - muestra el menú en pantalla y procesa lo devuelto por
* @param q - Guarda el valor de retorno de la funcion getInt
*/
  public  void run(){

do{
    System.out.println("***************************************************");
    System.out.println("\tSistema de Conversion Binaria");
    System.out.println("***************************************************");
    System.out.println("Para Comenzar a convertir un entero a binario ");
    System.out.println("Presione: 1 --------------------------Press \"1\" to Start");
    System.out.println("Presione: 0 para salir ---------------Press \"0 \" to Exit");


    int q=getInt("INGRESE UN VALOR ENTERO POSITIVO - LEE LAS INSTRUCCIONES ","NO HAS INGRESADO UN VALOR ENTERO POSITIVO --- VUELVE A INTENTARLO");

     switch(q){
       case 1 :
       System.out.println("Accesado");
        int to_Convert=getInt("INGRESE UN VALOR ENTERO POSITIVO - LEE LAS INSTRUCCIONES ","NO HAS INGRESADO UN VALOR ENTERO POSITIVO --- VUELVE A INTENTARLO");
        if(to_Convert>=0){ //Si el entero es Positivo será impreso en Binario, pero en caso contrario estevolverá a solicitar los valores
          System.out.print("Conversion:\t");
          ImpresoraBinario.imprime(to_Convert);//Imprime la cadena binaria del ingresado
        }
         break;
       case 0:
       System.out.println("Saliendo del Programa");
       System.exit(0);//Cierra el programa
       break;

       default : System.out.println("Locking");
       }
    }while(true);


    }
/**
Procesa la información, verifica la correctez de lo introducido y lo devuelve si es que afirmativamente es un entero
*
@param  whatsUp - Guarda la cadena del mensaje de las indicaciones
@param mistakeDone - Guarda la cadena del mensaje en caso de error
@return w - Devuelve el entero INGRESADO
*/

	public int getInt(String whatsUp, String mistakeDone){
	   Scanner to_Do = new Scanner(System.in);
     boolean al=true;
	int w=0;


do{
    System.out.println(whatsUp);
  if(to_Do.hasNextInt()){
    w=to_Do.nextInt();
  al = false;
}else{ // NO se ha ingresado un entero
    System.out.println(mistakeDone);
    to_Do.next();//Liberamos el Buffer

     }
   }while(al);
      return w;

	}





}
