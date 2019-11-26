
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
public class MultiplicacionTest extends Calificador{

    protected Operacion o;//Generamos un objeto tipo Protected que solo puede ser utilizado en esta clase
    protected Random rdm;//Generamos un objeto tipo Protected que solo puede ser utilizado en esta clase

    @Override
    public void init(){
        o = new Operacion();
        rdm = new Random();
    }

    @Test
    public void ConmutatividadTest(){
        int a, b;
        startTest("Conmutatividad", "a * b= b * a",1.0);//Inicializa test de Conmutatividad
        a = rdm.nextInt()/2;//Asigna una cadena de texto convertida a entero
	b = rdm.nextInt()/2;
        assertEquals(o.multiplicacion(a, b), o.multiplicacion(b, a));//Compara los resultados de la multiplicacion a*b = b*a
        addUp(1.0);
        passed();//Evalúa el éxito de la prueba
    }
 	@Test
	    public void AsociatividadTest(){
        int a, c, b;
        startTest("Asociatividad", "(a * b) * c= a * (b*c)",1.0);//Inicializa test de Asociatividad
        a = rdm.nextInt()/2;
	b = rdm.nextInt()/2;
	c = rdm.nextInt()/2;
        assertEquals(o.multiplicacion(o.multiplicacion(a, b),c), o.multiplicacion(a, o.multiplicacion(b, c)));//Evalúa los resultados de  la operacion (a*b) *c = a *(b*c)
        addUp(1.0);
        passed();//Evalúa el éxito del test
    }

    @Test
    public void NeutroTest(){
	int a;
	startTest("Neutro", "a*1 = a", 1.0);//Inicializa  el test para el Neutro
	a = rdm.nextInt()/2;
	assertEquals(o.multiplicacion(a,1),a);//Evalúa la igualdad entre el resultado de la multiplicacion de a*1 y a
	addUp(1.0);
	passed();//Evalúa el exito del test
    }
	@Test
	public void DistributividadTest(){
	int a = rdm.nextInt()/2;
	int b = rdm.nextInt()/2;
	int c = rdm.nextInt()/2;
	int s = b +c;

	startTest("Distributividad", "a * (b +c) = a*b + a*c ", 1.0);
	assertEquals( o.multiplicacion(a, s), o.multiplicacion(a,b) + o.multiplicacion(a, c));
	addUp(1.0);
	passed();

	}
}
