package ejercicios.ejercicio3;
public class Multifuncion implements MaquinaOficina {

    @Override
    public void imprimir(String texto) {
        System.out.println("Multifunción imprime: " + texto);
    }

    @Override
    public void escanear() {
        System.out.println("Multifunción escanea...");
    }

    @Override
    public void enviarFax(String numero) {
        System.out.println("Multifunción envía fax a: " + numero);
    }
}