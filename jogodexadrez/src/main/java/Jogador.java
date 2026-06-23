public abstract class Jogador implements JogadorInterface {

    protected char cor;

    public Jogador(char cor){

        if(cor != 'b' && cor != 'p'){
            throw new RuntimeException("Cor invalida");
        }

        this.cor = cor;
    }

}