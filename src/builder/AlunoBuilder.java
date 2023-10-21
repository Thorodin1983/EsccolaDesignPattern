package builder;

import model.Aluno;
import model.Turma;

public class AlunoBuilder implements  Builder {

    private int id;
    private String nome;
    private Turma turma;
    private double nota;
    private int frequencia;



    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public Aluno getResult(){
        return new Aluno(id, nome, turma, nota, frequencia);
    }
}
