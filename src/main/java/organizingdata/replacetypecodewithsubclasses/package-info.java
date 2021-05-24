/**
 * Tienes un código de tipo inmutable que afecta el comportamiento de una clase. Reemplace el código
 * de tipo con subclases.
 * 
 * 
 * Si tiene un código de tipo que no afecta el comportamiento, puede usar Reemplazar código de tipo
 * con clase. Sin embargo, si el código de tipo afecta el comportamiento, lo mejor que puede hacer
 * es usar polimorfismo para manejar el comportamiento variante.
 *
 * Esta situación suele estar indicada por la presencia de casos como enunciados condicionales.
 * Estos pueden ser switches o construcciones if-then-else. En cualquier caso, prueban el valor del
 * código de tipo y luego ejecutan un código diferente según el valor del código de tipo. Estos
 * condicionales deben refactorizarse con Reemplazar condicional con polimorfismo. Para que esta
 * refactorización funcione, el código de tipo debe reemplazarse con una estructura de herencia que
 * albergará el comportamiento polimórfico. Esta estructura de herencia tiene una clase con
 * subclases para cada código de tipo.
 * 
 * La forma más sencilla de establecer esta estructura es Reemplazar el código de tipo con
 * subclases. Toma la clase que tiene el código de tipo y crea una subclase para cada código de
 * tipo. Sin embargo, hay casos en los que no puede hacer esto. En el primero, el valor del código
 * de tipo cambia después de que el objeto es. creado. En el segundo, la clase con el código de tipo
 * ya está subclasificada por otra razón. En cualquiera de estos casos, debe utilizar Reemplazar
 * código de tipo con State / Strategy.
 * 
 * Reemplazar código de tipo con subclases es principalmente un movimiento de andamio que permite
 * Reemplazar condicional con polimorfismo. El desencadenante para usar Reemplazar código de tipo
 * con subclases es la presencia de declaraciones condicionales. Si no hay declaraciones
 * condicionales, Reemplazar el código de tipo con la clase es el movimiento mejor y menos crítico.
 * 
 * Otra razón para reemplazar el código de tipo con subclases es la presencia de características que
 * son relevantes solo para objetos con ciertos códigos de tipo. Una vez que haya realizado esta
 * refactorización, puede usar el método Push Down y Push Down Field para aclarar que estas
 * características son relevantes solo en ciertos casos.
 * 
 * La ventaja de Reemplazar código de tipo con subclases es que traslada el conocimiento del
 * comportamiento de las variantes de los clientes de la clase a la clase misma. Si agrego nuevas
 * variantes, todo lo que necesito hacer es agregar una subclase. Sin polimorfismo, tengo que
 * encontrar todos los condicionales y cambiarlos. Por lo tanto, esta refactorización es
 * particularmente valiosa cuando las variantes cambian constantemente.
 */
package organizingdata.replacetypecodewithsubclasses;
