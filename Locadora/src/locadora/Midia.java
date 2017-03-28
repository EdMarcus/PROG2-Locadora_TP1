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
public abstract class Midia {
    private int numero;
    private int censura;
    private String titulo;
    private int qtdDisponivel;
    private String categoria;

    // Construtor padrão, sem argumentos.  
    public Midia(){
        
    }
    
    // Construtor sobrecarregado, com argumentos.
    public Midia(int numero, int censura, String titulo, int qtdDisponivel, int catId) {
        this.numero = numero;
        this.censura = censura;
        this.titulo = titulo;
        this.qtdDisponivel = qtdDisponivel;
        this.setCategoria(catId);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCensura() {
        return censura;
    }

    public void setCensura(int censura) {
        this.censura = censura;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void setQtdDisponivel(int qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(int catId) {
        switch(catId){
            case 1:
                categoria = "Lançamento";
                break;
            case 2:
                categoria = "Comum";
                break;
            case 3:
                categoria = "Acervo";
                break;
            default:
                categoria = "";
                break;
        }
    }

    
}
