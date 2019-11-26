package icc.cuerpos.poligonos.regulares;
import icc.cuerpos.poligonos.Prisma;
import icc.cuerpos.Cuerpo;
import icc.figuras.poligonos.regulares.Octagono;
  public class Octagonal extends Prisma{
    /**
    * Crea un Prisma Octagonal con base y altura dadas.
    * @param altura Altura del prisma Cuadrangular.
    *@param lado Apotema del prisma Cuadrangular
    *@param apotema apotema de la figura
    */

    public Octagonal(double altura, double lado, double apotema){
    super.altura=altura;
    super.longitud=lado;
    super.forma= new Octagono(lado, apotema);
    super.numLados=8;
    }


    public String nombre(){
      return "Prisma Octagonal";
    }


    @Override
    public  String toString(){
        return super.toString() + "\n\tVolumen: " + volumen() + "\n\tForma de la base: " + forma.toString().replace("\t","\t\t");
    }

}
