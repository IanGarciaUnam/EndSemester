
package icc.cuerpos.curvas;

import java.util.NoSuchElementException;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import icc.cuerpos.CuerpoTestA;
import icc.cuerpos.Cuerpo;
import icc.figuras.Figura;

public class CilindroTest extends CuerpoTestA{

    public Cuerpo getCuerpo(){
        return new Cilindro(random(),random());
    }

    public double getVolumen(Cuerpo c){
        Cilindro l = (Cilindro)c;
        return l.getAltura() * c.getForma().area();
    }

    public double getArea(Figura f){
        Cilindro l = (Cilindro)f;
        return (l.getForma().perimetro() * l.getAltura()) + (2.0 * l.getForma().area());
    }

    public double getPerimetro(Figura f){
        Cilindro l = (Cilindro)f;
        return 2.0 * l.getForma().perimetro();
    }
}