package edu.dio.segundasemana;

import java.util.Locale;
import java.util.Scanner;

public class EstruturasRepeticoes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 25.0;

        System.out.println("Digite o valor solicitado: ");

        double valorSolicitado = scanner.nextDouble();

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);

        }else {
            System.out.println("Saldo não compativel ao valor solicitado");
        }
    }
// public class ResultadoEscolar {

//     public static void main(String[] args) {
//         int nota = 5;
//         String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

//         System.out.println(resultado);
//     }

// }
}
