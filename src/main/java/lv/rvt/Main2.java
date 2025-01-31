package lv.rvt;


public class Main2 {

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);

        Student ollie = (Student) persons.get(1);
        for (int i = 0; i < 25; i++) {
            ollie.study();
        }

        System.out.println(ollie);
    }
}