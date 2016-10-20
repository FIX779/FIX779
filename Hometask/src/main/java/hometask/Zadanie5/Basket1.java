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
public class Basket1 {
    
    ArrayList<Plant> list = new ArrayList<Plant>();
    
    //добавление одного растения
    public void put(Plant plant) {
        list.add(plant);
    }

    //добавление изз массива
    public void put(Plant[] basket1) {
        list.addAll(Arrays.asList(arr));
    }

    //добавление из корзины
    public void put(ArrayList<Plant> list2) {
        list.addAll(list2.subList(0, list2.size()));
        list2.clear();
    }

    //печать корзины
    public void print() {
        System.out.println("");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name + " " + list.get(i).isCleaned() + " " + list.get(i).getMass());
        }
    }

    //размер корзины
    public void siz() {
        System.out.println(list.size());
    }

    //очистка овощей и фруктов в корзине
    public void peel() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).peell();
        }
    }

    //удаление элемента из корзины
    public void extract(int i) {
        System.out.println("");
        System.out.println("Удален из корзины " + list.get(i - 1).name
                + " " + list.get(i - 1).isCleaned() + " " + list.get(i - 1).getMass());
        list.remove(i - 1);
    }

    //удаление всей корзины
    public void extractAll() {
        System.out.println("");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name);
        }
        list.clear();
        System.out.println("Овощи и фрукты выложены из корзины");
    }
    
    //удаление всех фруктов
    public void extractAllFruits(){
        for(int i = 0; i<list.size();i++){
            if(list.get(i).name=="Яблоко"||list.get(i).name=="Банан"||
                    list.get(i).name=="Апельсин"||list.get(i).name=="Груша"){
                list.remove(i);
                i--;
            }
        }
    }
    
    //удаление всех овощей
    public void extractAllVegetables(){
        for(int i = 0; i<list.size();i++){
            if(list.get(i).name!="Яблоко"&&list.get(i).name!="Банан"&&
                    list.get(i).name!="Апельсин"&&list.get(i).name!="Груша"){
                list.remove(i);
                i--;
            }
        }
    }
    
    // вывод веса
    public double getWeight(){
        double weight = 0;
        for(int i = 0; i< list.size();i++){
            weight = weight + list.get(i).getMass();
        }
        return weight;
    }
    
    public double getWeightP(){
        double weight = 0;
        for(int i = 0; i< list.size();i++){
            weight = weight + list.get(i).massP;
        }
        return weight;
    }
    
    // Работа с массивом
    
    public Plant[] arr = new Plant[8];
    int i = 0;
    
    //добавление одного растения
    public void putM(Plant plant) {
        arr[i] = plant;
        i++;
    }
    
    public void printM() {
        System.out.println("");
        System.out.println("В список входят такие продукты:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name);
        }
        System.out.println("");
    }
    
}
