public class App {
    public static void main(String[] args) throws Exception {
        Banheiro banheiro = new Banheiro();

        Thread convidado1 = new Thread(new Numero1(banheiro), "João");
        Thread convidado2 = new Thread(new Numero2(banheiro), "Rafael");
        Thread convidado3 = new Thread(new Numero1(banheiro), "Caique");
        Thread convidado4 = new Thread(new Numero2(banheiro), "Reginaldo");

        convidado1.start();
        convidado2.start();
        convidado3.start();
        convidado4.start();
    }
}
