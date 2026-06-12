
public class Peca {
    protected String nome;
    public Peca(){ this("P0b"); }
    public Peca(String nome){ this.nome=nome; }
    public String getNome(){ return nome; }
    public void mover(){ System.out.println("A peça se moveu.");}
}
