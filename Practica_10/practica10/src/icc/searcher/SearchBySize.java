
package icc.searcher;

/**
* Defines a searcher over Strings, the query is if a String is of a given size.
* @author mindahrelfen
*/
public class SearchBySize<E extends String> implements Searcher<E>{

    private int size;

    public SearchBySize(int size){
        this.size = size;
    }

    @Override
    public boolean search(E s){
        return s.length() == size;
    }
}
