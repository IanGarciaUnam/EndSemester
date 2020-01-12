package bibi.insercion;


public class Peliculas extends Audiovisuales{
/**
  *Constructor de medios Audiovisuales peliculas
  *
  *@param titulo Título de la pelicula
  *@param directores directores de la pelicula
  *@param productores productores de la pelicula
  *@param anioPublicacion año de estreno
  *@param noTotalEjemplares Número total de Ejemplares
  *
  */
  public Peliculas( String titulo, String directores, String productores, String anioPublicacion, String noTotalEjemplares){

    super(titulo, directores, productores, anioPublicacion, noTotalEjemplares);
  }

  /**
  *Muestra la ficha de la pelicula
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
