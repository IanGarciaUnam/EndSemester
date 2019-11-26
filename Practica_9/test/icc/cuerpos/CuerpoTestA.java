package icc.cuerpos;

import java.util.NoSuchElementException;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import icc.figuras.FiguraTestA;
import icc.figuras.Figura;

public abstract class CuerpoTestA extends FiguraTestA{

    public Figura getFigura(){
        return getCuerpo();
    }

    public abstract double getVolumen(Cuerpo c);

    public abstract Cuerpo getCuerpo();

    @Test
    public void volumenTest(){
        Cuerpo c = getCuerpo();
        startTest("Volumen", "Que el calculo del volumen del cuerpo " + c.nombre() + " sea conguente",1.0);
        assertTrue(almostEquals(c.volumen(), getVolumen(c)));
        addUp(1.0);
        passed();
    }
}
