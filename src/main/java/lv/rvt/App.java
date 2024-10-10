package lv.rvt;

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
      
            System.out.println("Ievadi skaitli:");
               int number = Integer.valueOf(scanner.nextLine());
       
            if (number < 0) {
                System.out.println("Faktoriāls nav definēts negatīviem skaitļiem.");
            } else {
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                System.out.println("Faktoriāls: " + factorial);
            }
       
               scanner.close();  
       
       

    



    }
  
}
