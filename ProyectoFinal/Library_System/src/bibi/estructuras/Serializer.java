package bibi.estructuras;
import java.util.Iterator;
import java.util.LinkedList;
import icc.exception.*;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.FileNotFoundException;
import java.io.EOFException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.NoSuchElementException;


/**
*Crea archivos serializables
*/
public class Serializer{



  /**
  *Crea un archivo y escribe contenido en el
  *
  *@param e Objeto conjunto genérico de tipo genérica
  *@param f nombre del archivo
  *@throws NullPointerException cuando solo se lee NULL
  *@throws  NotSerializableException Archivo no serializable
  *@throws FileNotFoundException Archivo no encontrado
  *@throws NoFileException Archivo No focalizado
  *@throws IOException errores no focalizados
  **/



  /**
  *Esta clase define todo el proceso de Serializacion y a dónde va a parar la información serializada.
  */


      Conjunto<Object> c=new Conjunto();
      public void write(Conjunto<Object> e,String f){
          ObjectOutputStream writer = null;
          FileOutputStream file;
          try{
              file = new FileOutputStream(f);
              writer = new ObjectOutputStream(file);
              writer.writeObject(e);
          }catch(NotSerializableException obj){
              System.out.println(obj);
          }catch(FileNotFoundException obj){
              System.out.println(obj);
          }catch(IOException obj){
              System.out.println(obj);
          }finally{
            System.out.println("Escritura terminada");
              if(writer==null){
                  System.out.println("Sin archivo abierto.");
              }else{
                  try{
                      writer.close();
                  }catch(IOException obj){
                  System.out.println(obj);
                  }
              }


          }
      }

      /**
      *lee los objetos en el archivo
      *
      *@param f nombre del archivo
      *@return Object
      */

      public Object read(String f){

          Object object =null;
          ObjectInputStream reader=null;
          FileInputStream file;
          try{
              file = new FileInputStream(f);
              reader = new ObjectInputStream(file);
              object = reader.readObject();
          }catch(ClassNotFoundException m){
              System.out.println(m);
          }catch(EOFException m){
              System.out.println("Fin de archivo");
          }catch(FileNotFoundException m){
              System.out.println(m);
          }catch(IOException m){
              System.out.println(m);
          }finally{
              if(reader==null){
                  System.out.println("Sin archivo abierto.");
              }else{
                  try{
                      reader.close();
                  }catch(IOException m){
                      System.out.println(m);
                  }
              }
          }
          return object;
      }

  }
