package lv.rvt;

import java.util.*;
public class App 
{
    public static void main(String[] args )
    {
        Scanner scanner = new Scanner(System.in);
     

        System.out.print("How many times? ");
        int count = scanner.nextInt();

        int i = 0;
        while (i < count) {
            printText();
            i++;
        }
                
        scanner.close();
        
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
  
}
