
public class JogoDeXadrez implements Jogo{
    public void iniciar(){
        Tabuleiro tabuleiro=new Tabuleiro();
        Jogador j1=new JogadorHumano('b');
        Jogador j2=new JogadorSintetico('p');
        while(!tabuleiro.acabouOJogo()){
            j1.jogar(tabuleiro,"P1b",1);
            j2.jogar(tabuleiro,"P1p",1);
        }
    }
    public static void main(String[] args){
        new JogoDeXadrez().iniciar();
        System.out.println("Guilherme");
    }
}
