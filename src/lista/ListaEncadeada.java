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

//Método p/ Adicionar in list    
    public void add(int element){
        No no = new No(); 
        no.setElement(element);
        no.setProximo(null);

        if (tamanho == 0) { //Se isso, lista vazia
            this.prim = no; //primeiro elemento aponta pra no

        } else{
            this.ultm.setProximo(no);
        }

        this.ultm = no; //ultimo aponta p no tbm 
        tamanho++;
    }
 
//Método p/ Adicionar in meio d list
    public static void addMeio(int element){
        No no = new No(); 
        no.setElement(element);
        no.setProximo(null);

        if (tamanho == 0) {
            this.prim = no;
        } else {
            this.ultm = no;
        }

        

    }

//Método para printar o ressult (sout p/ lista)    
    public void show_mostrar(){
        No interator = prim;
        System.out.println("Lista");

        for (int i = 1; i <= tamanho; i++) {
            System.out.println(interator.getElement() + " ");
            interator = interator.getProximo();
        }
    }


}
 
