
package icc.figuras.curvas;

import icc.figuras.Figura;

/**
* Define al circulo como clase.
*/
public class Circulo extends Figura{

    /**
    * Radio.
    */
    protected double radio;

    /**
    * Crea un circulo con radio dado.
    * @param radio Radio del circulo.
    */
    public Circulo(double radio){
        this.radio = radio;
    }

    /**
    * Devuelve el radio del circulo.
    * @return El radio del circulo.
    */
    public double getRadio(){
        return radio;
    }

    /**
    * Permite definir el radio del circulo.
    * @param radio El nuevo radio del circulo.
    */
    public void setRadio(double radio){
        this.radio = radio;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radio, 2.0);
    }

    @Override
    public double perimetro(){
        return 2.0 * Math.PI * radio;
    }

    @Override
    public String nombre(){
        return "Circulo";
    }

    @Override
    public  String toString(){
        return super.toString() + "\n\tRadio: " + getRadio();
    }
}