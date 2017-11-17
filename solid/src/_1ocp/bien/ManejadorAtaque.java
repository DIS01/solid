/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bien;


/**
 *
 * @author Palacios
 */
public class ManejadorAtaque {
	
	private Pokemon pokemon;
 
    public  void ataqueTipo(AtaqueTipo tipo){
    	this.pokemon.setPorcentajeVida(this.pokemon.getPorcentajeVida()*tipo.porcentajeAtaque());  
    }
    
    public ManejadorAtaque(Pokemon pokemon) {
        this.setPokemon(pokemon);
}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
}
