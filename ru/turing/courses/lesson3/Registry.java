package ru.turing.courses.lesson3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Registry <K extends Number, String>{
    //1st - key, 2nd - objects
    private final Map<K, String> storage = new HashMap<>();
    public void add(K key, String value) {
        storage.put(key, value);
    }
    public String removeByKey (K key) {
        return storage.remove(key);
    }
    public List<K> removeByValue (String value) {
        List <K> ans = null;
        for (Map.Entry<K, String> entry : storage.entrySet()) {
            if (value.equals(entry.getValue())) {
                K elem = entry.getKey();
                ans.add(elem);
            }
        }
        return ans;
    }
    public void clear() {
        storage.clear();
    }
    public String getByKey (K key) {
        return storage.get(key);
    }
    public List <String> getByName(String name) {
        List <String> ans = null;
        String value;
        for (Map.Entry<K, String> entry : storage.entrySet()) {
            value = entry.getValue();
            // Тут идея почему-то ругается на метод contains, о котором на форумах говорят как о рабочем.
            // Оставил вариант с полным совпадением, хоть как будет работать. Можно было бы ещё сделать
            // реализацию с посимвольным перебором, но как-то это уже слишком на низком уровне
            //if (value.contains(name)) {
            //    ans.add(value);
            //}
            if (value.equals(name)) {
                ans.add(value);
            }
        }
        return ans;
    }
}
