package bibi.searcher;
import bibi.estructuras.*;
import java.util.*;
import java.lang.*;

/**
* Defines a searcher over Strings, the query is if a String contains a given Name String
* @author mindahrelfen
*/
public class SearchByName<E extends String> implements Searcher<E>{

    private String name;
  ;
    /**
    * Constructor de SearchByName
    **/
    public SearchByName(){

    }

    @Override
    public boolean search(String n){
      Serializer serializer = new Serializer();
      boolean f=true;
      StringBuilder sb = new StringBuilder();
      StringBuilder sbCompare = new StringBuilder();
      StringBuilder getIt = new StringBuilder();
      try{
      sb.append(serializer.read("db.csv").toString());
    }catch(Exception e){
      System.out.println(e);
    }
      int tamanio=sb.length()-1;

      int toUbicate=0;
      String toCut=null;
      String cut=null;
     int run=0;
     int time=0;
      getIt =sb;
      sbCompare= getIt;
      do{

        try{
          toUbicate=getIt.indexOf(n.toUpperCase());
        if(toUbicate <0 ){
          if(toUbicate<getIt.length() ){
            int difference=(getIt.length()-1)-toUbicate;

              toCut = getIt.substring(run,difference);
          }else{
            toCut = getIt.substring(run,toUbicate);
          }

          System.out.println("Resultados de Búsqueda:\n"+ toCut);
          getIt.delete(0,getIt.length()-1);
          getIt.append(cut);
          run = toUbicate;

        }else{
          System.out.println("Not Found");
        }
          cut=getIt.substring(toUbicate, getIt.length());


        }catch(Exception e){
          System.out.println("\t^ ^ ^ ^ ^Resultados Semejantes ^ ^ ^ ^ ^ ^");
          toUbicate=-1;
            //System.out.println(e);
          }finally{
            time++;
                System.out.println("_________________________END LINE__________________________");

            }


        }while(time<(getIt.length()-1) && toUbicate < getIt.length()-1 && toUbicate>1);

        return f;
      }

}
