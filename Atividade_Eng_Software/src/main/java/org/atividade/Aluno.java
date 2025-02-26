package org.atividade;

public class Aluno {
    private String nome;
    private int np1;
    private int np2;
    private int np3;

    public Aluno(String nome, int np1, int np2) {
        this.nome = nome;
        this.np1 = np1;
        this.np2 = np2;
    }

    public String getNome() {
        return nome;
    }

    public int getNp1() {
        return np1;
    }

    public int getNp2() {
        return np2;
    }

    public int getNp3() {
        return np3;
    }
}
