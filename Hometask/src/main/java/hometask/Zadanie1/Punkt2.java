
package hometask.Zadanie1;

import java.util.Scanner;
public class Punkt2 {
    public static void main(String[] args) {
       double pi = 3.1415;
    System.out.println("Введите через пробел данные: Радиус окружности," +
           " внутренний радиус окружности,\n сторону тругольника, h - высоту," +
            " сторону прямоугольника. \nПосле ввода нажмите энтер");
    Scanner sc = new Scanner(System.in);
      double rPol = sc.nextDouble();
      double rVn = sc.nextDouble();
      double aTr = sc.nextDouble();
      double hTr = sc.nextDouble();
      double aPr = sc.nextDouble();
      
    System.out.println("Длинна окружности " + (rPol*2*pi));
    System.out.println("Площадь окружности " + (rPol*rPol*pi));
    System.out.println("Площадь кольца " + ((rPol*rPol - rVn*rVn)*pi));
    System.out.println("Периметр треугольника " + 3*aTr);
    System.out.println("Площадь треугольника " + (aTr*hTr)/2);
    System.out.println("Периметр " + aPr*4);
    System.out.println("Площадь прямоугольника " + aPr*aPr);
    
    }
}

