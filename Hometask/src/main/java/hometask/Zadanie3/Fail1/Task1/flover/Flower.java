/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask.Zadanie3.Fail1.Task1.flover;

/**
 *
 * @author FIX
 */
public class Flower {

    protected double price;
    protected String name;
    public int lardg;
    private int timer;

    public Flower(int lardg, int time) {
        this.lardg = lardg;
        this.timer = time;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getLardg() {
        return lardg;
    }

    public int getTime() {
        return timer;
    }

}
