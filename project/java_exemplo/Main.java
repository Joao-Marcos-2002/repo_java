package java_exemplo; // Definição do pacote


public class Main {
    public static void main(String[] args) {
        Ninja naruto = new Uzumaki();  //objeto 1
        naruto.setNome("Naruto U.");
        naruto.setIdade(34);
        naruto.ataqueBase();
        System.out.println("naruto nome: " + naruto.getNome());

        Uchiha sasuke = new Uchiha(); //objeto 2
        sasuke.ativarPoder();
        sasuke.setNome("Pedro");
        sasuke.ataqueBase();
        sasuke.ataqueBase(2);
    }
}