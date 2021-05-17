/**
 * Es posible que descubra que inicialmente ha configurado dos clases para que una se refiera a la
 * otra. Con el tiempo, es posible que un cliente de la clase mencionada necesite llegar a los
 * objetos que se refieren a ella. Esto efectivamente significa navegar hacia atrás a lo largo del
 * puntero. Los punteros son enlaces unidireccionales, por lo que no puede hacer esto. A menudo,
 * puede solucionar este problema buscando otra ruta. Esto puede costar en cálculo pero es
 * razonable, y puede tener un método en la clase referida que use este comportamiento. A veces, sin
 * embargo, esto no es fácil y es necesario configurar una referencia bidireccional, a veces
 * denominada puntero hacia atrás. Si no está acostumbrado a los punteros hacia atrás, es fácil
 * enredarse usándolos. Sin embargo, una vez que te acostumbras al idioma, no es demasiado
 * complicado. El idioma es lo suficientemente incómodo como para que debas hacerte pruebas, al
 * menos hasta que te sientas cómodo con el idioma. Debido a que generalmente no me molesto en
 * probar los accesos (el riesgo no es lo suficientemente alto), este es el caso poco común de una
 * refactorización que agrega una prueba. Esta refactorización utiliza punteros hacia atrás para
 * implementar la bidireccionalidad. Otras técnicas, como los objetos de enlace, requieren otras
 * refactorizaciones.
 */
package organizingdata.unidirectionalassociationtobidirectional;
