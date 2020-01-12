package bibi.manejador;

public class Manejador{

  /**
  *Ficha sobre el libro
  */
  private String ficha;
  /**
  *Autores del material
  */
  private String autores;

  /**
  *Título del material
  */
  private String titulo;
  /**
  *tema del material
  */
  private String tema;
  /**
  *Editorial del material
  */
  private String editorial;
  /**
  *Dia de publicacion del material
  */
  private String diaPublicacion;
  /**
  *Mes de publicacion del material
  */
  private String mesPublicacion;
  /**
  *Año de publicacion del material
  */
  private String anioPublicacion;
  /**
  *No De Edición del material
  */
  private String edicion;
  /**
  *Número de Páginas del material
  */
  private String noPags;
  /**
  *Número total de Ejemplares
  */
  private String noTotalEjemplares;


  /**
  *Institucion de la que proviene
  */
  private String institucion;


  /**
  *Genero musical
  */
  private String genMusical;

  /**
  *Nombre de productores
  */
  private String producers;


  /**
  *Inserta el dia
  *
  *@param dia dia
  */
  public void setDia(int dia){
    this.diaPublicacion=String.valueOf(dia);
  }

  /**
  *Devuelve el dia de publicacion
  *@return diaPublicacion
  */
  public String getDia(){
    return diaPublicacion;
  }







    /**
    *Inserta el mes
    *
    *@param mes mes
    */
    public void setMes(int mes){
      this.mesPublicacion=String.valueOf(mes);
    }

    /**
    *Devuelve la institucion
    *@return mesPublicacion
    */
    public String getMes(){
      return mesPublicacion;
    }





  /**
  *Inserta productores
  *
  *@param productores Productores
  */
  public void setProducers(String productores){
    this.producers=producers;
  }

  /**
  *Devuelve productores
  *
  *@return producers
  */

  public String getProducers(){
    return producers;
  }


  /**
  *Inserta genero musical
  *
  *@param genMusical genero musical
  */
  public void setGenMusical(String genMusical){
    this.genMusical=genMusical;
  }

  /**
  *Devuelve genero musical
  *
  *@return genMusical genero musical
  */

  public String getGenMusical(){
    return genMusical;
  }





  /**
  *Inserta la institucion
  *
  *@param institucion institucion
  */
  public void setInstitucion(String institucion){
    this.institucion=institucion;
  }

  /**
  *Devuelve la institucion
  *@return institucion
  */
  public String getInstitucion(){
    return institucion;
  }


  /**
  *Inserta el numero total de ejemplares
  *
  *@param noTotalEjemplares numero total de ejemplares
  */

  public void setNoTotalEjemplares(int noTotalEjemplares){
    this.noTotalEjemplares=String.valueOf(noTotalEjemplares);
  }


  /**
  *Devuelve el numero total de ejemplares
  *
  *@return noTotalEjemplares numero total de ejemplares
  */

  public String getNoTotalEjemplares(){
    return noTotalEjemplares;
  }


  /**
  *Inserta el numero de páginas
  *
  *@param noPags numero de páginas
  */

  public void setNoPags(int noPags){
    this.noPags=String.valueOf(noPags);
  }


  /**
  *Devuelve el numero de paginas
  *
  *@return noPags
  */
  public String getNoPags(){
    return noPags;
  }

  /**
  *Inserta la edicion del material
  *
  *@param edicion edicion
  */
  public void setEdicion(int edicion){
  this.edicion=String.valueOf(edicion);
  }

  /**
  *Devuelve el numero de edicion
  *
  *@return edicion edicion
  */
  public String getEdicion(){
    return edicion;
  }

  /**
  *Inserta año de publicacion
  *
  *@param anioPublicacion año de publicacion del material
  */
  public void setAnioPublicacion( int anioPublicacion){
    this.anioPublicacion=String.valueOf(anioPublicacion);
  }

  /**
  *Devuelve el año de publicacion
  *
  *@return anioPublicacion año de publicacion del material
  */
  public String getAnioPublicacion(){
    return anioPublicacion;
  }

  /**
  *Inserta autores del material
  *
  *@param autores autores
  */

  public void setAutores(String autores){
    this.autores=autores;
  }


  /**
  *Devuelve autores
  *
  *@return autores
  */
  public String getAutores(){
    return autores;
  }

  /**
  *Inserta titulo
  *
  *@param titulo titulo
  */
  public void setTitulo(String titulo){
    this.titulo=titulo;
  }


  /**
  *Devuelve titulo
  *
  *@return titulo titulo
  */
  public String getTitulo(){
    return titulo;
  }

  /**
  *Inserta tema
  *
  *
  *@param tema tema
  */
  public void setTema(String tema){
    this.tema=tema;
  }


  /**
  *Devuelve el tema
  *
  *@return tema
  */
  public String getTema(){
    return tema;
  }

  /**
  *Inserta Editorial
  *
  *@param editorial Editorial
  */
  public void setEditorial(String editorial){
    this.editorial=editorial;
  }

  /**
  *Devuelve editorial
  *
  *@return editorial
  */
  public String getEditorial(){
    return editorial;
  }

}
