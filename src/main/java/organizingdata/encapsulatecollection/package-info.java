/**
 * Un método devuelve una colección. Haga que devuelva una vista de solo lectura y proporcione
 * métodos de agregar / quitar
 * 
 * A menudo, una clase contiene una colección de instancias. Esta colección puede ser una matriz,
 * lista, conjunto o vector. Estos casos suelen tener el getter y setter habituales para la
 * colección. Sin embargo, las colecciones deben utilizar un protocolo ligeramente diferente al de
 * otros tipos de datos. La getter no debe devolver el objeto de colección en sí mismo, porque eso
 * permite a los clientes manipular el contenido de la colección sin que la clase propietaria sepa
 * lo que está sucediendo. También revela también mucho a los clientes sobre las estructuras de
 * datos internas del objeto. Un captador para un atributo multivalor debe devolver algo que evite
 * la manipulación de la colección y oculte innecesariamente detalles sobre su estructura. La forma
 * de hacerlo varía según la versión de Java que tenga utilizando. Además, no debería haber un
 * establecedor para la colección: más bien debería haber operaciones para agregar y eliminar
 * elementos. Esto le da al objeto propietario control sobre la adición y eliminación de elementos.
 * de la colección. Con este protocolo la colección se encapsula adecuadamente, lo que reduce el
 * acoplamiento de la poseer clase a sus clientes.
 * 
 */
package organizingdata.encapsulatecollection;
