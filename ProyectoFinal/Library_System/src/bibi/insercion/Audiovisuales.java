package bibi.insercion;



public abstract class Audiovisuales{

  /**
  *Ficha sobre el material
  */
  private String ficha;

  /**
  *Titulo de la obra
  */
  private String titulo;


  /**
  *Nombre de banda o directores
  */
  private String chiefs;


  /**
  *Nombre de productores
  */
  private String producers;

  /**
  *Año de publicación
  */
  private String anioPosted;

  /**
  *Número total de Ejemplares
  */
  private String numEjemplares;

  /**
  *Genero musical
  */
  private String genMusical;


  /**
  *Constructor de medios Audiovisuales peliculas
  *
  *@param titulo Título de la pelicula
  *@param directores directores de la pelicula
  *@param producers productores de la pelicula
  *@param anioPosted año de estreno
  *@param numEjemplares Número total de Ejemplares
  */

  public Audiovisuales(String titulo, String directores, String producers, String anioPosted, String numEjemplares){
    this.titulo=titulo;
    chiefs=directores;
    this.producers=producers;
    this.anioPosted=anioPosted;
    this.numEjemplares=numEjemplares;
  }


  /**
  *Constructor de medios Audiovisuales peliculas
  *
  *@param titulo Título
  *@param bandName nombre de la banda
  *@param generoMusic genero musical
  *@param producers Productores
  *@param anioPosted año de publicación
  *@param numEjemplares Número total de Ejemplares
  */

  public Audiovisuales(String titulo, String bandName, String generoMusic, String producers, String anioPosted, String numEjemplares){
    this.titulo=titulo;
    chiefs=bandName;
    this.genMusical=generoMusic;
    this.producers=producers;
    this.anioPosted=anioPosted;
    this.numEjemplares=numEjemplares;
  }


}
