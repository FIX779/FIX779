
package hometask.Zadanie2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Punkt5 {
    public static void main (String [] args){
        System.out.println("Введите колличество столбцов и строк через"
                + " пробел, а затем нажмите энтер");
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int arr [][] = new int [n][m];
    
     // Инициализация массива
    Random a = new Random();
    for (int i = 0; i<n;i++){
        for(int y = 0; y<m; y++){
            
            arr[i][y] = a.nextInt(100);
            }
        }
    // вывод массива
    System.out.println(Arrays.deepToString(arr));
    
    for (int i = 0; i<n;i++){
        for(int y = 0; y<m; y++){
            
            System.out.print(arr[i][y] + " ");
            }
        System.out.println(" ");
        }
    }
}
    
            
    
