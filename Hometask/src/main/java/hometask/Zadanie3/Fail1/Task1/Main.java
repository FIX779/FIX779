/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask.Zadanie3.Fail1.Task1;

import hometask.Zadanie3.Fail1.Task1.flover.Flower;
import hometask.Zadanie3.Fail1.Task1.flover.Rose;
import hometask.Zadanie3.Fail1.Task1.flover.Tulip;

/**
 *
 * @author FIX
 */
public class Main {

    public static void main(String[] args) {

        Buket buket = new Buket();
        buket.setFlower(new Rose(22, 3));
        buket.setFlower(new Tulip(43, 8));
        buket.setFlower(new Rose(43, 6));

        System.out.println("Цена букета= " + buket.getPrice());
        buket.getFlower();

    }

}
