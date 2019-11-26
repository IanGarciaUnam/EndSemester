
package icc.figuras.poligonos.regulares;

import java.util.NoSuchElementException;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class OctagonoTest extends RegularTestA{

    public Regular getRegular(){
        double a,l;
        int i;
        Random rdm = new Random();
        i = rdm.nextInt();
        a = random();
        l = random();
        if(i > 0){
            a = -a;
        }else{
            l = -l;
        }
        return new Octagono(a,l);
    }
}