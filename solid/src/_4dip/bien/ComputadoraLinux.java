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
public class ComputadoraLinux extends Computadora{

	public ComputadoraLinux( int ram, int almacenamiento){
		super("Linux",ram,almacenamiento);
	}

	public ComputadoraLinux(){
		super.SO = "Linux";
	}
}