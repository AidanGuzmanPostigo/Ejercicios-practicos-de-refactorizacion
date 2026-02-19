package ejercicios.ejercicio4;

public class MainBiblioteca {

 public static void main(String[] args) {

     InventarioService inventario =  new InventarioService();
     PrestamoService prestamos = new PrestamoService(inventario);
     InformeService informes = new InformeService();

     IEscritor escritor = new EscritorConsola();

     inventario.agregar(new Libro("123-456-789", "Kotlin para principiantes", "Juan Pérez"));
     inventario.agregar(new Libro("987-654-321", "Desarrollo Avanzado con Kotlin", "Ana López"));
     inventario.agregar(new Libro("456-789-123", "Fundamentos de Programación en Kotlin", "Carlos García"));

     // Prestar dos
     if (prestamos.prestar("123-456-789")) {
         escritor.escribir("Préstamo realizado: 123-456-789");
     } else {
         escritor.escribir("No se pudo prestar: 123-456-789");
     }

     if (prestamos.prestar("987-654-321")) {
         escritor.escribir("Préstamo realizado: 987-654-321");
     } else {
         escritor.escribir("No se pudo prestar: 987-654-321");
     }

     // Intentar prestar uno ya prestado
     if (prestamos.prestar("123-456-789")) {
         escritor.escribir("Préstamo realizado: 123-456-789");
     } else {
         escritor.escribir("No se pudo prestar (ya prestado): 123-456-789");
     }

     // Eliminar un libro
     if (inventario.eliminarPorIsbn("456-789-123")) {
         escritor.escribir("Libro eliminado: 456-789-123");
     } else {
         escritor.escribir("No se pudo eliminar: 456-789-123");
     }

     // Informes
     escritor.escribir(informes.informeDetallado(inventario.getLibros()));
     escritor.escribir(informes.informeDisponibles(inventario.getLibros()));
     escritor.escribir(informes.informePrestados(inventario.getLibros()));
 }
}