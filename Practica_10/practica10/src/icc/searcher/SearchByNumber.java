
package icc.searcher;
import icc.base.Persona;
/**
* Defines a searcher over Strings, the query is if a String contains a given number.
* @author mindahrelfen
*/
public class SearchByNumber<E extends String> implements Searcher<E>{

    private E number;

    public SearchByNumber(E s){
        this.number = s;
    }

    @Override
    public boolean search(E s){
        return true;
    }
}
