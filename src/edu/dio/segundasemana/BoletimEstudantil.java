package edu.dio.segundasemana;

public class BoletimEstudantil {

    public static void main(String[] args) {

        // Com Indentação
        int nota = 10;

        if (nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota <= 7)
            System.out.println("Prova Recupeção");

        else
            System.out.println("Reprovado");

        // Sem Indentação!

        // int mediaFinal = 7;
        // if(mediaFinal<6)
        // System.out.println("Reprovado");
        // else if(mediaFinal == 6)
        // System.out.println("Prova Minerva");
        // else
        // System.out.println("Aprovado");

    }

}
