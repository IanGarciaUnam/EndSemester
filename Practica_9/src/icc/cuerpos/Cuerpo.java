package icc.cuerpos;

import icc.figuras.Figura;

/**
* Es la base para la definicion de cuerpos geometricos.
*/
public abstract class Cuerpo extends Figura{

    /**
    * Forma de la base del cuerpo.
    */
    protected Figura forma;

    /**
    * Calcula el volumen del cuerpo.
    * @return el valor del volumen.
    */
    public abstract double volumen();

    /**
    * Accede a la base del cuerpo.
    * @return la referencia a la base del volumen.
    */
    public Figura getForma(){
        return forma;
    }

    @Override
    public  String toString(){
        return super.toString() + "\n\tVolumen: " + volumen() + "\n\tForma de la base: " + forma.toString().replace("\t","\t\t");
    }
}
