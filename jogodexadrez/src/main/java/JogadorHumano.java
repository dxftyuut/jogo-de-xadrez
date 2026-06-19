public class JogadorHumano extends Jogador
{
    public JogadorHumano(char cor)
    {
        super(cor);
    }

    @Override
    public boolean jogar(Tabuleiro tabuleiro, String NomeDaPeca, int numeroDaCasa)
    {
        System.out.println("Jogador humano de cor " + cor + " jogando " + NomeDaPeca + " para casa " + numeroDaCasa);
        return tabuleiro.realizarJogada(this, NomeDaPeca, numeroDaCasa);
    }
}
