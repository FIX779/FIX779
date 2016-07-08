package hometask.Zadanie2;

import java.util.Random; 
import java.util.Scanner;
import java.util.Arrays;

public class Punkt7 {
    public static void main (String []args){
    
//inicializacija masiva
    System.out.println("Введите размер квадратного двумерного массива");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr [][] = new int [n][n];
    
    for (int i = 0; i < arr.length; i++){
       for(int y = 0; y < arr[i].length; y++){
           System.out.print((arr[i][y] = slu4()) + " ");
       }
        System.out.println(" ");
    }
    
    
        
        vniz(n,arr);
        
       // vpravo( n, arr);
       pe4at(arr);
       // vlevo( n, arr);
       // pe4at(arr);
    }
    
    
    
    // sdvig vpravo
    public static void vpravo( int n, int arr[][]){
        System.out.println("Колличество сдвигов вправо");
        int x = scan();    
        
     for(int i = 0; i < arr.length; i ++){
          sdvig(x, n, arr[i]);
         for(int y = 0; y < arr[i].length; y++){
        }
     }
    }

    // sdvig vlevo
    public static void vlevo (int n, int arr[][]){
        System.out.println("Колличество сдвигов влево");
        int x = scan();    
        x = n - x;
    for(int i = 0; i < arr.length; i ++){
        sdvig(x, n, arr[i]);
        for(int y = 0; y < arr[i].length; y++){
        }
     }
    }
    
    // sdvig vniz
    public static void vniz (int n, int arr[][]){
        System.out.println("Колличество сдвигов вниз");
        int x = scan();    
        
     for(int i = 0; i < arr.length; i ++){
        for(int y = 0; y < arr[i].length; y++){
            sdvig(x, n, arr[i]);
        }
     }
       
     
    }
       

    
    
    
    //pe4at masiva
    public static void pe4at(int arr[][]){
        for (int i = 0; i < arr.length; i ++){
            for (int y = 0; y < arr[i].length; y++){
                System.out.print(arr[i][y] + " ");
            }
            System.out.println(" ");
        }
    }
    
    // generator psevdo slu4ainih 4isel
    public static int slu4(){
       
       Random i = new Random();
       return i.nextInt(10);
       
    }
        
    //shagi sdviga
    public static int scan() {
      
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    return x;
    }
    
    // algoritm sdviga
    public static void sdvig(int x, int n, int arr[]){
       
        x = x % n;
        
        int tmp[] = new int [x];
        
        int z = arr.length - x;
        System.arraycopy(arr, z, tmp, 0, x);
        System.arraycopy(arr, 0, arr, x, z);
        System.arraycopy(tmp, 0, arr, 0, x);
    }
   
    
   
}