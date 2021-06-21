/**
 * Utiliza la delegación y, a menudo, escribe muchas delegaciones simples para toda la interfaz.
 * Haga de la clase delegante una subclase del delegado.
 * 
 * Esta es la otra cara de Reemplazar delegación con herencia. Si se encuentra utilizando todos los
 * métodos del delegado y está harto de escribir todos esos métodos simples de delegación, puede
 * volver a la herencia con bastante facilidad.
 * 
 * Hay que tener en cuenta un par de advertencias. Si no está usando todos los métodos de la clase a
 * la que está delegando, no debe usar Reemplazar delegación con herencia, porque una subclase
 * siempre debe seguir la interfaz de la superclase. Si los métodos de delegación son tediosos,
 * tiene otras opciones. Puede permitir que los clientes llamen al delegado ellos mismos con Remove
 * Middle Man. Puede usar Extract Superclass para separar la interfaz común y luego heredar de la
 * nueva clase. Puede utilizar Extract Interface de forma similar.
 * 
 * Otra situación a tener en cuenta es aquella en la que el delegado es compartido por más de un
 * objeto y es mutable. En este caso, no puede reemplazar al delegado con herencia porque ya no
 * compartirá los datos. El intercambio de datos es una responsabilidad que no se puede transferir a
 * la herencia.
 * 
 * Cuando el objeto es inmutable, el intercambio de datos no es un problema, porque puedes
 * simplemente copiar y nadie puede saberlo.
 * 
 */
package dealingwithgeneralization.replacedelegationwithinheritance;
