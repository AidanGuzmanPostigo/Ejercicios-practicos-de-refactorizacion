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
		
	}
}
