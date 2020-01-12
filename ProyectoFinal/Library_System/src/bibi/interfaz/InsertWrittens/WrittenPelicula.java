package bibi.interfaz.InsertWrittens;
import bibi.estructuras.*;
import java.util.*;
import bibi.manejador.Manejador;
import bibi.interfaz.InterfazInsercion;
import bibi.insercion.Peliculas;
import bibi.insercion.*;
import bibi.insercion.Audiovisuales;
//import bibi.interfaz.InsertWrittens.WrittenLibro;
public class WrittenPelicula extends WrittenDiscoMusica{
//  Manejador f = new Manejador();
  //WrittenLibro wl = new WrittenLibro();
  //WrittenRevista rl= new WrittenRevista();
  boolean toEvaluate=true;

  public void process(String material){
    blankMe();
    show(material);
    inputTitle(material);
    inputDirectores(material);
    inputProductores(material);
    inputAnio(material);
    inputNoTotalEjemplares(material);

    Peliculas m = new Peliculas(getTitulo(),   getEditorial(), getAutores(), getAnioPublicacion(), getNoTotalEjemplares());
    m.showMe();
    write(m);
  }
}
