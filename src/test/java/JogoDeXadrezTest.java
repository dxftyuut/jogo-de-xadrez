import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class JogoDeXadrezTest {

    @Test
    void verificarPecas() {

        Bispo bispo = new Bispo("B1b");
        assertEquals(1, bispo.mover());

        Cavalo cavalo = new Cavalo("H1b");
        assertEquals(1, cavalo.mover());

        Peao peao = new Peao("P1b");
        assertEquals(1, peao.mover());

        Rainha rainha = new Rainha("Q0b");
        assertEquals(1, rainha.mover());

        Rei rei = new Rei("K0b");
        assertEquals(1, rei.mover());

        Torre torre = new Torre("T1b");
        assertEquals(1, torre.mover());
    }

    @Test
    void verificarTabuleiro() {
        Tabuleiro tabuleiro = new Tabuleiro();
        assertFalse(tabuleiro.acabouOJogo());
    }

    @Test
    void verificarCasaLivre() {
        Tabuleiro tabuleiro = new Tabuleiro();
        // The board constructor already calls colocarPecas().
        
        // a3 should be empty
        org.junit.jupiter.api.Assertions.assertTrue(tabuleiro.casaLivre("a3"));
        
        // a1 should be occupied (T1b)
        org.junit.jupiter.api.Assertions.assertTrue(!tabuleiro.casaLivre("a1"));
    }
}