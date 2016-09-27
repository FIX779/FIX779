/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask.Zadanie3.Fail2.Task1;

import hometask.Zadanie3.Fail1.Task1.flover.Flower;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author FIX
 */
public class StudentList {

    public Student[] arr = new Student[8];

    int i = 0;

    public void setStudent(Student student) {
        arr[i] = student;
        i++;

    }

    //metodi
    public void spisokVsehStudentov() {
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getFirstName() + " " + arr[i].getLastName());
        }
        System.out.println("");
    }

    public void spisocFakultet() {
        System.out.println("Студенты из факультета Ес");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getFackultet() == "Ec") {

                System.out.println(arr[i].getFirstName() + " " + arr[i].getLastName());
            }
        }
    }

    public static class StudentComparator implements Comparator<Student> {

        @Override
        public int compare(Student firstSt, Student secondSt) {
            return (firstSt.getKurs() - secondSt.getKurs());
        }
    }

    public void sortStudent() {
        StudentComparator comp = new StudentComparator();
        Arrays.sort(arr, comp);
    }

    public void spisocFacKurs() {

        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getFackultet() == "Ec") {
                print(i);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getFackultet() == "Mc") {
                print(i);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getFackultet() == "Med") {
                print(i);
            }
        }

        System.out.println("");
    }

    public void print(int i) {
        System.out.println(arr[i].getFirstName()
                + " " + arr[i].getLastName() + " " + arr[i].getKurs()
                + " " + arr[i].getFackultet());
    }
    
    public void year(){
         System.out.println("");
         System.out.println("Список студентов родившихся после 1987 года");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getBornDate() > 1987) {
                print(i);
            }
        }
    }
    
    public void gruppa(){
        System.out.println("");
         System.out.println("Список студентов группі Med - 4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getGruppa() == "Med - 4") {
                print(i);
            }
        }
    }
}
