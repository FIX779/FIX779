
package hometask.Zadanie1;

import java.util.Scanner;

public class Punkt3 {
    
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
      
    System.out.println("обьем цилиндра " + pi*rPol*rPol*hTr);
    
    System.out.println("обьем полого цилиндра " + 
            pi * (rPol*rPol - rVn*rVn)* hTr);
    
    System.out.println("обьем шараплощадь бок.поверхности " + 2*pi*rPol*hTr);
    
    System.out.println("обьем шара " + (4*pi*rPol*rPol*rPol)/3);
    
    System.out.println("площадь поверхности шара " + 4* pi * rPol*rPol);
    
    System.out.println("обьем параллелепипеда " + aPr*aPr*aPr);
    
    System.out.println("площадь параллелепипеда " + 6*aPr*aPr);
    
    System.out.println("обьем тетраэдра " + (aPr*aPr*hTr)/3);
    
    System.out.println("площадь тетраэдра " + Math.sqrt(3)*aPr*aPr);
    }
}
