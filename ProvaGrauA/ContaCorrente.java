public class ContaCorrente{
    private double numero;
    private double saldo;
    //construtores
    public ContaCorrente(double numero,double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }
    //metodos de acesso
    public double getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setNumero(double numero){
        this.numero = numero;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    //imprime #01
    public void imprimeInformacoes(){
        System.out.println("Numero da conta: "+ numero);
        System.out.println("Saldo: "+ saldo + " R$.");
    }
    //metodo efetua depósito #02
    public void efetuaDeposito(double dep){
        if (dep > 0){
            System.out.println("Você depositou "+ dep+ " R$");
        }
            else
                System.out.println("ERRO: não é possivel depositar um valor negativo.");
        }
    //metodo efetua saque #03
    public void efetuaSaque(double saq){
        if (saq <= saldo && saq > 0){
            System.out.println("Você sacou "+ saq+ " R$");
            
        }
            else if (saq < 0){
            System.out.println("ERRO: não é possivel sacar um valor negativo.");
            }
                else if (saq > saldo){
                    System.out.println("ERRO: não é possivel sacar, o saldo atual é menor que o valor a sacar.");
                }
       }
    
    }
