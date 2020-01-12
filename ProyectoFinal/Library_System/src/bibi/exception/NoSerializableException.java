package icc.exception;

/**
*Excepcion Para archivos No serializables
*
*/
public class NoSerializableException extends Exception{

  public NoSerializableException(){};

  /**
  *Constructor de la Excepcion
  *@param s Letrero a mostrar
  */
    public NoSerializableException(String s){
      super(s);
    }

}
