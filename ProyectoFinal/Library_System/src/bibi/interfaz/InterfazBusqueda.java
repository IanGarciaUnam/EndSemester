package bibi.interfaz;

import java.util.*;
import bibi.searcher.*;
import bibi.estructuras.*;
public class InterfazBusqueda{
  private boolean key=true;
/**
*@author Ian_Garcia
*run - muestra el menú en pantalla y procesa lo devuelto por
*
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
    System.out.println("[2]...............................Búsqueda por Autor");
    System.out.println("[3]...............................Búsqueda por Titulo");
    System.out.println("[4]...............................Búsqueda por Tema");
    System.out.println("[5]...............................Búsqueda por Institución");

      int q=getInt("Siga las Instrucciones atentamente","NO HAS INGRESADO UNA OPCIÓN VÁLIDA VUELVE A INTENTARLO");

     switch(q){
       case 0:
       System.out.println("Retornando");
       key=false;
       break;

       case 1 :
       System.out.println("Búsqueda General");
       System.out.println("Ingresa el caracter, o palabra que desees buscar y presiona enter");
       Scanner sc = new Scanner(System.in);
       String zita = sc.nextLine();
       Serializer serializer = new Serializer();
       SearchByName<String> s = new SearchByName<>();
         System.out.println(s.search(zita));
        break;

        case 2:
        String auttor="Autor";
        System.out.println("Búsqueda Por Autor");
        System.out.println("Ingresa el caracter, o palabra que desees buscar y presiona enter");
        Scanner sta = new Scanner(System.in);
        String sepa = sta.nextLine();

        //Serializer serializer = new Serializer();
        SearchByName<String> searchS = new SearchByName<>();
          System.out.println(searchS.search(auttor+":\t"+sepa.toUpperCase()));
         break;

         case 3:

         String tittle="Titulo";
         System.out.println("Búsqueda Por Autor");
         System.out.println("Ingresa el caracter, o palabra que desees buscar y presiona enter");
         Scanner sti = new Scanner(System.in);
         String title= sti.nextLine();

         //Serializer serializer = new Serializer();
         SearchByName<String> srti = new SearchByName<>();
           System.out.println(srti.search(tittle+":\t"+title.toUpperCase()));
          break;

          case 4:

          String tema="Tema";
          System.out.println("Búsqueda Por Autor");
          System.out.println("Ingresa el caracter, o palabra que desees buscar y presiona enter");
          Scanner st = new Scanner(System.in);
          String sita = st.nextLine();

          //Serializer serializer = new Serializer();
          SearchByName<String> se = new SearchByName<>();
            System.out.println(se.search(tema+":\t"+tema.toUpperCase()));
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
