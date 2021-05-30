/**
 * Tienes un condicional que elige un comportamiento diferente según el tipo de objeto. Mueva cada
 * tramo del condicional a un método en una subclase. Haz el método original abstracto.
 * 
 * Una de las palabras que suenan más grandiosas en la jerga de los objetos es polimorfismo. La
 * esencia de polymorphsim es que te permite evitar escribir un condicional explícito cuando tienes
 * objetos cuyo comportamiento varía según sus tipos. Como resultado, encontrará que las sentencias
 * switch que activan códigos de tipo o sentencias if-then-else que activan cadenas de tipo son
 * mucho menos comunes en un programa orientado a objetos. El polimorfismo te ofrece muchas
 * ventajas. La mayor ganancia ocurre cuando este mismo conjunto de condiciones aparece en muchos
 * lugares del programa. Si desea agregar un nuevo tipo, debe buscar y actualizar todos los
 * condicionales. Pero con las subclases, simplemente crea una nueva subclase y proporciona los
 * métodos apropiados. Los clientes de la clase no necesitan conocer las subclases, lo que reduce
 * las dependencias en su sistema y facilita la actualización.
 * 
 */
package simplifyingconditionalexpressions.replaceconditionalwithpolymorphism;
