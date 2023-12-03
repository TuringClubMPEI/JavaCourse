/**
 * User class
 *
 * @autor Ivanov Andrew
 * @version 1.0
 */
package ru.turing.courses.lesson3;

import java.util.Objects;

public class User extends PersonEntry {
    /**
     * Username field
     */
    private String name;

    /**
     * Constructor by name&key
     */
    public User(String key, String name) {
        super(key);
        this.name = name;
    }

    /**
     * Overriding the abstract class method
     */
    @Override
    public String getValue() {
        return name;
    }

    /**
     * Overriding .equals() for comparison
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    /**
     * Overriding .hashCode() to get hashcode by name
     */
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
