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
public class Student extends Human {

    private String fackultet;
    private int kurs;
    private String gruppa;

    public Student(String lastName, String firstName, String fatherName,
            int bornDate, String adress, String telefon, String fackultet,
            int kurs, String gruppa) {
        super(lastName, firstName, fatherName, bornDate, adress, telefon);
        this.fackultet = fackultet;
        this.kurs = kurs;
        this.gruppa = gruppa;
    }

    public String getFackultet() {
        return fackultet;
    }

    public void setFackultet(String fackultet) {
        this.fackultet = fackultet;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public String getGruppa() {
        return gruppa;
    }

    public void setGruppa(String gruppa) {
        this.gruppa = gruppa;
    }
    
    

}
