package Lista;

public class TarefaAdicional implements Runnable {

    private Lista lista;
    private int numeroThread;

    public TarefaAdicional(Lista lista, int numeroThread) {
        this.lista = lista;
        this.numeroThread = numeroThread;
    }

    @Override
    public void run() {
        // i< 10
        for (int i = 0; i < 100; i++) {
            lista.addElementos("Thread " + numeroThread + " - loop: " + i);
        }
    }

}
