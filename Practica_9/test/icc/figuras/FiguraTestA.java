
package icc.figuras;

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
public abstract class FiguraTestA extends Calificador{

    public abstract Figura getFigura();

    public abstract double getArea(Figura f);

    public abstract double getPerimetro(Figura f);

    public boolean almostEquals(double a, double b){
        double c = a - b;
        c = Math.abs(c);
        return c < 0.01;
    }

    public double random(){
        Random rdm = new Random();
        return rdm.nextDouble() + 10.0;
    }

    @Test
    public void areaTest(){
        Figura f = getFigura();
        startTest("Area", "Que el calculo del area de la figura " + f.nombre() + " sea congruente",1.0);
        assertTrue(almostEquals(f.area(), getArea(f)));
        addUp(1.0);
        passed();
    }

    @Test
    public void perimetroTest(){
        Figura f = getFigura();

        startTest("Perimetro", "Que el calculo del perimetro de la figura " + f.nombre() + " sea congruente",1.0);
        assertTrue(almostEquals(f.perimetro(), getPerimetro(f)));
        addUp(1.0);
        passed();
    }
}
