
package icc.cuerpos.curvas;

import icc.cuerpos.Cuerpo;
import icc.figuras.curvas.Circulo;

/**
* Define al cilindro como clase.
*/
public class Cilindro extends Cuerpo{

    /**
    * Altura.
    */
    protected double altura;

    /**
    * Crea un cilindro con altura y radio dado.
    * @param altura Altura del cilindro.
    * @param radio Radio de la base cilindro.
    */
    public Cilindro(double altura, double radio){
        this.altura = altura;
        super.forma = new Circulo(radio);
    }

    /**
    * Devuelve la altura del cilindro.
    * @return La altura del cilindro.
    */
    public double getAltura(){
        return altura;
    }

    /**
    * Devuelve el radio de la base del cilindro.
    * @return El radio de la base del cilindro.
    */
    public double getRadio(){
        return ((Circulo)this.forma).getRadio();
    }

    /**
    * Permite definir el radio de la base del cilindro.
    * @param radio El nuevo radio de la base del cilindro.
    */
    public void setRadio(double radio){
        ((Circulo)this.forma).setRadio(radio);
    }

    /**
    * Permite definir la altura del cilindro.
    * @param altura La nueva altura del cilindro.
    */
    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public double volumen(){
        return altura * forma.area();
    }

    @Override
    public double area(){
        return (forma.perimetro() * altura) + (2.0 * forma.area());
    }

    @Override
    public double perimetro(){
        return 2.0 * forma.perimetro();
    }

    @Override
    public String nombre(){
        return "Cilindro";
    }

    @Override
    public  String toString(){
        return super.toString() + "\n\tAltura: " + getAltura();
    }
}
