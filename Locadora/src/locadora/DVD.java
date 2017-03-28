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
public class DVD extends Midia{
    private String genero;
    private String idioma;

    public DVD(){
        
    }
    
    public DVD(String genero, String idioma, int numero, int censura, String titulo, int qtdDisponivel) {
        super(numero, censura, titulo, qtdDisponivel);
        this.genero = genero;
        this.idioma = idioma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
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
        return super.getTitulo(); //To change body of generated methods, choose Tools | Templates.
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
