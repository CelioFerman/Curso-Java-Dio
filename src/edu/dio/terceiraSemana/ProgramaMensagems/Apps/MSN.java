package edu.dio.terceiraSemana.ProgramaMensagems.Apps;

public class MSN extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando o historico de Mensagems");
    }
}
