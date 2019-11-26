
package icc.bits;

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
    public void conversionTest(){
        int a,b;
        boolean[] array;
        startTest("Conversion", "Que la conversion de decimal a binario y viceversa sea conguente",1.0);
        a = rdm.nextInt();
        array = o.conversion(a);
        b = o.conversion(array);
        assertEquals(a, b);
        addUp(1.0);
        passed();
    }
}
