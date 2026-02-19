package ejercicios.ejercicio2;
public class PagoService {

    private PayPal pago = new PayPal();

    public void pagar(double cantidad) {
        pago.procesar(cantidad);
    }
}