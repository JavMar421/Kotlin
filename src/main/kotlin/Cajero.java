public class Cajero extends Thread {
    private static int recaudado;
    public static synchronized String cobrar(int hilo) throws InterruptedException {
            recaudado += hilo;

        return "El dinero recaudado es "+recaudado;
    }
    public static String Resultado() {
        return "El dinero recaudado es "+recaudado;
    }
}