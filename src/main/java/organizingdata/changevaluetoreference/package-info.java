/**
 * Tiene una clase con muchas instancias iguales que desea reemplazar con un solo objeto. Convierta
 * el objeto en un objeto de referencia.
 * 
 * 
 * Puede hacer una clasificación útil de objetos en muchos sistemas: objetos de referencia y objetos
 * de valor. Los objetos de referencia son cosas como cliente o cuenta. Cada objeto representa un
 * objeto en el mundo real, y usa la identidad del objeto para probar si son iguales. Los objetos de
 * valor son cosas como la fecha o el dinero. Se definen completamente a través de sus valores de
 * datos. No le importa que existan copias; puede tener cientos de objetos "1/1/2000" alrededor de
 * su sistema. Debe saber si dos de los objetos son iguales, por lo que debe anular el método equals
 * (y también el método hashCode).
 * 
 * La decisión entre referencia y valor no siempre es clara. A veces, comienza con un valor simple
 * con una pequeña cantidad de datos inmutables. Luego, desea proporcionarle algunos datos
 * modificables y asegurarse de que los cambios afecten a todos los que se refieren al objeto. En
 * este punto, debe convertirlo en un objeto de referencia.
 */
package organizingdata.changevaluetoreference;
