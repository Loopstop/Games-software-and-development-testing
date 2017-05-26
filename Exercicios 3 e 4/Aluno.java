public class Aluno{
    private String nome, matricula;
    private double notaGA, notaGB;
    
    public Aluno(String nome, String matricula, double notaGA, double notaGB){
        this.nome = nome;
        this.matricula = matricula;
        this.notaGA = notaGA;
        this.notaGB = notaGB;
    }
    //gets
    public String getNome(){
        return this.nome;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public double getNotaGA(){
        return this.notaGA;
    }
    public double getNotaGB(){
        return this.notaGB;
    }
    //sets
    public void setNome(){
        this.nome = nome;
    }
    public void setMatricula(){
        this.matricula = matricula;
    }
    public void setNotaGA(){
        this.notaGA = notaGA;
    }
    public void setNotaGB(){
        this.notaGB = notaGB;
    }
    public double calculaMediaFinal(){
        double media = (notaGA*0.33)+(notaGB*0.67);
        return media;
    }
    //info
    public void imprimeInfo(){
        System.out.println("Nome: "+getNome());
        System.out.println("Matricula: "+getMatricula());
        System.out.println("Nota Grau A: "+getNotaGA());
        System.out.println("Nota Grau B: "+getNotaGB());
        System.out.println("Nota Final: "+calculaMediaFinal());
    }
}