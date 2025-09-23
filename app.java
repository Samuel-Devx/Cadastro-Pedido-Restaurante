public class app {
    public static void main(String[] args) {
        Dono dono1 = new Dono("Samuel", 192119, "Sm Carp");

        dono1.abrirRestaurante(192119);
        dono1.mostraRestaurante();

    Cardápio cardapio1 = new Cardápio("Samuel", 192119, "Sm Carp");
    
    cardapio1.adicionarCardapio("Hamburgue", 192119, 20.0);
    cardapio1.adicionarCardapio("Coca-cola 2l", 192119, 12.2);
   


    
    cardapio1.mostrarCardapio();

    }
}
