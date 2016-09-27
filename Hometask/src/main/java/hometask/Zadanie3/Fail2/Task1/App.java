/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask.Zadanie3.Fail2.Task1;

/**
 *
 * @author FIX
 */
public class App {

    public static void main(String[] args) {

        StudentList spisok = new StudentList();

        spisok.setStudent(new Student("Reshetnick", "Anton", "Evgen", 1988, "Gorizont", "80933201518", "Ec", 3, "E - 3"));
        spisok.setStudent(new Student("Petrenko", "Dmitri", "Andeev", 1986, "Alekseevka", "80934501618", "Mc", 4, "Mc - 4"));
        spisok.setStudent(new Student("Misjack", "Olga", "Ivanovna", 1986, "HTZ", "8093343118", "Mc", 2, "Mc - 2"));
        spisok.setStudent(new Student("Mansky", "Artur", "Igorevich", 1988, "Bot sad", "80988551518", "Med", 4, "Med - 4"));
        spisok.setStudent(new Student("Beresta", "Semen", "Evgen", 1989, "Gor", "80543254158", "Ec", 1, "E - 1"));
        spisok.setStudent(new Student("Ber", "Lok", "Evgen", 1989, "Gor", "80543254158", "Med", 4, "Med - 4"));
        spisok.setStudent(new Student("Ston", "Sten", "Oleg", 1984, "Gor", "80543254158", "Mc", 5, "Mc - 5"));
        spisok.setStudent(new Student("Kir", "Kran", "Stas", 1980, "Gor", "80543254158", "Ec", 3, "E - 3"));

        spisok.sortStudent();
        spisok.spisokVsehStudentov();
        spisok.spisocFakultet();
        // spisok.spisokVsehStudentov();
        spisok.spisocFacKurs();
        spisok.year();
        spisok.gruppa();
    }
}
