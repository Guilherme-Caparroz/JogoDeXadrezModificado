
public class Tabuleiro {
    private String[][] casas = new String[8][8];
    private int turnos=0;
    public Tabuleiro(){
        for(int i=0;i<8;i++)
            for(int j=0;j<8;j++)
                casas[i][j]="   ";
        colocarPecas();
        mostrar();
    }
    public void colocarPecas(){
        new Rei(); new Rainha(); new Torre(); new Torre();
        new Bispo(); new Bispo(); new Cavalo(); new Cavalo();
        for(int i=0;i<8;i++) new Peao();
    }
    public void mostrar(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++) System.out.print("["+casas[i][j]+"]");
            System.out.println();
        }
    }
    public boolean acabouOJogo(){ return turnos++>=2; }
}
