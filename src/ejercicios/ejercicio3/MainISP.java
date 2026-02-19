package ejercicios.ejercicio3;
public class MainISP {

    public static void main(String[] args) {

        MaquinaOficina basica = new ImpresoraBasica();
        MaquinaOficinaAvanzada multi = new Multifuncion();

        basica.imprimir("Hola");
        // basica.escanear();  // si se llama -> revienta

        multi.imprimir("Contrato");
        multi.escanear();
        multi.enviarFax("123456789");
    }
}