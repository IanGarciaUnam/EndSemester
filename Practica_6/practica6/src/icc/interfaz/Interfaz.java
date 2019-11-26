  package icc.interfaz;
import icc.bits.*;
import java.util.*;

public class Interfaz{

/**
*@author Ian_Garcia
*run - muestra el menú en pantalla y procesa lo devuelto por
*
*/
  public  void run(){
    boolean toExit=true;
do{
    System.out.println("***************************************************");
    System.out.println("\tSistema de Conversion Binaria");
    System.out.println("***************************************************");
    System.out.println("Para Comenzar a convertir un entero a binario ");
    System.out.println("Presione: 0 para salir ---------------Press \"0 \" to Exit");
    System.out.println("Presione: 1 --------------------------Press \"1\" to Start");
    System.out.println("Presione: 2 para Suma ---------------Press \"2 \" to SUM");
    int q=getInt("INGRESE UN VALOR ENTERO POSITIVO - LEE LAS INSTRUCCIONES ","NO HAS INGRESADO UN VALOR ENTERO POSITIVO --- VUELVE A INTENTARLO");

     switch(q){
       case 0:
       System.out.println("Saliendo del Programa");
       toExit=false;//Cierra el programa
       break;

       case 1 :
       int to_Convert=0;
       System.out.println("Accesado");
         to_Convert=getInt("INGRESE UN VALOR ENTERO - LEE LAS INSTRUCCIONES ","NO HAS INGRESADO UN VALOR ENTERO POSITIVO --- VUELVE A INTENTARLO");

          System.out.print("Conversion:\t");
          ImpresoraBinario.imprime(to_Convert);//Imprime la cadena binaria del ingresado
          boolean [] f = new boolean[32];
          System.out.println("Conversión por complemento A 2");
          f=Conversion.conversion(to_Convert);
          ImpresoraBinario.imprime(f);


         break;

       case 2:
       System.out.println("sum activada");
        int a = getInt("Ingresa tus valores enteros porfavor", "Error porfavor ingresa un numero válido");
        int b= getInt("Ingresa tus valores enteros porfavor", "Error porfavor ingresa un numero válido");
        //Conversion c = new Conversion();

        boolean [] v = new boolean[32];
        boolean [] v2 = new boolean[32];

         v= Conversion.conversion(a);
         v2 =Conversion.conversion(b);

         //OperacionBinaria o = new OperacionBinaria();

         boolean [] showSum= new boolean[32];



         System.out.println("CONVERTIMIENTO");
         System.out.print("Conversion  Primer entero:\t");
         ImpresoraBinario.imprime(v);//Imprime la cadena binaria del ingresado
        System.out.print("Conversion Segundo entero:\t");
        ImpresoraBinario.imprime(v2);//Imprime la cadena binaria del ingresado
         showSum=OperacionBinaria.suma(v,v2);
        System.out.println("SUMA");
        for(int t=31; t>=0; t--){
          if(showSum[t])  System.out.print("1");
          else System.out.print("0");

        }
        System.out.println("");


                /**************************************TO SHOW******************************/



       break;
       default : System.out.println("OPCION  -------------------- INVALIDA");
       }


    }while(toExit);


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
