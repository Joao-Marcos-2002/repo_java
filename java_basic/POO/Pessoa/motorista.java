package Pessoa;

public abstract class motorista {
        public abstract void respirar();

        public void dormir() {
            System.out.println("dormindo..");
        }
}




// Classe abstrata: 

// uas quando varias classes  compartilham atributos COMUNS.
// É uma classe que pode ter métodos com ou sem implementação.
// Não pode ser instanciada diretamente.
// Serve como uma base para outras classes que precisam compartilhar atributos e comportamentos comuns.