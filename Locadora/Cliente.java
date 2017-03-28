/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edlon
 */
package 

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String[] dependentes = new String[6];
    private int qtdDependentes = 0;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getDependenteI(int i){
        return dependentes[i];
    }
    public void setDependente(String dependente){
        try{
            dependentes[++qtdDependentes] = dependente;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Não foi possível adicionar o depedente " + dependente
                    + ". Já excedeu a quantidade de dependentes.");
        }
    }
    public String getDependentes(){
        if(qtdDependentes == 0) return "Não há dependentes.";
        String aux = "";
        for(int i=1; i<qtdDependentes; i++){
            if(qtdDependentes==i) return aux + dependentes[i] + ".";
            aux += dependentes[i] + ", ";
        }
        return "";
    }
    
}
