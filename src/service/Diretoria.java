package service;

import builder.Builder;
import model.Turma;

public class Diretoria {

    public void cadastroAluno(Builder builder){
        builder.setNome("Lucas");
        builder.setTurma(Turma.A);
        builder.setNota(9);
        builder.setFrequencia(80);
    }

}
