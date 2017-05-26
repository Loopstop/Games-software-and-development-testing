public class Produto{
    private String nome;
    private double preco;
    private int quantProdutos;
    
    public Produto(String nome, double preco, int quantProdutos){
        this.nome = nome;
        this.preco = preco;
        this.quantProdutos = quantProdutos;
    }
    //gets
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantProdutos(){
        return quantProdutos;
    }
    //sets
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setQuantProdutos(int quantProdutos){
        this.quantProdutos = quantProdutos;
    }
    
    public void imprimeInformacoes(){
        System.out.println("Nome: "+ nome);
        System.out.println("Preço: "+ "R$" + preco);
        System.out.println("Quantidade do produto: "+ quantProdutos);
    }
}