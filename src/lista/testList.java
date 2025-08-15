package lista;

import java.util.Scanner;

public class testList {
    final static Scanner LER = new Scanner(System.in); 
    public static void main(String[] args) {
        
        ListaEncadeada list = new ListaEncadeada();

//Add no fim        
        list.add(1); //0
        list.add(2); //1
        list.add(3); //2
        list.add(4); //3
        list.add(5); //4

//Add no inicio        
        // list.addInicio(9);

//Add manualmente - Método p add no meio
        // list.addMeio(7, 3);

//Pedir p usuário - Método p add no meio        
        // int element = LER.nextInt();
        // int pos = LER.nextInt();

        // list.addMeio(element, pos);

        list.show_mostrar();

//Remover no inicio
        // list.removerInicio();

//Remover no fim
        list.removerFim();


        
        list.show_mostrar();

    }
}
 