/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4dip.bien;

/**
 *
 * @author Luis Lama
 */
public class Programador {
    
    private Computadora computadora;
    
    /*
        Se está limitando a que el programador solo pueda utilziar 
        una computadora Windows, el programador debe tener total independencia
        para elegir su computadora
    */
    public Programador(Computadora computadora) {
        this.computadora = computadora;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
  
    
}
