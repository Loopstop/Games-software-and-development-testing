public class Teste{
    public static void main(String[] args){
        int i = 8;
        boolean b = true;
        
        Casa c = new Casa(8, 7, "Verde");
        
        Casa c2 = new Casa(1, 2, "Branca");
        
        Casa c3 = c;
        
        c = c2;
        
        String corC3 = c3.getCor();
        System.out.println("cor da casa C3 é " +corC3);
        
        int janelasC3 = c3.getQuantJanelas();
        System.out.println("numero de janelas da casa C3 é "+janelasC3);
        
        int comodosC3 = c3.getQuantComodos();
        System.out.println("numero de comodos da casa C3 é "+comodosC3);
        
        c3.setCor("cinza");
        System.out.println("Cor alterada da casa C3 "+c3.getCor());
        
        System.out.println("INFORMAÇÕES DA CASA C");
        c.imprimeInfo();
        System.out.println("INFORMAÇÕES DA CASA C2");
        c2.imprimeInfo();
        System.out.println("INFORMAÇÕES DA CASA C3");
        c3.imprimeInfo();
    }
}