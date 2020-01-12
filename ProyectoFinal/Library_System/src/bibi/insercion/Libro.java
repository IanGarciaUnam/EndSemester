package bibi.insercion;
import bibi.estructuras.*;

public class Libro extends Escritos{



    /**
    *Constructor revista
    *
    *@param autores autores
    *@param titulo titulo
    *@param tema tema Publicación
    *@param editorial editorial
    *@param anioPublicacion año de Publicación
    *@param edicion edicion
    *@param noPags Número de páginas
    *@param noTotalEjemplares Número total ejemplares
    */

  public Libro(String autores, String titulo, String tema, String editorial, String anioPublicacion, String edicion, String noPags, String noTotalEjemplares){

    super(1, autores, titulo, tema, editorial, anioPublicacion, edicion, noPags, noTotalEjemplares);

    setFicha(1);


}

  /**
  *Muestra la ficha de trabajo
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
