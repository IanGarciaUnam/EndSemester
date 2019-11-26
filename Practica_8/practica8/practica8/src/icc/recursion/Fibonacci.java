
package icc.recursion;

public class Fibonacci{

    public int fibRec(int i){
        if(i < 3){
            return 1;
        }else{
            return fibRec(i - 1) + fibRec(i - 2);
        }
    }

    public int fibIt(int i){
        int a,b,aux;
        a = b = 1;
        for(int j = 3; j <= i; j++){
            aux = b;
            b = a + b;
            a = aux;
        }
        return b;
    }

    public int fibCol(int i){
        return fib(1,1,3,i);
    }

    private int fib(int a, int b, int j, int i){
        if(j > i){
            return b;
        }else{
            return fib(b, a + b, j + 1, i);
        }
    }

}
