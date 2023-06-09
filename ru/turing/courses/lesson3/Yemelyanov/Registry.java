package ru.turing.courses.lesson3.Yemelyanov;

import java.util.*;

/**
 *
 * @author SteklotaraBlizz
 *
 */

public class Registry<String, T extends Alcohol> {
    private Map<String, T> registryEntry = new HashMap<>();

    public void add(String key, T value){ //Реализация добавления в реестр
        registryEntry.put(key, value);
    }

    public T getByKey(String key){ //Реализация метода, возвращающего значение по ключу
        if (registryEntry.isEmpty()) {
            return null;
        }
        else if (!registryEntry.containsKey(key)) {
            return null;
        }
        return registryEntry.get(key);
    }

    public void clear(){ //Реализация полной очистки реестра
        registryEntry.clear();
    }

    public T removeByKey(String key){ //Удаление по ключу - возвращается значение, состоящие в соответствии ключу в записи

        if (registryEntry.isEmpty()) {
            return null;
        }
        else if (!registryEntry.containsKey(key)) {
            return null;
        }

        return registryEntry.remove(key);
    }

    //Удаление по значению - возвращается набор ключей, состоящий в соответствии значению в записи
    public List<String> removeByValue(T value){
        List<String> deletedKeys = new ArrayList<>();

        Iterator<Map.Entry<String, T>> iterator = registryEntry.entrySet().iterator();

        if (value == null){
            Map.Entry<String, T> entry = iterator.next();
            while(iterator.hasNext()){
                if(entry.getValue() == null){
                    deletedKeys.add(entry.getKey());
                    iterator.remove();
                }
            }
        } else{
            Map.Entry<String, T> entry = iterator.next();
            while(iterator.hasNext()){
                if(value.equals(entry.getValue())){
                    deletedKeys.add(entry.getKey());
                    iterator.remove();
                }
            }
        }
        return deletedKeys;
    }

}


