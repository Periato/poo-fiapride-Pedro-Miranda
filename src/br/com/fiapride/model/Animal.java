package br.com.fiapride.model;

public class Animal {
	private String especie;
	private String nome;
	private double peso;
	private int idade;
	
	public Animal(String especie, String nome, double pesoInicial) {
		this.especie = especie;
		this.setNome(nome);
		this.setPeso(pesoInicial);
		this.setIdade(0);
	}
	
	public String getEspecie() { 
		return this.especie;
		}
    public String getNome() { 
    	return this.nome; 
    	}
    public double getPeso() { 
    	return this.peso; 
    	}
    public int getIdade() { 
    	return this.idade; 
    	}
    
 // REGRA NO SET: O nome deve ter pelo menos 3 caracteres e não ser nulo
    public void setNome(String nome) {
        if (nome != null && nome.trim().length() >= 3) {
            this.nome = nome;
        } else {
            System.out.println("Erro: O nome deve ter no mínimo 3 caracteres válidos.");
            // Define um nome padrão caso a entrada seja inválida
            if (this.nome == null) this.nome = "Sem Nome";
        }
    }
    
    private void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        } else {
            System.out.println("Erro: O peso não pode ser negativo!");
        }
    }
    
    private void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Erro: A idade não pode ser negativa!");
        }
    }    
	
	// Método 1: Envelhecer o animal
	// Regra de negócio: O animal só pode envelhecer uma quantidade positiva de anos.
	public void fazerAniversario(int anos) {
		if (anos > 0) {
			this.setIdade(this.idade + anos);
			System.out.println(this.nome + " agora tem " + this.idade + " anos!");
		} else {
			System.out.println("Erro: A quantidade de anos para envelhecer deve ser maior que zero.");
		}
	}
	// Método 2: Alteração de peso
	// Regra de negócio: O ganho de peso deve ser positivo e não pode exceder 10% do peso atual
	public void alimentar(double quantidadeComida) {
		if (quantidadeComida > 0 && quantidadeComida <= (this.peso * 0.10)) {
			this.setPeso(this.peso + quantidadeComida);
			System.out.println(this.nome + " comeu e agora pesa " + this.peso + "kg.");
		} else if (quantidadeComida > (this.peso * 0.10)){
			System.out.println("A quantidade de comida é excessiva.");
		} else {
			System.out.println("Erro: a quantidade de comida deve ser maior que zero!");
		}
	}
}