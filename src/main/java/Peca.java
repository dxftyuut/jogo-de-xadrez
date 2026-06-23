public abstract class Peca {

    protected String nome;

    public Peca(String nome){
        this.nome = nome;
    }

    public int mover(){
        return 1;
    }

}