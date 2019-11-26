
package icc.serial;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import icc.RandomStringGenerator;
import icc.Calificador;
import icc.exception.NoSerializableException;
import icc.exception.NoFileException;

/**
 *
 * @author mindahrelfen
 */
public class SerializerTest extends Calificador{

    Serializer r;
    String fileName;
    String directory;

    public void init(){
        r = new Serializer();
        fileName = "file.ser";
        directory = "dir/";
        rsg = new RandomStringGenerator(range,false);
    }

    @Test
    public void writeReadTest(){
        LinkedList l1,l2;
        startTest("writeRead", "Revisa que se escriba y lea correctamente",1.0);
        l1 = new LinkedList();
        rsgIt = rsg.iterator();
        try{
            while(rsgIt.hasNext()){
                l1.add(rsgIt.next());
            }
            r.write(l1,fileName);
        }catch(Exception e){
            fail("Should not throw any exception.");
        }
        try{
            l2 = r.read(fileName);
        }catch(Exception e){
            fail("Should not throw any exception.");
        }
        addUp(1.0);
        passed();
    }

    @Test
    public void writeNoSerializableTest(){
        LinkedList l;
        startTest("writeNoSerializable", "Revisa que no pueda escribir objetos no serializables.",1.0);
        l = new LinkedList();
        try{
            l.add(new Object());
            r.write(l,fileName);
            fail("Should throw exception");
        }catch(NoSerializableException e){
        }catch(Exception e){
            fail("Should not throw any other exception.");
        }
        addUp(1.0);
        passed();
    }

    @Test
    public void writeNoFileTest(){
        startTest("writeNoFile", "Revisa que no pueda escribir sobre un archivo invalido.",1.0);
        try{
            r.write(null,directory + fileName);
            fail("Should throw exception");
        }catch(NoFileException e){
        }catch(Exception e){
            fail("Should not throw any other exception.");
        }
        addUp(1.0);
        passed();
    }

    @Test
    public void readNoFileTest(){
        startTest("readNoFile", "Revisa que no pueda leer sobre un archivo invalido.",1.0);
        try{
            r.read(directory + fileName);
            fail("Should throw exception");
        }catch(NoFileException e){
        }catch(Exception e){
            fail("Should not throw any other exception.");
        }
        addUp(1.0);
        passed();
    }
}
