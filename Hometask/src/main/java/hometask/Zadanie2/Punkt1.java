
package hometask.Zadanie2;

public class Punkt1 {
   public static void main(String[] args) {
       int sum2 = 0;
       int sum3 = 0;
       int sum5 = 0;
       int sum7 = 0;
             
       System.out.println("Кратное 2 ");
       for (int i = 0; i <=100; i++) {
           if ( i % 2 == 0) {
               sum2 += i;
               System.out.print(i + " ");
               
           }
       }
       
       System.out.println (""); 
       System.out.println("Кратное 3 ");
       for (int i = 0; i <=100; i++) {
           if ( i % 3 == 0) {
               sum3 += i;
               System.out.print(i + " ");
           }
       }
       
       System.out.println("");
       System.out.println("Кратное 5 ");
       for (int i = 0; i <=100; i++) {
           if ( i % 5 == 0) {
               sum5 += i;
               System.out.print(i + " ");
           }
       }
       
       System.out.println("");
       System.out.println("Кратное 7 ");
       for (int i = 0; i <=100; i++) {
           if ( i % 7 == 0) {
               sum7 += i;
               System.out.print(i + " ");
           }
       }
       System.out.println ("");
       System.out.println ("Сумма" +sum2);
       System.out.println ("Сумма" +sum3);
       System.out.println ("Сумма" +sum5);
       System.out.println ("Сумма" +sum7);
       
       int raz7k2 = sum7 - sum2;
       double otn5k3 = ((double)sum5) / ((double)sum3);
       double otv = Math.round(otn5k3*1000);  //округление не сработало
       otv = otv/1000;                  // пришлось вводить  еше одну операцию
      System.out.println ("Разность " + raz7k2);
      System.out.println ("Отношение " + otv);
    }
} 

