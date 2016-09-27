/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask.Zadanie3.Fail1.Task1;

import hometask.Zadanie3.Fail1.Task1.flover.Rose;
import hometask.Zadanie3.Fail1.Task1.flover.Tulip;


/**
 *
 * @author FIX
 */
public class Main {

    
    static int min = 30;
    static int max = 40;

    public static void main(String[] args) {

        
        Buket buket = new Buket();
        buket.setFlower(new Rose(35, 2));
        buket.setFlower(new Tulip(35, 3));
        buket.setFlower(new Rose(30, 2));
        buket.setFlower(new Tulip(15, 1));
        buket.setFlower(new Rose(25, 4));

        System.out.println("Букет который вы собрали стоит = " + buket.getPrice()
                + " также в стоимость входит цена банта и бумаги (10 и 15 грн. сообтветственно)");

        buket.sortBuket();
        buket.getFlower();

        buket.getLardgGrad(min, max);
    }
}
