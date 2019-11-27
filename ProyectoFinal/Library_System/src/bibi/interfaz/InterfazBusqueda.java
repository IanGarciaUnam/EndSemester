package bibi.interfaz;

import java.util.*;
public class InterfazBusqueda{
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

    System.out.println("\t Búsqueda en Bibliotecas");

    for(int i=0;i<=50; i++){
    System.out.print("=");
    }
    System.out.println("");

    System.out.println("Bienvenido usuari@ a continuación seleccione una opción del menú");
    System.out.println("[0]...............................|^| Volver a menú principal");
    System.out.println("[1]...............................Búsqueda General");
    System.out.println("[2]...............................Búsqueda por autor");
    System.out.println("[3]...............................Búsqueda por título");
    System.out.println("[4]...............................Búsqueda por año");
    System.out.println("[5]...............................Búsqueda por Editorial");
    System.out.println("[6]...............................Búsqueda por número de páginas");

      int q=getInt("Siga las Instrucciones atentamente","NO HAS INGRESADO UNA OPCIÓN VÁLIDA VUELVE A INTENTARLO");

     switch(q){
       case 0:
       System.out.println("Retornando");
       key=false;
       break;

       case 1 :
       System.out.println("Búsqueda General");
        break;

        case 2:
        System.out.println("Búsqueda por autor");
        break;

        case 3:
        System.out.println("Búsqueda por título");
        break;

        case 4:
        System.out.println("Búsqueda por año");
        break;

        case 5:
        System.out.println("Búsqueda por Editorial");
        break;

        case 6:
        System.out.println("Búsqueda por número de páginas");
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
