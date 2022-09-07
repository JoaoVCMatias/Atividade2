/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author joao
 */
public abstract class Brinquedo {
    protected double velocidade;
    protected double aceleracao;
    
    public abstract void mover();
    
    public abstract void velocidade(int vel);
    
    public abstract void velocidade(double vel);
    
    public abstract void velocidade(double vel, double acel);
    
}
