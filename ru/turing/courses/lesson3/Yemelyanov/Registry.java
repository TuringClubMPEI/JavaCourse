package ru.turing.courses.lesson3.Yemelyanov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author SteklotaraBlizz
 *
 */

public class Registry<T extends String, T1 extends Alcohol> {
    private Map<T, T1> registryEntry = new HashMap<>();
    private List<T> deletedKeys;
    //Реализация добавления в реестр
    public void add(T key, T1 value){
        registryEntry.put(key, value);
    }
    //Реализация метода, возвращающего значение по ключу
    public T1 getByKey(T key){
        if (registryEntry.isEmpty()) return null;
        else if (!registryEntry.containsKey(key)) return null;
        return registryEntry.get(key);
    }
    //Реализация полной очистки реестра
    public void clear(){
        registryEntry.clear();
    }
    //Удаление по ключу - возвращается значение, состоящие в соответствии ключу в записи
    public T1 removeByKey(T key){
        T1 currentEntry;
        if (registryEntry.isEmpty()) return null;
        else if (!registryEntry.containsKey(key)) return null;
        else {
            currentEntry = registryEntry.get(key);
            registryEntry.remove(key);
        }
        return currentEntry;
    }

    //Удаление по значению - возвращается набор ключей, состоящий в соответствии значению в записи
    public List<T> removeByValue(T1 value){
        if(deletedKeys == null){
            deletedKeys = new ArrayList<>();
        } else {
            if (!registryEntry.isEmpty() && registryEntry.containsValue(value)) {
                for (Map.Entry<T, T1> entry : registryEntry.entrySet()) {
                    T1 tempValue = entry.getValue();
                    if (tempValue.equals(value)) {
                        deletedKeys.add(entry.getKey());
                        registryEntry.remove(entry.getKey());
                    }
                }
            }
        }
        return deletedKeys;
    }
}
