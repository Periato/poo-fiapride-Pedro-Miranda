package br.com.fiapride.main;

import br.com.fiapride.model.Animal;
import br.com.fiapride.model.Recinto;
import br.com.fiapride.model.Zoologico;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // Criando os objetos simples primeiro
        Animal animal1 = new Animal("Leão", "Simba", 150.0);
        Recinto recinto1 = new Recinto("Savana", 5);

        // PASSO 2 e 3: Criando a Associação
        // O objeto 'meuZoo' agora contém (TEM UM) animal e um recinto.
        Zoologico meuZoo = new Zoologico("Fiap Zoo Park", animal1, recinto1);

        System.out.println("--- Sistema FiapRide: Gestão de Zoológico ---");
        
        // PASSO 4: Teste imprimindo um dado do objeto associado
        // Navegamos: meuZoo -> pega o objeto animal -> pega o nome do animal
        System.out.println("Zoológico: " + meuZoo.getNomeZoo());
        System.out.println("Animal registrado: " + meuZoo.getAnimal().getNome());
        
        // Navegamos: meuZoo -> pega o objeto recinto -> pega o bioma
        System.out.println("Localizado no Recinto: " + meuZoo.getRecinto().getBioma());
    }
}