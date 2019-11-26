package icc.cuerpos.poligonos.regulares;
import icc.cuerpos.poligonos.Prisma;
import icc.cuerpos.Cuerpo;
import icc.figuras.Figura;
import icc.figuras.poligonos.Cuadrado;
  public class Cuadrangular extends Prisma{
    /**
    * Crea un Prisma Cuadrangular con base y altura dadas.
    *@param altura Altura del prisma Cuadrangular.
    *@param ancho ancho del prisma Cuadrangular
    *@param largo largo de la figura(No se emplea)
    */


    public Cuadrangular(double altura, double ancho, double largo){
      super.altura=altura;
      super.longitud=ancho;
      super.forma=new Cuadrado (ancho);
      super.numLados=4;
    }
    @Override
    public String nombre(){
        return "Prisma Cuadrangular";
    }
    @Override
    public  String toString(){
        return super.toString() + "\n\tVolumen: " + super.volumen();
    }


}

