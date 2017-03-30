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
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Midia> midias = new ArrayList<>();
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
                menuClientes();
            }
            else if(opcao==4){
                menuMidias();
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
    
    public static void listarClientes(){
        if(clientes.isEmpty()) System.out.println("Não há clientes cadastrados!");
        else{
            int i=0;
            for(Cliente cliente : clientes){
                System.out.println("["+(i+1)+"]-> " + cliente.getNome());
            }
        }
    }
    
    public static void menuClientes() {
        int opcao;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("[1]-> Listar clientes");
            System.out.println("[2]-> Cadastrar cliente");
            System.out.println("[3]-> Excluir cliente");
            System.out.println("[4]-> Editar propriedade cliente");
            System.out.println("[5]-> Sair");
            opcao = in.nextInt();
            if (opcao == 1) listarClientes();
            if (opcao == 2) cadastrarCliente();
            if (opcao == 3) excluirCliente();
            if (opcao == 4) editarPropriedadeCliente();
            if (opcao == 5) menuGeral();
        } while (opcao > 5 || opcao < 1);
    }
    
    public static void excluirCliente(){
        Scanner in = new Scanner(System.in);
        int idCliente;
        
        do{
            System.out.println("Deseja excluir qual cliente?");
            listarClientes();
            idCliente = in.nextInt() - 1;
            if(idCliente<0 || idCliente>clientes.size()) {
                Limpa.tela();
                System.out.println("Cliente inválido.");
            }
        }while(idCliente<0 || idCliente>clientes.size());
        clientes.remove(idCliente);
    }
    
    public static void cadastrarCliente(){
        String nome, cpf, telefone;
        String nomeDependente;
        int opcao;
        Scanner in = new Scanner(System.in);
        System.out.print("Nome: ");
        nome = in.nextLine();
        System.out.print("\nCPF: ");
        cpf = in.nextLine();
        System.out.print("\nTelefone: ");
        telefone = in.nextLine();
        
        Cliente cliente = new Cliente(nome, cpf, telefone);
        
        do{
            System.out.println("\nDeseja adicionar dependentes?");
            System.out.println("[1]-> Sim");
            System.out.println("[2]-> Não");
            opcao = in.nextInt();
        }while(opcao<1 || opcao>2);
        if(opcao==1){
            do{
                if(!(cliente.getDependentes().equals("0"))){
                    System.out.println("Já estão cadastrados os dependentes: " + cliente.getDependentes());
                }
                System.out.print("\nNome do dependente: ");
                nomeDependente = in.nextLine();
                cliente.setDependente(nomeDependente);
                System.out.println("\nDeseja cadastrar mais um cliente?");
                System.out.println("[1]-> Sim");
                System.out.println("[2]-> Não");
                opcao = in.nextInt();
                while(opcao>2 || opcao<1){
                    System.out.println("Opção inválida!");
                    System.out.println("\nDeseja cadastrar mais um cliente?");
                    System.out.println("[1]-> Sim");
                    System.out.println("[2]-> Não");
                    opcao = in.nextInt();
                }
            }while(opcao==1);
        }
    }
    
    public static void editarPropriedadeCliente(){
        
    }
    
    public static void menuMidias(){
        int opcao;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("[1]-> Pesquisar mídia");
            System.out.println("[2]-> Cadastrar mídia");
            System.out.println("[3]-> Excluir mídia");
            System.out.println("[4]-> Editar mídia");
            System.out.println("[5]-> Sair");
            opcao = in.nextInt();
            if (opcao == 1) pesquisarMidias();
            if (opcao == 2) cadastrarMidia();
            if (opcao == 3) excluirMidia();
            if (opcao == 4) editarMidia();
            if (opcao == 5) menuGeral();
        } while (opcao > 5 || opcao < 1);        
    }
    public static void pesquisarMidias(){
        int opcao;
        int numeroMidia;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Escolha o tipo de pesquisa:");
            System.out.println("[1]-> MÍDIA POR NÚMERO");
            System.out.println("[2]-> DVD POR GÊNERO");
            System.out.println("[3]-> CD POR GRUPO OU CANTOR");
            System.out.println("[4]-> SAIR");
            opcao = in.nextInt();
        }while(opcao<1 || opcao>4);
        if(opcao==1){
            if(midias.isEmpty()) {
                System.out.println("Não há mídias cadastradas");
                pesquisarMidias();
            }
            System.out.print("\nDigite o número da mídia: ");
            numeroMidia = in.nextInt();
            boolean encontrou = false;
            for(Midia midia : midias){
                if(midia.getNumero()==numeroMidia){
                    System.out.println("Mídia encontrada!");
                    midia.imprimeMidia();
                    encontrou = true;
                }
            }if(!encontrou) System.out.println("Mídia não encontrada!");
            
        }else if(opcao==2){
            if(midias.isEmpty()) {
                System.out.println("Não há mídias cadastradas");
                pesquisarMidias();
            }
            String genero;
            System.out.print("\nDigite o gênero do DVD: ");
            genero = in.nextLine();
            boolean encontrou = false;
            for(Midia midia : midias){
                if(((DVD)midia).getGenero().equals(genero)){
                    System.out.println("Mídia encontrada!");
                    midia.imprimeMidia();
                    encontrou = true;
                }
            }if(!encontrou) System.out.println("Mídia não encontrada!");
            
        }else if(opcao==3){
            int escolha;
            do{
                System.out.println("Deseja fazer a busca por grupo ou cantor?");
                System.out.println("[1]-> Grupo");
                System.out.println("[2]-> Cantor");
                escolha = in.nextInt();
            }while(escolha<1 || escolha>2);
            
            if(midias.isEmpty()) {
                System.out.println("Não há mídias cadastradas");
                pesquisarMidias();
            }
            if(escolha==1){
                String grupo;
                System.out.print("\nDigite o grupo: ");
                grupo = in.nextLine();
                boolean encontrou = false;
                for(Midia midia : midias){
                    if(((CD)midia).getGrupo().equals(grupo)){
                        System.out.println("Mídia encontrada!");
                        midia.imprimeMidia();
                        encontrou = true;
                    }
                }if(!encontrou) System.out.println("Mídia não encontrada!");
            }if(escolha==2){
                String cantor;
                System.out.print("\nDigite o cantor: ");
                cantor = in.nextLine();
                boolean encontrou = false;
                for(Midia midia : midias){
                    if(((CD)midia).getCantor().equals(cantor)){
                        System.out.println("Mídia encontrada!");
                        midia.imprimeMidia();
                        encontrou = true;
                    }
                }if(!encontrou) System.out.println("Mídia não encontrada!");
            }
            
            
        }
    }
    public static void cadastrarMidia(){
        Scanner in = new Scanner(System.in);
        int tipo;
        do{
            System.out.println("Selecione o tipo de mídia:");
            System.out.println("[1]-> DVD");
            System.out.println("[2]-> CD");
            System.out.println("[3]-> GAME");
            tipo = in.nextInt();
            if(tipo<1 || tipo>3) System.out.println("Valor inválido!");
        }while(tipo<1 || tipo>3);
        if(tipo==1){
            String genero, idioma, titulo;
            int qtdDisponivel, catId, numero, censura;
            System.out.print("Título: ");
            titulo = in.nextLine();
            System.out.print("\nNúmero: ");
            numero = in.nextInt();
            System.out.print("\nCensura: ");
            censura = in.nextInt();
            System.out.println("\nCategoria:");
            do{
                System.out.println("[1]-> Lançamento");
                System.out.println("[2]-> Comum");
                System.out.println("[3]-> Acervo");
                catId = in.nextInt();
            }while(catId<1 || catId>3);
            System.out.print("\nDisponível: ");
            qtdDisponivel = in.nextInt();
            System.out.print("\nGênero: ");
            genero = in.nextLine();
            System.out.print("\nIdioma: ");
            idioma = in.nextLine();
            
            DVD dvd = new DVD(genero, idioma, numero, censura, titulo, qtdDisponivel, catId);
            midias.add(dvd);
        }
        else if(tipo==2){
            String nome, grupo, cantor, titulo;
            int nMusicas, numero, censura, qtdDisponivel, catId;
            System.out.print("Título: ");
            titulo = in.nextLine();
            System.out.print("\nNúmero: ");
            numero = in.nextInt();
            System.out.print("\nCensura: ");
            censura = in.nextInt();
            System.out.println("\nCategoria:");
            do{
                System.out.println("[1]-> Lançamento");
                System.out.println("[2]-> Comum");
                System.out.println("[3]-> Acervo");
                catId = in.nextInt();
            }while(catId<1 || catId>3);
            System.out.print("\nDisponível: ");
            qtdDisponivel = in.nextInt();
            System.out.print("\nNome: ");
            nome = in.nextLine();
            System.out.print("\nGrupo: ");
            grupo = in.nextLine();
            System.out.print("\nCantor: ");
            cantor = in.nextLine();
            System.out.print("\nNº Músicas: ");
            nMusicas = in.nextInt();
                    
            CD cd = new CD(nome, grupo, cantor, nMusicas, numero, censura, titulo, qtdDisponivel, catId);
            midias.add(cd);   
        }
        if(tipo==3){
            String console, titulo;
            int numero, censura, qtdDisponivel, catId;
            System.out.print("Título: ");
            titulo = in.nextLine();
            System.out.print("\nNúmero: ");
            numero = in.nextInt();
            System.out.print("\nCensura: ");
            censura = in.nextInt();
            System.out.println("\nCategoria:");
            do{
                System.out.println("[1]-> Lançamento");
                System.out.println("[2]-> Comum");
                System.out.println("[3]-> Acervo");
                catId = in.nextInt();
            }while(catId<1 || catId>3);
            System.out.print("\nDisponível: ");
            qtdDisponivel = in.nextInt();
            System.out.print("\nConsole: ");
            console = in.nextLine();
            
            Game game = new Game(console, numero, censura, titulo, qtdDisponivel, catId);
            midias.add(game);
        }
    }
    public static void excluirMidia(){
        int opcao;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Escolha uma mídia: ");
            listarMidias();
            opcao = in.nextInt();
        }while(opcao<1 || opcao>midias.size());
        midias.remove(opcao - 1);
    }
    public static void editarMidia(){
        
    }
    public static void listarMidias(){
        if(midias.isEmpty()) System.out.println("Não há mídias cadastradas!");
        else{
            int i=0;
            for(Midia midia : midias){
                String tipoMidia = "";
                if(midia instanceof DVD) tipoMidia = "DVD";
                else if(midia instanceof CD) tipoMidia = "CD";
                else if(midia instanceof Game) tipoMidia = "GAME";
                System.out.println("["+(i+1)+"]-> "+midia.getNumero()+" - "+midia.getTitulo()+" ["+tipoMidia+"]");
                i++;
            }
        }
    }
}
