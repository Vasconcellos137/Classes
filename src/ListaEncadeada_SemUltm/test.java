package ListaEncadeada_SemUltm;

import java.util.Scanner;

public class test {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        ListaEncadeada atsil = new ListaEncadeada();

//Add no fim 
        atsil.addFinal(1);
        atsil.addFinal(2);
        atsil.addFinal(3);
        atsil.addFinal(4);
        atsil.addFinal(5);

        atsil.show_mostrar();

//Add no inicio

        // atsil.addInicio(7);

        // atsil.show_mostrar();

    }
}
