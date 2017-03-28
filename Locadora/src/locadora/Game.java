package locadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edlon
 */
public class Game extends Midia{
    private String console;

    public Game(String console, int numero, int censura, String titulo, int qtdDisponivel) {
        super(numero, censura, titulo, qtdDisponivel);
        this.console = console;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    @Override
    public void setQtdDisponivel(int qtdDisponivel) {
        super.setQtdDisponivel(qtdDisponivel);
    }

    @Override
    public int getQtdDisponivel() {
        return super.getQtdDisponivel();
    }

    @Override
    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public void setCensura(int censura) {
        super.setCensura(censura);
    }

    @Override
    public int getCensura() {
        return super.getCensura();
    }

    @Override
    public void setNumero(int numero) {
        super.setNumero(numero);
    }

    @Override
    public int getNumero() {
        return super.getNumero();
    }
    
    
}
