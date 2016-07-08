/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask.Zadanie2;

public class Punkt6 {
    public static void main (String []args){
      int x = 0;
        // инициализация массива
       int[][] arr = new int[4][];
       
       arr[0] = new int [1];
       arr[1] = new int [2];
       arr[2] = new int [3];
       arr[3] = new int [4];
       
       
        System.err.println("Оригинальный массив");
       for(int i = 0; i<arr.length; i++){
	for(int y = 0; y<arr[i].length; y++){			
	    System.out.print((arr[i][y]= x++) + " ");
	}
	System.out.println();
       }
       
       // vizovi metodov:
       gorizont(arr);
       vertic(arr);
       diagonal(arr);
    }     
    
    // gorizont
    public static void gorizont(int arr[][]){
    System.out.println("Отображенный по горизонтали");    
    for(int i = arr.length - 1; i>=0; i--){
        for (int y = 0; y <arr[i].length; y++){
            System.out.print(arr[i][y] + " ");
        }
        System.out.println();
        }
        
    }
 
    // vertical
    public static void vertic(int arr[][]){
        System.out.println("Отображенный по вертикали");
        for(int i = 0; i < arr.length; i++){
         invert (arr[i]);
         for(int y = 0; y < arr[i].length; y++){
             if(y==0){
                probel(i, arr);
             }
             System.out.print(arr[i][y] + " ");
            }
         System.out.println("");
         
        }
    }
   
   // i tak i tak === diagonal
    public static void diagonal(int arr[][]){
    System.out.println("Инвертирование по диагонали");    
    for(int i = arr.length - 1; i>=0; i--){
        for (int y = 0; y <arr[i].length; y++){
            if (y==0){
                probel (i, arr);
            }
            System.out.print(arr[i][y] + " ");
        }
        System.out.println();
        }
        
    }
    
    //invertirovanie po verticali
    public static void invert (int arr[]){
        for(int k = 0; k < arr.length / 2; k++){
            int tmp = arr[k];
            arr[k] = arr[arr.length - k -1];
            arr[arr.length - k -1] = tmp;
        }
    }
    
    //pods4et probelov
    public static void probel(int i, int arr[][]){
      int x = (arr.length - arr[i].length)* 2;
        for(int y = 0; y < x; y++){
        System.out.print(" ");
        }
       
        
    }
    
}
