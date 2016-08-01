/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask.Zadanie3.Fail1.Task1;

import hometask.Zadanie3.Fail1.Task1.flover.Flower;
import hometask.Zadanie3.Fail1.Task1.flover.Rose;

/**
 *
 * @author FIX
 */
public class Buket {

    int i = 0;
    int y = 3;
    public Flower[] arr = new Flower[y];
    private double price;
    private Acces[] acc;

    public void setFlower(Flower flowers) {
        arr[i] = flowers;
        i++;

    }

    public double getPrice() {
        price = 0;
        for (int i = 0; i < (y); i++) {
            price = price + arr[i].getPrice();
        }
        return price;
    }

    public void getFlower() {
        for (int i = 0; i < y; i++) {
            System.out.println(arr[i].getName() + " " + arr[i].getLardg()
                    + " " + arr[i].getTime() + " " + arr[i].getPrice());
        }

    }
}
