package br.com.fiapride.main;

import br.com.fiapride.model.*;

public class SistemaPrincipal {

    public static void main(String[] args) {
        
        // Instanciando nossos objetos
        Ave falcao = new Ave("Falcão", "Horus", 1.2, 1.10);
        DroneVigilancia drone = new DroneVigilancia("SKY-01");

        System.out.println("=== FIAPRIDE: Teste de Interfaces ===\n");

        // --- Seção: Treinando Tudo (Equivalente ao Recarregando Tudo) ---
        System.out.println("=== Treinando Tudo ===");
        
        // Usando polimorfismo de interface
        Treinavel[] unidades = {falcao, drone};
        for (Treinavel u : unidades) {
            u.executarComando("PATRULHAR");
            System.out.println("---");
        }

        // --- Seção: Múltiplos Tipos (Uso de instanceof) ---
        System.out.println("\n=== Múltiplos Tipos ===");
        
        System.out.println("Falcão é um Animal? " + (falcao instanceof Animal));
        System.out.println("Falcão é Treinável? " + (falcao instanceof Treinavel));
        
        System.out.println("Drone é um Animal? " + (Animal.class.isInstance(drone)));
        System.out.println("Drone é Treinável? " + (drone instanceof Treinavel));

        // --- Seção: Dados Específicos da Ave (Equivalente à Autonomia do Carro) ---
        System.out.println("\n=== Atributos da Ave ===");
        System.out.println("Envergadura: " + falcao.getEnvergaduraAsa() + " metros.");

        // --- Seção: Identificação (Equivalente à Bateria do Celular) ---
        System.out.println("\n=== Identificação do Drone ===");
        System.out.println("ID: " + drone.getIdDrone());
    }
}