package icc.figuras.poligonos.regulares;

public class Heptagono extends Regular{

  /**
  *Crea un Heptagono Regular
  *@param lado lado de la figura
  *@param apotema Devuelve el apotema
  */
  public Heptagono(double lado, double apotema){
    super.longitud=lado;
    super.apotema=apotema;
    super.numLados=7;
  }


    @Override
    public String nombre(){
      return "Heptagono";
    }
    @Override
    public String toString(){
        return nombre() + "\n\tArea: " + area() + "\n\tPerimetro: " + perimetro();
    }
}
