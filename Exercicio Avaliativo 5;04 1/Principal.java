public class Principal{
    public static void main(String[] args){
        Produto batata = new Produto("Batata Doce ", 10.90, 100);
        Produto dvd = new Produto("DVD Banda Calipso ", 0.01, 1000);
        Produto livro = new Produto("Livro de Java ", 180.56, 84);
        
        System.out.println("Informações sobre produto batata doce.");
        batata.imprimeInformacoes();
        
        System.out.println("\nInformações sobre produto DVD Banda Calipso.");
        dvd.imprimeInformacoes();
        
        System.out.println("\nInformações sobre produto livro de java.");
        livro.imprimeInformacoes();
        
        dvd.setPreco(0);
        System.out.println("\n"+dvd.getNome()+""+"preço "+ "R$" + dvd.getPreco());
        ///////////////////////animais/////////////////////
        ///////////Teclados animal A///////////////
        
        String aTecstringNome = Teclado.leString("Digite o nome desejado para o animal: ");
        String aTecstringRaça = Teclado.leString("Digite a raça desejada para o animal: ");
        char aTecChar = Teclado.leChar("Digite o sexo desejado para o animal: ");
        int aTecIntPata = Teclado.leInt("Digite a quantidade de patas desejadas para o animal:");
        ///////////Teclados animal B///////////////
        String bTecstringNome = Teclado.leString("Digite o nome desejado para o animal: ");
        String bTecstringRaça = Teclado.leString("Digite a raça desejada para o animal: ");
        char bTecChar = Teclado.leChar("Digite o sexo desejado para o animal: ");
        int bTecIntPata = Teclado.leInt("Digite a quantidade de patas desejadas para o animal:");
        ///////////Teclados animal C///////////////
        String cTecstringNome = Teclado.leString("Digite o nome desejado para o animal: ");
        String cTecstringRaça = Teclado.leString("Digite a raça desejada para o animal: ");
        char cTecChar = Teclado.leChar("Digite o sexo desejado para o animal: ");
        int cTecIntPata = Teclado.leInt("Digite a quantidade de patas desejadas para o animal:");
        ///////////FIM TECLADOS/////////////////
        
        Animal a = new Animal(aTecstringNome, aTecstringRaça , aTecChar , aTecIntPata);
        Animal b = new Animal(bTecstringNome, bTecstringRaça , bTecChar , bTecIntPata);
        Animal c = new Animal(cTecstringNome, cTecstringRaça , cTecChar , cTecIntPata);
        
        if (aTecIntPata < 2){
                a.setPatas(Teclado.leInt("Digite o novo numero de patas: "));
                System.out.println("ERRO01: infelizmente seu primeiro animal não pode ter menos que duas patas.");
            }
        else if (bTecIntPata < 2){
                System.out.println("ERRO02: infelizmente seu segundo animal não pode ter menos que duas patas.");
                b.setPatas(Teclado.leInt("Digite o novo numero de patas: "));
            }
        else if (cTecIntPata < 2){
                System.out.println("ERRO03: infelizmente seu terceiro animal não pode ter menos que duas patas.");
                c.setPatas(Teclado.leInt("Digite o novo numero de patas: "));
            }
        System.out.println("\nInformações sobre o primeiro animal.");
        a.imprimeInformacoes();
        System.out.println("Informações sobre o segundo animal");
        b.imprimeInformacoes();
        System.out.println("Informações sobre o terceiro animal.");
        c.imprimeInformacoes();
        
        //////////////////Livro class/////////////////
        int tecAnoPublicado = Teclado.leInt("\nDigite o ano em que o livro foi publicado: ");
        String tecAutor = Teclado.leString("Digite o autor do livro: ");
        double tecPrecoVenda = Teclado.leDouble("Digite o preço de venda do livro: ");
        System.out.println();
        Livro d = new Livro (tecAnoPublicado, tecAutor, tecPrecoVenda);
        d.imprimeInformacoes();
        
        Exercicios e1 = new Exercicios();
        Exercicios e2 = new Exercicios();
        Exercicios e3 = new Exercicios();
        Exercicios e4 = new Exercicios();
        Exercicios e5 = new Exercicios();
        Exercicios e6 = new Exercicios();
        
        System.out.println(e1.maiorValorDoisValores(8.6,9.4));
        System.out.println(e2.maiorValorTresValores(9.6,15.8,86.6));
        System.out.println(e3.verificaPositivo(8));
        System.out.println(e4.calculaFatorial(5));
        System.out.println(e5.mediaValores(2,1.5,2,3.6,4.8,5.8,8.6));
    }
}