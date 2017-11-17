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
public class ComputadoraMAC extends Computadora{

	public ComputadoraMAC( int ram, int almacenamiento){
		super("MAC",ram,almacenamiento);
	}

	public ComputadoraMAC(){
		super.SO = "MAC";
	}

}