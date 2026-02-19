package ejercicios.ejercicio4;

public class PrestamoService {
	private InventarioService inventario;
	public PrestamoService(InventarioService inventario) {
		this.inventario = inventario;
	}
	public boolean prestar(String isbn) {
		Libro libro = inventario.buscarPorIsbn(isbn);
		if (libro == null || libro.getEstado().name().equals("PRESTADO")) {
			return false;
		} else {
			libro.setEstado(EstadoLibro.PRESTADO);
			return true;
		}
	}
	public boolean devolver(String isbn) {
		Libro libro = inventario.buscarPorIsbn(isbn);
		if (libro == null || libro.getEstado().name().equals("DISPONIBLE")) {
			return false;
		} else {
			libro.setEstado(EstadoLibro.DISPONIBLE);
			return true;
		}
	}
}
