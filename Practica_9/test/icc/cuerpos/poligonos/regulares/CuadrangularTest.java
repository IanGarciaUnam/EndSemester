
package icc.cuerpos.poligonos.regulares;

import java.util.NoSuchElementException;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import icc.cuerpos.poligonos.PrismaTestA;
import icc.cuerpos.Cuerpo;

public class CuadrangularTest extends PrismaTestA{

    public Cuerpo getCuerpo(){

        return new Cuadrangular(random(),random(),random());
    }
    
}
