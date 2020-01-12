
package bibi.estructuras;
import bibi.searcher.Searcher;
import java.util.Iterator;
import java.io.*;
/**
*Realiza búsquedas y anade los elementos que no se encuentren
*
*/

  public class Conjunto<E> extends AbstractSet<E> implements Serializable {

  private static int size=0;

    /**
    *Nodo , como estructura de datos para guardar informacion
    **/
    private Nodo<E> nodo;

    /**
    *Constructor de Conjunto
    *
    */


    public String flv="file.csv";
    public Conjunto(){
      nodo=null;
      size=0;
    }



    @Override
    public boolean add(E s){


     if(s == null){
       System.out.println("Elemento vacío");
       return false;
     }else{
       if(contains(s)){
         System.out.println("El elemento se encuentra previamente registrado");
         return false;
       }else{
         System.out.println("Agregando...");
         nodo=new Nodo(s,nodo);
         size++;
         return true;

       }

     }

    }

    @Override
    public int size(){
      return size;
    }

    @Override
    public AbstractSet<E> search(Searcher<E> s){
      E f;
      Conjunto<E> c = new Conjunto<>();
      Iterator<E> it= iterator();
      while(it.hasNext()){
        f= it.next();
        if(s.search(f)){
          c.add(f);
        }
      }
        return c;
    }

    @Override
    public boolean isEmpty(){
      if(size==0){
        return true;
      }else{
        return false;
      }
    }

    @Override
    public boolean contains(E s){

      Iterator<E> it= iterator();
      while(it.hasNext()){
        if(it.next().equals(s)){
        return true;
        }
      }
        return false;
    }

    @Override
    public Iterator <E> iterator(){
    return new Iterador();
    }

    private class Iterador implements Iterator<E>, Serializable{
      Nodo<E> nodito=nodo;
      @Override
      public boolean hasNext(){
        return nodito !=null;
      }

      @Override
      public E next(){
        E copy = nodito.e;
        nodito = nodito.n;
        return copy;
      }

    }

    private class Nodo<E> implements Serializable{
      E e;
      Nodo<E > n;
      Nodo(E e, Nodo<E> n){
        this.n=n;
        this.e=e;

      }

      public String toString(){
        return e.toString();
      }
    }

  }
