public class Pessoa{
    private String nome;
    private int idade;
    private char sexo;
    
    public Pessoa(String nome, int idade, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    //gets getters
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public char getSexo(){
        return this.sexo;
    }
    //sets setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSexo(char quantComodos){
        this.sexo = sexo;
    }
    //imprime informações
    public void imprimeInfo(){
        System.out.println("O nome é "+nome);
        System.out.println("A idade é "+idade);
        System.out.println("O sexo é "+sexo);
    }
    public void aumentaIdade(){
        idade ++;
        setIdade(idade);
        System.out.println("Idade de "+nome+" atual aumentada em 1 é "+getIdade());
    }
}