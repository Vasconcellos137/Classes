package Testes;

import java.util.LinkedList;
import java.util.Queue;

public class FilaLinkedList {
    public static void main(String[] args) {
        //Queue é uma interface (contrato)
        //LinkedList implementou o contrato

        Queue fila = new LinkedList();

        fila.add(1);
        fila.add(2);
        fila.add(3);

        System.out.println(fila);

        fila.remove();
        
        System.out.println(fila);
    }
}
