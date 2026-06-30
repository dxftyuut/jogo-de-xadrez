import java.util.Scanner;

public class JogoDeXadrez implements Jogo {

    @Override
    public void iniciar(){

        Tabuleiro tabuleiro = new Tabuleiro();
        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;
        
        while(continuar && !tabuleiro.acabouOJogo()){
            
            boolean moveu = false;
            while (!moveu) {
                System.out.println("a. Qual peça você quer mover?");
                String peca = scanner.nextLine();
                
                System.out.println("b. Para qual casa você deseja mover?");
                String destino = scanner.nextLine();
                
                if (tabuleiro.moverPeca(peca, destino)) {
                    moveu = true;
                }
            }
            
            tabuleiro.mostrar();
            
            System.out.println("Deseja continuar jogando? (S/N)");
            String res = scanner.nextLine();
            if (res.trim().equalsIgnoreCase("N") || res.trim().equalsIgnoreCase("NÃO") || res.trim().equalsIgnoreCase("NAO")) {
                continuar = false;
            }
        }
        
        scanner.close();
    }

    public static void main(String[] args){

        JogoDeXadrez jogo = new JogoDeXadrez();

        jogo.iniciar();

        System.out.println("Gabriel Lopes");
    }

}