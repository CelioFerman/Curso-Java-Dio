package edu.dio.terceiraSemana.Veiculo;

public class Autodromo {
    public static void main(String[] args) {
        Carro argo = new Carro();
        argo.setChassi("726434");
        //argo.ligar();

        Moto CB600 = new Moto();
        CB600.setChassi("378468");
        //CB600.ligar();

        Veiculos qualquerVeiculo = CB600;
        qualquerVeiculo.ligar();
    }
}
