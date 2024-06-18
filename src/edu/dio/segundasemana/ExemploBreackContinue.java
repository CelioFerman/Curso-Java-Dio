package edu.dio.segundasemana;

public class ExemploBreackContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){
            if (numero == 3) 
            // break; utilizando o breack o programa para na condição if acima.
            continue; // utilizando o continue o programa para no numero 3, porem continua retornando os outros numeros.

            System.out.println(numero);
        }
    }
    
}
