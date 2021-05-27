/**
 * tiene subclases que varían solo en métodos que devuelven datos constantes. Cambie los métodos a
 * campos de superclase y elimine las subclases.
 * 
 * Crea subclases para agregar características o permitir que varíe el comportamiento. Una forma de
 * comportamiento variante es el método constante [Beck]. Un método constante es aquel que devuelve
 * un valor codificado. Esto puede resultar muy útil en subclases que devuelven valores diferentes
 * para un descriptor de acceso. Usted define el descriptor de acceso en la superclase y lo
 * implementa con diferentes valores en la subclase. Aunque los métodos constantes son útiles, una
 * subclase que consta solo de métodos constantes no hace lo suficiente para que valga la pena
 * existir. Puede eliminar estas subclases por completo poniendo campos en la superclase. Al hacer
 * eso, elimina la complejidad adicional de las subclases.
 */
package organizingdata.replacesubclasswithfields;
