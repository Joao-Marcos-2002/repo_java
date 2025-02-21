import java.util.ArrayList;


public class basicoDeJava { 
 /*pelo menos 1 classe deve ter o mesmo nome
  do arquivo e deve ser public */

    public static void main(String[] args) {
        // tambem: byte, short, int, long (numeros mais longos)
        
        // TIPOS PRIMITIVOS:

        // int i = 1000000000; 32 bits
        // float -> precisao simples. Ex: 38.09
        // double -> precisao dupla. Ex: 38.098765243
        // String -> representa palavras e frases
        // char -> representa 1 caracter // 16 bits
        // boolean -> true ou false
        // long l = 1000000000; 16 bits
        // short s = 10000; (pode representar numeros positivos e negativos)
        byte b = 100;
        
        //TIPOS NAO PRIMITIVOS:
        String nome = "Fernando";

        // Criacao e uso de vetores
        int[] colecaoDeInteiros = {1, 3 ,4, 55, 66};
        colecaoDeInteiros[2]= 33;

        int[] meusNumeros = new int[4]; // cria um vetor de inteiros (tamanho 4)
        meusNumeros[0]=11;
        System.out.println(meusNumeros[0]);

        if(b >900) 
            System.out.println("verdadeiro");
        else if(nome.equals("Fernando")) 
            System.out.println("Eh Fernando");
        else                                       
            System.out.println("falso");

        System.out.println((colecaoDeInteiros[2]));
        System.out.println(("Tamanho: " + colecaoDeInteiros.length));


        String[] nomeStr = new String[10];
        nomeStr[0] = "Jonas";
        System.out.println(nomeStr[0]);

        // ArrayList: permite criar uma lista dinamica de elementos
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Pedro");
        nomes.add("Lisa");
        nomes.add("Kaique");
        nomes.add("Maria");
        nomes.add("Ana");
        System.out.println(nomes);
        nomes.remove(0);
        System.out.println(nomes);
        nomes.remove("Ana");
        System.out.println(nomes);


        // length: usa para arrays nativos do java
        // size(): usa para colecoes do Java (ArrayList, LinkedList..)

        // for(int i = 0; i < nomeStr.length; i++) {
        //     System.out.println(nomeStr[i]);
        // }

        for (String name : nomeStr) {
            System.out.println(name);
        }

        int count =  0;
        while (count < nomeStr.length) {
            System.out.println(nomeStr[count]);
            count++;
        }

        // Casting: Transforma valores de veriavel em outro tipo
        // double resultado = 0.0;
        // int resultadoInt = (int) resultado; //exemplo de casting double -> int

        // int meuInt = 9;
        // double meuDouble= 9.9; // int -> double

        // String meuString = "10";
        // int meuInt2 = Integer.parseInt(meuString);

        // String minhaString = 
        
    }

}



