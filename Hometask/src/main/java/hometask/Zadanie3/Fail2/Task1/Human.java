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
public class Human {

    public Human(String lastName, String firstName, String fatherName, int bornDate, String adress, String telefon) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.bornDate = bornDate;
        this.adress = adress;
        this.telefon = telefon;
    }
    
    
    
    private String lastName;
    private String firstName;
    private String fatherName;
    private int bornDate;
    private String adress;
    private String telefon;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getBornDate() {
        return bornDate;
    }

    public void setBornDate(int bornDate) {
        this.bornDate = bornDate;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

   
}
