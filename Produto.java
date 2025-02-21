import static java.lang.Character.toUpperCase;
import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    ArrayList<Integer> listaProdutos = new ArrayList<>(); //Cria lsita vazia

    public static void main(String[] args) {
        new Mercado(); // cria uma instancia de Mercado
    }

    // private String nome;
    // private int quantidade;

    public Produto() {
        //construtor...

    }

    public void adicionarProduto(int id) {
        //metodo
        listaProdutos.add(id);

    }

    public void listarProdutos() {
        for(int id : listaProdutos) {
            System.out.println("Id product:" + id);
        }
    }

    public boolean existeIdLista(int id) {
        for(int idProd: listaProdutos) {
            if(id == idProd) {
                return true;
            }
        }
        return false;
    }

    public void removerProduto(int id) {
        System.out.println("delet");

        boolean existeId = false;
        for(int i = 0; i<listaProdutos.size(); i++) {
            if(listaProdutos.get(i) == id) { //pra acessar ArrayList usa: .get(indice)
                listaProdutos.remove(i);
                existeId = true;
            }
        }

        //caso nao exista o id digita novamente
        if(!existeId) {
            acionarRemocao();
        }
    }

    public void acionarAtualizacao() {
        System.out.println("Digite o id que queira trocar:");
        Scanner sc = new Scanner(System.in);
        int idDigitado = sc.nextInt();
        
        this.atualizarProduto(idDigitado);
        sc.close();
    }

    public void acionarRemocao() {
        Scanner sc = new Scanner(System.in);
        int idDigitado = sc.nextInt();

        this.removerProduto(idDigitado);

        sc.close();
    }
    

    public void atualizarProduto(int idDigitado) {
        System.out.println("Entra em atualizar");

        System.out.println("Atualizar pra qual id?");
        Scanner sc = new Scanner(System.in);
        int idNovo = sc.nextInt();

        for (int i = 0; i < listaProdutos.size(); i++) {
            //procura o id digitado na lista
            if (idDigitado == listaProdutos.get(i)) {
                listaProdutos.set(i, idNovo);  // atualiza o elemento pelo indice.
            }
        }


        sc.close();
    }
}


class Mercado {
    //construtor
    public Mercado() {
        int id= 0;

        //Cria objeto para receber entrada do teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ID (-1 para parar):");
        Produto prod = new Produto();
        
        while(id != -1) {
            id = sc.nextInt();
            prod.adicionarProduto(id);
        }

        System.out.println("Deletar ou atualizar? (D/A)");
        char escolherOpc = sc.next().charAt(0);
        char opc = toUpperCase(escolherOpc);

        if (opc == 'D') {
            System.out.println("Id digitado nao existe na lista. Digita novamente!");
            System.out.println("Digite o id:");
            prod.acionarRemocao();
        } if(opc == 'A') {
            System.out.println("Id digitado nao existe na lista. Digita novamente!");
            System.out.println("Digite o id:");
            prod.acionarAtualizacao();
        } else {
            System.out.println("Escolha: (D ou A)");
        }

         //listar
         prod.listarProdutos();

        sc.close();
    }
}
