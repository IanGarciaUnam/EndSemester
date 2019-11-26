package icc.cuerpos.poligonos.regulares;
import icc.cuerpos.poligonos.Prisma;
import icc.cuerpos.Cuerpo;
import icc.figuras.poligonos.regulares.Pentagono;
  public class Pentagonal extends Prisma{

    /**
    * Crea un Prisma Pentagonal con base y altura dadas.
    * @param altura Altura del prisma Cuadrangular.
    *@param lado Apotema del prisma Cuadrangular
    *@param apotema apotema de la figura
    */
    public Pentagonal(double altura, double lado, double apotema){
      super.altura=altura;
      super.longitud=lado;
      super.forma= new Pentagono(lado, apotema);
      super.numLados=5;
    }

    @Override
    public String nombre(){
      return "Prisma Pentagonal";
    }


    @Override
    public  String toString(){
        return super.toString() + "\n\tVolumen: " + volumen() + "\n\tForma de la base: " + forma.toString().replace("\t","\t\t");
    }

}
