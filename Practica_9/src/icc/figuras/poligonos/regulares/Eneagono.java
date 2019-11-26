package icc.figuras.poligonos.regulares;

public class Eneagono extends Regular{

  /**
  *Crea un hexagono Regular
  *@param lado lado de la figura
  *@param apotema Devuelve el apotema
  */
  public Eneagono(double lado, double apotema){
    super.apotema=apotema;
    super.longitud=lado;
    super.numLados=9;
    }


    @Override
    public String nombre(){
      return "Eneagono";
    }
    @Override
    public String toString(){
        return nombre() + "\n\tArea: " + area() + "\n\tPerimetro: " + perimetro();
    }
}
