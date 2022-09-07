/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author joao
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Loja l = new Loja("TI SOLUÇÕES", "TI", "09-09-2022");
        Vendedor n = new Vendedor();
        n.setNome("Joao");
        n.setIdade(21);
        l.admitirVendedor(n);
        System.out.println(l.getVendendor());
        l.getVendendor().vender();
        l.demitirVendedor();
    }
    
}
