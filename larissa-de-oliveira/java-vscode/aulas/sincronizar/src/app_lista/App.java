package app_lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        // Lista lista = new Lista();
        // List<String> lista = new ArrayList<>();

        List<String> lista = Collections.synchronizedList(new ArrayList<String>());

        for(int i = 0; i < 10; i++) {
            new Thread(new TarefaAdicional(lista, i)).start();
        }

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(int i = 0; i < lista.size(); i++) {
            System.out.println(i + " - " + lista.get(i));
        }

    }
}
