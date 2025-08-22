package Pilha;

public class tests {
    public static void main(String[] args) {
        pilha myPilha = new pilha();

//Inserção

        myPilha.push(1);
        myPilha.push(2);
        myPilha.push(3);
        myPilha.push(4);
        myPilha.push(5);

        System.out.println(myPilha);

//Remoção

        myPilha.pop();
        myPilha.pop();

        System.out.println(myPilha);
    }
}
