package ejercicios.ejercicio4;
import java.util.ArrayList;
import java.util.List;
public class InventarioService {
	private List<Libro> libros;
	public InventarioService() {
		libros = new ArrayList<>();
	}
	public void agregar(Libro libro) {
		libros.add(libro);
	}
	public boolean eliminarPorIsbn(String isbn) {
		Libro libro = buscarPorIsbn(isbn);
		if (libro == null) {
			return false;
		} else {
			libros.remove(libro);
			return true;
		}
	}
	public Libro buscarPorIsbn(String isbn) {
		Libro libro;
		for (int i = 0; i< libros.size();i++) {
			libro = libros.get(i);
			if(libro.getIsbn() == isbn) {
				return libro;
			}
		}
		return null;
	}
	public boolean estaDisponible(String isbn) {
		Libro libro;
        libro = buscarPorIsbn(isbn);
        if (libro == null) {
            return false;
        }
        return libro.getEstado().name().equals("DISPONIBLE");
	}
	public List<Libro> getLibros(){
		return libros;
	}
}
