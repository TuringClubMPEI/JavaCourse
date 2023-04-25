package ru.turing.courses.lesson3.Karashtina;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//создаем регистр
public final class ProductRegistry {
    //
    private static final ProductRegistry instance = new ProductRegistry();
    public static ProductRegistry getInstance() {
        return instance;
    }
    private static Map<Integer, String> productMap;

   //создаем объект класса HashMap
    private ProductRegistry() {
        productMap = new ConcurrentHashMap<Integer, String>();
    }
    //добавляем элементы в HashMap
    public void add(Integer key, String value) {
        productMap.put(key, value);
    }
    //получаем значения по ключу
    public String getByKey(Integer key) {
        return productMap.get(key);
    }
    //удаляем значения по ключу
    public String removeByKey(Integer key) {
        return productMap.remove(key);
    }
    //узнаем размер HashMap
    public Integer numberOfKeys() {
        return productMap.size();
    }
    //проверяем, содержит ли HashMap данный ключ
    public boolean containsKey(Integer key) {
        return productMap.containsKey(key);
    }
    //создаем лист, перебираем записи в HashMap циклом for, проверяем на соответствие заданному значению
    // с помощью метода equals(). Ключи удаляемых записей добавляются в ArrayList,
    // который затем используется для удаления записей из HashMap.
    public static List<Integer> removeByValue(String value) {
        List<Integer> keysToRemove = new ArrayList<>();
        for (Map.Entry<Integer, String> entry: productMap.entrySet()) {
            if (entry.getValue().equals(value)) {
                keysToRemove.add(entry.getKey());
            }
        }
        for (Integer key: keysToRemove) {
            productMap.remove(key);
        }
        return keysToRemove;
    }
    //создаем лист, перебираем записи в HashMap циклом for, проверяем на соответствие заданному значению
    // с помощью метода equals(). Ключи найденных записей добавляются в ArrayList,
    // который затем используется для возврата списка значений.
    public static List <Integer> getByName(String name) {
        List<Integer> valueToGet = new ArrayList<>();
        for (Map.Entry<Integer, String> entry: productMap.entrySet()) {
            if (entry.getValue().equals(name)) {
                valueToGet.add(entry.getKey());
            }
        }
        return valueToGet;
    }
   //очищаем HashMap
    public void clear() {
        productMap.clear();
    }
}

