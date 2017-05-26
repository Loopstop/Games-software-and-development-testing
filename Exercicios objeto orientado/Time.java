public class Time{
        private String nome;
        private int serie;
        private int quantTorcedores;
        private int quantTitulos;
        private Mascote mascote;
        private double rendaAtual;
        
        public Time(String nome, int serie, int quantTorcedores, int quantTitulos, Mascote mascote, double rendaAtual){
            this.nome = nome;
            this.serie = serie;
            this.quantTorcedores = quantTorcedores;
            this.quantTitulos = quantTitulos;
            this.mascote = mascote;
            this.rendaAtual = rendaAtual;
        }
}