package bibi.insercion;


public class ArticuloInvestigacion extends Escritos{

  /**
  *Constructor de Artículo de ArticuloInvestigacion
  *@param autores autores
  *@param titulo titulo
  *@param institucion institucion
  *@param anioPublicacion anio de anioPublicacion
  *@param noTotalEjemplares Numero total de ejemplares
  */

  public ArticuloInvestigacion(String autores, String titulo, String institucion, String anioPublicacion, String noTotalEjemplares){

    super( autores, titulo, institucion, anioPublicacion, noTotalEjemplares);
  }

  /**
  *Muestra la ficha del libro
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
