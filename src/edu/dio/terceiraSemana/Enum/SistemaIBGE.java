package edu.dio.terceiraSemana.Enum;
//Enums são valores já pré estabelecidos.
public class SistemaIBGE {
    public static void main(String[] args) {
        for (EstadoBrasileiro e: EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
        EstadoBrasileiro mg = EstadoBrasileiro.Minas_Gerais;
        System.out.println(mg.getNome());
        System.out.println(mg.getSigla());
        System.out.println(mg.getNomeMaiusculo());
        System.out.println(mg.getIbge());
    }
}
