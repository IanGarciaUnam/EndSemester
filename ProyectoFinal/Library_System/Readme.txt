@Author Ian Israel García Vázquez
@No. de Cuenta 317097364
En distribución para Linux
Lee el siguiente manual con sumo cuidado.

Para comenzar asegurate de tener instalado el compilador ant en tu ordenador
para obtener más información visita: https://ant.apache.org/manual/tutorial-HelloWorldWithAnt.html
Tras ello accede a la carpeta desde tu terminal

===============================================
Ejemplo:
cd  /Documentos/Dirección de la carpeta/Library_System/
===============================================

Tipea <ls> en tu terminal y preiona enter

deberan aparecer carpetas como src/  dia/  libs/

asi como build.xml


Ahora tipea ant compile y presiona enter: Debera aparecer al final de las lineas
==============================================
BUILD SUCCESFUL
==============================================
 - COmo una forma de asegurarnos de la correctes del código.
Como segundo paso tipea ant run y presiona enter

APARECERÁ UN MENÚ COMO EL SIGUIENTE Y SE GENERARÁN NUEVAS CARPETAS.
  En la primera parte aparecerá una Exception, esta es normal, ocurre solo la primera vez cuando la base de datos es
  virgen.


  ========================================================================
[java] java.io.FileNotFoundException: db.csv (No such file or directory)
     [java] Sin archivo abierto.
     [java] Sin Base de Datos Aún
     [java] java.lang.NullPointerException
     [java] ===================================================
     [java] 	 Sistema Nacional de Bibliotecas de México
     [java] ===================================================
     [java] Bienvenido usuari@ a continuación seleccione una opción del menú
     [java] [0]...............................Salir
     [java] [1]...............................Realizar una inserción de Nuevo Material
     [java] [2]...............................Leer todo el archivo
     [java] [3]...............................Realizar Búsquedas
     [java] Siga las Instrucciones atentamente


=========================================================================

Solo deberás seleccionar alguna de las opciones y tras ello presionar enter.

[1] Menu de inserción


=========================================================================
[java] ===================================================
[java] 	 Inserción de Material a Bibliotecas
[java] ===================================================
[java] Bienvenido usuari@ a continuación seleccione una opción del menú
[java] [0]...............................|^| Volver a menú principal
[java] [1]...............................Libros
[java] [2]...............................Revistas
[java] [3]...............................Periódicos
[java] [4]...............................Artículos de Investigación
[java] [5]...............................Películas
[java] [6]...............................Discos de Música
[java] Siga las Instrucciones atentamente
========================================================================
Solo deberás seleccionar cualquiera de las opciones disponibles al igual que en el menú anterior;
tras ello presionar enter; al finalizar el programa te indicará si la inserción a la base de datos ha sido correcta.
Recuerda que para Salir deberás utilizar 0 acompañado de un tipeo a enter;
en caso diferente podría no guardarse la inforamción que solicitas.

Sabemos que esta información es importante para ti; por ello te solicitamos de ninguna manera borrar los archivos
db.csv y temp.tmp; puesto que en ellos se resguarda tu información y al eliminarla será imposible recuperarla.
El archivo.csv es visualizable desde editores de Texto como Excel, LibreOffice, o semejantes.




*************************************************************************
Nota; en caso de no haber guardado nada y salir este podría  marcará una excepción como la siguiente
[java] Exception in thread "main" java.lang.NullPointerException
     [java] 	at bibi.menu.Menu.goingOut(Unknown Source)
     [java] 	at bibi.menu.Menu.main(Unknown Source)
     [java] Java Result: 1



===========================================================================================
Búsqueda - Se recomienda ya haber guardado elementos para utilizar pues en caso contrario podría lanzar una excepción; solo deberás presionar
[3] en el menú principal, despues [1] E ingresar únicamente el caracter o palabra(s) para buscar dentro de la base de datos.

Despues este devolverá aquellos elementos que pueden contener los o algunos caracteres de la(s) palabra(s)

==============================================================================================
Inserción
Este consta de un menú anáologo al que podeís ver en los previamente empleados, solo que aquí deberás de seleccionar que tipo de material deseas ingresar; Libros, Revistas, Periódicos, Articulos de Investigación, Peliculas, Discos de Música entre otros. 
Para ingresar los datos este te solicitará uno a uno de ellos y para evitar errores, puesto que NO SE PUEDE MODIFICAR EL CONTENIDO UNA VEZ AGREGADO, te solicitará tu confirmación por cada dato agregado, al finalizar te mostrará su ficha y su estado, si este logró o no ser añadido, asegurate de seguir las instrucciones para agilizar 
la inserción de material.
==============================================================================================

SIGUE ESTAS SENCILLAS INSTRUCCIONES Y DISFRUTA DE Library System by nanoX Company 
 

 

 





Es absolutamente normal y nos indica un comportamiento normal por no haber creado espacion en su ordenador para
guardar sus datos.
