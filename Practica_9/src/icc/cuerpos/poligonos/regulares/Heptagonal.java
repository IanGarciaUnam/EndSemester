package icc.cuerpos.poligonos.regulares;
import icc.cuerpos.poligonos.Prisma;
import icc.cuerpos.Cuerpo;
import icc.figuras.poligonos.regulares.Heptagono;
  public class Heptagonal extends Prisma{
    /**
    * Crea un Prisma Heptagonal con base y altura dadas.
    * @param altura Altura del prisma Cuadrangular.
    *@param lado Apotema del prisma Cuadrangular
    *@param apotema apotema de la figura
    */

    public Heptagonal(double altura, double lado, double apotema){
      super.altura = altura;
      super.longitud=lado;
      super.forma = new Heptagono(lado,apotema);
      super.numLados=7;
    }


    public String nombre(){
      return "Prisma Heptagonal";
    }


    @Override
    public  String toString(){
        return super.toString() + "\n\tVolumen: " + volumen() + "\n\tForma de la base: " + forma.toString().replace("\t","\t\t");
    }

}
