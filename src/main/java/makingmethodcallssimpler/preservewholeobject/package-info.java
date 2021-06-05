/**
 * Este tipo de situación surge cuando un objeto pasa varios valores de datos de un solo objeto como
 * parámetros en una llamada a un método. El problema con esto es que si el objeto llamado necesita
 * nuevos valores de datos más adelante, debe buscar y cambiar todas las llamadas a este método.
 * Puede evitar esto pasando el objeto completo del que proceden los datos. El objeto llamado
 * entonces puede pedir lo que quiera de todo el objeto.
 * 
 * Además de hacer que la lista de parámetros sea más robusta a los cambios, Preserve Whole Object a
 * menudo hace que el código sea más legible. Puede ser difícil trabajar con listas de parámetros
 * largas porque tanto el llamante como el destinatario tienen que recordar qué valores estaban
 * allí. También fomentan el código duplicado porque el objeto llamado no puede aprovechar ningún
 * otro método en todo el objeto para calcular valores intermedios.
 * 
 * Hay una desventaja. Cuando pasa valores, el objeto llamado tiene una dependencia de los valores,
 * pero no hay ninguna dependencia con el objeto del que se extrajeron los valores. Pasar el objeto
 * requerido provoca una dependencia entre el objeto requerido y el objeto llamado. Si esto va a
 * estropear su estructura de dependencia, no use Preserve Whole Object.
 * 
 * El hecho de que un método llamado use muchos valores de otro objeto es una señal de que el método
 * llamado realmente debería definirse en el objeto del que provienen los valores. Cuando esté
 * considerando Conservar todo el objeto, considere el Método de movimiento como alternativa.
 * 
 */
package makingmethodcallssimpler.preservewholeobject;
