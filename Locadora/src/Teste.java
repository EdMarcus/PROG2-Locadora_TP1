/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edlon
 */

import java.util.*;

public class Teste {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setDependente("Eduardo");
        cliente.setDependente("José");
        cliente.setDependente("Alberto");
        cliente.setDependente("Noé");
        cliente.setDependente("Carlos");
        
        System.out.println(cliente.getDependentes());
        System.out.println(cliente.getDependenteI(4));
        cliente.imprimeDependentes();
        cliente.delDependente(1);
        //Limpa.tela();
        cliente.imprimeDependentes();
    }
}