package edu.dio.segundasemana;

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            // Executando repetidas vezes até alguém atender.
            System.out.println("Telefone tocando");
        } while (telefoneTocando());
        
        System.out.println("Alô");

    }

    private static boolean telefoneTocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }

}
