package icc.cuerpos.poligonos.regulares;
import icc.cuerpos.poligonos.Prisma;
import icc.cuerpos.Cuerpo;
import icc.figuras.poligonos.regulares.TrianguloReg;


  public class Triangular extends Prisma{

    /**
    * Crea un Prisma Triangular con base y altura dadas.
    *@param altura Altura del prisma Triangular.
    *@param lado lado del prisma Triangular
    *@param apotema apotema de la figura
    */

    public Triangular(double altura, double lado, double apotema){
      super.altura=altura;
      super.longitud=lado;
      super.numLados=3;
      super.forma=new TrianguloReg(lado, apotema);


    }

    @Override
    public String nombre(){
      return "Prisma Triangular";
    }


    @Override
    public  String toString(){
        return super.toString() + "\n\tVolumen: " + volumen() + "\n\tForma de la base: " + forma.toString().replace("\t","\t\t");
    }

}
