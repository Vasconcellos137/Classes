package lista;

public class ListaEncadeada {

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

    // Método p/ Adicionar in final list
    public void add(int element) {
        No no = new No();
        no.setElement(element);
        no.setProximo(null);

        if (tamanho == 0) { // Se isso, lista vazia
            this.prim = no; // primeiro elemento aponta pra no

        } else {
            this.ultm.setProximo(no);
        }

        this.ultm = no; // ultimo aponta p no tbm
        tamanho++;
    }

    // Método p Adicionar in inicio list
    public void addInicio(int element) {
        No no = new No();
        no.setElement(element);
        no.setProximo(null);

        if (tamanho == 0) {
            ultm = no;
        }

        no.setProximo(prim);
        prim = no;
        tamanho++;
    }

    // Método p adicionar in meio list
    public void addMeio(int element, int pos) {
        if (pos == 0) {
            addInicio(element);         // Add no inicio
        } else if (pos == tamanho) {   // Add no final
            add(element);
        }

        No no = new No();
        no.setElement(element);
        no.setProximo(null);
        No atual = prim;

        for (int i = 0; i < pos-1; i++) {
            atual = atual.getProximo();
        }

        no.setProximo(atual.getProximo());
        atual.setProximo(no);
        tamanho++;
    }

    // Método para printar o result (sout p/ lista)
    public void show_mostrar() {
        No interator = prim;
        System.out.println("Lista");

        for (int i = 1; i <= tamanho; i++) {
            System.out.println(interator.getElement() + " ");
            interator = interator.getProximo();
        }
    }

    // Método p remover in inicio list
    public void removerInicio(){
        No atual = prim;
    
        if (tamanho == 1 ) {
            prim = null;
            ultm = null;
            return;
        }

        prim = prim.getProximo();
        atual = null;

        tamanho--;
        
    }

    // Método p remover in fim list (ˇ-ˇ)
    public void removerFim(){
        No atual = prim;
        
        if (tamanho == 1) {
            ultm = null;
        }

        for (int i = 0; i < tamanho; i++)  {

            if (prim.getProximo() == null) {
                atual.getProximo();    
                atual = null;           
            }
        }
        tamanho--;
    }

    //Método p remover in meio d list
    public void removeMeio(int pos){
        No atual = prim;

        if (pos == 0) {
            removerInicio();         
        } else if (pos == tamanho) {   
            removerFim();
        }

        for (int i = 0; i < pos-1; i++) {

        }
    
    }
}


