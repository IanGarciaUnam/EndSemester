
package icc.figuras.poligonos;

import java.util.NoSuchElementException;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import icc.figuras.FiguraTestA;
import icc.figuras.Figura;

public class RectanguloTest extends FiguraTestA{

    public Figura getFigura(){
        return new Rectangulo(random(),random());
    }

    public double getArea(Figura f){
        Rectangulo r = (Rectangulo)f;
        return r.getBase() * r.getAltura();
    }

    public double getPerimetro(Figura f){
        Rectangulo r = (Rectangulo)f;
        return 2.0 * (r.getBase() + r.getAltura());
    }
}