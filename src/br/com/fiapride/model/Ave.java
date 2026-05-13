package br.com.fiapride.model;

public class Ave extends Animal implements Treinavel {
    private double envergaduraAsa;

    public Ave(String especie, String nome, double pesoInicial, double envergaduraAsa) {
        super(especie, nome, pesoInicial);
        this.envergaduraAsa = envergaduraAsa;
    }
    
    public double getEnvergaduraAsa() {
    	return this.envergaduraAsa;
    }

    @Override
    public void identificar() {
        System.out.println("Sou a ave " + getNome() + " (Espécie: " + getEspecie() + ")");
    }

    @Override
    public void executarComando(String comando) {
        System.out.println("A ave " + getNome() + " voou em círculos para executar o comando: " + comando);
    }

    @Override
    public void recompensar() {
        System.out.println("Dando sementes premium para " + getNome());
    }
}