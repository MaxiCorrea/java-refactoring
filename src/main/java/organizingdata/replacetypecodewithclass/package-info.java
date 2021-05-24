/**
 * Una clase tiene un código de tipo numérico que no afecta su comportamiento. Reemplace el número
 * con una nueva clase.
 * 
 * Los códigos de tipo numérico, o enumeraciones, son una característica común de los lenguajes
 * basados en C. Con nombres simbólicos, pueden ser bastante legibles. El problema es que el nombre
 * simbólico es solo un alias; el compilador todavía ve el número subyacente. El tipo de compilador
 * verifica usando el número, no el nombre simbólico. Cualquier método que tome el código de tipo
 * como argumento espera un número y no hay nada que obligue a usar un nombre simbólico. Esto puede
 * reducir la legibilidad y ser una fuente de errores.
 * 
 * Si reemplaza el número con una clase, el compilador puede escribir check en la clase. Al
 * proporcionar métodos de fábrica para la clase, puede verificar estáticamente que solo se crean
 * instancias válidas y que esas instancias se pasan a los objetos correctos
 */
package organizingdata.replacetypecodewithclass;
