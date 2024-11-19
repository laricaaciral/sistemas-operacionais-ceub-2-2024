public class ThreadExample extends Thread {
    @Override
    public void run() {
        Thread threadAtual = Thread.currentThread();
        long id = threadAtual.getId();
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Id da Thread: " + id + " - Número: " + i);
        }
    }

    public static void main(String[] args) {
        ThreadExample thread1 = new ThreadExample();
        ThreadExample thread2 = new ThreadExample();

        thread1.start();
        thread2.start();
    }
}