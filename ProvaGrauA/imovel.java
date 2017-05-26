public class imovel{
    String endereco;
    double valorVenda;
    double valorAluguel;
    public imovel(String endereco, double valorVenda, double valorAluguel){
        this.endereco = endereco;
        this.valorVenda = valorVenda;
        this.valorAluguel = valorAluguel;
    }
    public imovel(String endereco, double valorAluguel){
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
    }
    public imovel(double valorVenda){
        this.valorVenda = valorVenda;
    }
    //metodos de acesso
    public String getEndereco(){
        return endereco;
    }
    public double getValorVenda(){
        return valorVenda;
    }
    public double getValorAluguel(){
        return valorAluguel;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setValorVenda(double valorVenda){
        this.valorVenda = valorVenda;
    }
    public void setValorAluguel(double valorAluguel){
        this.valorAluguel = valorAluguel;
    }
    //imprime #04
    public void imprimeInformacoes(){
        System.out.println("Endereço: "+ endereco);
        System.out.println("Valor de Aluguel: "+ valorAluguel + " R$");
        System.out.println("Valor de Venda:"+ valorVenda + " R$." );
    }
    // calcula imposto #05
    public double calculaImposto(){
        if(valorVenda < 1500 && valorAluguel < 150){
            double resultadoVelho = (valorVenda*15/100);
            return resultadoVelho;  
        }
        double resultadoNovo = (valorAluguel*10/100);
        return resultadoNovo;
    }
    
}