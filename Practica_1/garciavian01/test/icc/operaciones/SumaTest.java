
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
 * @author mindahrelfen && Ian Israel Garcia Vazquez
 */
public class SumaTest extends Calificador{

    protected Operacion o;
    protected Random rdm;

    @Override
    public void init(){
        o = new Operacion(); //Se genera el objeto para poder llamar las funciones de Operacion
        rdm = new Random(); //Se genera el objeto para poder llamar las funciones de Generacion de una cadena de numeros pseudoaleatoria
    }

    @Test
    public void sumaConmutativaTest(){
        int a, b;
        startTest("Conmutatividad", "a + b = b + a",1.0); //Inicia test , muestra letrero en terminal
        a = rdm.nextInt() / 2; //Convierte la cadena de texto de numeros random en una variable entera contenida en Int
        b = rdm.nextInt() / 2;
        assertEquals(o.suma(a,b), o.suma(b,a)); //Compara el proceso de suma a+b y b+a
        addUp(1.0);
        passed(); //Verifica y muestra si el test fue aprobado
    }
    @Test
    public void asociatividadTest(){
	int a, b, c;
	startTest("Asociatividad","(a+b)+c = a +(b+c)",1.0);
	a =rdm.nextInt()/2;//Convierte la cadena de texto de numeros random en una variable entera contenida en Int
	b =rdm.nextInt()/2;//Convierte la cadena de texto de numeros random en una variable entera contenida en Int
	c =rdm.nextInt()/2;//Convierte la cadena de texto de numeros random en una variable entera contenida en Int

	assertEquals(o.suma(o.suma(a,b),c), o.suma(a,o.suma(b,c)));//Compara el proceso de suma (a+b)+c = a +(b+c)
	addUp(1.0);
	passed();//Verifica y muestra si el test fue aprobado
		  }
    @Test
    public void neutroAditivoTest(){
	int c;
	startTest("Neutro","a+0=a",1.0);
	c=rdm.nextInt()/2;//Convierte la cadena de texto de numeros random en una variable entera contenida en Int
	assertEquals(o.suma(c,0), c);//Compara el resultado del proceso de suma c+0 = c
	addUp(1.0);
	passed();//Verifica y muestra si el test fue aprobado

    }
    @Test
    public void  inversoAditivoTest(){
	int d;
	startTest("Inverso", "a+(-a)=0",1.0);
	d=rdm.nextInt()/2;//Convierte la cadena de texto de numeros random en una variable entera contenida en Int
	assertEquals(o.suma(d,-d), 0);//Compara el resultado del proceso de suma d +(-d) = 0
	addUp(1.0);
	passed();//Verifica y muestra si el test fue aprobado

    }
    
}
