public class Professor {
    private String nome;
    private String sobrenome;
    private int tempoDeCasa;
    private int codigoDoProfessor;

    //public Professor(String nome, String sobrenome, int tempoDeCasa, int codigoDoProfessor) {
    //    this.nome = nome;
    //    this.sobrenome = sobrenome;
    //    this.tempoDeCasa = tempoDeCasa;
    //    this.codigoDoProfessor = codigoDoProfessor;
    //}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public int getCodigoDoProfessor() {
        return codigoDoProfessor;
    }

    public void setCodigoDoProfessor(int codigoDoProfessor) {
        this.codigoDoProfessor = codigoDoProfessor;
    }
}
