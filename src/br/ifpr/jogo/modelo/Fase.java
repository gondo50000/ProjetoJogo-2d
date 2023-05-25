package br.ifpr.jogo.modelo;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.NavigableMap;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fase extends JPanel {
    private Image imagemFundo;
    private Nave nave;



    public Fase(){
        ImageIcon carregando = new ImageIcon("Recursos\\Espaco_fundo.jpg");
        this.imagemFundo =carregando.getImage();

        this.nave = new Nave();
        this.nave.carregar();
        
        
    }
    
    public void paint(Graphics g){
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(imagemFundo,0,0, null);
        graficos.drawImage(this.nave.getImagem(), 10, 20, null);
        g.dispose();

    }
}    
