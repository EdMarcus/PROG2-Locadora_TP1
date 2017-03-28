/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edlon
 */
public class Administrador extends Comum{
    public Funcionario criaUsuario(){
        Funcionario aux;
        return aux;
    }

    public Administrador(String nome, Endereco endereco, String telefone, String senha) {
        super(nome, endereco, telefone, senha);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public Endereco getEndereco() {
        return super.getEndereco();
    }

    @Override
    public void setEndereco(Endereco endereco) {
        super.setEndereco(endereco);
    }

    @Override
    public String getTelefone() {
        return super.getTelefone();
    }

    @Override
    public void setTelefone(String telefone) {
        super.setTelefone(telefone);
    }

    @Override
    public String getSenha() {
        return super.getSenha();
    }

    @Override
    public void setSenha(String senha) {
        super.setSenha(senha);
    }

    @Override
    public void cadastraCliente() {
        super.cadastraCliente();
    }

    @Override
    public void criaMidia() {
        super.criaMidia();
    }

    @Override
    public boolean isAdmin() {
        return super.isAdmin();
    }

    @Override
    public void setAdmin(boolean admin) {
        super.setAdmin(admin);
    }
    
    
}
