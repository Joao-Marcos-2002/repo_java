package java_exemplo; // Definição do pacote


public class Uchiha extends Ninja {
    public void ativarPoder() {
        System.out.println("Ativa poder sharigan");
    }

    //Sobrescreve o metodo ataqueBase para o tipo Uchiha
    @Override
    public void ataqueBase() {
        System.out.println("Deu um soco com bola de fogo");
    }

    public void ataqueBase(int nivelForca) {
        if(nivelForca == 2) {
            System.out.println("ativa Susano");
        } else if (nivelForca >= 3) {
            System.out.println("ativa Supremo");   
        } else {
            System.out.println("forca de Ninja nao alocada");
        }
    }
}

