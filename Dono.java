public class Dono extends Pessoa{
    private int senha;
    private String restaurante;
    private boolean Status;
    //Método Cronstructors
    public Dono (String Nome_Dono, int Senha_dono, String Nome_restaurante) {
        setSenha(Senha_dono);
        setNome (Nome_Dono);
        setRestaurante(Nome_restaurante);
        setStatus(false);
    }
    //Métodos Própios 

    //Abrir o restaurante
    public void abrirRestaurante (int Senha_dono) {
        if (getSenha() == Senha_dono && isStatus() == false) {
            System.out.println("Restaurante aberto!");
            setStatus(true);
        }
        else {
            System.out.println("Loja aberta ou sua Senha errada ou Dono não cadastrado!");
        }
    }
    
    //Fechar o restaurante 
    public void fecharRestaurante (int Senha_dono) {
        if (isStatus() == true && getSenha() == Senha_dono){ 
        System.out.println("Restaurante fechada!");
        setStatus(false);
     }
        else {
            System.out.println("Sua loja já está fechada!");
        }
    }

    //Mostrar Status do Restaurante
    public void mostraRestaurante () {
        //Mostrativo status
        String status2;
        if (isStatus() == true) {
            status2 = "Aberta";
        }
        else {
            status2 = "Fechada";
        }
         
        System.out.println(String.format("============ %s ===========", getRestaurante()));
        System.out.println("Nome Restaurante: " + getRestaurante());
        System.out.println("Nome do Chefe: " + getNome());
        System.out.println("Status: " + status2);
    }

    //Metodos geters e serters

    //Status
    public boolean isStatus() {
        return Status;
    }
    public void setStatus(boolean status) {
        Status = status;
    }

    //Senha
    public int getSenha() {
        return senha;
    }
    private void setSenha(int senha) {
        this.senha = senha;
    }

    //Restaurante  
    public String getRestaurante() {
        return restaurante;
    }
    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }
    




 
}
