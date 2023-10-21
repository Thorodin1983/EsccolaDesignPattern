package builder;

import model.Turma;

public interface Builder {
    void setId(int id);
    void setNome(String nome);
    void setTurma(Turma turma);
    void setNota(double nota);
    void setFrequencia(int frequencia);
}
