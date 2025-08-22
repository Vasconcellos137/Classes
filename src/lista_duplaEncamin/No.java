package lista_duplaEncamin;

public class No {
    private int element;
    private No proximo;
    private No anterior;
 
    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public No(){
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public static void main(String[] args) {
        System.out.println("teste");
    }
}
