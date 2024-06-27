package edu.dio.terceiraSemana.Enum;

public enum EstadoBrasileiro {
    Sao_Paulo("SP", "São Paulo", 33),
    Rio_Janeiro("RJ", "Rio de Janeiro", 20),
    Minas_Gerais("MG", "Minas Gerais", 15),
    Espirito_Santo("ES", "Espirito Santo", 10),
    CEARA("CE", "Ceara", 11);


    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
