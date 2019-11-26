package icc.recursion;

    public class Recursion{


/**
*La función realiza una reversa a la lista ingresada
*@param lista -  Lista con datos
*@return r.aux - Funcion recursiva que devuelve la lista
*
*
*/


      public Lista reversa(Lista lista){
            Recursion r =new Recursion();
            Lista l2 =null;
            return r.aux(lista, l2);
          }
    
      private Lista aux(Lista lista, Lista l2){
      char h;
      Lista c;
      if(lista==null){
        return l2;
      }else{
         h= lista.getHead();
        c=lista.getTail();
         Lista x=new Lista(h,l2);
        return aux(c, x);
      }




      }


      }
