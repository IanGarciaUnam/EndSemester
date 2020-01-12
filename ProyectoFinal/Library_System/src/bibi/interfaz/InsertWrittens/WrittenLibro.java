package bibi.interfaz.InsertWrittens;

import java.util.*;
import bibi.manejador.Manejador;
import bibi.interfaz.InterfazInsercion;
import bibi.insercion.*;
import bibi.estructuras.*;

import java.io.*;

/**
*Permite ingresar material
*
*
*/
public class WrittenLibro extends Manejador implements Serializable{

  boolean toEvaluate=true;

    /**
    *Permite que el usuario ingrese sus material al sistema
    *
    *@param material tipo de material
    */
  public void process(String material){


    blankMe();
    show(material);
    inputAutor(material);
    inputTitle(material);
    inputTema(material);
    inputEditorial(material);
    inputAnio(material);
    inputEdicion(material);
    inputNuPags(material);
    inputNoTotalEjemplares(material);

    Libro l = new Libro(getAutores(), getTitulo(), getTema(), getEditorial(), getAnioPublicacion(), getEdicion(), getNoPags(), getNoTotalEjemplares());
    l.showMe();
    write(l);

    }

    /**
    *Escribe en el archivo el objecto Insertado
    *
    *@param e Objeto Insertado
    *@return e Objeto insertado
    */
    public Object write(Object e){
      Serializer serializer = new Serializer();
      Conjunto<Object> c = new Conjunto<>();
        Conjunto<Object> c2 = new Conjunto<>();
          Conjunto<Object> c3 = new Conjunto<>();
      c.add(e);

      try{
        c2.add(serializer.read("db.csv"));//c2
        c3.add(serializer.read("temp.tmp"));//c3
        if(c2.isEmpty()){
          if(c3.isEmpty()){
            serializer.write(c,"db.csv");
          }else{
              c2.add(serializer.read("temp.tmp"));
              serializer.write(c,"db.csv");
                serializer.write(c2,"temp.tmp");
              //  c3.add(serializer.read("temp.tmp"));//c3
                //  serializer.write(c3,"db.csv");
          }
        }else{
          if(!c3.isEmpty()){
            c3.add(serializer.read("db.csv"));
            serializer.write(c3,"temp.tmp");
            c.add(serializer.read("temp.tmp"));
              serializer.write(c,"db.csv");
          }


        }




        System.out.println("Escrito");
      //serializer.write(c,"db.csv");
    }catch(Exception exception){
      System.out.println(exception);
    }
      return e;
    }
    /**
    *Restablece a su valor por defecto cada variable
    *
    *
    */


    public void blankMe(){
      String limpia=null;
      Integer cleaner= new Integer(0);
      setTitulo(limpia);
      setTema(limpia);
      setAutores(limpia);
      setEditorial(limpia);

      setEdicion(cleaner);
      setDia(cleaner);
      setMes(cleaner);
      setAnioPublicacion(cleaner);
      setNoPags(cleaner);
      setNoPags(cleaner);
      setNoTotalEjemplares(cleaner);
    }



    /**
    *Muestra el letrero de trabajo
    *
    *@param material tipo de material
    */
    public void show(String material){
      for(int i=0;i<=50; i++){
        System.out.print("=");
      }
      System.out.println("");

      System.out.println("\t Registro de "+material);

      for(int i=0;i<=50; i++){
      System.out.print("=");
      }
      System.out.println("");
      System.out.println("Inserte lo que se le solicite a continuación, si necesitas ingresar mas de solo un elemento, presiona la BARRA ESPACIADORA");
      System.out.println("---->Para guardar el dato ingresado presiona ENTER <----");

      for(int i=0;i<=50; i++){
      System.out.print("*");
      }
      System.out.println("");
      for(int i=0;i<=50; i++){
      System.out.print("*");
      }
      System.out.println("");
    }


/**
*ingresar no Ejemplares  del libro
*
*@param material material
*/

public void inputNoTotalEjemplares(String material){

  InterfazInsercion i = new InterfazInsercion();
  do{

    System.out.println("Ingresa número Total de Ejemplares");
      int acces;
      Scanner sc = new Scanner(System.in);


      acces=i.getInt("El número de ejemplares deberá ser ingresado en un número entero positivo", "Porfavor ingresa un número entero o esta información no será salvada");

      int g=getInt("¿Tus datos fueron correctos? \n [1].....................Sí \n [2].....................No", "Ingreso inválido");
      toEvaluate=selection(g);
      if(!toEvaluate){
        setNoTotalEjemplares(acces);
        System.out.println("Añadido número número total de ejemplares en "+ material +":" + getNoTotalEjemplares());
      }else{

        System.out.println("Reestableciendo sistema");
          acces=0;
        setNoTotalEjemplares(acces);

        if(getNoTotalEjemplares().equals(String.valueOf(acces)) || getNoTotalEjemplares().isEmpty()){
          System.out.println("Presiona cualquier caracter y enter para continuar");
            sc.next();//Liberando Buffer

        }else{
          System.out.println("Error 1001");
            //m.setNoTotalEjemplares(acces);

        }
      }
      }while(toEvaluate);
    }




/**
*ingresar noPags
*
*@param material material
*/

public void inputNuPags(String material){

  InterfazInsercion i = new InterfazInsercion();
  do{

    System.out.println("Ingresa número de páginas");
      int acces;
      Scanner sc = new Scanner(System.in);


      acces=i.getInt("El número de páginas deberá ser ingresado en un número entero positivo", "Porfavor ingresa un número entero o esta información no será salvada");

      int g=getInt("¿Tus datos fueron correctos? \n [1].....................Sí \n [2].....................No", "Ingreso inválido");
      toEvaluate=selection(g);
      if(!toEvaluate){
        setNoPags(acces);
        System.out.println("Añadido número de páginas en "+ material +":" + getNoPags());
      }else{

        System.out.println("Reestableciendo sistema");
          acces=0;
        setNoPags(acces);

        if(getNoPags().equals(String.valueOf(acces))|| getNoPags().isEmpty()){
          System.out.println("Presiona cualquier caracter y enter para continuar");
            sc.next();//Liberando Buffer

        }else{
          System.out.println("Error 1001");
            setNoPags(acces);

        }
      }
      }while(toEvaluate);
    }

/**
*ingresar edicion del material
*
*@param material material
*/

public void inputEdicion(String material){
  //Manejador m = new Manejador();
  InterfazInsercion i = new InterfazInsercion();
  do{

    System.out.println("Ingresa la edicion de: \t"+ material);
      int acces;
      Scanner sc = new Scanner(System.in);


      acces=i.getInt("El numero de edicion deberá ser ingresado en un número entero positivo", "Porfavor ingresa un número entero o esta información no será salvada");

      int g=getInt("¿Tus datos fueron correctos? \n [1].....................Sí \n [2].....................No", "Ingreso inválido");
      toEvaluate=selection(g);
      if(!toEvaluate){
        setEdicion(acces);
        System.out.println("Añadido edicion en "+ material +":" + getEdicion());
      }else{

        System.out.println("Reestableciendo sistema");
          acces=0;
        setEdicion(acces);

        if(getEdicion().equals(String.valueOf(acces)) || getEdicion().isEmpty()){
          System.out.println("Presiona cualquier caracter y enter para continuar");
            sc.next();//Liberando Buffer

        }else{
          System.out.println("Error 1001");
            setEdicion(acces);

        }
      }
      }while(toEvaluate);
    }









/*************************************************************************************************/

/**
*Ingresar autor
*
*@param material tipo de material
*/
    public void inputAutor(String material){
      //Manejador m = new Manejador();
      do{

        System.out.println("Ingresa autor(es)");
          String autor=null;
          Scanner sc = new Scanner(System.in);
          autor=sc.nextLine();
          int g=getInt("¿Tus datos fueron correctos? \n [1].....................Sí \n [2].....................No", "Ingreso inválido");
          toEvaluate=selection(g);
          if(!toEvaluate){
            setAutores(autor);
            System.out.println("Añadido autor en "+ material +":" + getAutores());
          }else{

            System.out.println("Reestableciendo sistema");
              autor=null;
            setAutores(autor);

            if(getAutores()== null || getAutores().isEmpty()){
              System.out.println("Presiona cualquier caracter y enter para continuar");
                sc.next();//Liberando Buffer

            }else{
                setAutores(autor);

            }
          }
          }while(toEvaluate);

        }


        /**
        *ingresar titulo del libro
        *
        *@param material material
        */

        public void inputTitle(String material){
        //  Manejador m = new Manejador();
          do{

            System.out.println("Ingresa titulo");
              String title=null;
              Scanner sc = new Scanner(System.in);
              title=sc.nextLine();
              int g=getInt("¿Tus datos fueron correctos? \n [1].....................Sí \n [2].....................No", "Ingreso inválido");
              toEvaluate=selection(g);
              if(!toEvaluate){
                setTitulo(title);
                System.out.println("Añadido titulo en "+ material +":" + getTitulo());
              }else{

                System.out.println("Reestableciendo sistema");
                  title=null;
                setTitulo(title);

                if(getTitulo()== null || getTitulo().isEmpty()){
                  System.out.println("Presiona cualquier caracter y enter para continuar");
                    sc.next();//Liberando Buffer

                }else{
                  System.out.println("Error 1001");
                    setTitulo(title);

                }
              }
              }while(toEvaluate);



        }

/****************************************************************************************/
/**
*ingresar titulo del libro
*
*@param material material
*/

public void inputTema(String material){
  //Manejador m = new Manejador();
  do{

    System.out.println("Ingresa tema");
      String acces=null;
      Scanner sc = new Scanner(System.in);
      acces=sc.nextLine();
      int g=getInt("¿Tus datos fueron correctos? \n [1].....................Sí \n [2].....................No", "Ingreso inválido");
      toEvaluate=selection(g);
      if(!toEvaluate){
        setTema(acces);
        System.out.println("Añadido tema en "+ material +":" + getTema());
      }else{

        System.out.println("Reestableciendo sistema");
          acces=null;
        setTema(acces);

        if(getTema()== null || getTema().isEmpty()){
          System.out.println("Presiona cualquier caracter y enter para continuar");
            sc.next();//Liberando Buffer

        }else{
          System.out.println("Error 1001");
            setTema(acces);

        }
      }
      }while(toEvaluate);
    }

/****************************************************************************************/
/**
*ingresar editorial del libro
*
*@param material material
*/

public void inputEditorial(String material){
  //Manejador m = new Manejador();
  do{

    System.out.println("Ingresa editorial");
      String acces=null;
      Scanner sc = new Scanner(System.in);
      acces=sc.nextLine();
      int g=getInt("¿Tus datos fueron correctos? \n [1].....................Sí \n [2].....................No", "Ingreso inválido");
      toEvaluate=selection(g);
      if(!toEvaluate){
        setEditorial(acces);
        System.out.println("Añadido editorial en "+ material +":" + getEditorial());
      }else{
        System.out.println("Reestableciendo sistema");
          acces=null;
      setEditorial(acces);

        if(getEditorial()== null || getEditorial().isEmpty()){
          System.out.println("Presiona cualquier caracter y enter para continuar");
            sc.next();//Liberando Buffer

        }else{
          System.out.println("Error 1001");
            setEditorial(acces);

        }
      }
      }while(toEvaluate);
    }

/******************************************************************************************/

/**
*ingresar titulo del libro
*
*@param material material
*/

public void inputAnio(String material){
  //Manejador m = new Manejador();
  InterfazInsercion i = new InterfazInsercion();
  do{

    System.out.println("Ingresa año de publicacion");
      int acces;
      Scanner sc = new Scanner(System.in);


      acces=i.getInt("El año deberá ser ingresado en un número entero positivo", "Porfavor ingresa un número entero o esta información no será salvada");

      int g=getInt("¿Tus datos fueron correctos? \n [1].....................Sí \n [2].....................No", "Ingreso inválido");
      toEvaluate=selection(g);
      if(!toEvaluate){
        setAnioPublicacion(acces);
        System.out.println("Añadido año en "+ material +":" + getAnioPublicacion());
      }else{

        System.out.println("Reestableciendo sistema");
          acces=0;
        setAnioPublicacion(acces);

        if(getAnioPublicacion().equals(String.valueOf(acces))){
          System.out.println("Presiona cualquier caracter y enter para continuar");
            sc.next();//Liberando Buffer

        }else{
          System.out.println("Error 1001");
            setAnioPublicacion(acces);

        }
      }
      }while(toEvaluate);
    }



/****************************************************************************************/
    /**
    *Procesa la información, verifica la correctez de lo introducido y lo devuelve si es que afirmativamente es un entero
    *
    *@param  whatsUp - Guarda la cadena del mensaje de las indicaciones
    *@param mistakeDone - Guarda la cadena del mensaje en caso de error
    *@return w - Devuelve el entero INGRESADO
    */
    public int getInt(String whatsUp, String mistakeDone){
  	   Scanner to_Do = new Scanner(System.in);
       boolean al=true;
  	    int w=0;


  do{
      System.out.println(whatsUp);
    if(to_Do.hasNextInt() ){
      w=to_Do.nextInt();

      if(w<=2 && w>0){
        al = false;
      }


    }else{ // NO se ha ingresado un entero
      System.out.println(mistakeDone);
      to_Do.next();//Liberamos el Buffer
        }
     }while(al);
        return w;

  	}


    public boolean selection(int s){
      System.out.println("");
      System.out.println("");
      System.out.println("");

      switch(s){
        case 1:
        System.out.println("Añadido");
        toEvaluate=false;
        break;
        case 2:
        System.out.println("Eliminando dato ingresado");
        toEvaluate=true;
        break;
        default:
        System.out.println("Opción inválida");
        toEvaluate=true;

      }

      return toEvaluate;
    }


  }
