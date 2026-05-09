package br.com.fiapride.model;

public class Animal {
	public String especie;
	public String nome;
	public double peso;
	public int idade;
	
	
	public Animal(String especie, String nome, double pesoInicial) {
		this.especie = especie;
		this.nome = nome;
		this.peso = pesoInicial;
		this.idade = 0;
	}
	
	// Método 1: Envelhecer o animal
	// Regra de negócio: O animal só pode envelhecer uma quantidade positiva de anos.
	public void fazerAniversario(int anos) {
		if (anos > 0) {
			this.idade += anos;
			System.out.println(nome + " agora tem " + idade + " anos!");
		} else {
			System.out.println("Erro: A quantidade de anos para envelhecer deve ser maior que zero.");
		}
	}
	// Método 2: Alteração de peso
	// Regra de negócio: O ganho de peso deve ser positivo e não pode exceder 10% do peso atual
	public void alimentar(double quantidadeComida) {
		if (quantidadeComida > 0 && quantidadeComida <= (this.peso * 0.10)) {
			this.peso += quantidadeComida;
			System.out.println(nome + " comeu " + quantidadeComida + "kg. Peso atual: " + this.peso + "kg.");
		} else if (quantidadeComida > (this.peso * 0.10)){
			System.out.println("A quantidade de comida é excessiva.");
		} else {
			System.out.println("Erro: a quantidade de comida deve ser maior que zero!");
		}
	}
}