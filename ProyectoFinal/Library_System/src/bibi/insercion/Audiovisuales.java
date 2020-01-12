package bibi.insercion;
import java.io.*;


public abstract class Audiovisuales implements Serializable{

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

  private String tp;

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
    tp="Pelicula";
    setFicha(false);
  }


  /**
  *Constructor de medios Audiovisuales Discos de Musica
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
    tp="Disco de Música";
    setFicha(true);
  }


    public void setFicha(boolean tipo){
      StringBuilder sb = new StringBuilder();
        String toVolcate="\n";
      if(tipo){

        sb.append("Tipo de Material:\t");
         sb.append(tp);
         sb.append(toVolcate);
         sb.append("Nombre de la Banda:");
         sb.append("\t");
         sb.append(chiefs);
         sb.append(toVolcate);
           sb.append("Genero Musica:\t");
           sb.append(genMusical);
           sb.append(toVolcate);
           sb.append("Productores:\t");
           sb.append(producers);
           sb.append(toVolcate);
           sb.append("Año de publicación:\t");
           sb.append(anioPosted);
           sb.append(toVolcate);
           sb.append("Número total de ejemplares:\t");
           sb.append(numEjemplares);
           sb.append(toVolcate);
           ficha= sb.toString().toUpperCase();
      }else{


        sb.append("Tipo de Material:\t");
         sb.append(tp);
         sb.append(toVolcate);
         sb.append("Nombre / Título:");
         sb.append("\t");
         sb.append(titulo);
         sb.append(toVolcate);
           sb.append("Directores:\t");
           sb.append(chiefs);
           sb.append(toVolcate);
           sb.append("Productores:\t");
           sb.append(producers);
           sb.append(toVolcate);
           sb.append("Año de publicación:\t");
           sb.append(anioPosted);
           sb.append(toVolcate);
           sb.append("Número total de ejemplares:\t");
           sb.append(numEjemplares);
           sb.append(toVolcate);
           ficha= sb.toString().toUpperCase();
      }



    }



    public String getFicha(){
      return ficha;
    }


}
