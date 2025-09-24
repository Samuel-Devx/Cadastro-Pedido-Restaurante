public class Produto {
    private String nomeProduto;
    private double precoProduto;

    //Os métodos geters e seters

    //Nome Produto
    public String getNomeProduto() { 
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    //Preço Produto
    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    //Método contructor do produto para adcionar dentro do cardápio
    public Produto (String nm_p, double preço_p) {
        setNomeProduto(nm_p);
        setPrecoProduto(preço_p);
    }
    
    //To String para mostrar dentro do for (Mostrar Cardápio)
    @Override
    public String toString() {
        return String.format("%s - R$%.2f", nomeProduto, precoProduto);
    }
    





}
