package Encapsulamento;

public class Filme {
    private String titulo;               //ENCAPSULAMENTO:
    private String categoria;            //"private" faz com que nada apossa acessar estes, outras classes não acessam.
    private String classificacaoEtaria;  //"public" faz com que todos possam acessar estes.
    private String resumo;

    public Filme() {  //Construtor sem atributos
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo.toUpperCase(); //Pode-se modificar por fora, caracterizá-las da maneira q preferir
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public void setClassificacaoEtaria(String classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
