package bibi.insercion;



public abstract class Escritos{

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
  *Constructor de un Libro Revista
  *
  *@param tipo Tipo de material
  *@param autores autores del Libro
  *@param titulo titulo del libro
  *@param tema tema del Libro
  *@param editorial editorial del Libro
  *@param anioPublicacion año de publicacion
  *@param edicion Edición del Libro
  *@param noPags Número de Páginas
  *@param noTotalEjemplares Número total de Ejemplares
  */
  public Escritos(int tipo,String autores, String titulo, String tema, String editorial, String anioPublicacion, String edicion, String noPags, String noTotalEjemplares){
    this.autores=autores;
    this.titulo=titulo;
    this.tema=tema;
    this.editorial=editorial;
    this.anioPublicacion=anioPublicacion;
    this.edicion=edicion;
    this.noPags=noPags;
    this.noTotalEjemplares=noTotalEjemplares;
  }

  /**
  *Constructor de un Periódico
  *
  *@param tipo Tipo de texto
  *@param editorial editorial del Libro
  *@param titulo titulo del libro
  *@param diaPublicacion Dia de la publicacion
  *@param mesPublicacion tema del Libro
  *@param anioPublicacion año de publicacion
  *@param edicion Edición del Libro
  *@param noTotalEjemplares Número total de Ejemplares
  */
  public Escritos(int tipo,String Editorial, String diaPublicacion, String mesPublicacion, String anioPublicacion, String edicion, String noTotalEjemplares ){
    this.editorial=editorial;
    this.titulo=titulo;
    this.diaPublicacion=diaPublicacion;
    this.mesPublicacion=mesPublicacion;
    this.anioPublicacion=anioPublicacion;
    this.edicion=edicion;
    this.noTotalEjemplares=noTotalEjemplares;
    setFicha(tipo);
  }

  /**
  *Constructor de un Artículo de investigacion
  *
  *
  *@param autores Autores del Articulo
  *@param titulo Titulo de la publicacion
  *@param institucion Institucion de la que proviene
  *@param anioPublicacion año de publicacion
  *@param noTotalEjemplares Número total de Ejemplares
  */
  public Escritos(String autores, String titulo, String institucion, String anioPublicacion, String noTotalEjemplares ){
    this.autores=autores;
    this.titulo=titulo;
    this.institucion=institucion;
    this.anioPublicacion=anioPublicacion;
    this.noTotalEjemplares=noTotalEjemplares;
    setFicha(4);
  }

  /**
  *
  */
  public void setFicha(int tipo){
    StringBuilder sb = new StringBuilder();
    String tp="";
    switch (tipo){
    case 1 :
    tp = "Libro \n";
    break;

    case 2:
    tp = "Revista \n";
    break;
    case 3:
    tp = "Periódico \n";
    break;
    case 4:
    tp = "Artículo de Investigación \n";
    break;
    }
    String toVolcate="\n";
    sb.append("Tipo de Material:"+ tp);

    if(tipo != 3){
      sb.append("Autores:" + autores +toVolcate);
        sb.append("Título:"+ titulo +toVolcate);
        if(tipo == 1){
          sb.append("Tema:"+ tema + toVolcate);
        }
    }

    if(tipo !=4)
      sb.append("Editorial: " + editorial+toVolcate);


    if(tipo == 3)
      sb.append("Día de publicación"+ diaPublicacion+toVolcate);

    if(tipo == 2)
    sb.append("Mes de publicación" + tema + toVolcate);

    if(tipo==3)
    sb.append("Mes de publicación" + mesPublicacion + toVolcate);

    if(tipo==4)
    sb.append("Institución de publicación"+ institucion + toVolcate);

    sb.append("Año de publicación: "+ anioPublicacion + toVolcate);

    if(tipo != 4)
    sb.append("Número de Edición" + edicion + toVolcate);


    if(tipo==1 || tipo==2)
    sb.append("Número de páginas" + noPags+ toVolcate);

    sb.append("Número total de Ejemplares"+ noTotalEjemplares + toVolcate);

    ficha= sb.toString().toUpperCase();

  }







}
