package app_banheiro;
public class Numero2 implements Runnable {
    
    private Banheiro banheiro;

    public Numero2(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        this.banheiro.fazerNumero2();
    }
}
