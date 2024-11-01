package lv.rvt;

import java.util.*;
public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        List<Integer> birthYears = new ArrayList<>();

        System.out.println("Enter name and birth year (name,year) or press Enter to finish:");

        while (true) {
            String entry = scanner.nextLine();
            if (entry.isEmpty()) {
                break;
            }
            String[] parts = entry.split(",");
            if (parts.length == 2) {
                String name = parts[0].trim();
                try {
                    int year = Integer.parseInt(parts[1].trim());
                    names.add(name);
                    birthYears.add(year);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid year format. Please enter a valid year.");
                }
            } else {
                System.out.println("Invalid input format. Please enter in the format 'name,year'.");
            }
        }

        if (!names.isEmpty() && !birthYears.isEmpty()) {
            String longestName = names.get(0);
            for (String name : names) {
                if (name.length() > longestName.length()) {
                    longestName = name;
                }
            }

            double averageBirthYear = birthYears.stream()
                                                 .mapToInt(Integer::intValue)
                                                 .average()
                                                 .orElse(0.0);

            System.out.printf("\nLongest name: %s%n", longestName);
            System.out.printf("Average of the birth years: %.1f%n", averageBirthYear);
        }

        scanner.close();    
    }
}