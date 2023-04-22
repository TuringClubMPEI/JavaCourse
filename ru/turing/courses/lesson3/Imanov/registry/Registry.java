package ru.turing.courses.lesson3.Imanov.registry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import ru.turing.courses.lesson3.Imanov.user.User;

public class Registry<Type extends User> {
    private final Map<Integer, Type> info = new HashMap<>();

    public void add(Integer key, Type value) {
        if (key == null){
            System.out.println("key is null");
        } else if (value == null && !info.containsKey(key)){
            info.put(key, value);
        } else if (key.equals(value.getUserId())) {
            info.put(key, value);
        } else {
            System.out.println("Wrong key for user");
        }
    }


    public Type removeByKey(Integer key){
        if (key == null) {
            System.out.println("key is null");
            return null;
        } else if (info.containsKey(key)){
            Type value = info.get(key);
            info.remove(key);
            return value;
        } else {
            System.out.println("key not found");
            return null;
        }
    }

    public List<Integer> removeByValue(Type value){
        List<Integer> KeyForRemovedValues = new ArrayList<>();

        if (!info.isEmpty()) {
            if (value != null) {
                info.forEach((InfoKey, InfoValue) -> {
                    if (InfoValue.equals(value)) {
                        KeyForRemovedValues.add(InfoKey);
                    }
                });
            } else {
                for (Integer key : info.keySet()){
                    if (info.get(key) == null){
                        KeyForRemovedValues.add(key);
                    }
                }
            }
        }

        KeyForRemovedValues.forEach(this::removeByKey);

        return KeyForRemovedValues;
    }

    public void clear(){
        info.clear();
    }

    public Type getByKey(Integer key){
        if (info.containsKey(key)){
            return info.get(key);
        } else {
            System.out.println("key not found");
            return null;
        }
    }

    public List<Type> getByName(String name){
        List<Type> ValuesWithTheGivenName = new ArrayList<>();

        if (!info.isEmpty()) {
            info.forEach((InfoKey, InfoValue) -> {
                if (InfoValue.getUserName().equals(name)) {
                    ValuesWithTheGivenName.add(InfoValue);
                }
            });
        }

        return ValuesWithTheGivenName;
    }

    public void printInfo(){
        if (!info.isEmpty()) {
            info.forEach((InfoKey, InfoValue) -> {
                if (InfoValue != null) {
                    System.out.println("id: " + InfoKey + ", Имя: " + InfoValue.getUserName());
                } else {
                    System.out.println("id: " + InfoKey + ", Запись: null");
                }
            });
        } else {
            System.out.println("info is Empty");
        }
    }
}
