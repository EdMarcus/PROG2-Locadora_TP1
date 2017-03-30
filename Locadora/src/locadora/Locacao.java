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
public class Locacao {
    private static int idLocacao = 0;
    private Data dataLoca;
    private Data dataDevolve;
    private Cliente cliente;
    private ArrayList<Midia> midiasLocadas;
    private String dependente = "";
    private boolean pagoAntecipado;
    private double precoLocacao;
    private int tipoMidia;
    private String atendente;

    public Locacao(Data dataLoca, Cliente cliente, boolean pagoAntecipado, String dependente, String atendente, ArrayList<Midia> midias) {
        this.dataLoca = dataLoca;
        this.cliente = cliente;
        this.pagoAntecipado = pagoAntecipado;
        this.dependente = dependente;
        idLocacao++;
        precoLocacao = 0;
        this.midiasLocadas = midias;
        for(Midia midia : midiasLocadas){
            if(midia instanceof DVD) tipoMidia = 1;
            else if(midia instanceof CD) tipoMidia = 2;
            else if(midia instanceof Game) tipoMidia = 3;
            if(pagoAntecipado) precoLocacao += Midia.getValorCategoria(2, tipoMidia);
            else precoLocacao += Midia.getValorCategoria(midia.getIdCategoria(), tipoMidia);
            
        }
        this.atendente = atendente;
    }
    
    public Locacao(Data dataLoca, Cliente cliente, boolean pagoAntecipado, String dependente, String atendente, Midia midia) {
        this.dataLoca = dataLoca;
        this.cliente = cliente;
        this.pagoAntecipado = pagoAntecipado;
        this.dependente = dependente;
        idLocacao++;
        this.midiasLocadas.add(midia);
        if(midia instanceof DVD) tipoMidia = 1;
        else if(midia instanceof CD) tipoMidia = 2;
        else if(midia instanceof Game) tipoMidia = 3;
        if(pagoAntecipado) precoLocacao = Midia.getValorCategoria(2, tipoMidia);
        else precoLocacao = Midia.getValorCategoria(midia.getIdCategoria(), tipoMidia);
        this.atendente = atendente;
        
    }

    public static int getIdLocacao() {
        return idLocacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDependente() {
        return dependente;
    }

    public void setDependente(String dependente) {
        this.dependente = dependente;
    }

    public boolean isPagoAntecipado() {
        return pagoAntecipado;
    }

    public void setPagoAntecipado(boolean pagoAntecipado) {
        this.pagoAntecipado = pagoAntecipado;
    }
    
    public Data getDataLoca() {
        return dataLoca;
    }

    public void setDataLoca(Data dataLoca) {
        this.dataLoca = dataLoca;
    }

    public Data getDataDevolve() {
        return dataDevolve;
    }

    public void setDataDevolve(Data dataDevolve) {
        this.dataDevolve = dataDevolve;
    }
    
    public int multa(){
        if(pagoAntecipado){
            if(dataDevolve.comparaDatas(dataLoca)>2){
                return 2*(dataDevolve.comparaDatas(dataLoca)-2);
            }
            else return 0;
        }else{
            if(dataDevolve.comparaDatas(dataLoca)>1){
                return 2*(dataDevolve.comparaDatas(dataLoca)-1);
            }
            else return 0;
        }
    }
    
    public void imprimeLocacao(){
        
        System.out.println("Locação: " + idLocacao);
        System.out.println("Cliente: " + cliente.getNome() + " \tCPF: " + cliente.getCpf());
        System.out.println("Data de locação: " + dataLoca.getDia() + "/" + dataLoca.getMes() + "/" + dataLoca.getAno());
        if(!(dataDevolve == null)) System.out.println("Data de devolução: " + dataDevolve.getDia() + "/" + dataDevolve.getMes() + "/" + dataDevolve.getAno());
        else System.out.println("NÃO FOI DEVOLVIDO AINDA!");
        if(!(dependente.contains(""))) System.out.println("Dependente: " + dependente);
        System.out.println("Midia locadas: ");
        for(Midia midia : midiasLocadas){
            if(midia instanceof DVD) System.out.println("TIPO DE MÍDIA: DVD");
            else if(midia instanceof CD) System.out.println("TIPO DE MÍDIA: CD");
            else if(midia instanceof Game) System.out.println("TIPO DE MÍDIA: GAME");
            midia.imprimeMidia();
            System.out.println("-----------------------");
        }
        System.out.println("Preço total da locação: " + precoLocacao);
        System.out.println("Atendente: " + atendente);
        
        
    }
}
