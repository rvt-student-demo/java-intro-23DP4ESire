package lv.rvt;

import java.util.*;
public class App 
{
    public static void main(String[] args) {
    int[] val = {0, 1, 2, 3}; 

    int sum = 0;

    for (int number : val) {
        sum += number;
    }
    System.out.println( "Sum of all numbers = " + sum);

    }
}