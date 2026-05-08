package br.com.fiapride.main;

import br.com.fiapride.model.Animal;

public class SistemaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1 = new Animal();
		animal1.especie = "Leão";
		animal1.idade = 8;
		
		Animal animal2 = new Animal();
		animal2.especie = "Iguana";
		animal2.idade = 9;
	
	
		System.out.println("--- Sistema FiapRide ---");
        System.out.println("Espécie: " + animal1.especie + " | Idade" + animal1.idade);
        System.out.println("Espécie: " + animal2.especie + " | Idade" + animal2.idade);
	}

}
