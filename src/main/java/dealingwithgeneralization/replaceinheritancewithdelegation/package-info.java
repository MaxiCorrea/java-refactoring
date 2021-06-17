/**
 * Una subclase usa solo una parte de una interfaz de superclases o no quiere heredar datos.
 * 
 * Cree un campo para la superclase, ajuste los métodos para delegar en la superclase y elimine la
 * subclase. (Adapter).
 * 
 * La herencia es algo maravilloso, pero a veces no es lo que quieres. A menudo, comienzas a heredar
 * de una clase, pero luego descubres que muchas de las operaciones de superclase no son realmente
 * ciertas para la subclase. En este caso, tiene una interfaz que no refleja fielmente lo que hace
 * la clase. O puede descubrir que está heredando una gran cantidad de datos que no son apropiados
 * para la subclase. O puede encontrar que existen métodos de superclase protegidos que no tienen
 * mucho sentido con la subclase. Puede vivir con la situación y usar la convención para decir que,
 * aunque es una subclase, está usando solo una parte de la función de superclase. Pero eso da como
 * resultado un código que dice una cosa cuando su intención es otra: una confusión que debe
 * eliminar.
 * 
 * Al usar la delegación en su lugar, deja en claro que solo está haciendo un uso parcial de la
 * clase delegada. Usted controla qué aspectos de la interfaz tomar y cuáles ignorar. El costo es
 * delegar métodos adicionales que son aburridos de escribir pero que son demasiado simples para
 * equivocarse.
 * 
 */
package dealingwithgeneralization.replaceinheritancewithdelegation;
