
package icc.figuras.poligonos;

import java.util.NoSuchElementException;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import icc.figuras.Figura;

public class CuadradoTest extends RectanguloTest{

    public Figura getFigura(){
        return new Cuadrado(random());
    }

}