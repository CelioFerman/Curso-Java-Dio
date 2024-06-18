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
}
