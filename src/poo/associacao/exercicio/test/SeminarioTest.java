package poo.associacao.exercicio.test;

import poo.associacao.exercicio.domain.Aluno;
import poo.associacao.exercicio.domain.Local;
import poo.associacao.exercicio.domain.Professor;
import poo.associacao.exercicio.domain.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro", 18);
        Aluno aluno2 = new Aluno("Matheus", 14);
        Aluno aluno3 = new Aluno("Abraão", 19);
        Aluno[] alunos = {aluno1, aluno2, aluno3};
        Professor professor = new Professor("Jorge", "Gestão da Informação");
        Local local = new Local("Auditorio 8B");
        Seminario seminario = new Seminario("Inovaçoes em IA");
        Seminario[] seminarios = {seminario};

        aluno1.setSeminario(seminario);
        aluno2.setSeminario(seminario);
        aluno3.setSeminario(seminario);

        seminario.setLocal(local);

        professor.setSeminarios(seminarios);

        seminario.setAlunos(alunos);

        local.setSeminario(seminarios);

        aluno1.imprime();
//          seminario.imprime();
//        professor.imprime();
//        local.imprime();
    }
}
