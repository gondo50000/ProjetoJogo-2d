package br.ifpr.jogo.principal;
import javax.swing.JFrame;
import br.ifpr.jogo.modelo.Fase;

public class Principal extends JFrame {
    public Principal(){
        Fase fase = new Fase();
        super.add(fase);
        super.setVisible(true);
        super.setSize(1000, 1000);
        super.setTitle("Meu jogo");
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(ABORT);
    }
    public static void main(String[] args) {

        Principal principal = new Principal();
        
    }
    
}
