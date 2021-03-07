/**
 * Hide Delegate
 * 
 * Un cliente está llamando a una clase delegada de un objeto. Cree métodos en el servidor para
 * ocultar al delegado.
 * 
 * 
 * Una de las claves, si no la clave, de los objetos es la encapsulación. La encapsulación significa
 * que los objetos necesitan saber menos sobre otras partes del sistema. Luego, cuando las cosas
 * cambian, es necesario informar a menos objetos sobre el cambio, lo que facilita la realización
 * del cambio.
 * 
 * Cualquiera que esté involucrado en objetos sabe que debe ocultar sus campos, a pesar de que Java
 * permite que los campos sean públicos. A medida que se vuelve más sofisticado, se da cuenta de que
 * hay más que puede encapsular.
 * 
 * Si un cliente llama a un método definido en uno de los campos del objeto del servidor, el cliente
 * necesita conocer este objeto delegado. Si el delegado cambia, es posible que el cliente también
 * tenga que cambiar. Puede eliminar esta dependencia colocando un método de delegación simple en el
 * servidor, que oculta al delegado. Los cambios se limitan al servidor y no se
 * propagan al cliente.
 */
package movingfeaturesbetweenobjects.hidedelegate;
