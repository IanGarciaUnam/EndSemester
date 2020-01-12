package bibi.insercion;


public class Periodico extends Escritos{


  /**
  *Constructor de Periodico
  *
  *
  *@param editorial editorial
  *@param diaPublicacion dia diaPublicacion
  *@param mesPublicacion mes diaPublicacion
  *@param anioPublicacion anio Publicación
  *@param noTotalEjemplares Numero total Ejemplares
  *@param edicion edicion
  */

  public Periodico(String editorial, String diaPublicacion, String mesPublicacion, String anioPublicacion, String edicion, String noTotalEjemplares){

    super(3, editorial, diaPublicacion, mesPublicacion, anioPublicacion, edicion, noTotalEjemplares);
  }
  /**
  *Muestra la ficha del material
  *
  */
  public void showMe(){
    System.out.println(getFicha());
  }

  @Override
  public String toString(){
    return getFicha();
  }


}
