/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author joao
 */
public class ControleRemoto {
    private Brinquedo b;

    public void setB(Brinquedo b) {
        this.b = b;
    }
    
    public void mover(){
        b.mover();
    }
    
    
}
