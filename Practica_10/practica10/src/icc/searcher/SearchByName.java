package icc.searcher;
import icc.base.Persona;


/**
* Defines a searcher over Strings, the query is if a String contains a given Name String
* @author mindahrelfen
*/
public class SearchByName<E extends Persona> implements Searcher<E>{

    private String name;
    private String apM;
    private String apP;
    /**
    * Constructor de SearchByName
    *@param f contiene el nombre de la persona
    **/
    public SearchByName(String f){
        name=f;
    }

    @Override
    public boolean search(E n){
      boolean f=false;
      apM = n.getApM();
      apP=n.getApP();
      if(name.contains(n.getNombre())  && apM.contains(n.getApM()) && apP.contains(n.getApP())){

        f=true;
      }else{
        f=false;
      }
      return f;
    }
}
