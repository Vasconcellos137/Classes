package ListaEncadeada_SemUltm;

public class ListaEncadeada {
    private No prim;
    private int tamanho;

    public No getPrim() {
        return prim;
    }
    public void setPrim(No prim) {
        this.prim = prim;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

//  MÉTODOS - OPERAÇÕES

    // Método para printar o result (sout p/ lista)
    public void show_mostrar() {
        No interator = prim;
        System.out.println("Lista");

        for (int i = 1; i <= tamanho; i++) {
            System.out.println(interator.getElement() + " ");
            interator = interator.getProximo();
        }
    }

    @Override
    //Método p printar fila
    public String toString(){
        No no = prim;
        String resp = "";

        for (int i = 0; i < tamanho; i++) {
            resp = resp + " " + no.getElement() + " ";
            no = no.getProximo();
        }
        return resp;
    }

    // Método p/ Adicionar in final list
    public void addFinal(int element){
        No no = new No();
        no.setElement(element);
        no.setProximo(null);

        if (tamanho == 0) { // Se isso, lista vazia
            this.prim = no; // primeiro elemento aponta pra no

        }
        tamanho++;
    }

    
}
