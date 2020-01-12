package bibi.insercion;


public class DiscoMusica extends Audiovisuales{

  /**
  *Constructor de Discos de Música
  *
  *
  *@param titulo titulo
  *@param bandName Nombre de la bandName
  *@param generoMusic genero Musical
  *@param producers Productores
  *@param anioPublicacion anioPublicacion
  *@param numEjemplares Numero numEjemplares
  */

  public DiscoMusica( String titulo, String bandName, String generoMusic, String producers, String anioPublicacion, String numEjemplares){

    super(titulo, bandName, generoMusic, producers, anioPublicacion, numEjemplares);
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
