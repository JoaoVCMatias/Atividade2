/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import java.util.ArrayList;
import java.util.List;

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
        Caminhao c = new Caminhao();
        Navio v = new Navio();
        Helicoptero h = new Helicoptero();
        
        List<Brinquedo> list = new ArrayList(); 
        
        list.add(c);
        list.add(v);
        list.add(h);
        
        for(Brinquedo b : list){
            b.mover();
        }
       
    }
    
}
