
package icc.figuras;

/**
* Es la base para la definicion de figuras geometricas.
*/
public abstract class Figura{

    /**
    * Calcula el area de la figura.
    * @return el valor del area.
    */
    public abstract double area();
    /**
    * Calcula el perimetro de la figura.
    * @return el valor del perimetro.
    */
    public abstract double perimetro();

    /**
    * Devuelve el nombre de la figura.
    * @return el nombre.
    */
    public abstract String nombre();

    @Override
    public  String toString(){
        return nombre() + "\n\tArea: " + area() + "\n\tPerimetro: " + perimetro();
    }
}
