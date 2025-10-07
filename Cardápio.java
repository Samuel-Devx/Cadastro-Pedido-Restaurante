import java.util.ArrayList;

    public class Cardápio extends Dono {

        //Classe constructo de um cardápio
        public Cardápio(String Nome_Dono, int Senha_dono, String Nome_restaurante) {
            super(Nome_Dono, Senha_dono, Nome_restaurante);
        }

        //Criando um array para o cardapio para armazenar vários produtos
        private ArrayList<Produto> cardapio = new ArrayList <> ();
    
        //Uma função para adicionar um novo produto dentro do cardápio
        public void adicionarCardapio (String produto, int senhaDono, double preço) {
            if (senhaDono == getSenha() ){
                Produto p = new Produto (produto, preço);
                cardapio.add(p);
                System.out.println(String.format("O produto %s foi adicionado.", produto));}
            else{   
                System.out.println("Senha incorreta!");}} 


         //Uma função para remover um novo produto dentro do cardápio
        public void removerCardapio(String produto, int senhaDono) {
        
            if (cardapio.contains(produto) && senhaDono == getSenha() ) {
                cardapio.remove(produto);
                System.out.println("O produto " + produto + " foi removido");
            } else {
                System.out.println("Produto não cadastrado ou senha incorreta.");
            }
            
            
    };

        
        //Uma função para mostrar os produtos dentro do cardápio usando um for
        public void mostrarCardapio () {
            System.out.println("======= Cardápio " + getRestaurante() + " =============");
            for (Produto p : cardapio) {
                System.out.println(" > "+ p);
            }
        }



}
