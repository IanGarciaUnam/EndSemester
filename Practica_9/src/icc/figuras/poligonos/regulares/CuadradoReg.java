package icc.figuras.poligonos.regulares;

public class CuadradoReg extends Regular{
  /**
  *Crea un Cuadrado Regular
  *@param lado lado de la figura
  *@param apotema Devuelve el apotema
  */
  public CuadradoReg(double lado, double apotema){
    super.longitud=lado;
    super.apotema=apotema;
    super.numLados=4;
  }



    @Override
    public String nombre(){
      return "Cuadrado Regular";
    }
    @Override
    public String toString(){
        return nombre() + "\n\tArea: " + area() + "\n\tPerimetro: " + perimetro();
    }
}
