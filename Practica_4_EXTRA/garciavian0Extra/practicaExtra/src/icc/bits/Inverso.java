
package icc.bits; // Se encuentra en src/icc/ImpresoraBinaria

/**
 *
 * @author IanGarcia
 */

public class Inverso{

  //private Inverso(){}
  /**

En esta clase se obtiene el inverso a través del Complemento a 2
  **/
  public static int inverso(int b){/** La funcion inverso,
    obtiene el inverso a través del complemento a 2 **/
      int q=~b+1; /**Se obtiene el Complemento a 2
      a través del operador y a este se le suma 1 es decir  -x+1 **/
      System.out.println(Integer.toString(q));/*Se imprime en pantalla
      para el main en Prueba.java**/
  return q;// Retorna el valor entero del inverso ingresado (Complemento a 2 + 1 ) de B
  }


}
