package ejercicios.ejercicio2;
public class PayPal implements IMetodoPago{
	@Override
    public void procesar(double cantidad) {
        System.out.println("Pagando con PayPal: " + cantidad + "€");
    }
}