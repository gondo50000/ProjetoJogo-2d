package br.ifpr.jogo.modelo;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Nave {
    private int posicaoEmX;
    private int posicaoEmy;
    private int deloscamentoEmX;
    private int deslocamentoEmY;
    private Image imagem;
    private int larguraImagem;
    private int alturaImagem;


    public Nave(){
        this.posicaoEmX = 100;
        this.posicaoEmy = 100;

    }

    public void carregar(){
        ImageIcon carregando = new ImageIcon("Recursos\\Imagem_nave.jpg");
        this.imagem = carregando.getImage();         //Atribuindo a imagem para o atributo
        this.alturaImagem = this.imagem.getWidth(null);
        this.larguraImagem = this.imagem.getHeight(null);
    }

    public int getPosicaoEmX() {
        return this.posicaoEmX;
    }

    public void setPosicaoEmX(int posicaoEmX) {
        this.posicaoEmX = posicaoEmX;
    }

    public int getPosicaoEmy() {
        return this.posicaoEmy;
    }

    public void setPosicaoEmy(int posicaoEmy) {
        this.posicaoEmy = posicaoEmy;
    }

    public int getdeloscamentoEmX() {
        return this.deloscamentoEmX;
    }

    public void setdeloscamentoEmX(int deloscamentoEmX) {
        this.deloscamentoEmX = deloscamentoEmX;
    }

    public int getDeslocamentoEmY() {
        return this.deslocamentoEmY;
    }

    public void setDeslocamentoEmY(int DeslocamentoEmY) {
        this.deslocamentoEmY = DeslocamentoEmY;
    }

    public Image getImagem() {
        return this.imagem;
    }

    public void setImagem(Image imagem) {
        this.imagem = imagem;
    }

    public int getLarguraImagem() {
        return this.larguraImagem;
    }

    public void setLarguraImagem(int larguraImagem) {
        this.larguraImagem = larguraImagem;
    }

    public int getAlturaImagem() {
        return this.alturaImagem;
    }

    public void setAlturaImagem(int alturaImagem) {
        this.alturaImagem = alturaImagem;
    }


}
