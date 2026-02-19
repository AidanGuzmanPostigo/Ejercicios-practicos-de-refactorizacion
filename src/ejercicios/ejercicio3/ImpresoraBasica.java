package ejercicios.ejercicio3;
public class ImpresoraBasica implements MaquinaOficina {

    @Override
    public void imprimir(String texto) {
        System.out.println("Imprimiendo: " + texto);
    }

    @Override
    public void escanear() {
        // Una impresora básica NO escanea, pero está obligada por la interfaz
        throw new UnsupportedOperationException("Esta impresora no escanea");
    }

    @Override
    public void enviarFax(String numero) {
        // Tampoco envía fax
        throw new UnsupportedOperationException("Esta impresora no envía fax");
    }
}
