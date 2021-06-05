/**
 * Un campo debe establecerse en el momento de la creación y nunca debe modificarse. Elimine
 * cualquier método de configuración para ese campo.
 * 
 * Proporcionar un método de configuración indica que se puede cambiar un campo. Si no desea que ese
 * campo cambie una vez creado el objeto, no proporcione un método de configuración (y haga que el
 * campo sea final). De esa manera, su intención es clara y, a menudo, elimina la posibilidad
 * de que el campo cambie. Esta situación ocurre a menudo cuando los programadores usan ciegamente
 * el acceso a variables indirectas [Beck]. Estos programadores luego usan setters incluso en un
 * constructor. Supongo que hay un argumento a favor de la coherencia, pero no se compara con la
 * confusión que el método de configuración provocará más adelante.
 */
package makingmethodcallssimpler.removesettingmethod;
