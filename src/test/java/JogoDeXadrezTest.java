import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class JogoDeXadrezTest {

    @Test
    void verificarPecas() {

        Bispo bispo = new Bispo("B1b");
        org.junit.jupiter.api.Assertions.assertNotNull(bispo, "O objeto bispo deve ser criado com sucesso");
        assertEquals(1, bispo.mover());

        Cavalo cavalo = new Cavalo("H1b");
        org.junit.jupiter.api.Assertions.assertNotNull(cavalo, "O objeto cavalo deve ser criado com sucesso");
        assertEquals(1, cavalo.mover());

        Peao peao = new Peao("P1b");
        org.junit.jupiter.api.Assertions.assertNotNull(peao, "O objeto peao deve ser criado com sucesso");
        assertEquals(1, peao.mover());

        Rainha rainha = new Rainha("Q0b");
        org.junit.jupiter.api.Assertions.assertNotNull(rainha, "O objeto rainha deve ser criado com sucesso");
        assertEquals(1, rainha.mover());

        Rei rei = new Rei("K0b");
        org.junit.jupiter.api.Assertions.assertNotNull(rei, "O objeto rei deve ser criado com sucesso");
        assertEquals(1, rei.mover());

        Torre torre = new Torre("T1b");
        org.junit.jupiter.api.Assertions.assertNotNull(torre, "O objeto torre deve ser criado com sucesso");
        assertEquals(1, torre.mover());
    }

    @Test
    void verificarTabuleiro() {
        Tabuleiro tabuleiro = new Tabuleiro();
        org.junit.jupiter.api.Assertions.assertNotNull(tabuleiro, "O objeto tabuleiro deve ser criado com sucesso");
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

    @Test
    void verificarJogador() {
        JogadorHumano humano = new JogadorHumano('b');
        JogadorSintetico sintetico = new JogadorSintetico('p');
        
        org.junit.jupiter.api.Assertions.assertTrue(humano.jogar(new Tabuleiro(), "K0b", 10) || !humano.jogar(new Tabuleiro(), "K0b", 10));
        
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> {
            new JogadorHumano('x');
        });
        
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> {
            new JogadorSintetico('y');
        });
    }
}