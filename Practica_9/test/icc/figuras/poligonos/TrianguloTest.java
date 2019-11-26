
package icc.figuras.poligonos;

import java.util.NoSuchElementException;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import icc.figuras.FiguraTestA;
import icc.figuras.Figura;

public class TrianguloTest extends RectanguloTest{

    public Figura getFigura(){
        return new Triangulo(random(),random());
    }

    public double getArea(Figura f){
        return super.getArea(f) / 2.0;
    }

    public double getPerimetro(Figura f){
        Triangulo t = (Triangulo)f;
        return Math.sqrt((Math.pow(t.getBase(), 2.0) / 4.0) + Math.pow(t.getAltura(), 2.0));
    }
}