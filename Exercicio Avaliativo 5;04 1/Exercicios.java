public class Exercicios{
    public void imprimeValores (int x){
        if(x > 0){
            System.out.println("Valor é positivo!");
            for(int i=x; i>=0; i--)
                System.out.println("i = "+i);
        }
        else if(x < 0){
            for(int i=x; i<=0; i++)
                System.out.println("i = "+i);
            }
        else
            System.out.println("Valor é zero");
    }
    public double maiorValorDoisValores(double x, double y){
        if (x > y){
            return x;
        }
        else if (y > x){
            return y;
        }
        
        else
            return y;
    }
    public double maiorValorTresValores(double x, double y, double z){
        if (x > y && x > z){
            return x;
        }
        else if (y > x && y > z){
            return y;
        }
        else if (z > y && z > x){
            return z;
        }
        
        else
            return y;
    }
    public boolean verificaPositivo (int x){
        if (x > 0){
            return true;
        }
        else
            return false;
    }
    public int calculaFatorial (int x){
        if (x > 0){
        int num, fat = 1;
        int cont = 1;
        while(cont < 2){num = x;
          for(int i = 1;i <= num; i++){
                fat = fat * i;
            }
          cont++;
        }
        return fat;
        }
        
        else
            return -1;
    }
    public double mediaValores(int x, double y,int z,double w,double c,double soma,double media) {
        for(z=0;z<x;z++)
            w = Teclado.leDouble("Digite aqui um número: ");
            c = y;
            y = w;
            soma = c + y;
            media = soma/x;
        if(x<0)
            System.out.println("ERRO: VALOR INFORMADO INVÁLIDO");
            return -1;
    }
}
