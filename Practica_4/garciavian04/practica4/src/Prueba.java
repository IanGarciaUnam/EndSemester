package icc;

import icc.binario.ImpresoraBinario;

public class Prueba{
    public static void main(String args[]){
        boolean array[];
        array = new boolean[32];
        imprimir1(array);
        imprimir2(array);
        array[31] = true;
        array[1] = true;
        imprimir1(array);
        imprimir2(array);
    }

    public static void imprimir1(boolean[] arr){
        int i = 0;
        while(i < arr.length){
            System.out.print((arr[i++]?"1":"0"));
        }
        System.out.println();
    }

    public static void imprimir2(boolean[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print((arr[i]?"1":"0"));
        }
        System.out.println();
    }
}
