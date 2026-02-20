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
    public String getNombre() {
    	return nombre;
    }
    public int getId() {
    	return id;
    }
    public String getPuesto() {
    	return puesto;
    }
}