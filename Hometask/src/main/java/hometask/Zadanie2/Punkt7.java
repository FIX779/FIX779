package hometask.Zadanie2;

import java.util.Random; 
import java.util.Scanner;
        
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
    
    
        
        
        
       vpravo( n, arr);
       pe4at(arr);
       vlevo( n, arr);
       pe4at(arr);
       vniz(n,arr);
       pe4at(arr);
       vverh(n,arr);
       pe4at(arr);
    }
    
    
    
    // sdvig vpravo
    public static void vpravo( int n, int arr[][]){
        System.out.println("Колличество сдвигов вправо");
        int x = scan();    
        x = x % n;
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
        x = x % n;
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
        x = x % n;
        
        
        pov(x, n, arr);
    }
       
    // sdvig vverh
    public static void vverh(int n, int arr[][]){
         System.out.println("Колличество сдвигов вверх");
        int x = scan(); 
        x = x % n;
        x = n - x;
        pov(x, n, arr);
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
       
        
        
        int tmp[] = new int [x];
        
        int z = arr.length - x;
        System.arraycopy(arr, z, tmp, 0, x);
        System.arraycopy(arr, 0, arr, x, z);
        System.arraycopy(tmp, 0, arr, 0, x);
    }
    
    //sdvig vert
    public static void sdvigV(int x, int n, int tmp1[]){
         x = x % n;
        
        int tmp[] = new int [x];
        
        int z = tmp1.length - x;
        System.arraycopy(tmp1, z, tmp, 0, x);
        System.arraycopy(tmp1, 0, tmp1, x, z);
        System.arraycopy(tmp, 0, tmp1, 0, x);
    }
   
    //povorot na 90 ..... Dances with a tambourine =)
    public static void pov(int x, int n, int arr[][]){
        int tmp1[][] = new int[n][n];
        
        for(int i = 0; i < arr.length; i++){
            for(int y = 0; y < arr[i].length; y++){
                tmp1[y][i] = arr[i][y];
            }
        }
        for(int i = 0; i < tmp1.length; i ++){
          sdvigV(x, n, tmp1[i]);
         for(int y = 0; y < tmp1[i].length; y++){
        }
     }
         povN(n, tmp1, arr);
    }
    public static void povN(int n, int tmp1[][], int arr[][]){
               
        for(int i = 0; i < arr.length; i++){
            for(int y = 0; y < arr[i].length; y++){
                arr[i][y] = tmp1[y][i];
            }
        }
    }
}