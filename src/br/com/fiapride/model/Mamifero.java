package br.com.fiapride.model;

public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(String especie, String nome, double pesoInicial, String corPelo) {
        super(especie, nome, pesoInicial); // Passa os dados para o construtor de Animal
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
    	return this.corPelo; 
    	}
    
    @Override
    public void emitirSom() {
        System.out.println("O mamífero " + getNome() + " está rugindo ou vocalizando!");
    }
}