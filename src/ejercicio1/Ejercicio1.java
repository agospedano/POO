/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/

package ejercicio1;
import Entidad.Libro;
import Service.LibroService;
/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroService bookService = new LibroService();
        Libro libro1 = bookService.crearLibro();
        bookService.mostrarLibro(libro1);
        
        
    
    }
    
}
