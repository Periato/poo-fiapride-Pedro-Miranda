package br.com.fiapride.main;

import br.com.fiapride.model.*;
import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal {

    public static void main(String[] args) {
        
        // Criando os objetos específicos
        Mamifero animal1 = new Mamifero("Leão", "Simba", 180.0, "Dourado");
        Reptil animal2 = new Reptil("Cobra", "Kaa", 15.0, 28.0);
        Mamifero animal3 = new Mamifero("Cachorro", "Rex", 20.0, "Caramelo");

        // PASSO: Criar uma List tipada com a Superclasse
        List<Animal> listaAnimais = new ArrayList<>();
        
        // Adicionando objetos de tipos diferentes na mesma lista
        listaAnimais.add(animal1);
        listaAnimais.add(animal2);
        listaAnimais.add(animal3);

        System.out.println("--- Teste de Polimorfismo: O Coro do Zoo ---");

        // PASSO: Laço for chamando o mesmo método para todos
        for (Animal a : listaAnimais) {
            // O comando é o mesmo (.emitirSom), mas o resultado varia!
            a.emitirSom();
        }
    }
}