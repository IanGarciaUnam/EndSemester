
package icc.figuras.poligonos;

import icc.figuras.Figura;

/**
* Define al rectangulo como clase.
*/
public class Rectangulo extends Figura{

    /**
    * Base del rectangulo.
    */
    protected double base;

    /**
    * Altura del rectangulo.
    */
    protected double altura;

    /**
    * Crea un rectangulo con base y altura dadas.
    * @param base Base del rectangulo.
    * @param altura Altura del rectangulo.
    */
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    /**
    * Devuelve la base del rectangulo.
    * @return La base del rectangulo.
    */
    public double getBase(){
        return base;
    }

    /**
    * Devuelve la altura del rectangulo.
    * @return La altura del rectangulo.
    */
    public double getAltura(){
        return altura;
    }

    /**
    * Permite definir la base del rectangulo.
    * @param base La nueva base del rectangulo.
    */
    public void setBase(double base){
        this.base = base;
    }

    /**
    * Permite definir la altura del rectangulo.
    * @param altura La nueva altura del rectangulo.
    */
    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public double area(){
        return base * altura;
    }

    @Override
    public double perimetro(){
        return 2.0 * (base + altura);
    }

    @Override
    public String nombre(){
        return "Rectangulo";
    }

    @Override
    public  String toString(){
        return super.toString() + "\n\tBase: " + getBase() + "\n\tAltura: " + getAltura();
    }
}
