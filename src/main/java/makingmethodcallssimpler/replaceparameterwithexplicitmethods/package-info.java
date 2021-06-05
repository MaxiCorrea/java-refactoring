/**
 * Reemplazar parámetro con métodos explícitos es lo contrario de Método de parametrización. El caso
 * habitual para el primero es que tiene valores discretos de un parámetro, prueba esos valores en
 * un condicional y hace cosas diferentes. La persona que llama tiene que decidir qué quiere hacer
 * configurando el parámetro, por lo que también puede proporcionar diferentes métodos y evitar el
 * condicional. No solo evita el comportamiento condicional, sino que también gana la comprobación
 * del tiempo de compilación. Además, su interfaz también es más clara. Con el parámetro, cualquier
 * programador que use el método necesita no solo mirar los métodos en la clase, sino también
 * determinar un valor de parámetro válido. Este último a menudo está mal documentado.
 */
package makingmethodcallssimpler.replaceparameterwithexplicitmethods;
