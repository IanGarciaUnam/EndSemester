package bibi.interfaz.InsertWrittens;

import java.util.*;
import bibi.manejador.Manejador;
import bibi.interfaz.InterfazInsercion;
//import bibi.interfaz.InsertWrittens.*;
import bibi.estructuras.*;
import bibi.insercion.Periodico;
public class WrittenPeriodico extends WrittenRevista{


  boolean toEvaluate=true;

  public void process(String material){

      blankMe();
    show(material);
    inputEditorial(material);
    inputDia(material);
    inputMes(material);
    inputAnio(material);
    inputEdicion(material);
    inputNoTotalEjemplares(material);




    Periodico p = new Periodico(getEditorial(), getDia(), getMes(), getAnioPublicacion(), getEdicion(), getNoTotalEjemplares());
    p.showMe();
    write(p);
    }

/****************************************************************************************/



    /**
    *ingresar mes del libro
    *
    *@param material material
    */

    public void inputDia(String material){

      InterfazInsercion i = new InterfazInsercion();
      do{

        System.out.println("Ingresa dia de publicacion");
          int acces;
          Scanner sc = new Scanner(System.in);


          acces=i.getInt("El dia deberá ser ingresado en un número entero positivo", "Porfavor ingresa un número entero o esta información no será salvada");

          int g=getInt("¿Tus datos fueron correctos? \n [1].....................Sí \n [2].....................No", "Ingreso inválido");
          toEvaluate=selection(g);
          if(!toEvaluate){
            setDia(acces);
            System.out.println("Añadido dia en "+ material +":" + getDia());
          }else{

            System.out.println("Reestableciendo sistema");
              acces=0;
            setDia(acces);

            if(getDia().equals(String.valueOf(acces))){
              System.out.println("Presiona cualquier caracter y enter para continuar");
                sc.next();//Liberando Buffer

            }else{
              System.out.println("Error 1001");
                setDia(acces);

            }
          }
          }while(toEvaluate);
        }

  }
