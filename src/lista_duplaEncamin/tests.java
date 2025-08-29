package lista_duplaEncamin;
import java.util.Scanner;

public class tests {
    final static Scanner LER = new Scanner(System.in); 
    public static void main(String[] args) {
        
        ListaDuplamenEncadeada listDup = new ListaDuplamenEncadeada();

//AddFim
        listDup.addFim(1);
        listDup.addFim(2);
        listDup.addFim(3);
        listDup.addFim(4);
        listDup.addFim(5);

        listDup.show_mostrar();        

//AddInicio        
        // listDup.addInicio(7);

        // listDup.show_mostrar();




    }
}
