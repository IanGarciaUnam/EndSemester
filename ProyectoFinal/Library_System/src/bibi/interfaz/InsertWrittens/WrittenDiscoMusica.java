package bibi.interfaz.InsertWrittens;

import java.util.*;
import bibi.manejador.Manejador;
import bibi.interfaz.InterfazInsercion;
import bibi.insercion.DiscoMusica;
import bibi.estructuras.*;
import bibi.insercion.Audiovisuales;
//import bibi.insercion.Escritos;
import java.util.Iterator;

//import bibi.interfaz.InsertWrittens.WrittenLibro;
public class WrittenDiscoMusica extends WrittenArticuloInvestigacion{

  boolean toEvaluate=true;

  public void process(String material){

    blankMe();
    show(material);
    inputTitle(material);
    inputBanda(material);
    inputGenMusic(material);
    inputProductores(material);
    inputAnio(material);
    inputNoTotalEjemplares(material);

    DiscoMusica d = new DiscoMusica(getTitulo(),   getInstitucion(), getTema(), getAutores(), getAnioPublicacion(), getNoTotalEjemplares());
    d.showMe();
    write(d);

    }



    public void inputDirectores(String material){

      do{

        System.out.println("Ingresa Directores");
          String access=null;
          Scanner sc = new Scanner(System.in);
          access=sc.nextLine();
          int g=getInt("¿Tus datos fueron correctos? \n [1].....................Sí \n [2].....................No", "Ingreso inválido");
          toEvaluate=selection(g);
          if(!toEvaluate){
            setEditorial(access);
            System.out.println("Añadido Directores en "+ material +":" + getEditorial());
          }else{

            System.out.println("Reestableciendo sistema");
              access=null;
            setEditorial(access);

            if(getEditorial()== null || getEditorial().isEmpty()){
              System.out.println("Presiona cualquier caracter y enter para continuar");
                sc.next();//Liberando Buffer

            }else{
                setEditorial(access);

            }
          }
          }while(toEvaluate);
        }




public void inputProductores(String material){

  do{

    System.out.println("Ingresa Productores");
      String access=null;
      Scanner sc = new Scanner(System.in);
      access=sc.nextLine();
      int g=getInt("¿Tus datos fueron correctos? \n [1].....................Sí \n [2].....................No", "Ingreso inválido");
      toEvaluate=selection(g);
      if(!toEvaluate){
        setAutores(access);
        System.out.println("Añadido Productores en "+ material +":" + getAutores());
      }else{

        System.out.println("Reestableciendo sistema");
          access=null;
        setAutores(access);

        if(getAutores()== null || getAutores().isEmpty()){
          System.out.println("Presiona cualquier caracter y enter para continuar");
            sc.next();//Liberando Buffer

        }else{
            setAutores(access);

        }
      }
      }while(toEvaluate);
    }





public void inputGenMusic(String material){
  do{

    System.out.println("Ingresa Genero Musical");
      String access=null;
      Scanner sc = new Scanner(System.in);
      access=sc.nextLine();
      int g=getInt("¿Tus datos fueron correctos? \n [1].....................Sí \n [2].....................No", "Ingreso inválido");
      toEvaluate=selection(g);
      if(!toEvaluate){
        setTema(access);
        System.out.println("Añadido Genero musical en "+ material +":" + getTema());
      }else{

        System.out.println("Reestableciendo sistema");
          access=null;
        setTema(access);

        if(getTema()== null || getTema().isEmpty()){
          System.out.println("Presiona cualquier caracter y enter para continuar");
            sc.next();//Liberando Buffer

        }else{
            setTema(access);

        }
      }
      }while(toEvaluate);

}

public void inputBanda(String material){
do{

System.out.println("Ingresa Nombre de la Banda");
  String access=null;
  Scanner sc = new Scanner(System.in);
  access=sc.nextLine();
  int g=getInt("¿Tus datos fueron correctos? \n [1].....................Sí \n [2].....................No", "Ingreso inválido");
  toEvaluate=selection(g);
  if(!toEvaluate){
    setInstitucion(access);
    System.out.println("Añadido nombre de la banda en "+ material +":" + getInstitucion());
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
