/**
 * Un método tiene un comportamiento condicional que no aclara la ruta normal de ejecución.
 * 
 * Utilice cláusulas de guarda para todos los casos especiales.
 * 
 * 
 * A menudo encuentran que las expresiones condicionales vienen en dos formas. La primera forma es
 * una verificación de si alguno de los casos es parte del comportamiento normal. La segunda forma
 * es una situación en la que una respuesta del condicional indica un comportamiento normal y la
 * otra indica una condición inusual.
 * 
 * Este tipo de condicionales tienen diferentes intenciones, y estas intenciones deben reflejarse en
 * el código. Si ambos son parte del comportamiento normal, use una condición con if y otra else. Si
 * la condición es una condición inusual, verifique la condición y devuélvala si la condición es
 * verdadera. Este tipo de check a menudo se denomina cláusula de Guarda [Beck]. El punto clave
 * sobre Reemplazar cláusulas condicionales anidadas con protección es el énfasis. Si está
 * utilizando una construcción if-then-else, le está dando el mismo peso al if y a el else. Esto le
 * comunica al lector que los if-else son igualmente probables e importantes. En cambio, la cláusula
 * de Guarda dice: "Esto es raro, y si sucede, haga algo y salga". A menudo encuentro que uso
 * Reemplazar condicional anidado con cláusulas de Guarda cuando trabajo con un programador al que
 * se le ha enseñado a tener solo un punto de entrada y un punto de salida de un método. Los
 * lenguajes modernos imponen un punto de entrada, y un punto de salida no es realmente una regla
 * útil. La claridad es el principio clave: si el método es más claro con un punto de salida, use un
 * punto de salida; de lo contrario no lo hagas.
 * 
 */
package simplifyingconditionalexpressions.replacenestedconditionalwithguardclauses;
