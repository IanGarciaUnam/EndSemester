package icc.serial;
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
public class Serializer {



  /**
  *Crea un archivo y escribe contenido en el
  *
  *@param lita Lista de tipo LinkedList
  *@param fl nombre del archivo
  *@throws NullPointerException cuando solo se lee NULL
  *@throws  NotSerializableException Archivo no serializable
  *@throws FileNotFoundException Archivo no encontrado
  *@throws NoFileException Archivo No focalizado
  *@throws IOException errores no focalizados
  **/

private LinkedList myOwnList=null;
  public void write(LinkedList lita, String fl)throws Exception{

      ObjectOutputStream escritor =null;
      FileOutputStream archivo;

      myOwnList=lita;
      try{
        archivo = new FileOutputStream(fl);
        escritor = new ObjectOutputStream(archivo);
        Iterator ita = lita.iterator();
        while(ita.hasNext()){
          //System.out.println(ita.toString());
        escritor.writeObject(ita.next());

      }
    }catch(NullPointerException np){
        System.out.println(np);

      }catch(NotSerializableException n){
        System.out.println(n);
        throw new NoSerializableException("El archivo no es serializable");

      }catch(FileNotFoundException f){
        System.out.println(f);
        throw new NoFileException("File Not Found");
      }catch(IOException i){
        System.out.println(i);

      }finally{
        if(escritor == null){
        System.out.println("No se logró abrir el archivo");
          }else{

              try{
              escritor.close();
              }catch(IOException i){
              System.out.println(i);
            }
            }

          }

        }

        /**
        *Lee un objeto de tipo LinkedList
        *
        *@param fl nombre del archivo
        *@throws EOFException error EOFE
        *@throws FileNotFoundException error Archivo no encontrado
        *@throws IOException errores no focalizados
        *@return obj Devuelve la lista leída
        */

  public  LinkedList read(String fl) throws Exception{
    LinkedList obj = null;
    FileInputStream arch;
    ObjectInputStream lector=null;

    try{
      arch = new FileInputStream(fl);
      lector = new ObjectInputStream(arch);
      int tamanioLector= lector.read();
      obj=myOwnList;


    }catch(EOFException e){
      System.out.println(e);
      throw new Exception("EOFE Error");

    }catch(FileNotFoundException nf){
      System.out.println(nf);
      throw new NoFileException("No such file or directory");
    }catch(IOException e){
      System.out.println(e);
      throw new Exception("IO error");
    }finally{
      if(lector == null){
          System.out.println("No readable file");

      }else{
        try{
            lector.close();
        }catch(IOException i){
          System.out.println(i);

        }
      }
    }
    return obj;
  }


}
