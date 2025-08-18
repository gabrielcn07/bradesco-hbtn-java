import java.util.Random;

public class Produtor extends Thread {
    private final Fila fila;
    private final Random random = new Random();

    public Produtor(Fila fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int item = random.nextInt(100) + 1;
                fila.adicionar(item);
                Thread.sleep(1000); // Produz a cada 1 segundo
            }
        } catch (InterruptedException e) {
            System.out.println("Produtor interrompido.");
        }
    }
}

