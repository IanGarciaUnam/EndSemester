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

    protected Conversion v;
    protected OperacionBinaria o;
    protected Random rdm;


    public void init(){
        v = new Conversion();
        o = new OperacionBinaria();
        rdm = new Random();
    }

    public boolean equals(boolean[] a, boolean[] b){
        if(a == null){
            return b == null;
        }else{
            if(b == null){
                return false;
            }else{
                if(a == b){
                    return true;
                }else if(a.length != b.length){
                    return false;
                }else{
                    for(int i = 0; i < a.length; i++){
                        if(a[i] != b[i]){
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
    }

    @Test
    public void sumaConmutativaTest(){
        boolean[] a, b;
        boolean[] eq1,eq2;
        int i, j;
        startTest("Conmutatividad", "a + b = b + a",1.0);
        i = rdm.nextInt() / 2;
        j = rdm.nextInt() / 2;
        a = v.conversion(i);
        b = v.conversion(j);
        eq1 = o.suma(a,b);
        eq2 = o.suma(b,a);
        assertTrue(equals(a,v.conversion(i)));
        assertTrue(equals(b,v.conversion(j)));
        assertTrue(equals(eq1,eq2));
        addUp(1.0);
        passed();
    }

    @Test
    public void sumaAsociativaTest(){
        boolean[] a, b, c;
        boolean[] eq1,eq2;
        int i, j, k;
        startTest("Asociatividad", "(a + b) + c = a + (b + c)",1.0);
        i = rdm.nextInt() / 2;
        j = rdm.nextInt() / 2;
        k = rdm.nextInt() / 2;
        a = v.conversion(i);
        b = v.conversion(j);
        c = v.conversion(k);
        eq1 = o.suma(o.suma(a,b),c);
        eq2 = o.suma(a,o.suma(b,c));
        assertTrue(equals(a,v.conversion(i)));
        assertTrue(equals(b,v.conversion(j)));
        assertTrue(equals(c,v.conversion(k)));
        assertTrue(equals(eq1,eq2));
        addUp(1.0);
        passed();
    }

    @Test
    public void neutroTest(){
        boolean[] a, cero;
        boolean[] eq1,eq2;
        int i;
        startTest("Neutro", "a + 0 = a",1.0);
        i = rdm.nextInt() / 2;
        a = v.conversion(i);
        cero = v.conversion(0);
        eq1 = o.suma(a,cero);
        eq2 = v.conversion(i);
        assertTrue(equals(a,v.conversion(i)));
        assertTrue(equals(cero,v.conversion(0)));
        assertTrue(equals(eq1,eq2));
        addUp(1.0);
        passed();
    }

    @Test
    public void inversoTest(){
        boolean[] a, b, cero;
        boolean[] eq1,eq2;
        int i;
        startTest("Inverso", "a + (-a) = 0",1.0);
        i = rdm.nextInt() / 2;
        a = v.conversion(i);
        b = v.inverso(i);
        cero = v.conversion(0);
        eq1 = o.suma(a,b);
        eq2 = cero;
        assertTrue(equals(a,v.conversion(i)));
        assertTrue(equals(b,v.inverso(i)));
        assertTrue(equals(cero,v.conversion(0)));
        assertTrue(equals(eq1,eq2));
        addUp(1.0);
        passed();
    }

    @Test
    public void distributividadTest(){
        boolean[] a, b, c, d;
        boolean[] eq1,eq2;
        int i, j;
        startTest("Distributividad", "-a -b = -(a + b)",1.0);
        i = rdm.nextInt() / 2;i = 5;
        j = rdm.nextInt() / 2;j = 6;
        a = v.inverso(i);
        b = v.inverso(j);
        c = v.conversion(i);
        d = v.conversion(j);
        eq1 = o.suma(a,b);
        eq2 = v.complementoDos(o.suma(c,d));
        assertTrue(equals(a,v.inverso(i)));
        assertTrue(equals(b,v.inverso(j)));
        assertTrue(equals(c,v.conversion(i)));
        assertTrue(equals(d,v.conversion(j)));

        assertTrue(equals(eq1,eq2));
        addUp(1.0);
        passed();
    }
}
