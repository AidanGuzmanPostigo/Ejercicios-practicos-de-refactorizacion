package ejercicios.ejercicio4;
public class MainBiblioteca {

    public static void main(String[] args) {

        BibliotecaSistema sistema;

        sistema = new BibliotecaSistema();

        sistema.agregarLibro("123-456-789", "Kotlin para principiantes", "Juan Pérez");
        sistema.agregarLibro("987-654-321", "Desarrollo Avanzado con Kotlin", "Ana López");
        sistema.agregarLibro("456-789-123", "Fundamentos de Programación en Kotlin", "Carlos García");

        sistema.prestar("123-456-789");
        sistema.prestar("987-654-321");

        // Intentar volver a prestar uno ya prestado
        sistema.prestar("123-456-789");

        // Eliminar un libro
        sistema.eliminarLibro("456-789-123");

        // Informes
        sistema.imprimirInformeDetallado();
        sistema.imprimirInformeDisponibles();
        sistema.imprimirInformePrestados();
    }
}