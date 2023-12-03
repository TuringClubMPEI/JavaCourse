/**
 * Registry class
 *
 * @autor Ivanov Andrew
 * @version 1.0
 */

package ru.turing.courses.lesson3;

import java.util.*;

public class Registry<T extends User> {
    private final Map<String, T> storage = new HashMap<>();

    /**
     * Method of adding an item to the registry
     * @param entry user for adding
     */
    public void add(T entry) {
        storage.put(entry.getKey(), entry);
    }

    /**
     *  Method of removing an item by key
     *  @param key key by which we remove values
     */
    public T removeByKey(String key) {
        return storage.remove(key);
    }

    /**
     * Method of deleting items by value
     * @param value the value that all removable users have
     * @return removed users keys
     */
    public List<String> removeByValue(String value) {
        List<String> removedKeys = new ArrayList<>();
        Iterator<Map.Entry<String, T>> iterator = storage.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, T> entry = iterator.next();
            if (entry.getValue().getValue().equals(value)) {
                iterator.remove();
                removedKeys.add(entry.getKey());
            }
        }
        return removedKeys;
    }

    /** registry cleanup method */
    public void clear() {
        storage.clear();
    }

    /** method to get the value by key
     * @param key users key
     * @return value of user
     */
    public T getByKey(String key) {
        return storage.get(key);
    }

    /** Method to get values by name
     * @param name name(value) of the users we want to get the values from
     * @return keys of users with current name
     */
    public List<String> getByName(String name) {
        List<String> keys = new ArrayList<>();
        for (T entry : storage.values()) {
            if (entry.getValue().equals(name)) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }

    /** Additional method for getting the number of records in the registry
     * @return number of records
     */
    public int size() {
        return storage.size();
    }

    /** Override toString() to display in console */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{\n");
        for (Map.Entry<String, T> entry : storage.entrySet()) {
            result.append(entry.getKey())
                    .append(": ")
                    .append(entry.getValue().getValue())
                    .append("\n");
        }
        result.append("}");
        return result.toString();
    }

}
