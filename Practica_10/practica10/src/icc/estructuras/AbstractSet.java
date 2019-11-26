
package icc.estructuras;

import java.util.Iterator;
import icc.searcher.Searcher;

/**
* Defines a set as a data structure.
* @author mindahrelfen
*/
public abstract class AbstractSet<E> implements Iterable<E>{

    /**
    * This method inserts the given parameter inside this set, however, if the element
    * is null or if the element already belongs to this set, then, it must return false.
    * In case the element was successfully inserted in this set, then, it must return true.
    * @param e the element to insert.
    * @return if the element was successfully inserted in this set.
    */
    public abstract boolean add(E e);

    /**
    * Returns true if the given parameter is inside this set.
    * @param e the element to check.
    * @return if the element is in this set.
    */
    public abstract boolean contains(E e);

    /**
    * Returns true if the number of elements inside this set is zero.
    * @return if this set is empty.
    */
    public abstract boolean isEmpty();

    /**
    * Returns the maxium set inside this set which complies with the given query
    * given by the searcher, if no element inside this set complies with it then
    * the set must be empty.
    * @param s searcher, it defines a query to search.
    * @return the set which complies with the given query stated by the searcher.
    * @throws NullPointerException if the given searcher is null.
    */
    public abstract AbstractSet<E> search(Searcher<E> s);

    /**
    * Returns the actual number of elements inside this set.
    * @return the size of this set.
    */
    public abstract int size();

    @Override
    public String toString(){
        Iterator<E> it = iterator();
        StringBuilder sb = new StringBuilder();
        while(it.hasNext()){
            sb.append(it.next().toString() + "\n");
        }
        return sb.toString();
    }
}