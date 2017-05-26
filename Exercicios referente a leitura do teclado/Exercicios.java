public class Exercicios{
    public static void main(String[] args){
        System.out.println("Menu Geral");
        System.out.println("1) Soma");
        System.out.println("2) Divisão");
        System.out.println("3) Verifica triângulo");
        System.out.println("4) Verifica idade");
        System.out.println("5) Verificar sinaleira");
        System.out.println("6) Contagem até 300");
        System.out.println("7) Verifica se é numero primo");
        System.out.println("8) Identifica o maior numero)");
        System.out.println("9) Numeros pares.");
        
        int opcao = Teclado.leInt("Digite a opção desejada:");
        System.out.println("a opção desejada foi "+opcao);
        if (opcao > 9){
            System.out.println("ERRO: Você selecionou uma opção INEXISTENTE :/");
        };
        if(opcao == 1){
            System.out.println("Você escolheu somar dois numeros.");
            
            int n1 = Teclado.leInt("Digite um valor inteiro para ser somado:");
            int n2 = Teclado.leInt("Digite outro valor inteiro:");
            
            int soma = n1 + n2;
            
            if (n1 < 0 || n2 < 0){
            System.out.println("Erro: o numero digitado é NEGATIVO");
        }
            else 
                System.out.println("A soma desses valores é "+ soma);
        }
        //fim opção 1
        
        else if (opcao == 2){
            System.out.println("Você escolheu dividir dois numeros.");
            
            int div1 = Teclado.leInt("Digite um valor inteiro:");
            int div2 = Teclado.leInt("Digite outro valor inteiro:");
            
            int Rdiv = div1 / div2;
            
            if(div1 == 0 || div2 == 0){
                System.out.println("O numero é ZERO, não sera feito a divisão.");
            }
            else
                System.out.println("A divisão dos valores é "+Rdiv);
        }
        //fim opção 2
        
        
        else if (opcao == 3){
            System.out.println("Você escolheu verificar triângulo.");
            
            int x = Teclado.leInt("Digite o primeiro lado do triângulo:");
            int y = Teclado.leInt("Digite o segundo lado do triângulo:");
            int z = Teclado.leInt("Digite o terceiro lado do triângulo:");
            
            if (x < y+z || y < x+z || z < x+y){
                System.out.println("É um triangulo");
             }
            if (x!=y && x!=z && y!=x && y!=z && z!=x && z!=y){
                System.out.println("Três lados diferentes. é um Triângulo Escaleno");
            }
            else if (x == y && x == z && x==x){
                System.out.println("Três lados iguais . é um Triângulo Equilatero");
                }
            else if(x == y || x == z || x==x){
                System.out.println("Dois lados iguais . é um Triângulo Isosceles");
            }
        }
        //fim opção 3
        
        
        else if (opcao == 4){
            System.out.println("Você escolheu verificar idade.");
            
            int x = Teclado.leInt("Digite sua idade:");

            if (x < 0){
                System.out.println("ERRO: idade menor que ZERO.");
            }
            else if (x > 120){
                System.out.println("ERRO: idade maior que 120.");
            }
            else if(x <= 12)
            {
                System.out.println("Você é criança.");
            }
            else if (x <= 18){
                System.out.println("Você é adolescente.");
            }
            else if (x <= 120){
                System.out.println("Você é adulto.");
            };
        }
        //fim opção 4
        
        
        else if (opcao == 5){
            System.out.println("Você escolheu verificar situação da sinaleira");
            
            String corDigit = Teclado.leString("Digite uma cor desejada:(no masculino)");
            String cor1 = "Verde";
            String cor2 = "Amarelo";
            String cor3 = "Vermelho";
            if(corDigit.equals(cor1)){
                System.out.println("Sinaleira aberta");
            }
            else if (corDigit.equals(cor2)){
                System.out.println("Atenção!");
            }
            else if (corDigit.equals(cor3)){
                System.out.println("Sinaleira fechada");
            }
        }
        //fim opção 5
        
        
        else if (opcao == 6){
            System.out.println("Você escolheu fazer contagem até 300");
            
            int nX = Teclado.leInt("Digite um valor até 300:");
            System.out.println("\nValor digitado foi "+ nX);
            
            while (nX <= 300){
                System.out.println(nX);
                nX ++;
            }
        }
        //fim opção 6
        
        
        else if (opcao == 7){
            System.out.println("Você escolheu verificar se o numero é primo via verdadeiro e falso.");
            
            int nX = Teclado.leInt("Digite um valor inteiro:");
            
            boolean primo = true;
            if (nX==0|| nX==1)
                primo = false;
 
                else {
                    for (int i = 2; i < nX; i++) {
                        if ((nX % i) == 0){ //resto 0
                            primo = false; 
                            break;
                        }
                    }
                }
                if (primo)  //se é true
                System.out.println(primo);
                else  //se é false
                System.out.println(primo);
        }
        //fim opção 7
        
        
        else if (opcao == 8){
            System.out.println("Você escolheu encontrar o maior numero entre os mesmos.");
            
            int x = Teclado.leInt("Digite um inteiro:");
            int y = Teclado.leInt("Digite outro inteiro:");
            int z = Teclado.leInt("Digite mais um inteiro:");
            
            if (x > y && x > z){
                System.out.println(x+" é o maior numero.");
            }
            else if (y > x && y > z){
                System.out.println(y+" é o maior numero.");
            }
            else
                System.out.println(z+" é o maior numero.");
        }
        //fim opção 8
        
        
        else if (opcao == 9){
            System.out.println("Você escolheu verificar pares de 0 até o numero desejado.");
            
            int nX = Teclado.leInt("Digite um inteiro:");
            System.out.println("Digite um numero: ");

            while(nX >= 0){
            if(nX%2 == 0){
                System.out.println(nX);
            }
            nX--;
            
        }
       }//fim opção 9
    }
}
