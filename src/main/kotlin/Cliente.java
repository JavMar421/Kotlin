import java.util.Random;

public class Cliente extends Thread {

    Random r = new Random();
    int compras = 0;
    int N;
    String item;
    int dinero;
    final int numero;


    public Cliente(int numero) {
        this.numero = numero;
        dinero = dinero;
    }



    @Override
    public void run() {
        try {
            do {
                Thread.sleep(r.nextInt(1000));
                N = r.nextInt(9)+1;
                item = "Item Nº" + r.nextInt(1000000);
                dinero += r.nextInt(99) + 1;
                compras += 1;
            } while (N >= compras);
            Cajero.cobrar(dinero);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    main.listaHilosOrdenada.add(this);
    }

    }


