
package bibi.searcher;

/**
* Defines an equality criteria in a category of objects.
* @author mindahrelfen
*/
public interface Searcher<E>{

    /**
    * Returns true if the parameter complies with the given query that defines this searcher.
    * @param e element to test the criteria.
    * @return <code>true</code> if the element complies with the query.
    */
    public boolean search(E e);
}
