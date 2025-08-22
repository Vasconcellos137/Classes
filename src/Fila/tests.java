package Fila;

public class tests {
    public static void main(String[] args) {
        Fila myFila = new Fila();

//Inserção
        myFila.enqueue(1);
        myFila.enqueue(2);
        myFila.enqueue(3);
        myFila.enqueue(4);
        myFila.enqueue(5);

        System.out.println(myFila);

//Remoção
        myFila.dequeue();
        myFila.dequeue();

        System.out.println(myFila);

    }

}
