package icc.figuras.poligonos.regulares;

public class Hexagono extends Regular{

  /**
  *Crea un hexagono Regular
  *@param lado lado de la figura
  *@param apotema Devuelve el apotema
  */
  public Hexagono(double lado, double apotema){
    super.longitud=lado;
    super.apotema=apotema;
    super.numLados=6;
  }


    @Override
    public String nombre(){
      return "Hexagono";
    }
    @Override
    public String toString(){
        return nombre() + "\n\tArea: " + area() + "\n\tPerimetro: " + perimetro();
    }
}
