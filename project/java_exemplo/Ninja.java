package java_exemplo; // Definição do pacote

public class Ninja {
    private String nome;
    private String aldeia;
    private int idade;

    public void ataqueBase() {
        System.out.println("Deu um soco");
    }

    //Getter: mostrar para o usuario
    public String getNome() {
        return nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Setter: setar valor da variavel
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Construtor
    public Ninja() {
        
    }

}
