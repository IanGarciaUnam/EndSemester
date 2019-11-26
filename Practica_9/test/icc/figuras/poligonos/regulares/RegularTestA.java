package icc.figuras.poligonos.regulares;
import java.util.NoSuchElementException;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import icc.figuras.FiguraTestA;
import icc.figuras.Figura;

public abstract class RegularTestA extends FiguraTestA{

    public Figura getFigura(){
        return getRegular();
    }

    public abstract Regular getRegular();

    public double getArea(Figura f){
        Regular r = (Regular)f;
        return r.getApotema() * getPerimetro(r) / 2.0;
    }

    public double getPerimetro(Figura f){
        Regular r = (Regular)f;
        return r.getLongitud() * r.getNumLados();
    }

    private double alpha(int n){
        return (2.0 * Math.tan(Math.PI / (double)n));
    }

    @Test
    public void apotemaConstructorTest(){
        Regular r = getRegular();
        startTest("ApotemaConstructor", "Que la proporcion de la apotema en el poligono regular " + r.nombre() + " sea congruente con la longitud de sus lados. ",1.0);
        assertTrue(almostEquals(r.getApotema(), r.getLongitud()/alpha(r.getNumLados())));
        addUp(1.0);
        passed();
    }

    @Test
    public void apotemaTest(){
        Regular r = getRegular();
        startTest("Apotema", "Que la proporcion de la apotema en el poligono regular " + r.nombre() + " sea congruente con la longitud de sus lados. ",1.0);
        r.setApotema(random());
        assertTrue(almostEquals(r.getApotema(), r.getLongitud()/alpha(r.getNumLados())));
        addUp(1.0);
        passed();
    }

    @Test
    public void longitudConstructorTest(){
        Regular r = getRegular();
        startTest("LongitudConstructor", "Que la proporcion de la longitud en el poligono regular " + r.nombre() + " sea congruente con la apotema de sus lados. ",1.0);
        assertTrue(almostEquals(r.getApotema()*alpha(r.getNumLados()), r.getLongitud()));
        addUp(1.0);
        passed();
    }

    @Test
    public void longitudTest(){
        Regular r = getRegular();
        startTest("Longitud", "Que la proporcion de la longitud en el poligono regular " + r.nombre() + " sea congruente con la apotema de sus lados. ",1.0);
        r.setLongitud(random());
        assertTrue(almostEquals(r.getApotema()*alpha(r.getNumLados()), r.getLongitud()));
        addUp(1.0);
        passed();
    }
}
