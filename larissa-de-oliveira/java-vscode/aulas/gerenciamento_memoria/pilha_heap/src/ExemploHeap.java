public class ExemploHeap {

    public static void main(String[] args) {

        StringBuffer resultado = new StringBuffer();

        Thread thread1 = new Thread(() -> {
            for(int i = 0; i < 100; i++) {
                resultado.append(i);
                resultado.append(" ");
            }
        });
    
        Thread thread2 = new Thread(() -> {
            for(int i = 100; i < 200; i++) {
                resultado.append(i);
                resultado.append(" ");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(resultado.toString());
        
    }
    
    

    
}
