
package icc.estructuras;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import icc.searcher.Searcher;
import icc.RandomStringGenerator;
import icc.Calificador;

/**
 *
 * @author mindahrelfen
 */
public abstract class AbstractSetTestA extends Calificador{

    public abstract AbstractSet<String> getAbstractSet();
    
    public abstract Searcher<String> getSearcher();

    public void init(){
        rsg = new RandomStringGenerator(range,false);
    }

    //add

    @Test
    public void addContainsTest(){
        AbstractSet<String> ac;
        startTest("Abstract Set", "addContains", "Tests the abstract set contains elements added elements",1.0);
        ac = getAbstractSet();
        rsgIt = rsg.iterator();
        while(rsgIt.hasNext()){
            assertTrue(ac.add(rsgIt.next()));
        }
        rsgIt = rsg.iterator();
        while(rsgIt.hasNext()){
            assertTrue(ac.contains(rsgIt.next()));
        }
        addUp(1.0);
        passed();
    }
    @Test
    public void addRepeatTest(){
        AbstractSet<String> ac;
        startTest("Abstract Set", "addRepeat", "Tests the abstract set does not allow repeated elements",1.0);
        ac = getAbstractSet();
        rsgIt = rsg.iterator();
        while(rsgIt.hasNext()){
            assertTrue(ac.add(rsgIt.next()));
        }
        rsgIt = rsg.iterator();
        while(rsgIt.hasNext()){
            assertFalse(ac.add(rsgIt.next()));
        }
        addUp(1.0);
        passed();
    }

    @Test
    public void addNullTest(){
        AbstractSet<String> ac;
        startTest("Abstract Set", "addNull", "Tests the abstract set does not allow null insertion",1.0);
        ac = getAbstractSet();
        rsgIt = rsg.iterator();
        assertFalse(ac.add(null));
        addUp(1.0);
        passed();
    }

    @Test
    public void addSizeTest(){
        int i;
        AbstractSet<String> ac;
        startTest("Abstract Set", "addSize", "Tests the abstract set has correct size and is not empty after add",1.0);
        ac = getAbstractSet();
        rsgIt = rsg.iterator();
        i = 1;
        while(rsgIt.hasNext()){
            assertTrue(ac.add(rsgIt.next()));
            assertEquals(ac.size(), i++);
            assertFalse(ac.isEmpty());
        }
        addUp(1.0);
        passed();
    }

    //empty

    @Test
    public void emptyTest(){
        AbstractSet<String> ac;
        startTest("Abstract Set", "isEmpty", "Tests the abstract set is empty at initialization",1.0);
        ac = getAbstractSet();
        assertTrue(ac.isEmpty());
        addUp(1.0);
        passed();
    }

    //iterator

    @Test
    public void iteratorContainsTest(){
        Iterator<String> it;
        String aux;
        AbstractSet<String> ac;
        LinkedList<String> l;
        startTest("Abstract Set", "iteratorContains", "Tests the elements retrieved by the iterator are equal to the ones inserted (not necessarily same order)",1.0);
        ac = getAbstractSet();
        l = new LinkedList<>();
        rsgIt = rsg.iterator();
        while(rsgIt.hasNext()){
            aux = rsgIt.next();
            l.add(aux);
            ac.add(aux);
        }
        it = ac.iterator();
        while(it.hasNext()){
            assertTrue(l.contains(it.next()));
        }
        addUp(1.0);
        passed();
    }

    @Test
    public void iteratorSizeTest(){
        int aux;
        Iterator<String> it;
        AbstractSet<String> ac;
        startTest("Abstract Set", "iteratorSize", "Tests the number of elements retrieved by the iterator are equal to the ones inserted",1.0);
        ac = getAbstractSet();
        rsgIt = rsg.iterator();
        while(rsgIt.hasNext()){
            ac.add(rsgIt.next());
        }
        aux = 0;
        it = ac.iterator();
        while(it.hasNext()){
            it.next();
            aux++;
        }
        assertEquals(ac.size(), aux);
        addUp(1.0);
        passed();
    }

    @Test
    public void iteratorInitTest(){
        Iterator<String> it;
        AbstractSet<String> ac;
        startTest("Abstract Set", "iteratorInit", "Tests the abstract set iterator has no elements at initialization",1.0);
        ac = getAbstractSet();
        it = ac.iterator();
        assertFalse(it.hasNext());
        addUp(1.0);
        passed();
    }

    //search

    @Test
    public void searchTest(){
        Iterator<String> it;
        String aux;
        AbstractSet<String> ac,ac2;
        LinkedList<String> l;
        Searcher<String> s;
        startTest("Abstract Set", "search", "Tests the search works correctly",1.0);
        ac = getAbstractSet();
        l = new LinkedList<>();
        s = getSearcher();
        rsgIt = rsg.iterator();
        while(rsgIt.hasNext()){
            aux = rsgIt.next();
            if(s.search(aux)) l.add(aux);
            ac.add(aux);
        }
        ac2 = ac.search(s);
        it = ac2.iterator();
        while(it.hasNext()){
            assertTrue(l.remove(it.next()));
        }
        assertTrue(l.isEmpty());
        addUp(1.0);
        passed();
    }

    //size

    @Test
    public void zeroSizeTest(){
        AbstractSet<String> ac;
        startTest("Abstract Set", "initSize", "Tests the abstract set has zero size at initialization",1.0);
        ac = getAbstractSet();
        assertEquals(ac.size(), 0);
        addUp(1.0);
        passed();
    }
}
