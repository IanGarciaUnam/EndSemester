Ian Israel Garcia Vázquez
317097364
1.Semanticamente ¿Cuál es la diferencia entre if y switch?
Ambas realizan lo mismo, no existe diferencia de su significado, su trabajo realizar instrucciones en casos específicos.
2.¿Es necesaria la cláusula default para la correcta ejecución de switch?
No, homologa del else en las claúsulas condicionales if -else, puede o no colocarse
3.¿Es posible simular el do- while con while? Si es posible escribe un código de ejemplo
de como sería , si no lo es escribe porque.

Sí es posible, anexo código de ejemplo.
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      boolean to_Ask = true;
      while(to_Ask){
          System.out.println("Ingrese 1 para repetir y cualquier tecla para salir");
          if(sc.hasNextInt() && sc.nextInt()==1){
              System.out.println("1 Pressed");
              to_Ask=true;
          }else{
              System.out.println("Saliendo");

              to_Ask=false;
              }
          }
      System.exit(0);
      }


4.¿Qué pasa si se pregunta un has NextDouble() pero se manda un int? ¿Qué devuelve hasNextDouble?
Se devuelve un int con decimal en ceros
Ejemplo:
->4
RETURN 4.0

Comprobado con :
/**************************************************/
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextDouble()){
            Double r = sc.nextDouble();
            System.out.println(r);
        }else{
            System.out.println("No es Double");
        }

    }
}
/**************************************************/
