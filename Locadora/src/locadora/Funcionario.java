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
public abstract class Funcionario {
    private String nome;
    private Endereco endereco;
    private String telefone;
    private String senha;
    private boolean admin;

    public Funcionario() {
        
    }
    
    public Funcionario(String nome, Endereco endereco, String telefone, String senha) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    public abstract Midia criaMidia(int tipo);
    public abstract Cliente cadastraCliente();
    public abstract Funcionario criaUsuario(boolean admin);
    
}
