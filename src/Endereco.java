public class Endereco {

    private String rua;      //P criar uma coluna ?
    private String numero;  //private = privado, n pode ser acessado d fora; public = publico, pode ter acesso ser mexido  

//Criador de objeto ?    
    public Endereco() {

    }

//pegar atributo    
    public String getRua() {
        return rua;
    }

//alterar atributo 
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}