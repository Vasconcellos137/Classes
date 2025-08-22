package Testes;

import java.util.Deque;
import java.util.LinkedList;

public class PilhaLinkedList {

    public static void main(String[] args) {
        Deque pilha = new LinkedList();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        System.out.println(pilha);
        
        pilha.pop();

        System.out.println(pilha);

        //Método q mostra o 1° element da pilha -> .peek()
        System.out.println(pilha.peek());

    }

}
