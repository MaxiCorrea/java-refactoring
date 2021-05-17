/**
 * Tiene datos de dominio disponibles solo en un control de GUI y los métodos de dominio necesitan
 * acceso.
 * 
 * Copie los datos a un objeto de dominio. Configure un observador para sincronizar los dos datos.
 * 
 * 
 * 
 * Un sistema bien estructurado separa el código que maneja la interfaz de usuario del código que
 * maneja la lógica de negocio. Lo hace por varias razones. Es posible que desee varias interfaces
 * para una lógica de negocio similar; la interfaz de usuario se vuelve demasiado complicada si hace
 * ambas cosas; es más fácil mantener y desarrollar objetos de dominio separados de la GUI; o puede
 * tener diferentes desarrolladores manejando las diferentes piezas. Aunque el comportamiento se
 * puede separar fácilmente, los datos a menudo no. Los datos deben estar integrados en el control
 * de la GUI que tiene el mismo significado que los datos que viven en el modelo de dominio. Los
 * frameworks de interfaz de usuario, desde modelo-vista-controlador (MVC) en adelante, utilizaron
 * un sistema de varios niveles para proporcionar mecanismos que le permitan proporcionar estos
 * datos y mantener todo sincronizado. Si encuentra código que se ha desarrollado con un enfoque de
 * dos niveles en el que la lógica de negocio está incrustada en la interfaz de usuario, debe
 * separar los comportamientos. Gran parte de esto se trata de descomponer y mover metodos. Sin
 * embargo, para los datos, no puede simplemente mover los datos, debe duplicarlos y proporcionar el
 * mecanismo de sincronización.
 * 
 */
package organizingdata.duplicateobserveddata;
