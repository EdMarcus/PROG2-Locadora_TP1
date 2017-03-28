/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edlon
 */
public class Comum extends Funcionario{
    public void criaMidia(){};
    public void cadastraCliente(){};

    public Comum(String nome, Endereco endereco, String telefone, String senha) {
        super(nome, endereco, telefone, senha);
        setAdmin(false);
    }

    @Override
    public void setSenha(String senha) {
        super.setSenha(senha);
    }

    @Override
    public String getSenha() {
        return super.getSenha();
    }

    @Override
    public void setTelefone(String telefone) {
        super.setTelefone(telefone);
    }

    @Override
    public String getTelefone() {
        return super.getTelefone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEndereco(Endereco endereco) {
        super.setEndereco(endereco); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Endereco getEndereco() {
        return super.getEndereco(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAdmin(boolean admin) {
        super.setAdmin(admin);
    }

    @Override
    public boolean isAdmin() {
        return super.isAdmin();
    }
    
    

    
    
}
