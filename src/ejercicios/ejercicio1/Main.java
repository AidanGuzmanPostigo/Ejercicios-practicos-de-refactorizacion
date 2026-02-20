package ejercicios.ejercicio1;
public class Main {
    public static void main(String[] args) {
    	Empleado empleado = new Empleado(1,"Juan Pérez", "Desarrollador");
    	ListaEmpleados empleados = new ListaEmpleados();
        GeneradorInforme generadorInforme = new GeneradorInforme();
    	empleados.guardar(empleado);
        generadorInforme.generarInforme(empleados.getEmpleados());
        empleados.eliminar(empleado);
        generadorInforme.generarInforme(empleados.getEmpleados());
    }
}