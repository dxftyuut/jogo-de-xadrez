public class Tabuleiro {

    private String[][] casas = new String[8][8];

    public Tabuleiro(){

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                casas[i][j] = "   ";
            }
        }

        colocarPecas();

        mostrar();
    }

    public void colocarPecas(){

        Rei reiBranco = new Rei("K0b");
        Rei reiPreto = new Rei("K0p");

        Rainha rainhaBranca = new Rainha("Q0b");
        Rainha rainhaPreta = new Rainha("Q0p");

        Torre t1b = new Torre("T1b");
        Torre t2b = new Torre("T2b");
        Torre t1p = new Torre("T1p");
        Torre t2p = new Torre("T2p");

        Bispo b1b = new Bispo("B1b");
        Bispo b2b = new Bispo("B2b");
        Bispo b1p = new Bispo("B1p");
        Bispo b2p = new Bispo("B2p");

        Cavalo h1b = new Cavalo("H1b");
        Cavalo h2b = new Cavalo("H2b");
        Cavalo h1p = new Cavalo("H1p");
        Cavalo h2p = new Cavalo("H2p");

        Peao p1b = new Peao("P1b");
        Peao p2b = new Peao("P2b");
        Peao p3b = new Peao("P3b");
        Peao p4b = new Peao("P4b");
        Peao p5b = new Peao("P5b");
        Peao p6b = new Peao("P6b");
        Peao p7b = new Peao("P7b");
        Peao p8b = new Peao("P8b");

        Peao p1p = new Peao("P1p");
        Peao p2p = new Peao("P2p");
        Peao p3p = new Peao("P3p");
        Peao p4p = new Peao("P4p");
        Peao p5p = new Peao("P5p");
        Peao p6p = new Peao("P6p");
        Peao p7p = new Peao("P7p");
        Peao p8p = new Peao("P8p");
    }

    public void mostrar(){

        for(int i = 0; i < 8; i++){

            for(int j = 0; j < 8; j++){
                System.out.print("[" + casas[i][j] + "]");
            }

            System.out.println();
        }
    }

    public boolean acabouOJogo(){
        return false;
    }

}