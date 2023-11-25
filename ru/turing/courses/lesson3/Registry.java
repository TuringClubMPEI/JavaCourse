package ru.turing.courses.lesson3;

import ru.turing.courses.lesson3.objects.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//todo Задание со звездочкой - сделать Registry через generics.
// Для этого почитать, что такое дженерики и о том, как заставить класс с ними работать
// Сделать абстрактный доменный класс (похожий на Animal из прошлого урока для этого)
public class Registry<T extends User> {
    private final Map<String, T> storage = new HashMap<>(); //todo поменять Object, Object на то, что будет у вашего класса в примере

    public void add(String key, T value) {
        storage.put(key, value);
    }

    public T removeByKey(String key) {
        return storage.remove(key);
    }

    public List<String> removeByValue(T value) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, T> userSet : storage.entrySet()) {
            if (userSet.getValue().equals(value)) {
                result.add(userSet.getKey());
                removeByKey(userSet.getKey());
            }
        }
        return result;
    }

    public void clear() {
        storage.clear();
    }

    public T getByKey(String key) {
        return storage.get(key);
    }

    public List<T> getByName(String nickname) {
        List<T> result = new ArrayList<>();
        for (T value : storage.values()) {
            if (value.getNickname().equals(nickname)) {
                result.add(value);
            }
        }
        return result;
    }

    public double getTotalUserBalance() {
        double result = 0;
        for (T value : storage.values()) {
            result += value.getBalance();
        }
        return result;
    }

    public void addBalanceToAll(double amount) {
        for (T value : storage.values()) {
            value.addBalance(amount);
        }
    }
    //todo написать и реализовать методы
}
