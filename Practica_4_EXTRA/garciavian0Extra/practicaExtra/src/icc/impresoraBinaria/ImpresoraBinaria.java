
package icc.impresoraBinaria;

/**
 *
 * @author IanGarcia
 */
public class ImpresoraBinaria{

    private ImpresoraBinaria(){}

    /**
    * Imprime un numero en bits
    * @param i numero a imprimir.
    */
    public static void imprime(int i){
        System.out.println(Integer.toBinaryString(i));
    }

    /**
    * Imprime un numero en bits
    * @param d numero a imprimir.
    */
    public static void imprime(double d){
        System.out.println(Long.toBinaryString(Double.doubleToLongBits(d)));
    }

  
}
