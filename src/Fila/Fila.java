package Fila;

import lista.ListaEncadeada;
import lista.No;

public class Fila {
    private ListaEncadeada listaEncadeada = new ListaEncadeada();

    public Fila() {
    }

    public void enqueue(int element){  //inserir
        listaEncadeada.add(element);   //add sempre in final
    }

    public void dequeue(){               //Remover
        listaEncadeada.removerInicio();  //sempre remove no inicio
    }

    public String toString(){
        return "[" + listaEncadeada + "]";
    }
}
