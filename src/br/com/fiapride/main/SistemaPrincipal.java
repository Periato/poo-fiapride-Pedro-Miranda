package br.com.fiapride.main;

import br.com.fiapride.model.Animal;
import br.com.fiapride.model.Recinto;
import br.com.fiapride.model.Zoologico;
import br.com.fiapride.model.Mamifero;
import br.com.fiapride.model.Reptil;

public class SistemaPrincipal {

    public static void main(String[] args) {
        
        // Criando as instâncias
        Mamifero cachorro = new Mamifero("Cão", "Rex", 20.0, "Caramelo");
        Reptil tartaruga = new Reptil("Tartaruga", "Donatello", 5.0, 25.5);

        System.out.println("--- Prova Técnica de Herança ---");

        // PROVA 1: Chamando getEspecie()
        // Note que NÃO existe getEspecie em Mamifero.java, mas o código funciona!
        System.out.println("Espécie do Mamífero: " + cachorro.getEspecie()); 
        
        // PROVA 2: Chamando getNome()
        // O método está definido apenas na classe Animal.java
        System.out.println("Nome do Réptil: " + tartaruga.getNome());

        // PROVA 3: Executando lógica de negócio herdada
        // O método alimentar() com a regra dos 10% está na classe mãe.
        cachorro.alimentar(1.0); // 1kg é exatamente 5% de 20kg (Válido)
        
        System.out.println("\n--- Dados Específicos das Filhas ---");
        System.out.println("Cor do pelo do " + cachorro.getNome() + ": " + cachorro.getCorPelo());
        System.out.println("Temperatura da " + tartaruga.getNome() + ": " + tartaruga.getTemperaturaCorporal() + "°C");
    }
}