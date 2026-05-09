package br.com.fiapride.main;

import br.com.fiapride.model.Animal;

public class SistemaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1 = new Animal("Leão", "Scar", 190.0);
		Animal animal2 = new Animal("Iguana", "Irineu", 2.0);
		
		System.out.println("--- Sistema FiapRide ---");
        System.out.println("Animal 1: " + animal1.nome + " | Espécie: " + animal1.especie + " | Peso " + animal1.peso);
        System.out.println("Animal 2: " + animal2.nome + " | Espécie: " + animal2.especie + " | Peso " + animal2.peso);
        
        // ---Testes animal 1 (Scar)---
        System.out.println("\n>>>Testando: " + animal1.nome);
        
        // Teste válido: Fazendo aniversário de 2 anos
        animal1.fazerAniversario(2);
        
        // Teste inválido: Alimentação excessiva (25kg é > 10% de 190kg)
        animal1.alimentar(25.0);
        
        // ---Testes animal 2 (Irineu)---
        System.out.println("\n>>>Testando: " + animal2.nome);
        
        // Teste válido: Alimentação leve (0.1kg é 5% de 2kg)
        animal2.alimentar(0.1);
        
        // Teste inválido: Idade negativa
        animal2.fazerAniversario(-5);
        
        // --- STATUS FINAL ---
     		System.out.println("\n--- Resumo Atualizado Sistema FiapRide ---");
            System.out.println("Espécie: " + animal1.especie + " | Nome: " + animal1.nome + " | Idade: " + animal1.idade + " | Peso: " + animal1.peso + "kg");
            System.out.println("Espécie: " + animal2.especie + " | Nome: " + animal2.nome + " | Idade: " + animal2.idade + " | Peso: " + animal2.peso + "kg");
	}

}
