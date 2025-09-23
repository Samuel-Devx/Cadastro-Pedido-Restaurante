public class Produto {
    private String nomeProduto;
    private double precoProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Produto (String nm_p, double preço_p) {
        setNomeProduto(nm_p);
        setPrecoProduto(preço_p);
    }

    @Override
    public String toString() {
        return String.format("%s - R$%.2f", nomeProduto, precoProduto);
    }
    





}
