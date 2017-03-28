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
public class Comum extends Funcionario{

    public Comum() {
        super();
        setAdmin(false);
    }
    
    public Comum(String nome, Endereco endereco, String telefone, String senha) {
        super(nome, endereco, telefone, senha);
        setAdmin(false);
    }
    
    /* Funções de funcionários */
    
    // Implementação do método abstrato de funcionários que cria uma mídia auxiliar a partir de seu tipo e retorna seu objeto.
    @Override
    public Midia criaMidia(int tipo){
        if(tipo==1){
            DVD aux = new DVD();
            return aux;
        }else if(tipo==2){
            CD aux = new CD();
            return aux;
        }else if(tipo==3){
            Game aux = new Game();
            return aux;
        }else return null;
    }
    
    // Implementação do método abstrato de funcionários que cria um cliente auxiliar e retorna seu objeto.
    @Override
    public Cliente cadastraCliente(){
        Cliente aux = new Cliente();
        return aux;
    }
    public Cliente cadastraCliente(String nome, String cpf, String telefone){
        Cliente aux = new Cliente(nome, cpf, telefone);
        return aux;
    }
    
    /* Término das funções de funcionários */
    
    
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
