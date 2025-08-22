package Pilha;

import lista.ListaEncadeada;

public class pilha {
    private ListaEncadeada ListaEncadeada = new ListaEncadeada();

    public pilha(){
    }

    public void push(int element){     //inserir
        ListaEncadeada.add(element);  //add sempre no fim
    }

    public void pop(){                 // Remover
        ListaEncadeada.removerFim();  //remove sempre no fim
    }
    
    public String toString(){
        return "[" + ListaEncadeada + "]";
    }

}
