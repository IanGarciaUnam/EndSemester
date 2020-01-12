package bibi.insercion;


public class Revista extends Escritos{

  /**
  *Constructor revista
  *
  *@param autores autores
  *@param titulo titulo
  *@param mesPublicacion mes Publicación
  *@param editorial editorial
  *@param anioPublicacion año de Publicación
  *@param edicion edicion
  *@param noPags Número de páginas
  *@param noTotalEjemplares Número total ejemplares
  */

  public Revista(String autores, String titulo, String  mesPublicacion, String editorial, String anioPublicacion, String edicion, String noPags, String noTotalEjemplares){

    super(2, autores, titulo, mesPublicacion, editorial, anioPublicacion, edicion, noPags, noTotalEjemplares);
    setFicha(2);
    }
    /**
    *Muestra la ficha de la revista
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
