package bibi.interfaz;

import java.util.*;
import bibi.controlador.Controlador;
public class InterfazInsercion{
  private boolean key=true;
/**
*@author Ian_Garcia
*run - muestra el menú en pantalla y procesa lo devuelto por
* @param q - Guarda el valor de retorno de la funcion getInt
*/
  public  void run(){

do{
    for(int i=0;i<=50; i++){
      System.out.print("=");
    }
    System.out.println("");

    System.out.println("\t Inserción de Material a Bibliotecas");

    for(int i=0;i<=50; i++){
    System.out.print("=");
    }
    System.out.println("");

    System.out.println("Bienvenido usuari@ a continuación seleccione una opción del menú");
    System.out.println("[0]...............................|^| Volver a menú principal");
    System.out.println("[1]...............................Libros");
    System.out.println("[2]...............................Revistas");
    System.out.println("[3]...............................Periódicos");
    System.out.println("[4]...............................Artículos de Investigación");
    System.out.println("[5]...............................Películas");
    System.out.println("[6]...............................Discos de Música");

      int q=getInt("Siga las Instrucciones atentamente","NO HAS INGRESADO UNA OPCIÓN VÁLIDA VUELVE A INTENTARLO");

     switch(q){
       case 0:
       System.out.println("Retornando");
       key=false;
       break;

       case 1 :
       System.out.println("Ingresando Libros");
       Controlador c = new Controlador();
       c.forLibro();

        break;

        case 2:
        System.out.println("Ingresando Revistas");
        break;

        case 3:
        System.out.println("Ingresando Periódicos");
        break;

        case 4:
        System.out.println("Ingresando Artículos de Investigación");
        break;

        case 5:
        System.out.println("Ingresando Películas");
        break;

        case 6:
        System.out.println("Ingresando Discos de Música");
        break;

       default : System.out.println("Ingresa SOLO alguna de las opciones especificadas");
       }
    }while(key);


    }
/**
*Procesa la información, verifica la correctez de lo introducido y lo devuelve si es que afirmativamente es un entero
*
*@param  whatsUp - Guarda la cadena del mensaje de las indicaciones
*@param mistakeDone - Guarda la cadena del mensaje en caso de error
*@return w - Devuelve el entero INGRESADO
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
