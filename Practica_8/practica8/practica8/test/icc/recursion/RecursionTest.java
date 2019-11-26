
package icc.recursion;

import java.util.NoSuchElementException;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;
import icc.Calificador;
import icc.RandomStringGenerator;

/**
 *
 * @author mindahrelfen
 */
public class RecursionTest extends Calificador{

    protected Recursion r;
    protected RandomStringGenerator rdm;

    public void init(){
        r = new Recursion();
        rdm = new RandomStringGenerator(10240,false);
    }

    @Test
    public void reversaTest(){
        String s;
        StringBuilder sb;
        Lista l1,l2;
        Iterator<String> it = rdm.iterator();
        startTest("Reversa", "Revisa que la reversa de una lista es valida",1.0);
        while(it.hasNext()){
            s = it.next();

            l1 = new Lista(s);
            l2 = r.reversa(l1);
            sb = new StringBuilder(l1.toString());

            assertEquals(l1, new Lista(s));
            assertEquals(l2.toString(),sb.reverse().toString());
        }
        addUp(1.0);
        passed();
    }
}
