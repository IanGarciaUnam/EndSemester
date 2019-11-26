
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
public class SumaTest extends Calificador{

    protected Operacion o;//Generamos un objeto de tipo protected que solo podrá ser utilizado en esta clase
    protected Random rdm;

    @Override
    public void init(){
        o = new Operacion();//Genera el objeto para llamar a las funciones de Operacion.java
        rdm = new Random();//Genera el objeto para llamar a las funciones de Rdm-String
    }

    @Test
    public void sumaConmutativaTest(){
        int a, b; //Incializan Variables enteras
        startTest("Conmutatividad", "a + b = b + a",1.0);//Inicializa el Test  de Conmutatividad
        a = rdm.nextInt() / 2;//Se le asigna una cadena de  texto con numeros pseudoaleatorios, se convierten en entero
        b = rdm.nextInt() / 2;//Se le asigna una cadena de texto con numeros pesudoaleatorios, se convierten en enteros
        assertEquals(o.suma(a,b), o.suma(b,a));// Se compara los resultados de la funcion suma a + b y b + a
        addUp(1.0);
        passed();//Finaliza el Test y evalúa si fue completado existosamente
    }
}

