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
    
    @Override
    public void emitirSom() {
        System.out.println("O réptil " + getNome() + " está sibilando (fazendo 'hiss')!");
    }
}
