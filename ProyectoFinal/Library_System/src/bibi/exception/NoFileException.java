package icc.exception;

/**
*Excepcion para archivos no encontrados
*
*/
public class NoFileException extends Exception{


  public NoFileException(){};

/**
*Constructor de la Excepcion
*@param s Letrero a mostrar
*/
  public NoFileException(String s){
    super(s);
  }
}
