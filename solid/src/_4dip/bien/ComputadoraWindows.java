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
public class ComputadoraWindows extends Computadora{

	public ComputadoraWindows( int ram, int almacenamiento){
		super("Windows",ram,almacenamiento);
	}

	public ComputadoraWindows(){
		super.SO = "Windows";
	}

}