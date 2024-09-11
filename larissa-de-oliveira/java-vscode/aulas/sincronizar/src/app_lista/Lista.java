package app_lista;

public class Lista {
    
    private String[] elementos = new String[1000];
    private int indice = 0;

    int tamanho() {
        return elementos.length;
    }

    String getElementos(int indice) {
        return elementos[indice];
    }

    public void addElementos(String elemento) {
        synchronized(this) {
            this.elementos[indice] = elemento;
            this.indice++;
        }
        
    }
}
