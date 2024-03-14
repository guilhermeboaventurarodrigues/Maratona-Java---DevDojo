package poo.classes.test;

import poo.classes.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Jorge";
        professor.age = 24;
        professor.sexo = 'M';

        System.out.println(professor.name + " "  + professor.age +" "+ " " +professor.sexo);
    }
}
