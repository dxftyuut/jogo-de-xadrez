public class JogoDeXadrez implements Jogo {

    @Override
    public void iniciar(){

        Tabuleiro tabuleiro = new Tabuleiro();

        Jogador jogador1 = new JogadorHumano('b');
        Jogador jogador2 = new JogadorSintetico('p');

        while(!tabuleiro.acabouOJogo()){

            jogador1.jogar(tabuleiro, "", 0);
            jogador2.jogar(tabuleiro, "", 0);

            break;
        }
    }

    public static void main(String[] args){

        JogoDeXadrez jogo = new JogoDeXadrez();

        jogo.iniciar();

        System.out.println("Gabriel Lopes");
    }

}