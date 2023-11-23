package ru.turing.courses.lesson3;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Registry<T extends Number> {
    private final Map<Integer, T> storage = new HashMap<>();

    public void add(Integer key, T value) {
        this.storage.put(key, value);
    }

    public T removeByKey(Integer key) {
        T value = this.storage.get(key);
        this.storage.remove(key);
        return value;
    }

    public ArrayList removeByValue(T value) {
        ArrayList<Integer> Keys = new ArrayList<Integer>();
        for (Map.Entry<Integer, T> entry : this.storage.entrySet()) {
            if (value == entry.getValue()) {
                Keys.add(entry.getKey());
                this.storage.remove(entry.getKey());
            }
        }
        return Keys;
    }

    public void clear() {
        this.storage.clear();
    }

    public T getByKey(Integer key) {
        T value = this.storage.get(key);
        return value;
    }

    public ArrayList getByName(T value) {
        ArrayList<Integer> Keys = new ArrayList<Integer>();
        for (Map.Entry<Integer, T> entry : this.storage.entrySet()) {
            if (value == entry.getValue())
                Keys.add(entry.getKey());
        }
        return Keys;
    }
    public Integer getSize(){
        return this.storage.size();
    }
}
