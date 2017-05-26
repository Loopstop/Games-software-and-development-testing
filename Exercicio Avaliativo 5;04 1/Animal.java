public class Animal{
    private String nome, raca; 
    char sexo;
    int patas;
    
    public Animal(String nome, String raca, char sexo, int patas){
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.patas = patas;
    }
    //gets
    public String getNome(){
        return nome;
    }
    public String getRaca(){
        return raca;
    }
    public char getSexo(){
        return sexo;
    }
    public int getPatas(){
        return patas;
    }
    //sets
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public void setPatas(int patas){
        this.patas = patas;
    }
    
    public void imprimeInformacoes(){
        System.out.println("Nome: "+ nome);
        System.out.println("Raça: "+ raca);
        System.out.println("Sexo: "+ sexo);
        System.out.println("Quantidade de patas: "+ patas);
    }
}