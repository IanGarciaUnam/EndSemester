package bibi.interfaz.InsertWrittens;

import java.util.*;
import bibi.manejador.Manejador;
import bibi.interfaz.InterfazInsercion;
import bibi.insercion.ArticuloInvestigacion;
import bibi.estructuras.*;
import bibi.insercion.Escritos;
//import bibi.interfaz.InsertWrittens.WrittenLibro;
public class WrittenArticuloInvestigacion extends WrittenLibro{
//  Manejador f = new Manejador();
  //WrittenLibro wl = new WrittenLibro();
  //WrittenRevista rl= new WrittenRevista();
  boolean toEvaluate=true;
  Conjunto<ArticuloInvestigacion> c = new Conjunto<>();

    Iterator<ArticuloInvestigacion> it;
  public void process(String material){
      it=c.iterator();
    blankMe();
    show(material);

    inputAutor(material);
    inputTitle(material);
    inputInstitution(material);
    inputAnio(material);
    inputNoTotalEjemplares(material);

    ArticuloInvestigacion a = new ArticuloInvestigacion(getAutores(),   getTitulo(), getInstitucion(), getAnioPublicacion(), getNoTotalEjemplares());
    a.showMe();
    write(a);










    }



    public void inputInstitution(String material){
      do{

        System.out.println("Ingresa institucion");
          String access=null;
          Scanner sc = new Scanner(System.in);
          access=sc.nextLine();
          int g=getInt("¿Tus datos fueron correctos? \n [1].....................Sí \n [2].....................No", "Ingreso inválido");
          toEvaluate=selection(g);
          if(!toEvaluate){
            setInstitucion(access);
            System.out.println("Añadido institucion en "+ material +":" + getInstitucion());
          }else{

            System.out.println("Reestableciendo sistema");
              access=null;
            setInstitucion(access);

            if(getInstitucion()== null || getInstitucion().isEmpty()){
              System.out.println("Presiona cualquier caracter y enter para continuar");
                sc.next();//Liberando Buffer

            }else{
                setInstitucion(access);

            }
          }
          }while(toEvaluate);

    }




  }
