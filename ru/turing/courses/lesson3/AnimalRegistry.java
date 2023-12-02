package ru.turing.courses.lesson3;

import ru.turing.courses.lesson2.animals.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AnimalRegistry<K extends Number, V extends Animal> extends Registry<K, V>{
    protected String name;

    public AnimalRegistry(String name) {
        this.name = name;
    }

    public List<String> getByName(String name) {
        List <String> ans = new ArrayList<>();
        Animal value;
        for (Map.Entry<K, V> entry : storage.entrySet()) {
            value = entry.getValue();
            if (value.getName().equals(name))
                ans.add("found " + value.getName());
        }
        if (ans.isEmpty())
            ans.add("Nobody found :(");
        return ans;
    }
    @Override
    public void printAll() {
        System.out.print("Our pretty donkeys:\n");
        for (Map.Entry<K, V> entry : storage.entrySet()) {
            System.out.print(entry.getKey() + ") " + entry.getValue().getName() + "\n");
        }
    }
}
