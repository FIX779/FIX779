/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask.Zadanie5.Plants.Fruits;

import hometask.Zadanie5.Plants.Fruit;

/**
 *
 * @author FIX
 */
public class Apple extends Fruit {

    public Apple(String color, boolean maturity, boolean condition, boolean cleaned) {
        super(color, maturity, condition, cleaned);
        name = "Яблоко";
        mass = 130;
    }

    @Override
    public double peell() {
        if (cleaned == true) {
            return mass;
        } else {
            cleaned = true;
            return massP = getMass() * 0.98;
        }
    }

}
