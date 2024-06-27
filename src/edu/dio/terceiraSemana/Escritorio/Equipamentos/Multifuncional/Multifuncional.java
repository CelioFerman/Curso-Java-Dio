package edu.dio.terceiraSemana.Escritorio.Equipamentos.Multifuncional;

import edu.dio.terceiraSemana.Escritorio.Equipamentos.copiadora.Copiadora;
import edu.dio.terceiraSemana.Escritorio.Equipamentos.digitalizadora.Digitalizadora;
import edu.dio.terceiraSemana.Escritorio.Equipamentos.impressora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora {


    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento Multifuncional");

    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento Multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento Multifuncional");
    }
}
