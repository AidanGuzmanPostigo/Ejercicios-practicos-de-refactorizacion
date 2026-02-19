package ejercicios.ejercicio1;
public class Main {
    public static void main(String[] args) {

        Empleado empleado;

        empleado = new Empleado(1, "Juan Pérez", "Desarrollador");

        empleado.guardar();
        empleado.generar();
        empleado.eliminar();
    }
}