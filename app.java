public class app {
    public static void main(String[] args) {

        //Criando um dono de restaurante
        Dono dono1 = new Dono("Samuel", 192119, "SM-CARP");
        //Funções criadas na classe Dono pra abrir e mostrar o restaurante
        dono1.abrirRestaurante(192119);
        dono1.mostraRestaurante();

        //Criando um cardápio novo
        Cardápio cardapio1 = new Cardápio("Samuel", 192119, "Sm Carp");
    
        //Manipulando o cardápio adicionando o nome preço de cada produto
        cardapio1.adicionarCardapio("Hamburgue", 192119, 20.0);
        cardapio1.adicionarCardapio("Coca-cola 2l", 192119, 12.2);
        
        //Mostrando o cardápio dentro do terminal
        cardapio1.mostrarCardapio();        

    }
}
