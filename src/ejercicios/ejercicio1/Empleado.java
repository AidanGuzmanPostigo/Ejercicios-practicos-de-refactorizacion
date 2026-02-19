package ejercicios.ejercicio1;
public class Empleado {

    private int id;
    private String nombre;
    private String puesto;

    public Empleado(int id, String nombre, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public void guardarEmpleado() {
        System.out.println("Conectando a la base de datos...");
        System.out.println("Empleado " + nombre + " guardado");
    }

    public void eliminarEmpleado() {
        System.out.println("Conectando a la base de datos...");
        System.out.println("Empleado " + nombre + " eliminado");
    }

    public void generarInformeEmpleado() {
        System.out.println("Generando informe para " + nombre);
    }
}