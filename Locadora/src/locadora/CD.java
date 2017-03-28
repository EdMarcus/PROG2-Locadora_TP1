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
public class CD extends Midia{
    private String nome;
    private String grupo;
    private String cantor;
    private int nMusicas;
    
    public CD(){
        
    }

    public CD(String nome, String grupo, String cantor, int nMusicas, int numero, int censura, String titulo, int qtdDisponivel) {
        super(numero, censura, titulo, qtdDisponivel);
        this.nome = nome;
        this.grupo = grupo;
        this.cantor = cantor;
        this.nMusicas = nMusicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
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
