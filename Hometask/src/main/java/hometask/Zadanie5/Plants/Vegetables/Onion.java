/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask.Zadanie5.Plants.Vegetables;

import hometask.Zadanie5.Plants.Vegetable;

/**
 *
 * @author FIX
 */
public class Onion extends Vegetable {

    public Onion(String color, boolean maturity, boolean condition, boolean cleaned) {
        super(color, maturity, condition, cleaned);
        name = "Лук";
        mass = 45;
    }

    @Override
    public double peell() {
        if (cleaned == true) {
            return mass;
        } else {
            cleaned = true;
            return massP = getMass() * 0.95;
        }
    }

}
