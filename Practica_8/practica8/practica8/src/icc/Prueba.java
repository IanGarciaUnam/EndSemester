
package icc;

import icc.recursion.Fibonacci;

public class Prueba{
    public static void main(String args[]){
        int iRec,iIt,iCol,pos;
        Fibonacci f = new Fibonacci();
        pos = 700;
        iRec = f.fibRec(pos);
        iIt = f.fibIt(pos);
        iCol = f.fibCol(pos);
        System.out.println("Fibonacci por:");
        System.out.println("Recursion lineal: " + iRec);
        System.out.println("Iteracion: " + iIt);
        System.out.println("Recursion de cola: " + iCol);
    }
}
