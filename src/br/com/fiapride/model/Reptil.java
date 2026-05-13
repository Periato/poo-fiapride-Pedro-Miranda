package br.com.fiapride.model;

public class Reptil extends Animal {
    private double temperaturaCorporal;

    public Reptil(String especie, String nome, double pesoInicial, double temperatura) {
        super(especie, nome, pesoInicial);
        this.temperaturaCorporal = temperatura;
    }

    public double getTemperaturaCorporal() {
    	return this.temperaturaCorporal; 
    	}
}
