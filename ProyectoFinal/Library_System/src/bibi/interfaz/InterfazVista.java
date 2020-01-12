package bibi.interfaz;

import java.util.*;
import bibi.estructuras.*;
import java.io.*;
import bibi.insercion.*;


public class InterfazVista extends Object{

/**
*@author Ian_Garcia
*run - muestra todos el material registrado
*
*/
  public  void run(){
    try{
    Serializer serial = new Serializer();
    System.out.println("En sistema :\n" );
    System.out.println("En sistema :\n" + serial.read("db.csv").toString());
  }catch(Exception e){
    System.out.println(e);
    System.out.println("Sin elementos leídos");
  }
    }




}
