package br.com.fiapride.main;

import br.com.fiapride.model.*;
import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal {

    public static void main(String[] args) {
        

        // --- TESTE DE FUNCIONAMENTO ---
        List<Animal> zoo = new ArrayList<>();
        
        zoo.add(new Mamifero("Leão", "Simba", 180.0, "Dourado"));
        zoo.add(new Reptil("Cobra", "Kaa", 15.0, 30.0));
        zoo.add(new Mamifero("Cachorro", "Rex", 20.0, "Caramelo"));

        System.out.println("=== FIAPRIDE: Teste de Classes Abstratas ===");
        
        for (Animal animal : zoo) {
            // Chamando o método abstrato implementado nas filhas
            animal.identificar();
        }

        System.out.println("\n=== Polimorfismo com Classe Abstrata ===");
        for (Animal animal : zoo) {
            animal.identificar();
            System.out.println("---");
        }
    }
}