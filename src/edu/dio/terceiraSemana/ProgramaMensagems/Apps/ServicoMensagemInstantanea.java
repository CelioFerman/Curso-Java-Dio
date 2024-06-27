package edu.dio.terceiraSemana.ProgramaMensagems.Apps;

public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();

    public abstract void receberMensagem();


    public abstract void salvarHistoricoMensagem();

    //Somente os filhos conhecem esse metodo

    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }


//    public void enviarMensagem() {
//        validarConectadoInternet();
//        System.out.println("Enviando mensagem");
//        salvarHistoricoMensagem();
//    }
//
//    public void receberMensagem() {
//        System.out.println("Recebendo Mensagem");
//    }
//
//    private void validarConectadoInternet() {
//        System.out.println("Validando se está conectado a internet");
//    }
//
//    private void salvarHistoricoMensagem() {
//        System.out.println("Salvando o histórico da Mensagem");
//    }
}
