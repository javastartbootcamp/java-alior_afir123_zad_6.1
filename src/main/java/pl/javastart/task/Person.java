package pl.javastart.task;

import static pl.javastart.task.IncorrectAgeException.checkAge;
import static pl.javastart.task.NameUndefinedException.checkFirstName;
import static pl.javastart.task.NameUndefinedException.checkLastName;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private final String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        checkFirstName(firstName);
        checkLastName(lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    void setFirstName(String firstName) {
        checkFirstName(firstName);
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        checkLastName(lastName);
        this.lastName = lastName;
    }

    void setAge(int age) {
        checkAge(age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
