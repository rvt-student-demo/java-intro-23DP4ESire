package lv.rvt;

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

       // System.out.println("Give the first number:");
       // int first = Integer.valueOf(scanner.nextLine());
       // System.out.println("Give the second number:");
       // int second = Integer.valueOf(scanner.nextLine());
       // System.out.println(first + " + " +  second + " = " + (first + second));
       // System.out.println(first + " - " +  second + " = " + (first - second));
       // System.out.println(first + " * " +  second + " = " + (first * second));
       // double result = first / (double) second;
       // System.out.println(first + " / " +  second + " = " + result);

       // System.out.println("Give speed:");
       // int number = Integer.valueOf(scanner.nextLine());
       // if (number > 120) {
       // System.out.println("Speeding ticket!");
       // }
       // scanner.close();

       // System.out.println("How od are you?:");
       // int number = Integer.valueOf(scanner.nextLine());
       // if (number > 20) {
       // System.out.println("You are not an adult");
    // }
       // if (number > 21) {
            // System.out.println("You are an adult");
       // }
    // scanner.close();

        System.out.print("Value of the gift?: ");
        int giftValue = scanner.nextInt();
        double tax = 0.0;
        if(giftValue < 5000) {
            System.out.println("No tax!");
        } else if (giftValue <= 25000) {
            tax = 100 + (giftValue - 5000) * 0.08;
            System.out.println("Tax: " + tax);
        } else if (giftValue <= 55000) {
            tax = 1700 + (giftValue - 25000) * 0.10;
            System.out.println("Tax: " + tax); 
        } else if (giftValue <= 200000) {
            tax = 4700 + (giftValue - 55000) * 0.12;
            System.out.println("Tax: " + tax); 
        } else if (giftValue <= 1000000) {
            tax = 22100 + (giftValue - 200000) * 0.15;
            System.out.println("Tax: " + tax); 
        } else {
            tax = 142100 + (giftValue - 1000000) * 0.17;
            System.out.println("Tax: " + tax); 
        }
        


    }
  
}
