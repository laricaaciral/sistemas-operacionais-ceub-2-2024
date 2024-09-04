package Lista;

public class Lista {

    private String[] elementos = new String[1000]; // 100
    private int indice = 0;

    int tamanho() {
        return this.elementos.length;
    }

    String getElemento(int index) {
        return this.elementos[index];
    }

    public void addElementos(String elemento) {
        // synchronized (this) {
        this.elementos[indice] = elemento;
        this.indice++;
        // }

    }

}
