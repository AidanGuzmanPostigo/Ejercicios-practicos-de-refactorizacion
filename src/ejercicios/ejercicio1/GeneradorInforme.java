package ejercicios.ejercicio1;
import java.util.List;
public class GeneradorInforme {
	public void generarInforme(List<Empleado> empleados) {
		if (empleados.size() == 0) {
			System.out.println("No hay empleados");
		} else {
			for (Empleado empleado: empleados) {
				System.out.println("Generando informe para " + empleado.getNombre());
	            System.out.println("Empleado " + empleado.getNombre()+ " Id: " + empleado.getId() + " Puesto: " + empleado.getPuesto());
			}
		}
	}
}
