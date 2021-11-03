
import java.util.ArrayList;

public class main {

    static ArrayList<Cliente> listaHilosOrdenada = new ArrayList<>() {
    };

    public static void main(String args[]) throws InterruptedException {
        ArrayList<Cliente> listaHilos = new ArrayList<>();
        int recaudado=0;
        for (int i = 0; i < 100; i++) {
            Cliente h = new Cliente(i);
            h.start();
            listaHilos.add(h);
        }
        for (Cliente h : listaHilos) {
            try {
                h.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (Cliente hilo:listaHilosOrdenada) {
             recaudado += hilo.dinero;
        }
        System.out.println(Cajero.Resultado());
    }
}
