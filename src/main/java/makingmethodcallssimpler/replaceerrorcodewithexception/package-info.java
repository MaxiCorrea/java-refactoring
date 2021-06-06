/**
 * Un metodo retorna un codigo especial de error.
 * 
 * Dispare una Exception en su lugar.
 * 
 * 
 * En las computadoras, como en la vida, las cosas salen mal de vez en cuando. Cuando las cosas van
 * mal, debes hacer algo al respecto. En el caso más simple, puede detener el programa con un código
 * de error. Este es el software equivalente a suicidarse porque pierde un vuelo. (Si hiciera eso,
 * no estaría vivo aunque fuera un gato). A pesar de mi simplista intento de humor, la opción del
 * software suicida tiene mérito. Si el costo de la caída de un programa es pequeño y el usuario es
 * tolerante, detener el programa está bien. Sin embargo, los programas más importantes necesitan
 * medidas más importantes. El problema es que la parte de un programa que detecta un error no
 * siempre es la parte que puede averiguar qué hacer al respecto. Cuando una rutina de este tipo
 * encuentra un error, debe avisar a la persona que llama, y ​​la persona que llama puede pasar el
 * error a lo largo de la cadena. En muchos idiomas se utiliza una salida especial para indicar un
 * error. Los sistemas basados ​​en Unix y C tradicionalmente usan un código de retorno para señalar
 * el éxito o el fracaso de una rutina. Java tiene una forma mejor: excepciones. Las excepciones son
 * mejores porque separan claramente el procesamiento normal del procesamiento de errores. Esto hace
 * que los programas sean más fáciles de entender y, como espero que ahora crean, la comprensión
 * está al lado de la piedad.
 */
package makingmethodcallssimpler.replaceerrorcodewithexception;
