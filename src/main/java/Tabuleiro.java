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

        // Linha 0 (Pretas): T1p, H1p, B1p, Q0p, K0p, B2p, H2p, T2p
        casas[0][0] = t1p.getNome();
        casas[0][1] = h1p.getNome();
        casas[0][2] = b1p.getNome();
        casas[0][3] = rainhaPreta.getNome();
        casas[0][4] = reiPreto.getNome();
        casas[0][5] = b2p.getNome();
        casas[0][6] = h2p.getNome();
        casas[0][7] = t2p.getNome();

        // Linha 1 (Peoes Pretos)
        casas[1][0] = p1p.getNome();
        casas[1][1] = p2p.getNome();
        casas[1][2] = p3p.getNome();
        casas[1][3] = p4p.getNome();
        casas[1][4] = p5p.getNome();
        casas[1][5] = p6p.getNome();
        casas[1][6] = p7p.getNome();
        casas[1][7] = p8p.getNome();

        // Linha 6 (Peoes Brancos)
        casas[6][0] = p1b.getNome();
        casas[6][1] = p2b.getNome();
        casas[6][2] = p3b.getNome();
        casas[6][3] = p4b.getNome();
        casas[6][4] = p5b.getNome();
        casas[6][5] = p6b.getNome();
        casas[6][6] = p7b.getNome();
        casas[6][7] = p8b.getNome();

        // Linha 7 (Brancas)
        casas[7][0] = t1b.getNome();
        casas[7][1] = h1b.getNome();
        casas[7][2] = b1b.getNome();
        casas[7][3] = rainhaBranca.getNome();
        casas[7][4] = reiBranco.getNome();
        casas[7][5] = b2b.getNome();
        casas[7][6] = h2b.getNome();
        casas[7][7] = t2b.getNome();
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

    public boolean casaLivre(String casa){
        if(casa == null || casa.length() != 2) return false;
        char colunaChar = Character.toLowerCase(casa.charAt(0));
        char linhaChar = casa.charAt(1);
        
        int j = colunaChar - 'a';
        int i = 8 - (linhaChar - '0');
        
        if (i < 0 || i > 7 || j < 0 || j > 7) {
            return false;
        }
        
        return casas[i][j].trim().isEmpty();
    }

}