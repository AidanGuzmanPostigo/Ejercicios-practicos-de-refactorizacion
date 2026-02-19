package ejercicios.ejercicio2;
public class PagoService {

    private IMetodoPago pago;
    public PagoService(IMetodoPago pago) {
    	this.pago = pago;
    }

    public void pagar(double cantidad) {
        pago.procesar(cantidad);
    }
}