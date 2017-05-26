public class PedraSpock{
    public static void main(String[] args){
    //jogadores 1 e 2 solicitados no teclado
    String jogador1nome = Teclado.leString("Digite o nome do primeiro jogador: ");
    String jogador2nome = Teclado.leString("Digite o nome do segundo jogador: ");
    Jogador jogador1 = new Jogador(jogador1nome, 0);
    Jogador jogador2 = new Jogador(jogador2nome, 0);
    
    System.out.println("Essas são suas escolhas possiveis:Pedra, papel, tesoura, lagarto,Spock");
    System.out.println("Sendo que:");
    System.out.println("Tesoura corta papel");
    System.out.println("Papel cobre pedra");
    System.out.println("Pedra esmaga lagarto");
    System.out.println("Lagarto envenena Spock");
    System.out.println("Spock quebra tesoura");
    System.out.println("Tesoura decapita lagarto");
    System.out.println("Lagarto come papel");
    System.out.println("Papel desaprova Spock");
    System.out.println("Spock vaporiza pedra");
    System.out.println("e como sempre, pedra destrói tesoura.\n");
    

    String jogada1 = Teclado.leString("Por favor, execute sua jogada, "+ jogador1.getNome()+" :");
    String jogada2 = Teclado.leString("\nPor favor, execute sua jogada, "+ jogador2.getNome()+" :");
    int i = 1;
    
        while (jogada1.equalsIgnoreCase("Tesoura") && jogada2.equalsIgnoreCase("Papel") || jogada1.equalsIgnoreCase("Papel") && jogada2.equalsIgnoreCase("Pedra") || 
                jogada1.equalsIgnoreCase("Pedra") && jogada2.equalsIgnoreCase("Lagarto") || jogada1.equalsIgnoreCase("Lagarto") && jogada2.equalsIgnoreCase("Spock") ||
                jogada1.equalsIgnoreCase("Spock") && jogada2.equalsIgnoreCase("Tesoura") || jogada1.equalsIgnoreCase("Tesoura") && jogada2.equalsIgnoreCase("Lagarto") || 
                jogada1.equalsIgnoreCase("Lagarto") && jogada2.equalsIgnoreCase("Papel") || jogada1.equalsIgnoreCase("Papel") && jogada2.equalsIgnoreCase("Spock") ||
                jogada1.equalsIgnoreCase("Spock") && jogada2.equalsIgnoreCase("Pedra") || jogada1.equalsIgnoreCase("Pedra") && jogada2.equalsIgnoreCase("Tesoura")){
                System.out.println(jogada1 + " vence "+ jogada2+"\n");
                jogador1.setQuantPontos(i++);
                System.out.println(jogador1.getNome() +" venceu dessa vez.");
                break;
               }
               
        while(jogada1.equalsIgnoreCase("Papel") && jogada2.equalsIgnoreCase("Tesoura") || jogada1.equalsIgnoreCase("Pedra") && jogada2.equalsIgnoreCase("Papel") || 
                jogada1.equalsIgnoreCase("Lagarto") && jogada2.equalsIgnoreCase("Pedra") || jogada1.equalsIgnoreCase("Spock") && jogada2.equalsIgnoreCase("Lagarto") ||
                jogada1.equalsIgnoreCase("Tesoura") && jogada2.equalsIgnoreCase("Spock") || jogada1.equalsIgnoreCase("Lagarto") && jogada2.equalsIgnoreCase("Tesoura") || 
                jogada1.equalsIgnoreCase("Papel") && jogada2.equalsIgnoreCase("Lagarto") || jogada1.equalsIgnoreCase("Spock") && jogada2.equalsIgnoreCase("Papel") ||
                jogada1.equalsIgnoreCase("Pedra") && jogada2.equalsIgnoreCase("Spock") || jogada1.equalsIgnoreCase("Tesoura") && jogada2.equalsIgnoreCase("Pedra")){
                System.out.println(jogada2 + " vence "+ jogada1+"\n");
                jogador2.setQuantPontos(i++);
                System.out.println(jogador2.getNome() +" venceu dessa vez.");
                break;
                }
        if (jogador1.getQuantPontos() > jogador2.getQuantPontos()){
            jogador1.imprimeInformacoes();
            System.out.println(jogador1.getNome() + " Venceu.");
            }
        else if (jogador1.getQuantPontos() < jogador2.getQuantPontos()){
                jogador2.imprimeInformacoes();
                System.out.println("\n"+jogador2.getNome() + " Venceu.");
                }
        // deseja continuar?
        String c = Teclado.leString("Deseja continuar jogando? \n (Sim ou não?)");
        while (c.equalsIgnoreCase("Sim")){
            jogada1 = Teclado.leString("Por favor, execute sua jogada, "+ jogador1.getNome()+" :");
            jogada2 = Teclado.leString("\nPor favor, execute sua jogada, "+ jogador2.getNome()+" :");
        while (jogada1.equalsIgnoreCase("Tesoura") && jogada2.equalsIgnoreCase("Papel") || jogada1.equalsIgnoreCase("Papel") && jogada2.equalsIgnoreCase("Pedra") || 
                jogada1.equalsIgnoreCase("Pedra") && jogada2.equalsIgnoreCase("Lagarto") || jogada1.equalsIgnoreCase("Lagarto") && jogada2.equalsIgnoreCase("Spock") ||
                jogada1.equalsIgnoreCase("Spock") && jogada2.equalsIgnoreCase("Tesoura") || jogada1.equalsIgnoreCase("Tesoura") && jogada2.equalsIgnoreCase("Lagarto") || 
                jogada1.equalsIgnoreCase("Lagarto") && jogada2.equalsIgnoreCase("Papel") || jogada1.equalsIgnoreCase("Papel") && jogada2.equalsIgnoreCase("Spock") ||
                jogada1.equalsIgnoreCase("Spock") && jogada2.equalsIgnoreCase("Pedra") || jogada1.equalsIgnoreCase("Pedra") && jogada2.equalsIgnoreCase("Tesoura")){
                System.out.println(jogada1 + " vence "+ jogada2+"\n");
                jogador1.setQuantPontos(i++);
                System.out.println(jogador1.getNome() +" venceu dessa vez.");
                break;
               }
               
        while(jogada1.equalsIgnoreCase("Papel") && jogada2.equalsIgnoreCase("Tesoura") || jogada1.equalsIgnoreCase("Pedra") && jogada2.equalsIgnoreCase("Papel") || 
                jogada1.equalsIgnoreCase("Lagarto") && jogada2.equalsIgnoreCase("Pedra") || jogada1.equalsIgnoreCase("Spock") && jogada2.equalsIgnoreCase("Lagarto") ||
                jogada1.equalsIgnoreCase("Tesoura") && jogada2.equalsIgnoreCase("Spock") || jogada1.equalsIgnoreCase("Lagarto") && jogada2.equalsIgnoreCase("Tesoura") || 
                jogada1.equalsIgnoreCase("Papel") && jogada2.equalsIgnoreCase("Lagarto") || jogada1.equalsIgnoreCase("Spock") && jogada2.equalsIgnoreCase("Papel") ||
                jogada1.equalsIgnoreCase("Pedra") && jogada2.equalsIgnoreCase("Spock") || jogada1.equalsIgnoreCase("Tesoura") && jogada2.equalsIgnoreCase("Pedra")){
                System.out.println(jogada2 + " vence "+ jogada1+"\n");
                jogador2.setQuantPontos(i++);
                System.out.println(jogador2.getNome() +" venceu dessa vez.");
                break;
                }
        if (jogador1.getQuantPontos() > jogador2.getQuantPontos()){
            jogador1.imprimeInformacoes();
            System.out.println(jogador1.getNome() + " Venceu.");
            c = Teclado.leString("Deseja continuar jogando? \n (Sim ou não?)");
            }
        else if (jogador1.getQuantPontos() < jogador2.getQuantPontos()){
                jogador2.imprimeInformacoes();
                System.out.println("\n"+jogador2.getNome() + " Venceu.");
                c = Teclado.leString("Deseja continuar jogando? \n (Sim ou não?)");
                }
        }
        while (c.equalsIgnoreCase("Não")){
            if (jogador1.getQuantPontos() > jogador2.getQuantPontos()){
                    jogador1.imprimeInformacoes();
                    System.out.println(jogador1.getNome() + " Venceu.");
                    break;
            }
                else if (jogador1.getQuantPontos() < jogador2.getQuantPontos()){
                    jogador2.imprimeInformacoes();
                    System.out.println("\n"+jogador2.getNome() + " Venceu.");
                    break;
                }
                }
            }
    
    }