
package hometask.Golovolomka;

public class Punkt1 {
    public static void main(String[] args) {
        byte day = 26;
        byte month = 2;
        short year = 1988;
        
        int data = 0;
        data = data ^ day;
        data = data << 8;
        
        data = data ^ month;
        data = data << 16;
        
        data = data ^ year;
        
        System.out.println("day = " + day);
        System.out.println("month = " + month);
        System.out.println("year = " + year);
        System.out.println(data);
        
        short year1 = 0;
        year1 = (short) (year1 ^ data);
        System.out.println("year = " + year1);
        
        data = data >> 16;
        
       
        byte month1 = 0;
        month1 = (byte) (month1 ^ data);
        System.out.println("month = " + month1);
       
        
        data = data >> 8;
        byte day1 = 0;
        day1 = (byte) (day1 ^ data);
        System.out.println("day = " + day1);
    }
}
