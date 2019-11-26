 package icc.bits;
 import java.lang.Math;
/**
*
*@author Ian_Garcia
*/

public class Conversion{

/**
*Convierte un arreglo booleano en un numero entero
*@param kel arreglo Booleano a convertir
*@return dennis entero proveniente del arreglo booleano
*/

    public static int conversion(boolean [] kel){
      int f1=0;
      int correo=0;
      int dennis=0;
      while(f1<kel.length){
        if(kel[f1]){
          correo=(int) Math.pow(2,f1);
        }else{
          correo=0;
        }
        dennis +=correo;
        f1++;
      }
      if(dennis<0){
        dennis+=1;
      }
      //System.out.println(dennis);
      return dennis;
    }
    /**
    *En el método conversion recibimos un entero y este devuelve el arreglo binario correspondiente a su forma binaria
    *@param  to_Convert el numero para convertir
    *@return converted  - el arreglo booleano
    */

    public  static boolean[] conversion(int to_Convert){

        int c = to_Convert;//numero a dividir
        boolean[] converted= new boolean[32];//Arreglo booleano a devolver
        int [] b= new int[32];//Arreglo entero a devolver
        int a=b.length-1;//tamño del arreglo
        if(c<0){
          boolean [] vw= new boolean[32];
          vw = Conversion.conversion(-c);
          converted=Conversion.complementoDos(vw);
        }else{
          if(c == 0){
            for(int bee =0 ; bee<=converted.length-1; bee++){
              converted[bee]=false;
            }
          }else{
            while(c > 0){
              b[a]=c%2;//Se asigna el valor del modulo a la posición a del arreglo entero b
              a--;//se recorre un lugar de derecha a izquierda

              c=c/2;//Se divide entre dos y queda asignado en la variable c
              }
            }

                int w =converted.length-1;//Tamaño de la conversion
                while(w>=0){
                if(b[(b.length-1)-w]==1){// Se leen los bits de derecha a izquierda si es 1 corresponde a true
                converted[w]=true;//Se asigna en la posicion w del aareglo booleano converted true
              }else{
                converted[w]=false;
              }
                w--;// se resta 1 al entero para recorrer una posicion en el bit
                         }

                       }
                       return converted;//Regresa el arreglo Booleano creado

                     }










                /**   En el metodo inverso obtenemos el inverso del numero enviado
                *@param a Entero de que se desea buscar su inverso
                *@return deComplemento Arreglo Booleano
                */

      public static boolean[] inverso(int a){
        int d = a;//numero a dividir
        boolean[] convertedNegative= new boolean[32];//Arreglo booleano a devolver
        boolean[] deComplemento = new boolean[32];


        convertedNegative=Conversion.conversion(d);
        deComplemento= Conversion.complementoDos(convertedNegative);
        //fin= OperacionBinaria.suma(deComplemento,mUno);
            return deComplemento;

                }
                /**En el metodo complementoDos en realidad realizamos el complemento a uno y a este se le suma 1
                *@param v arreglo Booleano
                *@return elMoro arreglo Booleano
                */


                public static boolean[] complementoDos(boolean [] v){

                  boolean [] elMoro = new boolean[32];
                  boolean[] fin = new boolean[32];
                  boolean[] uno = new boolean[32];
                  uno=Conversion.conversion(1);
                    for(int t=0; t<elMoro.length; t++){
                      if(v[t]){
                        elMoro[t]=false;
                      }else{
                        elMoro[t]=true;
                      }
                    }
                    fin=OperacionBinaria.suma(elMoro,uno);



                  return fin;

                }

              }
