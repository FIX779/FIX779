/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask.Zadanie5;

import hometask.Zadanie5.Plants.Fruits.Apple;
import hometask.Zadanie5.Plants.Fruits.Banana;
import hometask.Zadanie5.Plants.Fruits.Orange;
import hometask.Zadanie5.Plants.Fruits.Pear;
import hometask.Zadanie5.Plants.Vegetables.Carrot;
import hometask.Zadanie5.Plants.Vegetables.Celery;
import hometask.Zadanie5.Plants.Vegetables.Onion;
import hometask.Zadanie5.Plants.Vegetables.Potatoes;
import java.util.Scanner;

/**
 *
 * @author FIX
 */
public class App {

    public static void main(String[] args) {

        Tools t = new Tools();
        Basket1 basket1 = new Basket1();
        Basket2 basket2 = new Basket2();
        FoodProcessor fp = new FoodProcessor();
        Scanner in = new Scanner(System.in);

        System.out.println("Добрый день!");
        boolean b = true;
        while (b) {
            t.menu();
            switch (in.nextInt()) { // Общее меню 0
                case 1:
                    System.out.println("------ Список покупок ------");
                    t.menu1();
                    switch (in.nextInt()) { // Меню корзины 0.1
                        case 1:
                            System.out.println("Введите номера восьми продуктов и не забывайте про ввод");
                            t.menu2();
                            for (int i = 0; i < basket1.arr.length; i++) {
                                switch (in.nextInt()) {
                                    case 1:
                                        basket1.putM(new Apple("blue", true, false, false));
                                        break;
                                    case 2:
                                        basket1.putM(new Pear("blue", true, false, false));
                                        break;
                                    case 3:
                                        basket1.putM(new Banana("blue", true, false, false));
                                        break;
                                    case 4:
                                        basket1.putM(new Orange("blue", true, false, false));
                                        break;
                                    case 5:
                                        basket1.putM(new Potatoes("blue", true, false, false));
                                        break;
                                    case 6:
                                        basket1.putM(new Carrot("blue", true, false, false));
                                        break;
                                    case 7:
                                        basket1.putM(new Celery("blue", true, false, false));
                                        break;
                                    case 8:
                                        basket1.putM(new Onion("blue", true, false, false));
                                        break;
                                }
                            }
                            basket1.printM();
                            break;
                        case 2: //0.1.2
                            System.out.println("-----Все товары в первой корзине");
                            basket1.put(basket1.arr);
                            System.out.println("");
                            break;
                        case 0: //0.1.3
                            System.out.println("-----Вернуться в преведущее меню");
                            break;
                    }

                    break;

                case 2: // пунт меню 0.2
                    System.out.println("------ Корзина первая ------");
                    basket1.print();
                    System.out.println("Корзина весит - " + basket1.getWeight() + " грамм");
                    t.menu3();
                    switch (in.nextInt()) {
                        case 1: //0.2.1
                            System.out.println("-----Товары загружены");
                            basket1.put(basket1.arr);
                            System.out.println("");
                            break;
                        case 2: // 0.2.2
                            System.out.println("-----Товары загружены");
                            basket1.put(basket2.list2);
                            System.out.println("");
                            break;
                        case 3: //0.2.3
                            System.out.println("Введите номера продуктов и не забывайте про ввод");
                            t.menu2();
                            System.out.println("0. Прекратить добавление");
                            boolean v = true;
                            while (v) {
                                switch (in.nextInt()) {
                                    case 1:
                                        basket1.put(new Apple("blue", true, false, false));
                                        break;
                                    case 2:
                                        basket1.put(new Pear("blue", true, false, false));
                                        break;
                                    case 3:
                                        basket1.put(new Banana("blue", true, false, false));
                                        break;
                                    case 4:
                                        basket1.put(new Orange("blue", true, false, false));
                                        break;
                                    case 5:
                                        basket1.put(new Potatoes("blue", true, false, false));
                                        break;
                                    case 6:
                                        basket1.put(new Carrot("blue", true, false, false));
                                        break;
                                    case 7:
                                        basket1.put(new Celery("blue", true, false, false));
                                        break;
                                    case 8:
                                        basket1.put(new Onion("blue", true, false, false));
                                        break;
                                    case 0:
                                        v = false;
                                        break;
                                }
                            }
                            break;
                        case 4: // 0.2.4
                            System.out.println("Введите номер удаляемого продукта");
                            basket1.extract(in.nextInt());
                            break;
                        case 5: // 0.2.5
                            System.out.println("Все фрукты удалены из корзины");
                            basket1.extractAllFruits();
                            break;
                        case 6: // 0.2.6
                            System.out.println("Все овощи удалены из корзины");
                            basket1.extractAllVegetables();
                            break;
                        case 7:
                            basket1.extractAll();
                            break;
                        case 8:
                            System.out.println("Продукты переложены в кухонный комбаин");
                            fp.put(basket1.list);
                            break;
                        case 0:
                            break;
                    }

                    break;

                case 3: // 0.3
                    System.out.println("------ Корзина вторая ------");
                    basket2.print();
                    System.out.println("Корзина весит - " + basket2.getWeight() + " грамм");
                    t.menu4();
                    switch (in.nextInt()) {
                        case 1: // 0.3.1
                            System.out.println("-----Товары загружены");
                            basket2.put(basket1.list);
                            System.out.println("");
                            break;
                        case 2: //0.3.2
                            System.out.println("Введите номера продуктов и не забывайте про ввод");
                            t.menu2();
                            System.out.println("0. Прекратить добавление");
                            boolean v = true;
                            while (v) {
                                switch (in.nextInt()) {
                                    case 1:
                                        basket2.put(new Apple("blue", true, false, false));
                                        break;
                                    case 2:
                                        basket2.put(new Pear("blue", true, false, false));
                                        break;
                                    case 3:
                                        basket2.put(new Banana("blue", true, false, false));
                                        break;
                                    case 4:
                                        basket2.put(new Orange("blue", true, false, false));
                                        break;
                                    case 5:
                                        basket2.put(new Potatoes("blue", true, false, false));
                                        break;
                                    case 6:
                                        basket2.put(new Carrot("blue", true, false, false));
                                        break;
                                    case 7:
                                        basket2.put(new Celery("blue", true, false, false));
                                        break;
                                    case 8:
                                        basket2.put(new Onion("blue", true, false, false));
                                        break;
                                    case 0:
                                        v = false;
                                        break;
                                }
                            }
                            break;
                        case 3: // 0.3.3
                            System.out.println("Введите номер удаляемого продукта");
                            basket2.extract(in.nextInt());
                            break;
                        case 4: // 0.3.4
                            System.out.println("Все фрукты удалены из корзины");
                            basket2.extractAllFruits();
                            break;
                        case 5: // 0.3.5
                            System.out.println("Все овощи удалены из корзины");
                            basket2.extractAllVegetables();
                            break;
                        case 6: // 0.3.6
                            basket2.extractAll();
                            break;
                        case 7: // 0.3.7
                            System.out.println("Продукты переложены в кухонный комбаин");
                            fp.put(basket2.list2);
                            break;
                        case 0: // 0.3.0
                            break;
                    }

                    break;

                case 4: //0.4
                    System.out.println("------ Кухонный комбаин ------");
                    fp.print();
                    System.out.println("Вес продуктов - " + fp.getWeight() + " грамм");
                    t.menu5();
                    switch (in.nextInt()) {
                        case 1: // 0.4.1
                            System.out.println("------ Загрузка продуктов");
                            t.menu6();
                            switch (in.nextInt()) {
                                case 1:
                                    System.out.println("Продукты загружены из первой корзины");
                                    fp.put(basket1.list);
                                    break;
                                case 2:
                                    System.out.println("Продукты загружены из второй корзины");
                                    fp.put(basket2.list2);
                                    break;
                                case 0:
                                    break;
                            }
                            break;
                        case 2: // 0.4.2
                            System.out.println("------ Чистка продуктов");
                            t.menu7();
                            switch (in.nextInt()) {
                                case 1:
                                    System.out.println("---Введите номер продукта");
                                    fp.peellItem(in.nextInt());
                                    break;
                                case 2:
                                    fp.peellItems();
                                    break;
                                case 0:
                                    break;
                            }
                            break;
                        case 3:// 0.4.3
                            System.out.println("------ Нарезка продуктов");
                            t.menu8();
                            switch (in.nextInt()) {
                                case 1:
                                    System.out.println("---Введите номер продукта");
                                    try {
                                        fp.cut(in.nextInt());
                                    } catch (IllegalArgumentException ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    break;
                                case 2:
                                    try {
                                        fp.cutAll();
                                    } catch (IllegalArgumentException ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    break;
                                case 0:
                                    break;
                            }

                            break;
                        case 4:// 0.4.4
                            System.out.println("------ Шинковка продуктов");
                            t.menu9();
                            switch (in.nextInt()) {
                                case 1:
                                    System.out.println("---Введите номер продукта");
                                    try {
                                        fp.slice(in.nextInt());
                                    } catch (IllegalArgumentException ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    break;
                                case 2:
                                    try {
                                        fp.sliceAll();
                                    } catch (IllegalArgumentException ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    break;
                                case 0:
                                    break;
                            }
                            break;
                        case 5:// 0.4.5
                            System.out.println("------ Данные");
                            System.out.println("Начальнsй вес корзины " + fp.getWeight() + " грамм");
                            System.out.println("Вес корзины после чистки " + fp.getWeightP() + " грамм");
                            System.out.println("Вес корзины после нарезки и шинковки " + fp.getWeightCS() + " грамм");
                            System.out.println("Отходы = " + (fp.getWeight() - fp.getWeightP()) + " грамм");
                            System.out.println("Потери = " + (fp.getWeightP() - fp.getWeightCS()) + " грамм");
                            break;
                        case 0:
                            break;
                    }
                    break;

                case 0: // Выход из приложения
                    System.out.println("------ До свидания ------");
                    b = false;
                    break;
            }
        }
    }
}
