
package icc.operaciones;

import java.util.NoSuchElementException;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import icc.*;
/*
*
*
*@author Ian Israel Garcia Vazquez
*317097364
*/
public class OrdenTest extends Calificador{

    protected Orden o;
    protected Random rdm;

    @Override
    public void init(){
        o = new Orden();
        rdm = new Random();
    }

    @Test
    public void tricotomiaTest(){
        int a, b;
        boolean p, q, r;
        startTest("Tricotomia", "int a,b : o.igual(a, b) || o.mayor(a, b) || o.menor(a, b)",1.0); //Comienza el test de Tricotomia
        a = rdm.nextInt() / 2;//Asigna un valor entero aleatorio 
        b = rdm.nextInt() / 2;//Asigan un valor entero aleatorio
        p = o.igual(a, b); //Compara la igualdad
        q = o.mayor(a, b);//Compara quien es mayor
        r = o.menor(a, b);//Compara quien es menor
        assertTrue(p || q || r);//Compara los valores logicos
        addUp(1.0);
        passed();//Finalización y evaluacion del test
    }

    @Test
    public void MdicotomiaTest(){
        int a, b;
        boolean q, r;
        startTest("Dicotomia", "int a,b : o.mayor(a, b) || o.menorIgual(a, b)",1.0);//Comienza el test de Dicotomia
        a = rdm.nextInt() / 2;//Asigna un valor entero aleatorio 
        b = rdm.nextInt() / 2;//Asigna un valor entero aleatorio 
        q = o.mayor(a, b);//Compara quien es mayor
        r = o.menorIgual(a, b);//Compara quien es menor o igual
        assertTrue(q || r);//Compara los valores logicos 
        addUp(1.0);
        passed();
    }

    @Test
    public void mdicotomiaTest(){
        int a, b;
        boolean q, r;
        startTest("Dicotomia", "int a,b : o.mayorIgual(a, b) || o.menor(a, b)",1.0);//Comienza el test de Dicotomia
        a = rdm.nextInt() / 2;//Asigna un valor entero aleatorio 
        b = rdm.nextInt() / 2;//Asigna un valor entero aleatorio 
        q = o.mayorIgual(a, b);//Compara quien es mayor
        r = o.menor(a, b);//Compara quien es menor
        assertTrue(q || r);//COmpara los valores logicos
        addUp(1.0);
        passed();//Finalización y evaluacion del test


   }
}
