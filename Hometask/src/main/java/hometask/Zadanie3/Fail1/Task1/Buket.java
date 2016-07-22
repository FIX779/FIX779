/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask.Zadanie3.Fail1.Task1;


import hometask.Zadanie3.Fail1.Task1.flover.Flower;
import java.util.ArrayList;

/**
 *
 * @author FIX
 */
public class Buket extends ArrayList<Flower> {

    public double getBuketPrice() {

        double summ = 0;
        for (Flower f : this) {
            summ = summ + f.getPrice();
        }
        summ = summ + Acces.BANT.getPrice() + Acces.BUMAGA.getPrice();
        return summ;
    }

    public void pe4at() {

        for (Flower f : this) {
            System.out.println(f.getName() + " " + f.getPrice()
                    + " грн., длинна ствола: " + f.getLength()
                    + " см. Срезан " + f.getTime() + " часов назад");
        }
    }

    public void sort(){
     
    }
}
