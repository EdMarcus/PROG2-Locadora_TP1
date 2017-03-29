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
import java.lang.*;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String[] dependentes;
    private int qtdDependentes;
    
    public Cliente(){
        dependentes = new String[6];
        for(int i=1; i<=5; i++){
            dependentes[i] = "";
        }
        qtdDependentes = 0;
    }
    public Cliente(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        dependentes = new String[6];
        for(int i=1; i<=5; i++){
            dependentes[i] = "";
        }
        qtdDependentes = 0;
    }
    
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
        try{
            if(dependentes[i].equals("")) throw new ArrayIndexOutOfBoundsException();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Não é possível achar o dependente.");
            return "";
        }
        return dependentes[i];
    }
    public void setDependente(String dependente){
        try{
            dependentes[++qtdDependentes] = dependente;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Não foi possível adicionar o depedente " + dependente
                    + ". Já excedeu a quantidade de dependentes.");
            qtdDependentes--;
        }
    }
    public String getDependentes(){
        String aux = "";
        if(qtdDependentes == 0){
            System.out.println("Não há dependentes.");
            aux = "0";
        }
        for(int i=1; i<=qtdDependentes; i++){
            if(qtdDependentes==i) aux += dependentes[i] + ".";
            else aux += dependentes[i] + ", ";
        }
        return aux;
    }
    public void imprimeDependentes(){
        for(int i=1; i<=qtdDependentes; i++){
            System.out.println("["+i+"]- " + dependentes[i]);
        }
    }
    public void delDependente(int id){
        dependentes[id] = "";
        for(int i=1; i<5; i++){
            if(dependentes[i]=="" && dependentes[i+1]!=""){
                dependentes[i] = dependentes[i+1];
                dependentes[i+1] = "";
            }
        }
        qtdDependentes--;
    }
    
}
