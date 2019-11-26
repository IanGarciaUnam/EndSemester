package icc.cuerpos.poligonos;
import icc.cuerpos.Cuerpo;
import icc.figuras.Figura;
import icc.figuras.poligonos.*;
  public abstract class Prisma extends Cuerpo{
    protected double altura;
    protected int numLados;
    protected double longitud;
    public double getAltura(){
      return altura;
    }
    public int getNumLados(){
      return numLados;
    }

    @Override
    public double volumen(){
        return super.forma.area() * altura;
    }

    @Override
    public double area(){
        return (2.0*super.forma.area())+ numLados*longitud*altura;
    }

    @Override
    public double perimetro(){
      return 2.0*super.forma.perimetro()+ numLados*altura;
    }



    @Override
    public  String toString(){
        return super.toString() + "\n\tVolumen: " + volumen();
    }

}
