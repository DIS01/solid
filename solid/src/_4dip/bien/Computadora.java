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
public class Computadora {
    private int ram;
    private int almacenamiento;
    private String SO;

    public Computadora(String SO, int ram, int almacenamiento) {
        this.SO = SO;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public Computadora() {
        
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
}