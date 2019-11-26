
package icc.estructuras;

import java.util.LinkedList;
import java.util.Iterator   ;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import icc.searcher.*;
import icc.base.*;

/**
* @author mindahrelfen
*/
public class ConjuntoTest extends AbstractSetTestA{

    public AbstractSet<String> getAbstractSet(){
        return new Conjunto<>();
    }

    public Conjunto<Persona> getConjunto(){
        return new Conjunto<>();
    }

    public Searcher<String> getSearcher(){
        Random r = new Random();
        if(r.nextInt() % 2 == 0){
            return new SearchByNumber("" + (r.nextInt() % 10));
        }else{
            return new SearchBySize(r.nextInt() % 3);
        }
    }

    public Searcher<Persona> getSearcherByName(){
        return new SearchByName(PersonaBuilder.randomName());
    }

    public Searcher<Persona> getSearcherByMonth(){
        Random r = new Random();
        return new SearchByMonth(r.nextInt() % 12);
    }

    @Test
    public void searchByNameTest(){
        Iterator<Persona> it;
        Persona aux;
        AbstractSet<Persona> ac,ac2;
        LinkedList<Persona> l;
        Searcher<Persona> s;
        PersonaBuilder builder;
        int i = 0;
        startTest("Conjunto", "search by name", "Tests the search works correctly",1.0);
        ac = getConjunto();
        l = new LinkedList<>();
        s = getSearcherByName();
        builder = new PersonaBuilder();
        while(i < 100){
            aux = builder.next();
            if(s.search(aux)) l.add(aux);
            ac.add(aux);
            i++;
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

    @Test
    public void searchByMonthTest(){
        Iterator<Persona> it;
        Persona aux;
        AbstractSet<Persona> ac,ac2;
        LinkedList<Persona> l;
        Searcher<Persona> s;
        PersonaBuilder builder;
        int i = 0;
        startTest("Conjunto", "search by month", "Tests the search works correctly",1.0);
        ac = getConjunto();
        l = new LinkedList<>();
        s = getSearcherByMonth();
        builder = new PersonaBuilder();
        while(i < 100){
            aux = builder.next();
            if(s.search(aux)) l.add(aux);
            ac.add(aux);
            i++;
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
}
