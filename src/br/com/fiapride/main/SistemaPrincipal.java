package br.com.fiapride.main;

import br.com.fiapride.model.Animal;

public class SistemaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1 = new Animal("Leão", "Scar", 150.0);
		Animal animal2 = new Animal("Iguana", "Irineu", 2.0);
		
		System.out.println("--- Sistema FiapRide ---");
        System.out.println("Animal 1: " + animal1.getNome() + " | Espécie: " + animal1.getEspecie() + " | Peso " + animal1.getPeso() + "kg.");
        System.out.println("Animal 2: " + animal2.getNome() + " | Espécie: " + animal2.getEspecie() + " | Peso " + animal2.getPeso() + "kg.");
        
     // --- TESTES DE SUCESSO (Valores Válidos) ---
        System.out.println("\n--- Realizando Operações Válidas ---");
        System.out.println("Regarga de idade para " + animal1.getNome());
        animal1.fazerAniversario(2);
        
        System.out.println("Alimentando " + animal2.getNome());
        animal2.alimentar(0.1); // 100g para uma iguana de 2kg (OK)

        // --- TESTES DE ERRO (Valores Inválidos / Inconsistência) ---
        System.out.println("\n--- Testando Regras de Segurança (Erros) ---");
        
        // Testando a regra do setNome
        System.out.println("Tentando mudar nome para 'Al':");
        animal1.setNome("Al"); // Deve cair na nossa regra de < 3 caracteres
        System.out.println("Nome atual: " + animal1.getNome());
        
        System.out.print("Tentativa de envelhecimento inválido: ");
        animal1.fazerAniversario(-1);

        System.out.print("Tentativa de super-alimentação: ");
        animal1.alimentar(80.0); // 80kg é muito mais que 10% de 150kg

        // --- STATUS FINAL (RESUMO) ---
        System.out.println("\n--- Sistema FiapRide: Resumo Final ---");
        // Exibindo os dados atualizados usando GET
        System.out.println("Animal: " + animal1.getNome() + " | Idade: " + animal1.getIdade() + " | Peso: " + animal1.getPeso() + "kg");
        System.out.println("Animal: " + animal2.getNome() + " | Idade: " + animal2.getIdade() + " | Peso: " + animal2.getPeso() + "kg");
    }
}