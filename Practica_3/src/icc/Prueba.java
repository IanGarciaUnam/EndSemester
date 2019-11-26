
package icc;
import icc.Identidad;
import java.util.*;

/**
 *
 * @author mindahrelfen
 */
public class Prueba {

    public static void main(String[] s){
	Wilkomen();
    }
	public static void Wilkomen(){//Funcion de Bienvenida, permite seleccionar entre generar el CURP o Salir del programa
	Scanner ns = new Scanner(System.in);
	
	System.out.print("************************************************************");
	System.out.println("\n\t\tSistema Nacional de CURP");
	System.out.println("************************************************************");
	System.out.println("\n\t\t  Gobierno de México");
	System.out.println("************************************************************");
	System.out.println("\n\t\t Menú de acceso");
	/*Se imprimen instrucciones para el manejo del programa*/
	System.out.println("\t\tBienvenido al sistema de generación de Clave De Registro de Población");
	System.out.println("\t\tPara Ingresar los datos, deberá escribir lo solicitado y presionar enter, al finalizar recibirá su CURP");
	System.out.println("\t\tPresione Enter para continuar, tras ingresar sus datos");
	toAcces();//Llama a la funcion toAcces();
	}


public static String toAcces(){//ESta funcion invoca a la Funcion Curp en Identidad.java
	Identidad id = new Identidad();//Se genera el objeto Identidad
	Scanner sc = new Scanner(System.in);//Se genera el objeto scanner que permite al usuario ingresar información
	String apellidoPaterno, apellidoMaterno, Nombre, sexo; //Se generan las variables String de Apellido Paterno, Apellido materno, nombre y sexo
	int year=0,month=0, day=0;//Inicializa las variables de año, mes día
	System.out.println("\t\t Recuerde que al ingresar los datos puede hacerlo con Mayúsculas y/o minúsculas");
	System.out.println("\t\tIngrese Nombre:");
	Nombre= sc.nextLine();//EL usuario ingresa información de tipo String
	System.out.println("\t\tIngrese Apellido Paterno:");
	apellidoPaterno = sc.nextLine();//El usuario ingresa información tipo String
	System.out.println("\t\tIngrese Apellido Materno");
	apellidoMaterno = sc.nextLine();//El usuario ingresa informacion tipo String
	System.out.println("Para seleccionar sexo, escriba <-----H----> Hombre, escriba M<------M------> Mujer");
	sexo = sc.nextLine();// EL usuario ingresa Información tipo Stringr que puede provocar el No ingresar un numero para una variable tipo String
	System.out.println("Ingrese el número de año de Nacimiento");

	StringBuilder sb = new StringBuilder();
	year  = sc.nextInt();//El usuario ingresa informacion tipo Int
	String anee = Integer.toString(year);//Convierte a String la variable entero Year
	sb.append(anee.charAt(2));//Toma el caracter 2 de la variable anee
	sb.append(anee.charAt(3));//Toma el caracter 3 de la variable anee
	int anio_3= Integer.parseInt(sb.toString());////Convierte a entero el nuevo String formado en el objeto sb a través del método .toString();	
	System.out.println("Ingrese el número de mes de Nacimiento");	
	month = sc.nextInt();//El usuario ingresa informacion tipo Int
	System.out.println("Ingrese el número día de Nacimiento");
	day  = sc.nextInt();//El usuario ingresa informacion tipo Int
	System.out.println("************************\tGobierno de Mexico\t***********************");//Letrero en pantalla


	Printer(apellidoPaterno, apellidoMaterno, Nombre,year, month,day , sexo);//Imprime los datos ingresados
	System.out.println("\t\t\t\tTu CURP es: " + id.curp(apellidoPaterno, apellidoMaterno, Nombre, anio_3, month, day,sexo));//Imprime el CURP generado desde la Identidad.java
	System.out.println("************************\t\t\t\t************************");	
	return id.curp(apellidoPaterno, apellidoMaterno, Nombre, anio_3, month, day,sexo);//Devuelve el CURP generado desde Identidad.java, en la funcion String to Acces()
	}

public static void Printer(String ap, String am, String N, int Anio, int mes, int jour, String sexo){//Imprime los letreros de Informacion del programa
	String anio_2 ="";	
	String m_2 = "";
	String dia_2 = "";
	String anio =anio_2.format("%02d",Anio);
	String m   =m_2.format("%02d",mes);
	String dia =anio_2.format("%02d",jour);
	System.out.println("Nombre:\t" + N.toUpperCase());
	System.out.println("Apellido Paterno:\t" + ap.toUpperCase());
	System.out.println("Apellido Materno:\t" + am.toUpperCase());
	System.out.println("|--------- Fecha de Nacimiento ---------|");
	System.out.println("\tEn formato dd / mm / aaaa");
	System.out.println("\t\t\t"+dia + "/" + m + "/" + anio);
	System.out.println("|_______________________________________|");	
	System.out.println("Sexo:\t" + sexo.toUpperCase());

}


}
