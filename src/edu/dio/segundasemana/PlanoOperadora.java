package edu.dio.segundasemana;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";

        // if(plano == "B") {
        // System.out.println("150 minutos de ligação.");
        // }else if(plano == "M"){
        // System.out.println("130 minutos de ligação");
        // System.out.println("Whatsapp e instagram gratis.");
        // }else if(plano == "T"){
        // System.out.println("110 minutos de ligação ");
        // System.out.println("Whatsapp e instagram gratis.");
        // System.out.println("5GB Youtube");
        // }

        // Mesmo caso Acima porem utilizando swicth and case
        switch (plano) {
            case "T": {
                System.out.println("110 minutos de ligação ");
                System.out.println("Whatsapp e instagram gratis.");
                System.out.println("5GB Youtube");
                break;
            }
            case "M": {
                System.out.println("130 minutos de ligação");
                System.out.println("Whatsapp e instagram gratis.");
                break;
            }case "B": {
                System.out.println("150 minutos de ligação.");
                break;
            }

            default:
                break;
        }
    }

}
