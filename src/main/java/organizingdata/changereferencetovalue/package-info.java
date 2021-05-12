/**
 * 
 * Tiene un objeto de referencia que es pequeño, inmutable y difícil de administrar. Conviértelo en
 * un Value Object.
 * 
 * 
 * Al igual que con Cambiar valor a referencia, la decisión entre una referencia y un objeto de
 * valor no siempre es clara. Es una decisión que a menudo necesita revertirse. El desencadenante
 * para pasar de una referencia a un valor es que trabajar con el objeto de referencia se vuelve
 * incómodo. Los objetos de referencia deben controlarse de alguna manera. Siempre debes pedirle al
 * controlador el objeto apropiado. Los vínculos de memoria también pueden ser incómodos. Los
 * objetos de valor son particularmente útiles para sistemas distribuidos y concurrentes. Una
 * propiedad importante de los objetos de valor es que deben ser inmutables. Cada vez que invoca una
 * consulta en uno, debería obtener el mismo resultado. Si esto es cierto, no hay problema en que
 * muchos objetos representen lo mismo. Si el valor es mutable, debe asegurarse de que al cambiar
 * cualquier objeto también se actualicen todos los demás objetos que representan lo mismo. Eso es
 * tan molesto que lo más fácil de hacer es convertirlo en un objeto de referencia. Es importante
 * tener claro lo que significa inmutable. Si tiene una clase monetaria con una moneda y un valor,
 * suele ser un objeto de valor inmutable. Eso no significa que su salario no pueda cambiar.
 * Significa que para cambiar su salario, debe reemplazar el objeto monetario existente con un nuevo
 * objeto monetario en lugar de cambiar la cantidad de un objeto monetario existente. Su relación
 * puede cambiar, pero el objeto de dinero en sí no lo hace.
 */
package organizingdata.changereferencetovalue;
