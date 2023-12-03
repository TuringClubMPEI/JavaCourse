/**
 * Abstract class from which the User inherits
 * @autor Ivanov Andrew
 * @version 1.0
 * @see User
 */
package ru.turing.courses.lesson3;

abstract class PersonEntry{
    /**
     * Key field
     */
    protected String key;

    /**
     * Constructor by key
     * @param key key
     */
    public PersonEntry(String key) {
        this.key = key;
    }

    /**
     * Method to get users key
     * @return key
     */
    public String getKey() {
        return key;
    }

    /**
     * Method to get users value
     * @return value
     */
    public abstract String getValue();
}