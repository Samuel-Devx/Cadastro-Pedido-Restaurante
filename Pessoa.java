public abstract class  Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    //Métodos gets e seters

    //nome
    public void setNome (String n) {
        this.nome = n;
    }
    public String getNome () {
        return this.nome;
    }

    //Idade
    public void setIdade (int i) {
        this.idade = i;
    }
    public int getIdade () {
        return this.idade;
    }

    //Sexo
    public void setSexo (String s) {
        this.sexo = s;
    }
    public String getSexo () {
        return this.sexo;
    }

}