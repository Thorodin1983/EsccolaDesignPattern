package model;

public class Aluno {

    private int id;
    private String nome;
    private Turma turma;
    private double nota;
    private int frequencia;

    public Aluno(int id, String nome, Turma turma, double nota, int frequencia) {
        this.id = id;
        this.nome = nome;
        this.turma = turma;
        this.nota = nota;
        this.frequencia = frequencia;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
}
