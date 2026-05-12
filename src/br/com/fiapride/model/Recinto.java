package br.com.fiapride.model;

public class Recinto {
    
    private String bioma;          // Ex: Savana, Ártico, Floresta Tropical
    private int capacidadeMaxima;  // Quantidade máxima de animais
    private int quantidadeAtual;   // Quantidade de animais presentes agora

    // CONSTRUTOR
    public Recinto(String bioma, int capacidadeMaxima) {
        this.bioma = bioma;        // Bioma é imutável após a criação (sem set público)
        this.setCapacidadeMaxima(capacidadeMaxima);
        this.quantidadeAtual = 0;  // Todo recinto começa vazio
    }

    // --- MÉTODOS GET ---
    public String getBioma() {
    	return this.bioma; 
    	}
    public int getCapacidadeMaxima() {
    	return this.capacidadeMaxima; 
    	}
    public int getQuantidadeAtual() {
    	return this.quantidadeAtual; 
    	}

    // --- MÉTODOS SET (Privados para controle interno) ---

    private void setCapacidadeMaxima(int capacidade) {
        if (capacidade > 0) {
            this.capacidadeMaxima = capacidade;
        } else {
            System.out.println("Erro: A capacidade deve ser no mínimo 1.");
            this.capacidadeMaxima = 1; // Valor padrão de segurança
        }
    }

    // --- MÉTODOS DE NEGÓCIO (Regras de Lotação) ---

    // Método para adicionar animal
    public void adicionarAnimal(Animal animal) {
        if (this.quantidadeAtual < this.capacidadeMaxima) {
            this.quantidadeAtual++;
            System.out.println(animal.getNome() + " foi alocado no recinto de " + this.getBioma());
        } else {
            System.out.println("Lotação esgotada no bioma " + this.getBioma());
        }
    }

    // Método para remover animal
    public void removerAnimal() {
        if (this.quantidadeAtual > 0) {
            this.quantidadeAtual--;
            System.out.println("Um animal foi removido. Espaço disponível agora: " + (this.capacidadeMaxima - this.quantidadeAtual));
        } else {
            System.out.println("Erro: O recinto já está vazio.");
        }
    }
}