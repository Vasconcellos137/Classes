import Encapsulamento.Filme;

public class TestEncapsulan {
    public static void main(String[] args) {
        

        Filme filme = new Filme(); //Cria área na memória

        filme.titulo = "The Platform";
        filme.categoria = "Suspense";
        System.out.println(filme.titulo);

    }
}
