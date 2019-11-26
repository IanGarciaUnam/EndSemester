
package icc.figuras.curvas;

import java.util.NoSuchElementException;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import icc.figuras.FiguraTestA;
import icc.figuras.Figura;

public class CirculoTest extends FiguraTestA{

    public Figura getFigura(){
        return new Circulo(random());
    }

    public double getArea(Figura f){
        Circulo c = (Circulo)f;
        return Math.PI * Math.pow(c.getRadio(), 2.0);
    }

    public double getPerimetro(Figura f){
        Circulo c = (Circulo)f;
        return 2.0 * Math.PI * c.getRadio();
    }
}