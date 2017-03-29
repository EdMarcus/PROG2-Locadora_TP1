/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author edlon
 */
public class SISLOCA {
    public static void main(String[] args){
        Administrador root = new Administrador("root", null, "00000000", "root");
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(root);
        do{
            Scanner in = new Scanner(System.in);
            String usuario, senha;
            boolean admin;
            boolean logado = false;
            int idUsuario = -1;
            Funcionario usuarioLogado;
            System.out.println("----------|SISLOCA - Sistema de Locadoras|----------");
            System.out.println("\n\n");
            System.out.println("Você precisa se logar no sistema!");
            System.out.println("\n\n\n\n");
            
            while(!logado){
                System.out.print("\t\t\tUsuário:");
                usuario = in.nextLine();
                System.out.print("\n\t\t\tSenha:");
                senha = in.nextLine();
                int i = 0;
                for(Funcionario funcionario : funcionarios){
                    if(((String)funcionario.getNome()).equals(usuario) && ((String)funcionario.getSenha()).equals(senha)){
                        logado = true;
                        idUsuario = i;
                        if(funcionario.isAdmin()) admin = true;
                        else admin = false;
                    } else{
                        logado = false;
                        System.out.println(funcionario.getNome() + funcionario.getSenha());
                        System.out.println("\nDados incorretos! Tente logar novamente.\n\n");
                    }
                    i++;
                }
            }
            Limpa.tela();
            usuarioLogado = funcionarios.get(idUsuario);
            System.out.println("Usuário " + usuarioLogado.getNome() + "logado com sucesso.");
            int opcao;
            menuGeral();
            
            
        }while(true);
        
    }
    public static void menuGeral(){
        Scanner in = new Scanner(System.in);
        int opcao;
            do{
                System.out.println("Selecione um menu: ");
                System.out.println("[1]-> Locação");
                System.out.println("[2]-> Usuários");
                System.out.println("[3]-> Clientes");
                System.out.println("[4]-> Mídias");
                System.out.println("[5]-> Sair");
                opcao = in.nextInt();
                Limpa.tela();
            }while(opcao>5 || opcao<1);
            if(opcao==1){
                
            }
            else if(opcao==2){
                
            }
            else if(opcao==3){
                int opcao2;
                do{
                    System.out.println("Selecione uma opção: ");
                    System.out.println("[1]-> Listar clientes");
                    System.out.println("[2]-> Cadastrar cliente");
                    System.out.println("[3]-> Excluir cliente");
                    System.out.println("[4]-> Editar propriedade cliente");
                    System.out.println("[5]-> Sair");
                    opcao2 = in.nextInt();
                    if(opcao2==5) menuGeral();
                }while(opcao2>5 || opcao2<1);
            }
            else if(opcao==4){
                
            }
            else if(opcao==5){
                int sair;
                do{
                    System.out.println("Deseja se deslogar ou sair do sistema?");
                    System.out.println("[1]-> Deslogar");
                    System.out.println("[2]-> Sair");
                    sair = in.nextInt();
                    if(sair==2) System.exit(0);
                }while(sair<1 || sair >2);
                
            }
    }
}
