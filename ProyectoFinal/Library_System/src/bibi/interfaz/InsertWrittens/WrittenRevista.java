package bibi.interfaz.InsertWrittens;

import java.util.*;
import bibi.manejador.Manejador;
import bibi.interfaz.InterfazInsercion;
import bibi.insercion.Revista;
import bibi.insercion.Escritos;
import bibi.estructuras.*;
//import bibi.interfaz.InsertWrittens.WrittenLibro;
public class WrittenRevista extends WrittenLibro{

  boolean toEvaluate=true;

  public void process(String material){


    blankMe();
    show(material);
    inputEditorial(material);
    inputAutor(material);
    inputTitle(material);
    inputMes(material);
    inputAnio(material);
    inputNuPags(material);
    inputEdicion(material);
    inputNoTotalEjemplares(material);

    Revista r = new Revista(getAutores(),   getTitulo(), getMes(),getEditorial(), getAnioPublicacion(),getEdicion(),getNoPags(),  getNoTotalEjemplares());
    r.showMe();
    write(r);

    }


    /**
    *ingresar mes del libro
    *
    *@param material material
    */

    public void inputMes(String material){
      Manejador m = new Manejador();
      InterfazInsercion i = new InterfazInsercion();
      do{

        System.out.println("Ingresa mes de publicacion");
          int acces;
          Scanner sc = new Scanner(System.in);


          acces=i.getInt("El mes deberá ser ingresado en un número entero positivo", "Porfavor ingresa un número entero o esta información no será salvada");

          int g=getInt("¿Tus datos fueron correctos? \n [1].....................Sí \n [2].....................No", "Ingreso inválido");
          toEvaluate=selection(g);
          if(!toEvaluate){
            setMes(acces);
            System.out.println("Añadido mes en "+ material +":" + getMes());
          }else{

            System.out.println("Reestableciendo sistema");
              acces=0;
            m.setMes(acces);

            if(m.getMes().equals(String.valueOf(acces))){
              System.out.println("Presiona cualquier caracter y enter para continuar");
                sc.next();//Liberando Buffer

            }else{
              System.out.println("Error 1001");
                m.setMes(acces);

            }
          }
          }while(toEvaluate);
        }

  }
