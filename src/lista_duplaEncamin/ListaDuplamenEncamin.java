package lista_duplaEncamin;

public class ListaDuplamenEncamin {
    private No prim;
    private No ultm;
    private int tamanho = 0;

    public No getPrim() {
        return prim;
    }

    public void setPrim(No prim) {
        this.prim = prim;
    }

    public No getUltm() {
        return ultm;
    }

    public void setUltm(No ultm) {
        this.ultm = ultm;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

//  MÉTODOS - OPERAÇÕES

    // Método para printar o result (sout)
    public void show_mostrar() {
        No interator = prim;
        System.out.println("Lista");

        for (int i = 1; i <= tamanho; i++) {
            System.out.println(interator.getElement() + " ");
            interator = interator.getProximo();
        }
    }

    @Override
    // Método p printar pilha
    public String toString() {
        No no = prim;
        String resp = "";

        for (int i = 0; i < tamanho; i++) {
            resp = resp + " " + no.getElement() + " ";
            no = no.getProximo();
        }
        return resp;
    }

    
}
