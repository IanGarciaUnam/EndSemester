
package icc.base;

import java.util.Iterator;
import java.util.Random;

/**
* Define una fabrica de personas, se basa en iterator.
* @author mindahrelfen
*/
public class PersonaBuilder implements Iterator<Persona>{

    /**
    * Arreglo que contiene apellidos.
    */
    public static final String[] apellidos = {"Rubio", "Bayo", "Juarez", "Pizarro", "Domingo", "Granados", "Amaya"};

    /**
    * Arreglo que contiene nombres masculinos.
    */
    public static final String[] nombreH = {"Carlos", "Luis", "Ricardo", "Pablo", "Rafael"};

    /**
    * Arreglo que contiene nombres femeninos.
    */
    public static final String[] nombreM = {"Diana", "Valentina", "Chloe", "Julia", "Paula"};

    @Override
    public boolean hasNext(){
        return true;
    }

    @Override
    public Persona next(){
        if(random(2) == 1){
            return new Persona(nombreH[random(nombreH.length)], apellidos[random(apellidos.length)], apellidos[random(apellidos.length)], random(28) + 1, random(12) + 1, random(100) + 1900, true);
        }else{
            return new Persona(nombreM[random(nombreM.length)], apellidos[random(apellidos.length)], apellidos[random(apellidos.length)], random(28) + 1, random(12) + 1, random(100) + 1900, false);
        }
    }

    public static String randomName(){
        String s = null;
        switch(random(3)){
            case 1:
                s = nombreH[random(nombreH.length)];
                break;
            case 2:
                s = nombreM[random(nombreM.length)];
                break;
            default:
                s = apellidos[random(apellidos.length)];
                break;
        }
        return s;
    }

    private static int random(int k){
        Random rdm = new Random();
        int i = rdm.nextInt();
        i = i < 0 ? -i : i;
        return i % k;
    }
}
