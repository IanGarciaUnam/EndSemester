package icc.figuras.poligonos.regulares;

public class TrianguloReg extends Regular{

  public TrianguloReg(double base, double altura){
    super.longitud=base;
    super.apotema=altura;
    super.numLados=3;
  }



    public String nombre(){
      return "Triangulo Regular (Isoceles)";
    }
    @Override
    public String toString(){
        return nombre() + "\n\tArea: " + area() + "\n\tPerimetro: " + perimetro();
    }
}
