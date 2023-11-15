package pl.javastart.task;

public class Main {

    public static void main(String[] args) throws NameUndefinedException {

        try {
            Person person = new Person("Jan", null, 25, "1234567890");
            System.out.println(person);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Koniec programu");
        }

        try {
            Person person2 = new Person("Jan", "Kowalski", 25, "1234567890");
            System.out.println(person2);
            //person2.setFirstName(null);
            person2.setAge(-10);
            System.out.println(person2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Koniec programu");
        }
    }
}
