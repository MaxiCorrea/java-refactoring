/**
 * El Downcasting puede ser un mal necesario, pero debes hacerlo lo menos posible. Si devuelve un
 * valor de un método y sabe que el tipo de lo que se devuelve es más especializado que lo que dice
 * la firma del método, está poniendo un trabajo innecesario en sus clientes. En lugar de obligarlos
 * a hacer el Downcasting, siempre debe proporcionarles el tipo más específico que pueda.
 */
package makingmethodcallssimpler.encapsulatedowncast;
