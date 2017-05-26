public class Livro{
    private int anoPublicado; 
    private String autor;
    private double precoVenda;
    
    public Livro(int anoPublicado, String autor, double precoVenda){
        this.anoPublicado = anoPublicado;
        this.autor = autor;
        this.precoVenda = precoVenda;
    }
    //gets
    public int getAnoPublicado(){
        return anoPublicado;
    }
    public String getAutor(){
        return autor;
    }
    public double getPrecoVenda(){
        return precoVenda;
    }
    //sets
    public void setAnoPublicado(int anoPublicado){
        this.anoPublicado = anoPublicado;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setPrecoVenda(double precoVenda){
        this.precoVenda = precoVenda;
    }
    
    public void imprimeInformacoes(){
        System.out.println("Ano de publicação: "+ anoPublicado);
        System.out.println("Autor: "+ autor);
        System.out.println("Preço de venda: "+ "R$" + precoVenda);
    }
}