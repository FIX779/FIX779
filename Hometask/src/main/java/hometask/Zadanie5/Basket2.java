/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask.Zadanie5;

import hometask.Zadanie5.Plants.Plant;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author FIX
 */
public class Basket2 {
    ArrayList<Plant> list2 = new ArrayList<Plant>();
  Basket1 b1 = new Basket1();
    //добавление одного растения
    public void put(Plant plant) {
        list2.add(plant);
    }

//    //добавление изз массива
//    public void put(Plant[] plant) {
//        list2.addAll(Arrays.asList(b1.arr));
//    }

    //добавление из корзины
    public void put(ArrayList<Plant> list) {
        list2.addAll(list.subList(0, list.size()));
        list.clear();
    }

    //печать корзины
    public void print() {
        System.out.println("");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i).name + " " + list2.get(i).isCleaned() + " " + list2.get(i).getMass());
        }
    }

    //размер корзины
    public void siz() {
        System.out.println(list2.size());
    }

    //очистка овощей и фруктов в корзине
    public void peel() {
        for (int i = 0; i < list2.size(); i++) {
            list2.get(i).peell();
        }
    }

    //удаление элемента из корзины
    public void extract(int i) {
        System.out.println("");
        System.out.println("Удален из корзины " + list2.get(i - 1).name
                + " " + list2.get(i - 1).isCleaned() + " " + list2.get(i - 1).getMass());
        list2.remove(i - 1);
    }

    //удаление всей корзины
    public void extractAll() {
        System.out.println("");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i).name + " " + list2.get(i).isCleaned() + " " + list2.get(i).getMass());
        }
        list2.clear();
        System.out.println("Овощи и фрукты выложены из корзины");
    }
    
    //удаление всех фруктов
    public void extractAllFruits(){
        for(int i = 0; i<list2.size();i++){
            if(list2.get(i).name=="Яблоко"||list2.get(i).name=="Банан"||
                    list2.get(i).name=="Апельсин"||list2.get(i).name=="Груша"){
                list2.remove(i);
                i--;
            }
        }
    }
    
    //удаление всех овощей
    public void extractAllVegetables(){
        for(int i = 0; i<list2.size();i++){
            if(list2.get(i).name!="Яблоко"&&list2.get(i).name!="Банан"&&
                    list2.get(i).name!="Апельсин"&&list2.get(i).name!="Груша"){
                list2.remove(i);
                i--;
            }
        }
    }
    
    // вывод веса
    public double getWeight(){
        double weight = 0;
        for(int i = 0; i< list2.size();i++){
            weight = weight + list2.get(i).getMass();
        }
        return weight;
    }
    
    public double getWeightP(){
        double weight = 0;
        for(int i = 0; i< list2.size();i++){
            weight = weight + list2.get(i).massP;
        }
        return weight;
    }
}
