/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;
import java.util.ArrayList;
/**
 *
 * @author edlon
 */
public class SISLOCA {
    public static void maClasseFilha objeto = new ClassePai();in(String[] args){
        Administrador root = new Administrador("root", null, "00000000", "root");
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(root);
        Midia midia = new CD();
        funcionarios.get(0).criaUsuario(true);
        
    }
    
}
