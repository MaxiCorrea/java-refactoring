/**
 * Tienes una secuencia de pruebas condicionales con el mismo resultado. Combínelos en una sola
 * expresión condicional y extráigala.
 * 
 * A veces ves una serie de verificaciones condicionales en las que cada verificación es diferente
 * pero la acción resultante es la misma. Cuando vea esto, debe usar ands y ors para consolidarlos
 * en una sola verificación condicional con un solo resultado. La consolidación del código
 * condicional es importante por dos razones. Primero, hace que el chequeo sea más claro al mostrar
 * que realmente está haciendo un solo chequeo que está juntando los otros chequeos. La secuencia
 * tiene el mismo efecto, pero comunica la realización de una secuencia de comprobaciones separadas
 * que simplemente se hacen juntas. La segunda razón de esta refactorización es que a menudo lo
 * prepara para el método de extracción. Extraer una condición es una de las cosas más útiles que
 * puede hacer para aclarar su código. Reemplaza una declaración de lo que está haciendo con la
 * razón por la que lo está haciendo. Las razones a favor de la consolidación de condicionales
 * también apuntan a razones para no hacerlo. Si cree que las comprobaciones son realmente
 * independientes y no deben considerarse como una única comprobación, no haga la refactorización.
 * Tu código ya comunica tu intención.
 * 
 */
package simplifyingconditionalexpressions.consolidateconditionalexpression;
