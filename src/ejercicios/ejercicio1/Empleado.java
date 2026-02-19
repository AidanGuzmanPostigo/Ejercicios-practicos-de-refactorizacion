package ejercicios.ejercicio1;
public class Empleado {

    private int id=-1;
    private String nombre="Sin asignar";
    private String puesto="Sin asignar";

    public Empleado(int id, String nombre, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public static Empleado guardar(int id, String nombre, String puesto) {
        System.out.println("Conectando a la base de datos...");
        System.out.println("Empleado " + nombre + " guardado");
        return new Empleado (id,nombre,puesto);
    }

    public void eliminar() {
        System.out.println("Conectando a la base de datos...");
        System.out.println("Empleado " + nombre + " eliminado");
        id = -1;
        nombre = "Sin asignar";
        puesto = "Sin asignar";
    }

    public void generarInforme() {
        if (id == -1) {
        	System.out.println("No existe el empleado o se ha borrado con anterioridad");
        } else {
        	System.out.println("Generando informe para " + nombre);
            System.out.println("Empleado " + nombre + " Id: " + id + " Puesto: " + puesto);
        }
    }
}