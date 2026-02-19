package ejercicios.ejercicio3;
public class ImpresoraBasica implements MaquinaOficina {

    @Override
    public void imprimir(String texto) {
        System.out.println("Imprimiendo: " + texto);
    }
}
