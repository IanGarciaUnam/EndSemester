
package icc.figuras.poligonos;

/**
* Define al triangulo como clase. Es Isosceles.
*/
public class Triangulo extends Rectangulo{

    /**
    * Crea un triangulo con base y altura dadas.
    * @param base Base del triangulo.
    * @param altura Altura del triangulo.
    */
    public Triangulo(double base, double altura){
        super(base,altura);
    }

    @Override
    public double area(){
        return super.area() / 2.0;
    }

    @Override
    public double perimetro(){
        return Math.sqrt((Math.pow(base, 2.0) / 4.0) + Math.pow(altura, 2.0));
    }

    @Override
    public String nombre(){
        return "Triangulo";
    }
}