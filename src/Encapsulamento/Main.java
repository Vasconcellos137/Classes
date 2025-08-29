package Encapsulamento;

public class Main {
    public static void main(String[] args) {

        Filme filme = new Filme(); //Cria área na memória

        filme.titulo = "The Platform";
        filme.categoria = "Suspense";
        System.out.println(filme.titulo);

    }
}
