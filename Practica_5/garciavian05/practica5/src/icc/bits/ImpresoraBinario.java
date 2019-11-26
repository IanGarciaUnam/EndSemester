package icc.bits;

/**
 * 
 * @author mindahrelfen
 */
public class ImpresoraBinario {
    
   //private ImpresoraBinario(){}
    
    /**
     * Imprime los bits de un numero entero
     * @param num el numero
     */
    public static void imprime(int num) {
        System.out.println(Integer.toBinaryString(num));
    }

    /**
     * Imprime los bits de un numero flotante
     * @param num el numero
     */
    public static void imprime(float num) {
        System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(num)));
    }

    /**
     * Convierte un arreglo de boolean a cadena
     * @param num el arreglo
     * @return la cadena equivalente
     */
    public static String toBinaryString(boolean num[]) {
        StringBuilder sb = new StringBuilder();
        int i = num.length - 1;
        for(; i >= 0; i--){
            if(num[i]){
                break;
            }
        }
        for(; i >= 0; i--){
            sb.append(num[i]?"1":"0");
        }
        return sb.toString();
    }

    /**
     * Imprime los bits de un numero flotante
     * @param num el numero
     */
    public static void imprime(boolean num[]) {
        System.out.println(toBinaryString(num));
    }
}
