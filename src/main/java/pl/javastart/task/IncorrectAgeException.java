package pl.javastart.task;

public class IncorrectAgeException {

    static void checkAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Wiek nie jest prawidłowy " + age);
        }
    }
}

