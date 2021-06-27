/**
 * Tiene clases de GUI que contienen lógica de dominio. Separe la lógica del dominio en clases de
 * dominio separadas
 * 
 * Siempre que escuchas a la gente hablar sobre objetos, escuchas sobre modelo-vista-controlador
 * (MVC).
 * 
 * Esta idea sustenta la relación entre la interfaz gráfica de usuario (GUI) y los objetos de
 * dominio en Smalltalk-80.
 * 
 * El oro en el corazón de MVC es la separación entre el código de la interfaz de usuario (la vista,
 * en estos días a menudo llamada presentación) y la lógica del dominio (el modelo). Las clases de
 * presentación contienen solo la lógica necesaria para tratar con la interfaz de usuario. Los
 * objetos de dominio no contienen código visual sino toda la lógica empresarial. Esto separa dos
 * partes complicadas del programa en partes que son más fáciles de modificar. También permite
 * múltiples presentaciones de la misma lógica empresarial. Quienes tienen experiencia en trabajar
 * con objetos utilizan esta separación de manera instintiva, y ha demostrado su valor. Pero no es
 * así como la mayoría de las personas que trabajan con GUI hacen su diseño. La mayoría de los
 * entornos con Las GUI cliente-servidor utilizan un diseño lógico de dos niveles: los datos se
 * encuentran en la base de datos y la lógica en las clases de presentación. El entorno a menudo te
 * obliga a adoptar este estilo de diseño, lo que te dificulta poner la lógica en otro lugar. Java
 * es un entorno orientado a objetos adecuado, por lo que puede crear objetos de dominio no visual
 * que contengan lógica empresarial. Sin embargo, a menudo se encontrará con código escrito en el
 * estilo de dos niveles.
 * 
 */
package bigrefactorings.separatedomainfrompresentation;
