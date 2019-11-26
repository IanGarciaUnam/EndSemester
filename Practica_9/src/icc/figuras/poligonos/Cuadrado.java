
package icc.figuras.poligonos;

/**
* Define al cuadrado como clase.
*/
public class Cuadrado extends Rectangulo{

    /**
    * Crea un cuadrado con lado dado.
    * @param lado Lado del cuadrado.
    */
    public Cuadrado(double lado){
        super(lado,lado);
    }

    @Override
    public void setBase(double lado){
        super.base = lado;
        super.altura = lado;
    }

    @Override
    public void setAltura(double lado){
        super.base = lado;
        super.altura = lado;
    }

    @Override
    public String nombre(){
        return "Cuadrado";
    }
}