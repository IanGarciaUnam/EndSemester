  package icc.bits;
  import icc.*;

  public class OperacionBinaria{
/**
*Este proceso, suma numeros binarios en base a Xor
*@author Ian_Garcia
*
*@param fS arreglo booleano
*@param fS2 arreglo booleano
*@return converted arreglo booleano
*/


    public static boolean[] suma(boolean [] fS, boolean [] fS2){
        boolean [] converted = new boolean [32];
        boolean carry=false;
        int a=converted.length;
        int b = 0;
        while(b<a){
          if(carry){
            if(fS[b] && fS2[b]){
              converted[b]=true;
              carry =true;
            }else{
              if(fS[b]==false && fS2[b]==false){
                converted[b]=true;
                carry=false;
              }else{
                if(fS[b] ^ fS2[b]){
                  converted[b]=false;
                  carry=true;
                }else{
                  if(fS[b]){
                    converted[b]=true;
                    carry=true;
                  }else{
                    converted[b]=true;
                    carry=false;
                  }
                }
              }
            }

          }else{
              if(fS[b] ^ fS2[b]){
                converted[b]=true;
              }else{
                converted[b]=false;

                if(fS[b]==false){
                  carry=false;
                }else{
                  carry=true;
                }
              }

          }
          b++;
        }
/*
      if((carry && fS[31]==true && fS2[31]==true) || (carry && (fS[31] ^ fS2[31]))){
        System.out.println("DESBORDAMIENTO");
        for(int o =0; o<32; o++ ){
          converted[o]=false;
        }

      }*/

      return converted;
    }

}
