package icc.cuerpos.poligonos.regulares;
import icc.cuerpos.poligonos.Prisma;
import icc.cuerpos.Cuerpo;
import  icc.figuras.poligonos.regulares.Eneagono;
  public class Eneagonal extends Prisma{
    /**
    * Crea un Prisma Eneagonal con base y altura dadas.
    * @param altura Altura del prisma Cuadrangular.
    *@param lado ancho del prisma Cuadrangular
    *@param apotema apotema de la figura
    */

    public Eneagonal(double altura, double lado, double apotema){
      super.altura=altura;
      super.longitud=lado;
      super.forma=new Eneagono(lado,apotema);
      super.numLados=9;
    }


    public String nombre(){
      return "Prisma Eneagonal";
    }


    @Override
    public  String toString(){
        return super.toString() + "\n\tVolumen: " + volumen() + "\n\tForma de la base: " + forma.toString().replace("\t","\t\t");
    }

}
