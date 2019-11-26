
package icc.operaciones;

import java.util.NoSuchElementException;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import icc.*;

/**
 *
 * @author Ian Israel Garcia Vazquez
 */
public class LogicasTest extends Calificador{

    protected Logico o;
    protected Random rdm;

    @Override
    public void init(){
        o = new Logico();//Incializamos nuestros objetos para llamar Logico.java
        rdm = new Random();//Inicializamos nuestros objetos para llamar a Random String
    }

    @Test
    public void andConmutativaTest(){
        boolean a, b;//Creamos una variable de tipo boolean
        startTest("AndConmutatividad", "a && b = b && a",1.0); // Avisa el comienzo de nuestro test
        a = rdm.nextInt() > rdm.nextInt();
        b = rdm.nextInt() > rdm.nextInt();
        assertEquals(o.and(a,b), o.and(b,a)); //Comparamos nuestra variables a y b bajo nuestra funcion and ----- Esperando que estas sean iguales
        addUp(1.0);
        passed();
    }



    @Test
    public void orConmutativaTest(){
        boolean a, b;
        startTest("OrConmutatividad", "a || b = b || a",1.0);// Avisa el comienzo de nuestro test
        a = rdm.nextInt() > rdm.nextInt();
        b = rdm.nextInt() > rdm.nextInt();
        assertEquals(o.or(a,b), o.or(b,a));//Comparamos nuestra variables a y b bajo nuestra funcion or ----- Esperando que estas sean iguales
        addUp(1.0);
        passed();//Evalúa si el test fue logrado existosamente
    }

    @Test
    public void xorConmutativaTest(){
        boolean a, b;
        startTest("XorConmutatividad", "a ^ b = b ^ a",1.0); // Avisa el comienzo de nuestro test
        a = rdm.nextInt() > rdm.nextInt();
        b = rdm.nextInt() > rdm.nextInt();
        assertEquals(o.xor(a,b), o.xor(b,a));//Comparamos nuestra variables a y b bajo nuestra funcion xor ----- Esperando que estas sean iguales
        addUp(1.0);
        passed();//Evalúa si el test fue logrado existosamente
    }

    @Test
    public void identidadTest(){
        boolean a;
        startTest("Identidad", "!!a = a",1.0);// Avisa el comienzo de nuestro test
        a = rdm.nextInt() > rdm.nextInt();
        assertEquals(o.not(o.not(a)),a); //Comparamos nuestra variables a y b bajo nuestra funcion not ----- Esperando que estas sean iguales
        addUp(1.0);
        passed();//Evalúa si el test fue logrado existosamente
    }
}
