package ejercicios.ejercicio2;
public class MainPago {

    public static void main(String[] args) {

        PagoService servicio1 = new PagoService(new PayPal());
        PagoService servicio2 = new PagoService(new TarjetaCredito());

        servicio1.pagar(19.99);
        servicio2.pagar(49.90);
    }
}