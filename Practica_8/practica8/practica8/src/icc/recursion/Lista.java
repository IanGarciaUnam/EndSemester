package icc.recursion;
/**
 * Define una lista recursivamente como l = {h,l}
 * @author mindahrelfen
 */

public class Lista{

    private char head;
    private Lista tail;

    public Lista(String s){
        this(s.charAt(0));
        if(s.length() > 1){
            tail = new Lista(s.substring(1));
        }else{
            tail = null;
        }
    }

    public Lista(char c){
        this(c,null);
    }

    public Lista(char c, Lista t){
        head = c;
        tail = t;
    }

    /**
     * Metodo de acceso que devuelve la cabeza de la lista.
     * @return La cabeza de la lista.
     */
    public char getHead(){
        return head;
    }

    /**
     * Metodo de acceso que devuelve el resto de la lista.
     * @return El resto de la lista.
     */
    public Lista getTail(){
        return tail;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Lista l = this;
        while(l != null){
            sb.append(l.head);
            l = l.tail;
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj){
        Lista l,t;
        if(obj == null){
            return false;
        }else if(obj == this){
            return true;
        }else if(obj instanceof Lista){
            l = (Lista)obj;
            t = this;
            while(l.tail != null && t.tail != null){
                if(l.head != t.head){
                    return false;
                }else{
                    l = l.tail;
                    t = t.tail;
                }
            }
            return l.tail == null && t.tail == null;
        }else{
            return false;
        }
    }
}
