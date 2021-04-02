/**
 * La motivación para Hide Delegate, Es encapsular el uso de un objeto delegado. Esto tiene un
 * precio. El precio es que cada vez que el cliente quiera utilizar un nueva característica del
 * delegado, debe agregar un método de delegación simple al servidor. Después agregar funciones por
 * un tiempo, se vuelve doloroso. La clase de servidor es solo un intermediario, y tal vez sea el
 * momento de que el cliente llame directamente al delegado.
 */
package movingfeaturesbetweenobjects.removemiddleman;
