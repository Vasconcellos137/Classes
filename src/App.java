public class App {
    public static void main(String[] args) {
        Endereco endereco;

//Inicializacao d objeto, criacao d area em memoria        
        endereco = new Endereco();
        endereco.setRua("rua tal de tal");
        endereco.setNumero("777");

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Ciclano d tal");
        pessoa.setEmail("jhgvkhgkh@gmail.com");
        pessoa.setEndereco(endereco);

        pessoa.getEndereco().getRua();
    }
}
