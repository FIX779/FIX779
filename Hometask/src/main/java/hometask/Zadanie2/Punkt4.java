
package hometask.Zadanie2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Punkt4 {
    public static void main (String [] args) {
    System.out.println("Введите колличество элементов массива");
    
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int arr [] = new int [x];
    
    // Инициализация массива
    Random a = new Random();
    for (int i = 0; i<arr.length;i++){
        arr[i] = a.nextInt(100);
        }
    //Печать элементов массива
    System.out.println(Arrays.toString(arr));
    
// Сортируем данный массив
    for (int barrier = arr.length - 1; barrier >= 0; barrier --){
        for(int i = 0; i < barrier; i ++){
            if(arr[i]>arr[i + 1]){
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i +1] = tmp;
                }
        }
    }
    
    System.out.println(Arrays.toString(arr));

//Инвертируем массив
    for (int i = 0; i < arr.length / 2; i++){
        int tmp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = tmp;
    }
    System.out.println(Arrays.toString(arr));
    
// Вывод всех четных элементов массива
    for (int i = 0; i < arr.length; i++){
        if (i%2 == 0){
            System.out.print(arr[i] + " ");
        }
    }
        System.out.println();
//Вывод всех не четных элементов массива       
        for (int i = 0; i < arr.length; i++){
        if (i%2!=0){
            System.out.print(arr[i] + " ");
        }
    }
        System.out.println();
//Сумма элементов кратных 7
        int sum7 = 0;
        for (int i = 0; i < arr.length; i++){
        if (i%7 == 0){
            sum7 = sum7 + arr[i];
        }
    }
    System.out.println("Сумма элементов кратных 7 = " + sum7);
// Произведение элементов кратных 3
    int sum3 = 1;
        for (int i = 0; i < arr.length; i++){
        if (i%3 == 0){
            sum3 = sum3 * arr[i];
        }
    }
    System.out.println("Произведение элементов кратных 3 = " + Math.abs(sum3));
    // непонятно почему но без Math.abs выводит отрицательное значение
    }
}
