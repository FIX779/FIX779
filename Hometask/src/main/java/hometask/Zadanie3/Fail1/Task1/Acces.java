/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask.Zadanie3.Fail1.Task1;

/**
 *
 * @author FIX
 */
public enum Acces {

    
    BANT(10, "Бант"),
    BUMAGA(15, "Бумага");
    
    private int price;
    private String name;

    Acces(int price, String name){
        this.price = price;
        this.name = name;
    }
    
    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    
}
