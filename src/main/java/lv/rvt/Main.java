package lv.rvt;

import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = Helper.getReader("persons.csv");
        // String line1 = reader.readLine();
        // System.out.println(line1);

        // Katrs readLine() metodes izsaukums atgriež nākamo rindiņu no teksta faila
        System.out.println(reader.readLine()); // Atgriež 1 rindu
        System.out.println(reader.readLine()); // Atgriež 2 rindu
        System.out.println(reader.readLine()); // Atgriež 3 rindu
        System.out.println(reader.readLine()); // Atgriež 4 rindu
        
    }
}