package edu.dio.terceiraSemana.ProgramaMensagems;

import edu.dio.terceiraSemana.ProgramaMensagems.Apps.ServicoMensagemInstantanea;
import edu.dio.terceiraSemana.ProgramaMensagems.Apps.Telegram;
import edu.dio.terceiraSemana.ProgramaMensagems.Apps.FacebookMessenger;
import edu.dio.terceiraSemana.ProgramaMensagems.Apps.MSN;

public class MeuComputador {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        /* Não se sabe qual APP
        <Mas qualquer um deverá enviar e receber mensagem
         */

        String appEscolhido = "tlg";

        if (appEscolhido.equals("msn"))
            smi = new MSN();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();
        smi.enviarMensagem();
        smi.receberMensagem();


//        System.out.println("MSN");
//        MSN msn = new MSN();
//        msn.enviarMensagem();
//        msn.receberMensagem();
//
//        System.out.println("FCB");
//        FacebookMessenger fcb = new FacebookMessenger();
//        fcb.enviarMensagem();
//        fcb.receberMensagem();

//        System.out.println("TLG");
//        Telegram tlg = new Telegram();
//        tlg.enviarMensagem();
//        tlg.receberMensagem();
    }
}
