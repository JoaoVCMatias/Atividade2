/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author joao
 */
public class Loja {
    private String nome;
    private String ramo;
    private String anoFundacao;
    private Vendedor vendedor;

    public Loja(String nome, String ramo, String anoFundacao) {
        this.nome = nome;
        this.ramo = ramo;
        this.anoFundacao = anoFundacao;
        this.vendedor = new Vendedor();
    }

    
    
    
    public void admitirVendedor(Vendedor vendedor){
        System.out.println("Adimitindo " + vendedor.getNome());
        this.vendedor = vendedor;
    }
    public void demitirVendedor(){
        System.out.println("Demitindo " + this.vendedor.getNome());
        this.vendedor = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public String getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(String anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public Vendedor getVendendor() {
        return vendedor;
    }

    public void setVendendor(Vendedor vendendor) {
        this.vendedor = vendendor;
    }

    @Override
    public String toString() {
        return "Loja{" + "nome=" + nome + ", ramo=" + ramo + ", anoFundacao=" + anoFundacao + ", vendedor=" + vendedor + '}';
    }
    
    
    
    
}
