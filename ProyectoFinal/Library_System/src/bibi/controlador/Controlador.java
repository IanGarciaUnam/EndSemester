package bibi.controlador;
import java.util.Scanner;
public class Controlador{

    Scanner sc = new Scanner(System.in);

  private String autores;
  private String titulo;
  private String tema;


  public void forLibro(){

    System.out.println("Por favor ingrese de forma meticulosa los datos que le serán solicitados");
    System.out.println("Ingrese el autor o los autores del libro para hacerlo ESCRIBE EL NOMBRE DEL AUTOR, SEPARA POR UNA COMA PRESIONA ESPACIO Y CONTINUA ");
    System.out.println("Presiona ENTER solo cuando hayas terminado de ingresar el autor");
    setAutor();
    System.out.println("Escribe el Título del libro");
    System.out.println("Presiona ENTER solo cuando hayas terminado de ingresar el Título del libro");
    setTitulo();

    System.out.println("Escribe el Tema del libro");
    System.out.println("Presiona ENTER solo cuando hayas terminado de ingresar el Tema del libro");
    setTema();

    System.out.println("Escribe La editorial del libro");
    System.out.println("Presiona ENTER solo cuando hayas terminado de ingresar lo solicitado");
    setEditorial();

    }




    public void setAutor(){
      String at="";
      int ev=0;
      boolean door=true;

    do{

      at=sc.nextLine();
      System.out.println("¿Estas seguro que este autor es correcto? En caso de que necesites agregar más autores presiona 2 y escribe todos los autores que necesites");
      System.out.println("Considera que no debes presionar ENTER hasta que finalices de escribir todos los autores.");
      System.out.println("Recuerda que para separar cada autor deberas presionar UNICAMENTE la barra espaciadora");
      System.out.println("[1]..................................Sí");
      System.out.println("[2]..................................No");
      if(sc.hasNextInt()){
        ev=sc.nextInt();
        switch(ev){
          case 1 :
          autores=at;
          System.out.println("Añadiendo");
          System.out.println("Añadido");
          door=false;
          break;

          case 2:
          System.out.println("El autor fue borrado, reescribe todos los autores que necesites");
          at ="";
          System.out.println("SOLO PUEDES SELECCIONAR UNA DE LAS DOS OPCIONES DISPONIBLES");
          setAutor();
          door=false;
          break;
          default:
          System.out.println(" recuerda que DEBES PRESIONAR 1 Ó 2 Y TRAS ELLO PRESIONAS ENTER");

        }
      }else{
        System.out.println("Opción inválida");
        System.out.println("SOLO PUEDES SELECCIONAR UNA DE LAS DOS OPCIONES DISPONIBLES");
        System.out.println(" recuerda que DEBES PRESIONAR 1 Ó 2 Y TRAS ELLO PRESIONAS ENTER");

      }

    }while(door);


    }






    public void setTitulo(){
      String at="";
      int ev=0;
      boolean door=true;

    do{

      at=sc.nextLine();
      System.out.println("¿Estas seguro que este titulo es correcto?");
      System.out.println("Considera que no debes presionar ENTER hasta que finalices de escribir todos los autores.");
      System.out.println("Recuerda que para separar cada palabra deberas presionar UNICAMENTE la barra espaciadora");
      System.out.println("[1]..................................Sí");
      System.out.println("[2]..................................No");
      if(sc.hasNextInt()){
        ev=sc.nextInt();
        switch(ev){
          case 1 :
          titulo=at;
          System.out.println("Añadiendo");
          System.out.println("Añadido");
          System.out.println(titulo);
          break;
          door=false;

          case 2:
          System.out.println("El autor fue borrado, reescribe todos los autores que necesites");
          at ="";
          setTitulo();
          door=false;
          break;
          default:
          System.out.println("SOLO PUEDES SELECCIONAR UNA DE LAS DOS OPCIONES DISPONIBLES");
          System.out.println(" recuerda que DEBES PRESIONAR 1 Ó 2 Y TRAS ELLO PRESIONAS ENTER");

        }
      }else{
        System.out.println("Opción inválida");
        System.out.println("SOLO PUEDES SELECCIONAR UNA DE LAS DOS OPCIONES DISPONIBLES");
        System.out.println(" recuerda que DEBES PRESIONAR 1 Ó 2 Y TRAS ELLO PRESIONAS ENTER");

      }

    }while(door);


    }


}
