public class Principal{
    public static void main(String[] args){
        double numero = Teclado.leDouble("Digite o número da conta: ");
        double saldo = Teclado.leDouble("Digite o saldo da conta: ");
        ContaCorrente c1 = new ContaCorrente(numero, saldo);
        

        System.out.println("Menu Geral");
        System.out.println("1) Efetuar saque");
        System.out.println("2) Efetuar um depósito");
        System.out.println("3) informações da conta");
        System.out.println("4) Sair do menu");
        int opcao = Teclado.leInt("Digite a opção desejada:");
        System.out.println("a opção desejada foi "+opcao);
        while(opcao == 1){
           System.out.println("Efetuar saque");
           double saque = Teclado.leDouble("Digite quanto deseja sacar: ");
           c1.efetuaSaque(saque);
           break;}
           String continuar = Teclado.leString("Deseja continuar? (Sim ou Não) ");
        while (opcao == 2){
         System.out.println("Efetuar um depósito");
         double deposito = Teclado.leDouble("Digite quanto deseja depositar: ");
         c1.efetuaDeposito(deposito);
         break;
        }
        //fim opção 2
        while (opcao == 3){
         System.out.println("informações da conta");
         c1.imprimeInformacoes();
         break;
        }
                   while (continuar.equalsIgnoreCase("Não")){
            if (opcao == 4){
                System.out.println("Obrigado, Tenha um bom dia.");
                break;
            }
            //fim opção 4
        }
        while (continuar.equalsIgnoreCase("Sim")){
        while(opcao == 1){
           System.out.println("Efetuar saque");
           double saque = Teclado.leDouble("Digite quanto deseja sacar: ");
           c1.efetuaSaque(saque);
           break;
        }
        continuar = Teclado.leString("Deseja continuar? (Sim ou Não) ");
        while (opcao == 2){
         System.out.println("Efetuar um depósito");
         double deposito = Teclado.leDouble("Digite quanto deseja depositar: ");
         c1.efetuaDeposito(deposito);
         break;
        }
        //fim opção 2
        while (opcao == 3){
         System.out.println("informações da conta");
         c1.imprimeInformacoes();
         break;
         
        }
    }

        while (continuar.equalsIgnoreCase("Não")){
        if (opcao == 4){
            System.out.println("Obrigado, Tenha um bom dia.");
            break;
        }
        //fim opção 4
    }
    
    ContaCorrente c2 = new ContaCorrente(numero, saldo);
    ContaCorrente c3 = new ContaCorrente(numero, saldo);
    ContaCorrente c4 = new ContaCorrente(numero, saldo);
    c2.imprimeInformacoes();
    c3.imprimeInformacoes();
    c4.imprimeInformacoes();
}
}
