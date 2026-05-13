package br.com.fiapride.model;

public class DroneVigilancia implements Treinavel {
    private String idDrone;

    public DroneVigilancia(String idDrone) {
        this.idDrone = idDrone;
    }
    
    public String getIdDrone() {
        return this.idDrone;
    }

    @Override
    public void executarComando(String comando) {
        System.out.println("Sistema do Drone " + idDrone + " recebeu o sinal: " + comando);
        System.out.println("Drone estabilizado em altitude de cruzeiro.");
    }

    @Override
    public void recompensar() {
        System.out.println("Retornando à base para troca de bateria.");
    }
}