/**
 * Tiene un método que devuelve un valor pero también cambia el estado de un objeto. Cree dos
 * métodos, uno para la consulta y otro para la modificación.
 * 
 * Cuando tienes una función que te da un valor y no tiene efectos secundarios observables, tienes
 * algo muy valioso. Puede llamar a esta función tantas veces como desee. Puede mover la llamada a
 * otros lugares del método. En resumen, tienes mucho menos de qué preocuparte.
 * 
 * Es una buena idea señalar claramente la diferencia entre los métodos con efectos secundarios y
 * los que no los tienen. Una buena regla a seguir es decir que cualquier método que devuelva un
 * valor no debe tener efectos secundarios observables. Algunos programadores tratan esto como una
 * regla absoluta [Meyer]. No soy 100 por ciento puro en esto (como en cualquier otra cosa), pero
 * trato de seguirlo la mayor parte del tiempo y me ha servido bien.
 * 
 * Si encuentra un método que devuelve un valor pero también tiene efectos secundarios, debe
 * intentar separar la consulta del modificador. Notarás que utilizo la frase efectos secundarios
 * observables. Una optimización común es almacenar en caché el valor de una consulta en un campo
 * para que las llamadas repetidas sean más rápidas. Aunque esto cambia el estado del objeto con la
 * caché, el cambio no es observable. Cualquier secuencia de consultas siempre devolverá los mismos
 * resultados para cada consulta [Meyer].
 * 
 */
package makingmethodcallssimpler.separatequeryfrommodifier;
