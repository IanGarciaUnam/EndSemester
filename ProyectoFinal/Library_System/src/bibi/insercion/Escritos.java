package bibi.insercion;
import java.io.*;


public abstract class Escritos implements Serializable{



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

  protected String db="db.ser";
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
  *@param editorial editorial del Periodico
  *
  *@param diaPublicacion Dia de la publicacion
  *@param mesPublicacion  mes de publicacion
  *@param anioPublicacion año de publicacion
  *@param edicion Edición del periodico
  *@param noTotalEjemplares Número total de Ejemplares
  */
  public Escritos(int tipo,String editorial, String diaPublicacion, String mesPublicacion, String anioPublicacion, String edicion, String noTotalEjemplares ){
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
  *Muestra la ficha
  *@param tipo tipo 
  */
  public void setFicha(int tipo){
    StringBuilder sb = new StringBuilder();
    String tp="";
    switch (tipo){
    case 1 :
    tp = "Libro \t";
    break;

    case 2:
    tp = "Revista \t";
    break;
    case 3:
    tp = "Periódico \t";
    break;
    case 4:
    tp = "Artículo de Investigación \t";
    break;
    }
    String toVolcate="\n";
    sb.append("Tipo de Material:\t");
     sb.append(tp);
     sb.append(toVolcate);
    if(tipo != 3){
      sb.append("Autores:");
      sb.append("\t");
      sb.append(autores);
      sb.append(toVolcate);
        sb.append("Título:\t");
        sb.append(titulo);
        sb.append(toVolcate);
        if(tipo == 1){
          sb.append("Tema:\t");
          sb.append(tema+"\n");

        }
    }

    if(tipo !=4){
      sb.append("Editorial:\t");
       sb.append( editorial+"\n");
     }
    if(tipo == 3){
      sb.append("Día de publicación:\t");
      sb.append(diaPublicacion +"\n");
    }


    if(tipo == 2){
    sb.append("Mes de publicación: \t");
     sb.append(tema +"\n");
   }

    if(tipo==3){
    sb.append("Mes de publicación:\t");
     sb.append( mesPublicacion);
      sb.append(toVolcate);
    }

    if(tipo==4){
    sb.append("Institución de publicación:\t");
    sb.append(institucion);
     sb.append(toVolcate);
   }
    sb.append("Año de publicación:\t ");
    sb.append(anioPublicacion);
    sb.append(toVolcate);

    if(tipo != 4){
    sb.append("Número de Edición : \t");
     sb.append(edicion);
      sb.append(toVolcate);
    }


    if(tipo==1 || tipo==2){
    sb.append("Número de páginas : \t");
    sb.append(noPags);
    sb.append(toVolcate);
    }

    sb.append("Número total de Ejemplares : \t");
    sb.append(noTotalEjemplares);
     sb.append(toVolcate);

    ficha= sb.toString().toUpperCase();

  }

  public void setNoTotalEjemplares(int s){
    this.noTotalEjemplares=String.valueOf(s);
  }
  public void setNoTotalEjemplares(int s , int t){
    this.noTotalEjemplares=String.valueOf(s+t);
  }

  public String noTotalEjemplares(){
    return noTotalEjemplares;
  }

  public String getAutor(){
    return autores;
  }

  public int getMes(){
    return Integer.parseInt(mesPublicacion);
  }

  public String getFicha(){
    return ficha;
  }




}
