public class Tabuleiro
{
    private String[][] casas = new String[8][8];
    private int jogadas = 0;

    public Tabuleiro()
    {
        inicializarCasas();
        colocarPecas();
        mostrar();
    }

    private void inicializarCasas()
    {
        for (int linha = 0; linha < casas.length; linha++)
        {
            for (int coluna = 0; coluna < casas[linha].length; coluna++)
            {
                casas[linha][coluna] = "   ";
            }
        }
    }

    private void colocarPecas()
    {
        casas[0][0] = new Torre("T1p").getNome();
        casas[0][1] = new Cavalo("H1p").getNome();
        casas[0][2] = new Bispo("B1p").getNome();
        casas[0][3] = new Rainha("Q0p").getNome();
        casas[0][4] = new Rei("K0p").getNome();
        casas[0][5] = new Bispo("B2p").getNome();
        casas[0][6] = new Cavalo("H2p").getNome();
        casas[0][7] = new Torre("T2p").getNome();
        for (int coluna = 0; coluna < 8; coluna++)
        {
            casas[1][coluna] = new Peao("P" + (coluna + 1) + "p").getNome();
        }

        casas[7][0] = new Torre("T1b").getNome();
        casas[7][1] = new Cavalo("H1b").getNome();
        casas[7][2] = new Bispo("B1b").getNome();
        casas[7][3] = new Rainha("Q0b").getNome();
        casas[7][4] = new Rei("K0b").getNome();
        casas[7][5] = new Bispo("B2b").getNome();
        casas[7][6] = new Cavalo("H2b").getNome();
        casas[7][7] = new Torre("T2b").getNome();
        for (int coluna = 0; coluna < 8; coluna++)
        {
            casas[6][coluna] = new Peao("P" + (coluna + 1) + "b").getNome();
        }
    }

    public void mostrar()
    {
        System.out.println("Tabuleiro:");
        for (int linha = 0; linha < casas.length; linha++)
        {
            for (int coluna = 0; coluna < casas[linha].length; coluna++)
            {
                System.out.print("|" + casas[linha][coluna]);
            }
            System.out.println("|");
        }
    }

    public boolean acabouOJogo()
    {
        return jogadas >= 10;
    }

    public boolean realizarJogada(Jogador jogador, String NomeDaPeca, int numeroDaCasa)
    {
        jogadas++;
        System.out.println("Tabuleiro recebeu jogada: " + NomeDaPeca + " para " + numeroDaCasa + " pelo jogador de cor " + jogador.getCor());
        return true;
    }
}

