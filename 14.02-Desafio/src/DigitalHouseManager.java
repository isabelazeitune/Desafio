import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DigitalHouseManager {
    private List<Aluno> listaDeAlunos = new ArrayList<>();
    private List<Professor> listaDeProfessores = new ArrayList<>();
    private List<Curso> listaDeCursos = new ArrayList<>();
    private List<Matricula> listaDeMatricula = new ArrayList<>();


    public DigitalHouseManager() {

    }

    //public DigitalHouseManager(List<Aluno> listaDeAlunos, List<Professor> listaDeProfessores, List<Curso> listaDeCursos, List<Matricula> listaDeMatricula) {
    //    this.listaDeAlunos = listaDeAlunos;
    //    this.listaDeProfessores = listaDeProfessores;
    //    this.listaDeCursos = listaDeCursos;
    //    this.listaDeMatricula = listaDeMatricula;
    //}

    public void registrarCurso(String nome, int codigoCurso, int quantidadeMaximaDeAlunos) {
        int contador = 0;
            Curso curso1 = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        for (Curso curso : this.listaDeCursos) {
            if (curso.getCodigoDeCurso() == codigoCurso) {
                contador += 1;
            }
        }
        if(contador == 0) {
            listaDeCursos.add(curso1);
            System.out.println("O curso " + curso1.getNome() + " foi adicionado com sucesso!");
        } else {
            System.out.println("O curso " + curso1.getNome() + " já existe!");
        }
    }

    public void excluirCurso(int codigoCurso) {
        int contador = 0;
        for(Curso curso : this.listaDeCursos) {
            if (codigoCurso == curso.getCodigoDeCurso()) {
                contador += 1;
                codigoCurso = 0;
            }
        }
        if(contador != 0) {
            this.listaDeCursos.remove(codigoCurso = 0);
            System.out.println("Curso deletado com sucesso!");
        } else {
            System.out.println("Este curso ainda não existe!");
        }
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public List<Professor> getListaDeProfessores() {
        return listaDeProfessores;
    }

    public void setListaDeProfessores(List<Professor> listaDeProfessores) {
        this.listaDeProfessores = listaDeProfessores;
    }

    public List<Curso> getListaDeCursos() {
        return listaDeCursos;
    }

    public void setListaDeCursos(List<Curso> listaDeCursos) {
        this.listaDeCursos = listaDeCursos;
    }

    public List<Matricula> getListaDeMatricula() {
        return listaDeMatricula;
    }

    public void setListaDeMatricula(List<Matricula> listaDeMatricula) {
        this.listaDeMatricula = listaDeMatricula;
    }
}
