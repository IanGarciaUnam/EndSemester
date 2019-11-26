
package icc.bits;

import icc.binario.ImpresoraBinario;

import java.util.NoSuchElementException;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import icc.Calificador;

/**
 *
 * @author mindahrelfen
 */
public class BitsTest extends Calificador{

    protected Conversion o;
    protected Random rdm;

    @Override
    public void init(){
        o = new Conversion();
        rdm = new Random();
    }

    @Test
    public void conversionPositivosTest(){
        int a;
        boolean[] array;
        startTest("Conversion", "Que la representacion a bits de un numero entero positivo sea congruente",1.0);
        a = rdm.nextInt() / 2;
        a = a > 0 ? a : -a;
        array = o.conversion(a);

        assertEquals(ImpresoraBinario.toBinaryString(array),Integer.toBinaryString(a));
        addUp(1.0);
        passed();
    }
}
