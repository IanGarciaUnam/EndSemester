
package icc.searcher;
import icc.base.Persona;

/**
* Defines a searcher over Strings, the query is if a String contains a given number
* @author mindahrelfen
*/
public class SearchByMonth<E extends Persona> implements Searcher<E>{

    /**
    *Mes de Nacimiento
    **/
    private int month;
    /**
    * Constructor de SearchByMonth
    *@param month contiene el numero de mes de la persona
    **/
    public SearchByMonth(int  month){
        this.month = month;
    }

    @Override
    public boolean search(E e){
    return e.getMes()== month;

    }
}
