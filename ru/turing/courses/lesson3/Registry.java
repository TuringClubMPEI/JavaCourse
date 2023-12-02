package ru.turing.courses.lesson3;

import java.util.*;

public abstract class Registry <K extends Number, V>{
    protected final Map<K, V> storage = new HashMap<>();

    public void add(K key, V value) {
        storage.put(key, value);
    }
    public V removeByKey (K key) {
        return storage.remove(key);
    }
    public List<K> removeByValue (V value) {
        List <K> ans = new ArrayList<>();
        Iterator<Map.Entry<K, V>> iterator = storage.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            if (entry.getValue().equals(value)) {
                ans.add(entry.getKey());
                iterator.remove();
            }
        }
        return ans;
    }

    public void clear() {
        storage.clear();
    }
    public V getByKey (K key) {
        return storage.get(key);
    }
    public void printAll() {
        for (Map.Entry<K, V> entry : storage.entrySet()) {
            System.out.print(entry.getKey() + ") " + entry.getValue() + "\n");
        }
    }
}
