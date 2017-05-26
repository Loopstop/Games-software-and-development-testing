public class Principal{
    public static void main(String[] args){
    
        Pessoa A = new Pessoa("Excelsa", 19,'F');
        Pessoa B = new Pessoa("Pacífico", 102, 'M'); 
        
        System.out.println("\nINFORMAÇÕES DAS PESSOAS");
        A.imprimeInfo();
        System.out.println();
        B.imprimeInfo();
        
        A.aumentaIdade();
        
        //////////////////////////
        
        Aluno a1 = new Aluno("Brandamente Brasil","1585248",5 , 9);
        Aluno a2 = new Aluno("Radigunda Cercená","2254879",8, 2);
        Aluno a3 = new Aluno("Vitimado José Araújo","0085994", 7, 1);
        
        System.out.println("\nInformações do aluno 1");
        a1.imprimeInfo();
        System.out.println("\nInformações do aluno 2");
        a2.imprimeInfo();
        System.out.println("\nInformações do aluno 3");
        a3.imprimeInfo();
        
        System.out.println("\nMédia final do aluno 2: " + a2.calculaMediaFinal());
        
        System.out.println("\nMatricula do aluno 3: "+ a3.getMatricula());
        
    }
}