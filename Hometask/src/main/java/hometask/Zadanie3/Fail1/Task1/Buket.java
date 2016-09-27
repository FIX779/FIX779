/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask.Zadanie3.Fail1.Task1;

import hometask.Zadanie3.Fail1.Task1.flover.Flower;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author FIX
 */
public class Buket {

    
    int y = 5;
    int i = 0;
    
    public Flower[] arr = new Flower[y];
    private double price;

    public void setFlower(Flower flowers) {
        arr[i] = flowers;
        i++;

    }

    public double getPrice() {
        price = 0;
        for (int j = 0; j < (y); j++) {
            price = price + arr[j].getPrice();
        }
        price = price + Acces.BANT.getPrice() + Acces.BUMAGA.getPrice();
        return price;
    }

    public void getFlower() {
        for (int i = 0; i < y; i++) {
            System.out.println(arr[i].getName() + ". Длинна стебля: " + arr[i].getLardg()
                    + "см. Цветок срезан " + arr[i].getTime() + " часа. Цена "
                    + arr[i].getPrice() + "грн.");
        }
    }

    public void getLardgGrad(int min, int max) {

        for (int i = 0; i < y; i++) {
            if (arr[i].getLardg() > min & arr[i].getLardg() < max) {
                System.out.println("Цветы входящие в рамки " + arr[i].getName()+
                        " "+arr[i].getLardg()+" cм");
            }
        }
    }

    public static class BouquetComparator implements Comparator<Flower> {

        @Override
        public int compare(Flower firstVeg, Flower secondVeg) {
            return (firstVeg.getTime() - secondVeg.getTime());
        }
    }

    public void sortBuket() {
        BouquetComparator comp = new BouquetComparator();
        Arrays.sort(arr, comp);
    }
}
