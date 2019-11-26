package icc.figuras.poligonos.regulares;

public class Octagono extends Regular{
  /**
  *Crea un Octagono Regular
  *@param lado lado de la figura
  *@param apotema Devuelve el apotema
  */
  public Octagono(double lado, double apotema){
    super.longitud=lado;
    super.apotema=apotema;
    super.numLados=8;
  }


    @Override
    public String nombre(){
      return "Octagono";
    }
    @Override
    public String toString(){
        return nombre() + "\n\tArea: " + area() + "\n\tPerimetro: " + perimetro();
    }
}
