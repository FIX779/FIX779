
package hometask.Zadanie2;

import java.util.Scanner;

public class Punkt2 {
   public static void main (String[]ars){
      
   
    // Инициализация массива данных
      String [] arr = new String [28];
      arr [0] = " ноль ";
      arr [1] = " один ";
      arr [2] = " два ";
      arr [3] = " три ";
      arr [4] = " четыре ";
      arr [5] = " пять ";
      arr [6] = " шесть ";
      arr [7] = " семь ";
      arr [8] = " восемь ";
      arr [9] = " девять ";
      arr [10] = " десять ";
      arr [11] = " одинадцать ";
      arr [12] = " двенадцать ";
      arr [13] = " тринадцать ";
      arr [14] = " четырнадцать ";
      arr [15] = " пятнадцать ";
      arr [16] = " шестнадцать ";
      arr [17] = " семнадцать ";
      arr [18] = " восемнадцать ";
      arr [19] = " девятнадцать ";
      arr [20] = " двадцать ";
      arr [21] = " тридцать ";
      arr [22] = " сорок ";
      arr [23] = " пятьдесят ";
      arr [24] = " шетдесят ";
      arr [25] = " семдесят ";
      arr [26] = " восемдесят ";
      arr [27] = " девяносто ";
    
     // Функция 
      int i;
      i = chislo();
   
   if (i<=19){
       switch(i){
           case 0: System.out.println(arr[0]);
           break;
           case 1: System.out.println(arr[1]);
           break;
           case 2: System.out.println(arr[2]);
           break;
           case 3: System.out.println(arr[3]);
           break;
           case 4: System.out.println(arr[4]);
           break;
           case 5: System.out.println(arr[5]);
           break;
           case 6: System.out.println(arr[6]);
           break;
           case 7: System.out.println(arr[7]);
           break;
           case 8: System.out.println(arr[8]);
           break;
           case 9: System.out.println(arr[9]);
           break;
           case 10: System.out.println(arr[10]);
           break;
           case 11: System.out.println(arr[11]);
           break;
           case 12: System.out.println(arr[12]);
           break;
           case 13: System.out.println(arr[13]);
           break;
           case 14: System.out.println(arr[14]);
           break;
           case 15: System.out.println(arr[15]);
           break;
           case 16: System.out.println(arr[16]);
           break;
           case 17: System.out.println(arr[17]);
           break;
           case 18: System.out.println(arr[18]);
           break;
           case 19: System.out.println(arr[19]);
           break;
            }
       }
       else {
       int n = i%10;
       int m = (i-n)/10;
       
       switch (m){ 
           case 2: System.out.print(arr [20]);
           break;
           case 3: System.out.print(arr [21]);
           break;
           case 4: System.out.print(arr [22]);
           break;
           case 5: System.out.print(arr [23]);
           break;
           case 6: System.out.print(arr [24]);
           break;
           case 7: System.out.print(arr [25]);
           break;
           case 8: System.out.print(arr [26]);
           break;
           case 9: System.out.print(arr [27]);
           break;
               }
       switch (n){
           case 0: System.out.print("");
           break;
           case 1: System.out.print(arr[1]);
           break;
           case 2: System.out.print(arr[2]);
           break;
           case 3: System.out.print(arr[3]);
           break;
           case 4: System.out.print(arr[4]);
           break;
           case 5: System.out.print(arr[5]);
           break;
           case 6: System.out.print(arr[6]);
           break;
           case 7: System.out.print(arr[7]);
           break;
           case 8: System.out.print(arr[8]);
           break;
           case 9: System.out.print(arr[9]);
           break;
       }
    }
   
      
       }
  // ввод числа
   public static int chislo() {
   System.out.println("Введите число от 0 до 99");
   Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    return x;
   }
   
   
   
   }

   
