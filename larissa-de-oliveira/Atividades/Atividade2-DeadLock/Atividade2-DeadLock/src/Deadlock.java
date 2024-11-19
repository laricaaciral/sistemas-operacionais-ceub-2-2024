public class Deadlock {
    public static void main(String[] args) {
        final Object objeto1 = "Objeto 1";
        final Object objeto2 = "Objeto 2";

        Thread t1 = new Thread(() -> {
            synchronized (objeto1) {
                System.out.println("Thread 1: locked objeto 1");

                try { Thread.sleep(50); } catch (InterruptedException e) {}

                synchronized (objeto2) {
                    System.out.println("Thread 1: locked objeto 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (objeto2) {
                System.out.println("Thread 2: locked objeto 2");

                try { Thread.sleep(50); } catch (InterruptedException e) {}

                synchronized (objeto1) {
                    System.out.println("Thread 2: locked objeto 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

/* Resultado execução: 
Thread 1: locked objeto 1
Thread 2: locked objeto 2 */

