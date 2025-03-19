package Pessoa;

//Heranca
public class Joao extends motorista {
    public Joao() {
        //construtor
        System.out.println("asoidas");
    }

    @Override
    public void respirar() {
        System.out.println("João está respirando...");
    }
}