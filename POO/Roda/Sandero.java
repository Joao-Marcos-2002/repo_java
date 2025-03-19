package Roda;

public class Sandero implements Carro {

    @Override
    public void acelerar() {
        System.out.println("acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("freada do sandero");
    }

    @Override
    public void parar() {
        System.out.println("Sandero para");
    }


    
}
