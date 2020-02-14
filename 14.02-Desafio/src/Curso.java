import java.util.List;
import java.util.Objects;

public class Curso {
    private String nome;
    private int codigoDeCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private int quantidadeMaximaDeAlunos;
    private List<String> listaDeAlunos;

    public Curso() {

    }

    public Curso(String nome, int codigoDeCurso, int quantidadeMaximaDeAlunos) {
        this.nome = nome;
        this.codigoDeCurso = codigoDeCurso;
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
    }

    public Boolean adicionarUmAluno(Aluno umAluno) {
        return quantidadeMaximaDeAlunos > listaDeAlunos.size();
    }

    public void excluirAluno(Aluno umAluno) {
        for(int i = 0; i < listaDeAlunos.size(); i++) {
            if(umAluno.equals(getListaDeAlunos(i))) {
                listaDeAlunos.remove(i);
            } else {
                System.out.println("Este aluno ainda não está matriculado.");
            }
        }
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoDeCurso() {
        return codigoDeCurso;
    }

    public void setCodigoDeCurso(int codigoDeCurso) {
        this.codigoDeCurso = codigoDeCurso;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public int getQuantidadeMaximaDeAlunos() {
        return quantidadeMaximaDeAlunos;
    }

    public void setQuantidadeMaximaDeAlunos(int quantidadeMaximaDeAlunos) {
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
    }

    public List<String> getListaDeAlunos(int i) {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<String> listaDeAlunos) {
       this.listaDeAlunos = listaDeAlunos;
    }
}