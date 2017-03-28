/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;
import java.util.*;
import java.text.*;
import java.lang.Integer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuário
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes= mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
       
    // Retorna a diferença em dias entre outro objeto data e o próprio.
    public int comparaDatas(Data data) {
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        df.setLenient(false);
        Date d1 = null;
        Date d2 = null;
        try {
            d1 = df.parse(Integer.toString(dia) + "/" + Integer.toString(mes) + "/" + Integer.toString(ano));
            d2 = df.parse(Integer.toString(data.getDia()) + "/" + Integer.toString(data.getMes()) + "/" + Integer.toString(data.getAno()));
        } catch (ParseException e) {
            e.getMessage();
        }
        
        long dt = (d2.getTime() - d1.getTime()) + 3600000; // 1 hora para compensar horário de verão
        return (int)(dt / 86400000L);
    }
}
