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

    public void add(T key, T1 value){ //Реализация добавления в реестр
        registryEntry.put(key, value);
    }

    public T1 getByKey(T key){ //Реализация метода, возвращающего значение по ключу
        if (registryEntry.isEmpty()) return null;
        else if (!registryEntry.containsKey(key)) return null;
        return registryEntry.get(key);
    }

    public void clear(){ //Реализация полной очистки реестра
        registryEntry.clear();
    }

    public T1 removeByKey(T key){ //Удаление по ключу - возвращается значение, состоящие в соответствии ключу в записи
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
