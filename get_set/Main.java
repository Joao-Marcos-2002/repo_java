
public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        //Definindo nome com Setter
        p.setNome("Gabriel");

        //Obtendo o nome com getter
        System.out.println("Nome: " + p.getNome());


        //Definindo idade com Setter
        p.setIdade(9);

        // Obtendo idade com getter
        System.out.println("Idade: " + p.getIdade());
    }
}