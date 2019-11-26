package icc.cuerpos.poligonos;

import java.util.NoSuchElementException;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import icc.cuerpos.CuerpoTestA;
import icc.cuerpos.Cuerpo;
import icc.figuras.Figura;

public abstract class PrismaTestA extends CuerpoTestA{

    public double getVolumen(Cuerpo c){
        Prisma l = (Prisma)c;
        return l.getAltura() * c.getForma().area();
    }

    public double getArea(Figura f){
        Prisma l = (Prisma)f;
        return (l.getForma().perimetro() * l.getAltura()) + (2.0 * l.getForma().area());
    }

    public double getPerimetro(Figura f){
        Prisma l = (Prisma)f;
        return (2.0 * l.getForma().perimetro()) + (l.getNumLados() * l.getAltura());
    }
}
