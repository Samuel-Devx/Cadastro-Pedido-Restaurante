import java.util.ArrayList;

public class Cardápio extends Dono{
    public Cardápio(String Nome_Dono, int Senha_dono, String Nome_restaurante) {
        super(Nome_Dono, Senha_dono, Nome_restaurante);
    }


    private ArrayList<Produto> cardapio = new ArrayList <> ();
    

    public void adicionarCardapio (String produto, int senhaDono, double preço) {
        if (senhaDono == getSenha() ){
            Produto p = new Produto (produto, preço);
        cardapio.add(p);
        System.out.println(String.format("O profuto %s foi adicionado.", produto));
    }
        else{   
            System.out.println("Senha incorreta!");
        }

    }
        public void removerCardapio(String produto, int senhaDono) {
        if (senhaDono == getSenha()) {
            Produto p = new Produto(produto, 0); // preço não importa para remover
            if (cardapio.remove(p)) {
                System.out.println("O produto " + produto + " foi removido");
            } else {
                System.out.println("Produto não cadastrado.");
            }
        } else {
            System.out.println("Senha incorreta!");
        }
    }
    
    public void mostrarCardapio () {
        System.out.println("======= Cardápio " + getRestaurante() + " =============");
        for (Produto p : cardapio) {
            System.out.println(" > "+ p);
        }
    }



}
