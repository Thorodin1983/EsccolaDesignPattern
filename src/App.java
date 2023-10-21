import builder.AlunoBuilder;
import model.Aluno;
import service.Diretoria;
import service.SituacaoService;

public class App {
    public static void main(String[] args) throws Exception {

        Diretoria diretor = new Diretoria();

        AlunoBuilder alunoBuilder = new AlunoBuilder();

        diretor.cadastroAluno(alunoBuilder);

        Aluno aluno = alunoBuilder.getResult();

        System.out.println("ID:"+aluno.getId()+"\nNome:"+aluno.getNome()+"\nTurma:"+aluno.getTurma()+"\nNota:"+aluno.getNota()+"\nFrequência:"+aluno.getFrequencia());

        SituacaoService valida = new SituacaoService();

        System.out.println(valida.frequencia(aluno));

    }


}
