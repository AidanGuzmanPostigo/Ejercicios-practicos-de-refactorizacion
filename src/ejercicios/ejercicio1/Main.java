package ejercicios.ejercicio1;
public class Main {
    public static void main(String[] args) {

        Empleado empleado = Empleado.guardar(1, "Juan Pérez", "Desarrollador");
        empleado.generarInforme();
        empleado.eliminar();
        empleado.generarInforme();
    }
}