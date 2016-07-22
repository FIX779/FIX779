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
public abstract class Flower {

    protected double price;
    protected String name;
    private int length;
    private int timer;

    public Flower(int length, int time) {
        this.length = length;
        this.timer = time;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getTime() {
        return timer;
    }

}
