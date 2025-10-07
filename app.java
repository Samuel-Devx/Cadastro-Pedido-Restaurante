
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int escolha;
        Scanner teclado = new Scanner(System.in);
        Cardápio card = null;

        do {        
            System.out.printf("%n====Menu Sistema====%n");
            System.out.println("1 - Cadastrar Dono");
            System.out.println("2 - Criar cardápio");
            System.out.println("3 - Adiocionar Produto");
            System.out.println("4 - Remover Produto");
            System.out.println("5 - Mostrar cardápio");
            System.out.println("6 - Sair");
            System.out.print("Digite sua opção: ");
            escolha = teclado.nextInt();
            
            switch (escolha) {
                case 1:
                    System.out.print("Digite nome do dono: ");
                    String nomeDono = teclado.next();
                    System.out.print("Digite uma senha: ");
                    int senhaDono = teclado.nextInt();
                    System.out.print("Digite o nome do restaurante: ");
                    String nomeRestaurante = teclado.next ();
                    Dono dono = new Dono(nomeDono, senhaDono, nomeRestaurante); 
                    System.out.printf("Cadastro do %s realizado com secesso! %n", nomeDono);
                break;
                case 2:
                    System.out.print("Digite nome do dono: ");
                    String nomeDonoCardapio = teclado.next();
                    System.out.print("Digite a senha do donos: ");
                    int senhaDonoCardapio = teclado.nextInt();
                    System.out.print("Digite o nome do restaurante: ");
                    String nomeRestauranteCardapio = teclado.next ();
                    card = new Cardápio(nomeDonoCardapio, senhaDonoCardapio, nomeRestauranteCardapio);
                     System.out.printf("Cardápio do %s realizado com secesso! %n", nomeDonoCardapio);
                break;
                case 3:
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = teclado.next();
                    System.out.print("Digite a senha do dono: ");
                    int senhaDonoProduto = teclado.nextInt();
                    System.out.print("Digite o preço do produto: ");
                    double preço = teclado.nextDouble();
                    card.adicionarCardapio(nomeProduto, senhaDonoProduto, preço);
                break;
                 case 4:
                    System.out.print("Digite o nome do produto: ");
                    String nomeProdutoRemover = teclado.next();
                    System.out.print("Digite a senha do dono: ");
                    int senhaDonoRemover = teclado.nextInt();
                    card.removerCardapio(nomeProdutoRemover, senhaDonoRemover);
                break;
                case 5:
                    card.mostrarCardapio();
                break;
                case 6: 
                    System.out.println("Saindo....");
                break;
            }

        }while(escolha != 6);






    }
}