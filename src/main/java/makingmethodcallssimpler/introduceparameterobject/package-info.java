/**
 * Tiene un grupo de parámetros que, naturalmente, van juntos. Reemplácelos con un objeto.
 * 
 * A menudo, ve un grupo particular de parámetros que tienden a pasarse juntos. Varios métodos
 * pueden usar este grupo, ya sea en una clase o en varias clases. Dicho grupo de clases es un grupo
 * de datos y se puede reemplazar con un objeto que contenga todos estos datos. Vale la pena
 * convertir estos parámetros en objetos solo para agrupar los datos. Esta refactorización es útil
 * porque reduce el tamaño de las listas de parámetros y las listas de parámetros largas son
 * difíciles de entender. Los accesos definidos en el nuevo objeto también hacen que el código sea
 * más consistente, lo que nuevamente hace que sea más fácil de entender y modificar. Sin embargo,
 * obtiene un beneficio más profundo porque una vez que ha agrupado los parámetros, pronto verá un
 * comportamiento que también puede pasar a la nueva clase. A menudo, los cuerpos de los Los métodos
 * tienen manipulaciones comunes de los valores de los parámetros. Al mover este comportamiento al
 * nuevo objeto, puede eliminar una gran cantidad de código duplicado.
 * 
 */
package makingmethodcallssimpler.introduceparameterobject;
