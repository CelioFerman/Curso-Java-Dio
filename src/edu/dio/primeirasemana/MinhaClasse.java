package edu.dio.primeirasemana;
public class MinhaClasse {
    public static void main (String[] args){
        
        String primeiroNome = "Célio";
        String segundonome = "Ferman";

        String nomeCompleto = nomeCompleto(primeiroNome, segundonome);
        // System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
