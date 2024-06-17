package edu.dio.primeirasemana;

public class TiposVariaveis {

    public static void main(String[] args) {
        //Tipos Primitivos

        

        double salarioMinimo = 2.5;
        // System.out.println(salarioMinimo);

        int numero = 1;
        numero = 4;
        // System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
        // System.out.println(VALOR_DE_PI);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        // System.out.println(numeroCurto2);
        // acontecera um erro se o (short) não receber um cast,
        // pois a variaveis recebe um valor maior do que short. O correto seria mudar
        // para int

        String meuNome = "Celio Fermano" ;
        // System.out.println(meuNome);

    }
}

/*
 * byte idade = 123;
 * short ano = 2021;
 * int cep = 46902057;
 * long cpf = 18190610070L; do tipo long sempre encerre com (L);
 * float pi = 3.14F; Se for do tipo float encerre sempre com um (F);
 * double salario = 1275.33
 */