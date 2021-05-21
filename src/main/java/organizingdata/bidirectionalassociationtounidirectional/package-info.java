/**
 * Tiene una asociación bidireccional, pero una clase ya no necesita características de la otra.
 * Elimine el final innecesario de la asociación.
 * 
 * Las asociaciones bidireccionales son útiles, pero tienen un precio. El precio es la complejidad
 * añadida de mantener los enlaces bidireccionales y garantizar que los objetos se creen y eliminen
 * correctamente. Las asociaciones bidireccionales no son naturales para muchos programadores, por
 * lo que a menudo son una fuente de errores. Muchos enlaces bidireccionales también facilitan que
 * los errores conduzcan a zombies: objetos que deberían ser muerto, pero todavía merodeando debido
 * a una referencia que no se borró. Las asociaciones bidireccionales fuerzan una interdependencia
 * entre las dos clases. Cualquier cambio a uno la clase puede provocar un cambio a otra. Si las
 * clases están en paquetes separados, obtienes un interdependencia entre los paquetes. Muchas
 * interdependencias conducen a una sistema, en el que cualquier pequeño cambio conduce a muchas
 * ramificaciones impredecibles. Debe utilizar asociaciones bidireccionales cuando sea necesario,
 * pero no cuando no lo necesite. Tan pronto como ves que una asociación bidireccional ya no está
 * tirando de su peso, suelta el extremo innecesario.
 * 
 */
package organizingdata.bidirectionalassociationtounidirectional;
