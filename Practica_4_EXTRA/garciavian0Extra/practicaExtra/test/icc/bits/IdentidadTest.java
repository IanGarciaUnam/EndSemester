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
public class IdentidadTest extends Calificador{

    protected Inverso o;
    protected Random rdm;

    @Override
    public void init(){
        o = new Inverso();
        rdm = new Random();
    }

    @Test
    public void identidadTest(){
        int a, b;
        startTest("Identidad", "a + (-a) = 0",1.0);
        a = rdm.nextInt() / 2;
        assertEquals(a + o.inverso(a), 0);
        addUp(1.0);
        passed();
    }
}
