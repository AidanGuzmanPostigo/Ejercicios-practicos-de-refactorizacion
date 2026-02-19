package ejercicios.ejercicio4;
import java.util.ArrayList;
import java.util.List;
public class InformeService {
	public String informeDetallado(List<Libro> libros) {
		return String.format("Informe detallado:\n%s",listar(libros));
	}
	public String informeDisponibles(List<Libro> libros) {
		return String.format("Informe libros disponibles:\n%s",listar(filtrarPorEstado(libros, EstadoLibro.DISPONIBLE)));
	}
	public String informePrestados(List<Libro> libros) {
		return String.format("Informe libros prestados:\n%s",listar(filtrarPorEstado(libros, EstadoLibro.PRESTADO)));
	}
	private List<Libro> filtrarPorEstado(List<Libro> libros, EstadoLibro estado){
		List<Libro> librosFiltrados = new ArrayList<>();
		for (Libro libro: libros) {
			if (libro.getEstado() == estado) {
				librosFiltrados.add(libro);
			}
		}
		return librosFiltrados;
	}
	private String listar(List<Libro> libros){
		StringBuilder listado = new StringBuilder("");
		for (Libro libro: libros) {
			listado.append(String.format("- %s\n",libro.getTitulo()));
		}
		return listado.toString();
	}
}