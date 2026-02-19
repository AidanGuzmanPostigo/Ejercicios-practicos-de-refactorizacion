package ejercicios.ejercicio4;
public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private String estado; // "DISPONIBLE" o "PRESTADO" (detalle mejorable)

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.estado = "DISPONIBLE";
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}