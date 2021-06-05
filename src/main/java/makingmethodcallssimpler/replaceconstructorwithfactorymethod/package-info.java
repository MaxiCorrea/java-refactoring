/**
 * Desea hacer más que una simple construcción cuando crea un objeto.
 * 
 * Reemplaza el constructor con un método de fábrica.
 * 
 * La motivación más obvia para Reemplazar constructor con método de fábrica viene con reemplazar un
 * código de tipo con subclases. Tiene un objeto que a menudo se crea con un código de tipo, pero
 * ahora necesita subclases. La subclase exacta se basa en el código de tipo. Sin embargo, los
 * constructores solo pueden devolver una instancia del objeto solicitado. Entonces necesitas
 * reemplazar el constructor con un método de fábrica [Gang of Four].
 * 
 * Puede utilizar métodos de fábrica para otras situaciones en las que los constructores son
 * demasiado limitados. Los métodos de fábrica son esenciales para cambiar el valor de referencia.
 * También se pueden utilizar para señalar diferentes comportamientos de creación que van más allá
 * del número y tipo de parámetros.
 * 
 */
package makingmethodcallssimpler.replaceconstructorwithfactorymethod;
