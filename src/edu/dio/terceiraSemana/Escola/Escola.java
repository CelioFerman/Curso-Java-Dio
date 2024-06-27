package edu.dio.terceiraSemana.Escola;

public class Escola {
    public static void main(String[] args) {
        edu.dio.terceiraSemana.Escola.Aluno felipe = new edu.dio.terceiraSemana.Escola.Aluno();
        felipe.setNome("Felipe Junior");
        felipe.setIdade(11);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos. ");

    }
}