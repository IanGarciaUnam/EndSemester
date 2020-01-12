package bibi.interfaz;

import java.util.*;
import bibi.estructuras.*;
import java.io.*;



public class Interfaz {
  private boolean key=true;
/**
*@author Ian_Garcia
*run - muestra el menú en pantalla y procesa lo devuelto por
* @param q - Guarda el valor de retorno de la funcion getInt
*/
  Object obj=null;



  public  void run(){


do{
    for(int i=0;i<=50; i++){
      System.out.print("=");
    }
    System.out.println("");

    System.out.println("\t Sistema Nacional de Bibliotecas de México");

    for(int i=0;i<=50; i++){
    System.out.print("=");
    }
    System.out.println("");



    System.out.println("Bienvenido usuari@ a continuación seleccione una opción del menú");
    System.out.println("[0]...............................Salir");
    System.out.println("[1]...............................Realizar una inserción de Nuevo Material");
    System.out.println("[2]...............................Leer todo el archivo");
    System.out.println("[3]...............................Realizar Búsquedas");



      int q=getInt("Siga las Instrucciones atentamente","NO HAS INGRESADO UNA OPCIÓN VÁLIDA VUELVE A INTENTARLO");

     switch(q){
       case 0:
         System.out.println("Saliendo del Programa");
       key=false;
       break;

       case 1 :
       InterfazInsercion introduciendo= new InterfazInsercion();
       introduciendo.run();

        break;

        case 2:
        InterfazVista iv = new InterfazVista();
        iv.run();
        System.out.println("-------------------END LINE--------------------");
        break;

        case 3:
        InterfazBusqueda buscando = new InterfazBusqueda();
        
        buscando.run();
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
