package edu.dio.terceiraSemana.Escritorio.Loja;

import edu.dio.terceiraSemana.Escritorio.Equipamentos.Multifuncional.Multifuncional;
import edu.dio.terceiraSemana.Escritorio.Equipamentos.copiadora.Copiadora;
import edu.dio.terceiraSemana.Escritorio.Equipamentos.digitalizadora.Digitalizadora;
import edu.dio.terceiraSemana.Escritorio.Equipamentos.impressora.Impressora;

import java.lang.invoke.MutableCallSite;

public class Loja {
    public static void main(String[] args) {
        Multifuncional mf = new Multifuncional();
        Impressora impressora = mf;
        Digitalizadora digitalizadora = mf;
        Copiadora copiadora = mf;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
