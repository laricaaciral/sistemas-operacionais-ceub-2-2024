package AppBanheiro;

public class Banheiro {

    public void fazendoNumero1() {
        String nomeThread = Thread.currentThread().getName();

        System.out.println(nomeThread + " esta batendo na porta!");

        synchronized (this) {
            atividadeDentroBanheiro(nomeThread, 5);
        }
    }

    public void fazendoNumero2() {
        String nomeThread = Thread.currentThread().getName();

        System.out.println(nomeThread + " esta batendo na porta!");

        // synchronized é a forma como com tarefas atômicas.

        synchronized (this) {
            atividadeDentroBanheiro(nomeThread, 10);
        }
    }

    private void atividadeDentroBanheiro(String nomeThread, Integer tempoEmSegundos) {
        System.out.println(nomeThread + " entrando no banheiro \n");
        if (tempoEmSegundos > 5) {
            System.out.println(nomeThread + " fazendo coisa demorada \n");
        } else {
            System.out.println(nomeThread + " fazendo coisa rápida \n");
        }

        try {
            Thread.sleep(tempoEmSegundos * 1000);
        } catch (Exception e) {
            System.err.println("Erro - " + e);
        }
        System.out.println(nomeThread + " dando descarga \n");
        System.out.println(nomeThread + " lanvando as mãos \n");
        System.out.println(nomeThread + " saindo do banheiro \n");
    }

}
