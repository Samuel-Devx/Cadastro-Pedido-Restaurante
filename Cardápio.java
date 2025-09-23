import java.util.ArrayList;

public class Cardápio extends Dono{
    public Cardápio(String Nome_Dono, int Senha_dono, String Nome_restaurante) {
        super(Nome_Dono, Senha_dono, Nome_restaurante);
    }


    private ArrayList<String> cardapio = new ArrayList <> ();
    

    public void adicionarCardapio (String produto, int senhaDono, double preço) {
        if (senhaDono == getSenha() ){
        cardapio.add(produto + " - R$" + preço);
        System.out.println(String.format("O profuto %s foi adicionado.", produto));
    }
        else{
            System.out.println("Senha incorreta!");
        }

    }
    public void mostrarCardapio () {
        System.out.println("======= Cardápio " + getRestaurante() + " =============");
        for (String p : cardapio) {
            System.out.println(" > "+p);
        }
    }



}
