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
    
    /* Funções de funcionários */
    
    //Cria um funcionário auxiliar a partir de seu tipo e retorna seu objeto.
    public Funcionario criaUsuario(boolean admin){
        if(admin){
            Administrador aux = new Administrador();
            return aux;
        }else {
            Comum aux = new Comum();
            return aux;
        }
    }
    
    //Método sobreescrito do funcionário comum que cadastra e retorna o cliente.
    @Override
    public Cliente cadastraCliente() {
        return super.cadastraCliente();
    }

    //Método sobreescrito do funcionário comum que cadastra e retorna a mídia.
    @Override
    public Midia criaMidia(int tipo) {
        return super.criaMidia(tipo);
    }

    /* Término das funções de funcionários */
    
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
    public boolean isAdmin() {
        return super.isAdmin();
    }

    @Override
    public void setAdmin(boolean admin) {
        super.setAdmin(admin);
    }
    
    
}
