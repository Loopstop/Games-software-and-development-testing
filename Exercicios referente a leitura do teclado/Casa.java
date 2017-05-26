public class Casa{
    private int quantJanelas, quantComodos;
    private String cor;
    
    public Casa(int quantJanelas, int quantComodos, String cor){
        this.quantJanelas = quantJanelas;
        this.quantComodos = quantComodos;
        this.cor = cor;
    }
    
    //ESTRUTURA DE MÉTODOS
    /** 
       
       
       visibilidade tipo_de_retorno nome_método(parâmetros){
        
        }
       
       
       **/
    
    //MÉTODOS DE ACESSO
    //GET e SET
    
    
    // GET
    public String getCor(){
        return this.cor;
    }
    public int getQuantJanelas(){
        return this.quantJanelas;
    }
    public int getQuantComodos(){
        return this.quantComodos;
    }
    
    
    //SET
    public void setCor(String novaCor){
        cor = novaCor;
    }
    public void setQuantJanelas(int quantJanelas){
        this.quantJanelas = quantJanelas;
    }
    public void setQuantComodos(int quantComodos){
        this.quantComodos = quantComodos;
    }
    public void imprimeInfo(){
        System.out.println("A cor da casa é "+cor);
        System.out.println("A quantidade de janelas é "+ quantJanelas);
        System.out.println("A quantidade de comodos é "+ quantComodos);
    }
}