package Lista;

public class App {

    public static void main(String[] args) {
        Lista lista = new Lista();

        for (int i = 0; i < 10; i++) {
            new Thread(new TarefaAdicional(lista, i)).start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < lista.tamanho(); i++) {
            System.out.println(i + " - " + lista.getElemento(i));
        }

    }

}
