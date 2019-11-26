package icc.cuerpos.poligonos.regulares;
import icc.cuerpos.poligonos.Prisma;
import icc.cuerpos.Cuerpo;
import icc.figuras.poligonos.regulares.Hexagono;
  public class Hexagonal extends Prisma{
    /**
    * Crea un Prisma Hexagonal con base y altura dadas.
    * @param altura Altura del prisma Cuadrangular.
    *@param lado Apotema del prisma Cuadrangular
    *@param apotema apotema de la figura
    */

    public Hexagonal(double altura, double lado, double apotema){
      super.altura=altura;
      super.longitud=lado;
      super.forma=new Hexagono(lado,apotema);
      super.numLados=6;
    }


    public String nombre(){
      return "Prisma Hexagonal";
    }


    @Override
    public  String toString(){
        return super.toString() + "\n\tVolumen: " + volumen() + "\n\tForma de la base: " + forma.toString().replace("\t","\t\t");
    }

}
