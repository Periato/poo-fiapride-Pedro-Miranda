package br.com.fiapride.model;

public class Zoologico {

	private String nomeZoo;
	private Animal habitante;
	private Recinto moradia;
	
	public Zoologico(String nomeZoo, Animal habitante, Recinto moradia) {
        this.nomeZoo = nomeZoo;
        this.habitante = habitante;
        this.moradia = moradia;
    }
	
	// Getters para acessar as associações
    public String getNomeZoo() {
    	return this.nomeZoo; 
    	}
    public Animal getAnimal() {
    	return this.habitante; 
    	}
    public Recinto getRecinto() {
    	return this.moradia; 
    	}
}
