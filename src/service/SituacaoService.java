package service;

import model.Aluno;

public class SituacaoService {

    public String frequencia(Aluno aluno){
        if(aluno.getFrequencia()<75){
            return "Reprovado por falta";
        }

        return nota(aluno);
    }


    public String nota(Aluno aluno){
        if(aluno.getNota()<6){
            return "Reprovado por nota";
        }

        return "Aprovado";
    }



    public String processarSituacao(Aluno aluno){
        var frequencia = aluno.getFrequencia();
        var nota = aluno.getNota();


        if (frequencia < 75) {
            return "Reprovado por falta";
        }
        if (nota < 4) {
            return "Reprovado por nota";
        }
        if (nota < 7) {
            return "Exame";
        }
        return "Aprovado";
    }
}
