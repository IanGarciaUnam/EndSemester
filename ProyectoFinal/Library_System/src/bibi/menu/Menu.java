package bibi.menu;
import bibi.interfaz.Interfaz;
import bibi.estructuras.*;
import bibi.insercion.*;
/**
*Acceso al sistema
*
*/
public class Menu{


  /**
  *Menu de acceso al Sistema de biblioteca
  *
  *
  **/
  Object obj=null;
  int tamanio1=0;
  public static void main(String [] args){

    Menu m= new Menu();
    m.toWatch();
     Interfaz i = new Interfaz();
     i.run();
     m.goingOut();
  }



  /**
  *Guarda los archivos del inicio y permite su manejo desde un archivo temporal
  *
  */

    public  void toWatch(){
      Serializer serializer = new Serializer();
      Conjunto<Object> conjunto = new Conjunto();

        try{

          obj = serializer.read("db.csv");
          if(!obj.equals(null)){
          conjunto.add(obj);
          serializer.write(conjunto,"temp.tmp");
        }else{
          System.out.println("Base de datos Virgen");
        }

        }catch(Exception e){
          System.out.println("Sin Base de Datos Aún");
          System.out.println(e);

        }

    }
    /**
    *Guarda todos los datos en un archivo csv
    *
    */

      public void goingOut(){

        Serializer serializer = new Serializer();
        Conjunto<Object> conjunto = new Conjunto<>();
        Object oc=null;
        Object es;
        Object ep;
        Conjunto<Object> cPrueba= new Conjunto<>();
        Object pPrueba=null;
        if(!obj.equals(null)){

          try{
             obj=serializer.read("db.csv");
             oc=serializer.read("temp.tmp");
             cPrueba.add(serializer.read("temp.tmp"));

         if(!cPrueba.isEmpty()){
               //conjunto.add(serializer.read("temp.tmp"));
               conjunto.add(serializer.read("db.csv"));

             }


               System.out.println("Guardando archivo");
              //serializer.write(conjunto,"db.csv");
              String toSee=serializer.read("db.csv").toString();
              if(!toSee.equals(null))
              System.out.println("Guardado exitosamente - Excelente día");
          }catch(Exception e){
            //System.out.println(e);
          }
        }else{
          System.out.println("Without Old information");
        }
      }






}
