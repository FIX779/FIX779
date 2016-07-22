/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask.Zadanie3.Fail1.Task1;

import hometask.Zadanie3.Fail1.Task1.flover.Flower;
import hometask.Zadanie3.Fail1.Task1.flover.Rose;
import hometask.Zadanie3.Fail1.Task1.flover.Tulip;
import java.util.ArrayList;

/**
 *
 * @author FIX
 */
public class Main {

    public static void main(String[] args) {

        Buket buket = new Buket();
        buket.add(new Rose(23, 5));
        buket.add(new Rose(34, 5));
        buket.add(new Rose(26, 2));
        buket.add(new Tulip(30, 5));
        buket.add(new Rose(28, 4));
        buket.add(new Rose(15, 8));

        System.out.println("Стоимость букета: " + buket.getBuketPrice() + " грн.");
        Flower b = null;
       
       buket.pe4at();
    
       buket.pe4at();
    }


}
