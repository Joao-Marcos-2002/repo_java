import Pessoa.Joao;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Carro meucarro = new Carro("FORD KA");
        meucarro.acelerar();

        Joao pessoa = new Joao();
        pessoa.dormir();
    }

}


class Carro {
    String modelo;

    public Carro(String modelo) {
        System.out.println("Carro criado");
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("Acelerando o " + this.modelo);
    }
}