
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
public class RestaTest extends Calificador{

    protected Operacion o;//Generamos un objeto tipo Protected que solo puede ser utilizado en esta clase
    protected Random rdm;//Generamos un objeto tipo Protected que solo puede ser utilizado en esta clases

    public void init(){
        o = new Operacion();//Generamos el objeto de Operacion
        rdm = new Random();//Generamos el objeto para generar una cadena de numeros pseudoaleatorios
    }

    @Test
    public void restaInversoTest(){// Test del Inverso de la Resta
        int a;//Inicializa la variable entera
        startTest("Inverso", "a - a = 0",1.0);//Inicializa el test
        a = rdm.nextInt() / 2;//Se le asigan una cadena de texto con numeros convertida a enteros
        assertEquals(o.resta(a,a), 0);//Se realiza la comparacion entre a - a  y el 0
        addUp(1.0);//Agrega el 1.0 de 1.0 a la evaluacion del test
        passed();// Se evalua si fue logrado de forma exitosa
    }

    @Test
    public void restaIdentidadTest(){
	int a;//Inicializa la variable entera
	a = rdm.nextInt()/2;//Se le asigna una cadena de texto con valores pseudoaleatorios y se convierte a entero	
	
	startTest("Identidad", "-(-(a))=a", 1.0);//Inicializa test de la identidad
	assertEquals(o.resta(0,o.resta(0,a)),a);//Compara los valores de la resta de  -(-a) = a
	addUp(1.0);//Agrega el 1.0 de 1.0 a la evaluacion del test
	passed();//Se evalua  y notifica su fue logrado de forma exitosa
    }
}
