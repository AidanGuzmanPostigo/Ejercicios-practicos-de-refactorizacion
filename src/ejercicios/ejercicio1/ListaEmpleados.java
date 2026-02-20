package ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ListaEmpleados {
	private List<Empleado> empleados;
	public ListaEmpleados() {
		empleados = new ArrayList<>();
	}
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	public void guardar(Empleado empleado) {
		System.out.println("Conectando a la base de datos...");
        System.out.println("Empleado " + empleado.getNombre() + " guardado");
        empleados.add(empleado);
	}
	public void eliminar (Empleado empleado) {
		boolean isValid = false;
		System.out.println("Conectando a la base de datos...");
        for (int i=0;i< empleados.size();i++) {
        	if (empleado == empleados.get(i)) {
        		System.out.println("Empleado " + empleado.getNombre() + " eliminado");
                empleados.remove(empleado);
                isValid = true;
        	}
        }
        if (!isValid) {
        	System.out.println("No existe el empleado o se ha borrado con anterioridad");
        }
		
		
	}
}
