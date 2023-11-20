package pl.javastart.task;

public class NameUndefinedException extends RuntimeException {
    private static final int MIN_FIRSTNAME_LENGTH = 2;
    private static final int MIN_LASTNAME_LENGTH = 2;

    static void checkFirstName(String firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("Imię nie jest prawidłowe " + firstName);
        } else if (firstName.length() < MIN_FIRSTNAME_LENGTH) {
            throw new IllegalArgumentException("Imię powinno być dłuższe niż " + MIN_FIRSTNAME_LENGTH + " znaki");
        }
    }

    static void checkLastName(String lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException("Nazwisko nie jest prawidłowe " + lastName);
        } else if (lastName.length() < MIN_LASTNAME_LENGTH) {
            throw new IllegalArgumentException("Nazwisko powinno być dłuższe niż " + MIN_LASTNAME_LENGTH + " znaki");
        }
    }
}
