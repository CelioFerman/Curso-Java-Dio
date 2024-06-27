package edu.dio.terceiraSemana.Veiculo;

public class Carro extends  Veiculos{

    public void ligar() {
        // Encapsulamento
        confereCambio();
        confereCombustivel();
        System.out.println("Carro Ligado");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustivel");
    }

    private void confereCambio() {
        System.out.println("Conferindo cambio em P");
    }

}
