public class Jogador{
    private String nome;
    private int quantPontos;
    public Jogador(String nome,int quantPontos){
        this.nome = nome;
        this.quantPontos = quantPontos;
    }
    public String getNome(){
        return nome;
    }
    public int getQuantPontos(){
        return quantPontos;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setQuantPontos(int quantPontos){
        this.quantPontos = quantPontos;
    }
    public void imprimeInformacoes(){
        System.out.println("Nome do jogador: "+ nome);
        System.out.println("Quantidade de pontos do jogador: "+ quantPontos);
    }
}