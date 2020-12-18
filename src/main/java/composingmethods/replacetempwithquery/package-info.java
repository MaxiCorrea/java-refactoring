/**
 * Tecnica de Refactoring "Replace Temp with Query"
 * 
 *  Motivacion para realizar este refactoring.
 *  
 *  1) El problema con las variables temporales es que son temporales y locales. 
 *  Debido a que solo se pueden ver en el contexto del método en el que se utilizan, 
 *  las temperales tienden a fomentar métodos más largos, porque esa es la única 
 *  forma en que puede alcanzar al temporal. Al reemplazar el temporal con un método
 *  de consulta, cualquier método de la clase puede obtener la información. 
 *  Eso ayuda mucho a crear un código más limpio para la clase.
 * 
 *  2) Es un paso vital para implementar el Extract Method Refactoring.
 *  
 */
package composingmethods.replacetempwithquery;