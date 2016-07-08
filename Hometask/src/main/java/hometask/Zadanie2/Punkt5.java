
package hometask.Zadanie2;


import java.util.Random;
import java.util.Scanner;

public class Punkt5 {
    
   
    public static void main (String [] args){
      
    // Инициализация массива
              
    System.out.println("Введите колличество столбцов и строк через"
                + " пробел, а затем нажмите энтер");
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int arr [][] = new int [n][m];
    
    Random a = new Random();
    for (int i = 0; i<n;i++){
        for(int y = 0; y<m; y++){
            arr[i][y] = a.nextInt(100);
            }
        }
   
   
   print(n, m, arr);
   obrat(n, m, arr);
   print(n, m, arr);
   chet(n, m, arr);
   neChet(n, m, arr);
   summ7(n, m, arr);   
   proizv(n, m, arr);   
    }
    
    
    // обратный порядок массивa
    public static void obrat(int n, int m, int arr [][]){
        
      System.out.println("В обратном порядке "); 
      for(int i = 0; i < n; i++){
          for (int y = 0; y < m/2; y++){
          int tmp = arr[i][y];
          arr[i][y] = arr[i][m - y - 1];
          arr[i][m - y - 1] = tmp;
            }
         }   
    }
     // четные строки, четные элементы
    public static void chet (int n, int m, int arr[][]){
       
      System.out.println("четные строки, четные элементы");
      for (int y = 0; y < m; y++){
          for (int i = 0; i < n; i++){
              if (i%2 == 0){
                  if ((arr[i][y])%2 == 0)
                  System.out.print(arr[i][y] + " ");
              }
                  
          }
      }
    }
        
    // вывод массива
    public static void print(int n, int m, int arr[][]){
         for (int i = 0; i<n;i++){
        for(int y = 0; y<m; y++){
            
            System.out.print(arr[i][y] + " ");
            }
        System.out.println(" ");
        }
     }
    
    // не четный столбец, не четный элемент
    public static void neChet(int n, int m, int arr[][]){
        
        System.out.println("\nНе четные столбци, не четные элементы");
      for (int i = 0; i < n; i++){
          for (int y = 0; y < m; y++){
              if (y%2 != 0){
                  if ((arr[i][y])%2 != 0)
                  System.out.print(arr[i][y] + " ");
              }
                  
          }
      }
    }  
    
    // сумма элементов кратных семи в четных строках
    public static void summ7(int n, int m, int arr[][]){
      
      System.out.print("\n сумма элементов кратных семи в четных строках = ");
      int summ = 0;
      for (int y = 0; y < m; y++){
          for (int i = 0; i < n; i++){
              if (i%2 == 0){
                  if ((arr[i][y])%7 == 0)
                   summ+=arr[i][y];   
                  }
          }
      }
      System.out.println(summ);
    }
    
    // произведение элементов кратных 3 в нечетных строках
    public static void proizv(int n, int m, int arr[][]){
    System.out.print("\n произведение элементов кратных 3 в нечетных строках = ");
      int proiz = 1;
      for (int y = 0; y < m; y++){
          for (int i = 0; i < n; i++){
              if (i%2 != 0){
                  if ((arr[i][y])%3 == 0)
                   proiz = proiz * arr[i][y];   
                  }
          }
      }
      System.out.println(proiz);
    }
}

    
            
    
