
package icc;

import icc.impresoraBinaria.*;
import icc.bits.*;
/**
 *
 * @author mindahrelfen
 */
public class Prueba {


    public static void main(String[] s){
        int a,b,c;
        double f,g,h;
        a = 3;
        b = 4;
        c = a & b;
        f = 6;
        g = 5.6;
        h = a & b;
        System.out.println("==========Numero Base 10===========");//Imprime el letrero entre comillas
        System.out.println(a);// Imprime la variable a
        System.out.println("===================================");//Imprime el letrero entre comillas
        System.out.println("==============Binario==============");
        ImpresoraBinaria.imprime(a);//Imprime la forma binaria desde la clase ImpresoraBinaria, de la funcion imprime >> Para enteros
        System.out.println("===================================");
        System.out.println("==========Complemento a 2==========");//Imprime el letrero entre comillas
    Inverso.inverso(a);//Devuelve el inverso de la variable a
        System.out.println("===================================");//Imprime el letrero entre comillas

        System.out.println("==========Numero Base 10===========");//Imprime el letrero entre comillas
        System.out.println(b);//Devuelve el inverso de la variable a
        System.out.println("===================================");//Imprime el letrero entre comillas
        System.out.println("==============Binario==============");//Imprime el letrero entre comillas
        ImpresoraBinaria.imprime(b);//Imprime la forma binaria desde la clase ImpresoraBinaria, de la funcion imprime >> Para enteros
        System.out.println("===================================");//Imprime el letrero entre comillas
        System.out.println("========Complemento a 2============");//Imprime el letrero entre comillas
        Inverso.inverso(b);//Devuelve el inverso de la variable a
        System.out.println("===================================");//Imprime el letrero entre comillas

        System.out.println("===========Numero Base 10===========");//Imprime el letrero entre comillas
        System.out.println(c);//Devuelve el inverso de la variable a
        System.out.println("====================================");//Imprime el letrero entre comillas
        System.out.println("==============Binario==============");//Imprime el letrero entre comillas
        ImpresoraBinaria.imprime(c);//Imprime la forma binaria desde la clase ImpresoraBinaria, de la funcion imprime >> Para enteros
        System.out.println("===================================");//Imprime el letrero entre comillas
        System.out.println("========Complemento a 2============");//Imprime el letrero entre comillas
        Inverso.inverso(c);//Devuelve el inverso de la variable a
        System.out.println("===================================");//Imprime el letrero entre comillas
        System.out.println(f);

        System.out.println(f);
        ImpresoraBinaria.imprime(f);
        System.out.println(g);
        ImpresoraBinaria.imprime(g);
        System.out.println(h);
        ImpresoraBinaria.imprime(h);
    }

}
