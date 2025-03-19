package exercicios;

public class Main {
    public static void main(String args[]) {
        Cat cat = new Cat(); //obj 1

        System.out.println("Mostra nome: " + cat.getName());
        System.out.println("Mostra idade: " + cat.getAge());

        Dog dog = new Dog("Mel", "White"); //obj 2
    
        System.out.println("Nome do cachorro(a): " + dog.getName());
        System.out.println("Cor do cachorro(a): " + dog.getColor());
     
        Book book = new Book("A Cartomante", "Machado de Assis"); //obj 3
        
        System.out.println("Nome do livro: " + book.getTitle());
        System.out.println("Autor: " + book.getAuthor());
        
        Book myBook = new Book("Diario de um Banana 1", "Jeff Kinney", 45.25); //obj 4
        System.out.println("Nome do livro: " + myBook.getTitle());
        System.out.println("Autor: " + myBook.getAuthor());
        System.out.println("Preço do livro: " + myBook.getPrice());


    }
}
