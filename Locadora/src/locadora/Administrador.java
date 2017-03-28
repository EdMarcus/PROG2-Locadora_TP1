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
public class Administrador extends Comum{
    
    public Administrador() {
        setAdmin(true);
    }
    
    public Administrador(String nome, Endereco endereco, String telefone, String senha) {
        super(nome, endereco, telefone, senha);
    }
    
    public Funcionario criaUsuario(boolean admin){
        if(admin){
            Administrador aux = new Administrador();
            return aux;
        }else {
            Comum aux = new Comum();
            return aux;
        }
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
    public Cliente cadastraCliente() {
        return super.cadastraCliente();
    }

    @Override
    public Midia criaMidia(int tipo) {
        return super.criaMidia(tipo);
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
