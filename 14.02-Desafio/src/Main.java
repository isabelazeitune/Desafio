public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso("curso1", 100, 13);
        Curso curso2 = new Curso("curso2", 200, 13);
        Curso curso3 = new Curso("curso3", 300, 13);
        Curso curso4 = new Curso("curso4", 400, 13);
        Curso curso5 = new Curso("curso5", 500, 13);

        DigitalHouseManager dig = new DigitalHouseManager();

        dig.registrarCurso("curso1", 100, 13);
        dig.registrarCurso("curso2", 300, 13);
        dig.registrarCurso("curso3", 400, 13);
        dig.registrarCurso("curso4", 500, 13);
        dig.registrarCurso("curso4", 500, 13);

        dig.excluirCurso(100);
        dig.excluirCurso(100);
        dig.excluirCurso(100);
        dig.excluirCurso(100);
        dig.excluirCurso(100);
        dig.excluirCurso(100);
        dig.excluirCurso(100);
        dig.excluirCurso(100);
    }
}
