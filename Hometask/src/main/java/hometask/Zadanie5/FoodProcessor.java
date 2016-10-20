/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask.Zadanie5;

import hometask.Zadanie5.Interfeses.Cutter;
import hometask.Zadanie5.Interfeses.Peeller;
import hometask.Zadanie5.Interfeses.Slicer;
import hometask.Zadanie5.Plants.Plant;
import java.util.ArrayList;

/**
 *
 * @author FIX
 */
public class FoodProcessor implements Peeller, Cutter, Slicer {

    ArrayList<Plant> list3 = new ArrayList<Plant>();

    //добавление из корзины
    public void put(ArrayList<Plant> list) {
        list3.addAll(list.subList(0, list.size()));
        list.clear();
    }

    //печать обьектов кухонного комбайна
    public void print() {
        System.out.println("");
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i).name + " " + list3.get(i).isCleaned() + " " + list3.get(i).getMass());
        }
    }

    public double getWeight() {
        double weight = 0;
        for (int i = 0; i < list3.size(); i++) {
            weight = weight + list3.get(i).getMass();
        }
        return weight;
    }

    public double getWeightP() {
        double weight = 0;
        for (int i = 0; i < list3.size(); i++) {
            weight = weight + list3.get(i).massP;
        }
        return weight;
    }

    public double getWeightCS() {
        double weight = 0;
        for (int i = 0; i < list3.size(); i++) {
            weight = weight + list3.get(i).getMassCS();
        }
        return weight;
    }

    @Override
    public double peellItem(int i) {
        return list3.get(i - 1).peell();
    }

    @Override
    public double peellItems() {
        double m = 0;
        for (int i = 0; i < list3.size(); i++) {
            m = m + list3.get(i).peell();
        }
        return m;
    }

    @Override
    public double cut(int i) throws IllegalArgumentException {
        if (list3.get(i - 1).cleaned == false) {
            throw new IllegalArgumentException(list3.get(i - 1).name + ": Продукт неочищен");
        } else if (list3.get(i - 1).isCondition() == true) {
            System.out.println(list3.get(i - 1).name + "Уже нарезан или пошинкован");
            return list3.get(i - 1).massCS;
        } else {
            list3.get(i - 1).setCondition(true);
            list3.get(i - 1).massCS = list3.get(i - 1).massP * 0.98;
            return list3.get(i - 1).massCS;
        }
    }

    @Override
    public double cutAll() throws IllegalArgumentException {
        double m = 0;
        for (int i = 0; i < list3.size(); i++) {
            if (list3.get(i).cleaned == false) {
                throw new IllegalArgumentException(list3.get(i).name + ": Продукт неочищен");
            } else if (list3.get(i).isCondition() == true) {
                System.out.println(list3.get(i - 1).name + "Уже нарезан или пошинкован");
                m = m + list3.get(i).getMassCS();
            } else {
                list3.get(i).setCondition(true);
                list3.get(i).massCS = list3.get(i).massP * 0.98;
                m = m + list3.get(i).getMassCS();
            }
        }
        return m;
    }

    @Override
    public double slice(int i) throws IllegalArgumentException {
        if (list3.get(i - 1).cleaned == false) {
            throw new IllegalArgumentException(list3.get(i - 1).name + ": Продукт неочищен");
        } else if (list3.get(i - 1).isCondition() == true) {
            System.out.println(list3.get(i - 1).name + "Уже нарезан или пошинкован");
            return list3.get(i - 1).massCS;
        } else {
            list3.get(i - 1).setCondition(true);
            list3.get(i - 1).massCS = list3.get(i - 1).massP * 0.98;
            return list3.get(i - 1).massCS;
        }
    }

    @Override
    public double sliceAll() throws IllegalArgumentException{
        double m = 0;
        for (int i = 0; i < list3.size(); i++) {
            if (list3.get(i).cleaned == false) {
                throw new IllegalArgumentException(list3.get(i).name + ": Продукт неочищен");
            } else if (list3.get(i).isCondition() == true) {
                System.out.println(list3.get(i - 1).name + "Уже нарезан или пошинкован");
                m = m + list3.get(i).getMassCS();
            } else {
                list3.get(i).setCondition(true);
                list3.get(i).massCS = list3.get(i).massP * 0.98;
                m = m + list3.get(i).getMassCS();
            }
        }
        return m;
    }

}
