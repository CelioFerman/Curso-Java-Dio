package edu.dio.primeirasemana;

public class OperadoresLogicos {

    public static void main(String[] args) {

        // Concatenação com numeros e Strings.

        String concatenacao = "?";

        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(concatenacao);

        // ---------------------------------------
        // Numero negativo ou positivo
        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        // ---------------------------------------

        // Incremento e Decremento
        int numero1 = 5;
        numero1++;
        System.out.println(numero1);
        System.out.println(numero1);

        // --------------------------------
        // negando o valor de uma condição verdadeira ou falsa.
        boolean verdadeiraFalsa = true;
        System.out.println(verdadeiraFalsa);

        verdadeiraFalsa = !verdadeiraFalsa;
        System.out.println(verdadeiraFalsa);

        // -------------------------------------------
        // Utilizando o operador ternário.
        int a, b;

        a = 5;

        b = 6;

        // a = 6;

        String resultado = a == b ? "verdadeiro" : "falso";

        // if(a==b) {
        // resultado = "verdadeiro";
        // }else {
        // resultado = "falso";
        // }
        System.out.println(resultado);

        // -------------------------------------
        // Utilizando operadores relacionais.

        int numeroUm = 1;
        int numeroDois = 2;

        boolean simNao = numeroUm == numeroDois;

        if (numeroUm < numeroDois) {
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numeroUm != numeroDois;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numeroUm > numeroDois;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        simNao = numeroUm < numeroDois;

        System.out.println("numeroUm é menor que numeroDois? " + simNao);

        // -------------------------------------------------------------------
        // Operadores relacionais com objetos.

        String nomeUm = "Célio";
        String nomeDois = "Célio";
        nomeDois = new String("Célio");

        System.out.println(nomeUm.equals(nomeDois));

        // -------------------------------------------------------
        // Utilizando os operadores lógicos && e ||;
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira.");

            condicao2 = true;

            if (condicao1 && condicao2) {
                System.out.println("As duas condições são verdadeiras.");
            }

            if(condicao1 && 10 > 9){
                System.out.println("Ambas são verdadeiras.");
            }

        }

    }
}
