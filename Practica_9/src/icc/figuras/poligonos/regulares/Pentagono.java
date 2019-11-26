package icc.figuras.poligonos.regulares;

public class Pentagono extends Regular{

  public Pentagono(double lado, double apotema){
    super.longitud=lado;
    super.apotema=apotema;
    super.numLados=5;
  }



    public String nombre(){
      return "Pentagono";
    }
    @Override
    public String toString(){
        return nombre() + "\n\tArea: " + area() + "\n\tPerimetro: " + perimetro();
    }
}
