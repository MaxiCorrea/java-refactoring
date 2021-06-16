/**
 * Varios clientes utilizan el mismo subconjunto de la interfaz de una clase, o dos clases tienen
 * parte de sus interfaces en común.
 * 
 * Extraiga el subconjunto en una interfaz.
 * 
 * 
 * Las clases se utilizan de varias formas. El uso de una clase a menudo significa abarcar toda el
 * área de responsabilidades de una clase. Otro caso es el uso de solo un subconjunto particular de
 * las responsabilidades de una clase por parte de un grupo de clientes. Otro es que una clase
 * necesita trabajar con cualquier clase que pueda manejar ciertas solicitudes.
 * 
 * Para los dos segundos casos, a menudo es útil hacer que el subconjunto de responsabilidades sea
 * una cosa por derecho propio, de modo que pueda quedar claro en el uso del sistema. De esa forma
 * es más fácil ver cómo se dividen las responsabilidades. Si se necesitan nuevas clases para
 * respaldar el subconjunto, es más fácil ver exactamente qué encaja en el subconjunto.
 * 
 * En muchos lenguajes orientados a objetos, esta capacidad es compatible con herencia múltiple.
 * Creas una clase para cada segmento de comportamiento y los combinas en una implementación. Java
 * tiene herencia única, pero le permite establecer e implementar este tipo de requisitos mediante
 * interfaces.
 * 
 * Las interfaces han tenido una gran influencia en la forma en que los programadores diseñan
 * programas Java. ¡Incluso los programadores de Smalltalk piensan que las interfaces son un paso
 * adelante!
 * 
 * Existe cierta similitud entre Extract Superclass y Extract Interface. Extraer interfaz solo puede
 * mostrar interfaces comunes, no código común. El uso de Extract Interface puede generar código
 * duplicado maloliente. Puede reducir este problema utilizando Extract Class para poner el
 * comportamiento en un componente y delegar en él. Si hay un comportamiento común sustancial,
 * Extraer Superclase es más simple, pero solo puedes tener una superclase.
 * 
 */
package dealingwithgeneralization.extractinterface;
