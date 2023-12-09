package ru.turing.courses.lesson3;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //creating new registry
        Registry<User> registry = new Registry<>();
        //adding some users
        registry.add(new User("1", "Vovan"));
        registry.add(new User("2", "Vovan"));
        registry.add(new User("3", "Andy"));
        registry.add(new User("4", "VVP"));
        //printing current registry for comparison
        System.out.println(registry);
        //removing by key to see changes in registry
        registry.removeByKey("3");
        System.out.println(registry);
        //removing by value..
        User vovan = new User("3", "Vovan");
        List<String> removedKeys = new ArrayList<>();
        removedKeys = registry.removeByValue(vovan);
        System.out.println(registry);
        for (String s : removedKeys) {
            System.out.print(s + " ");
        }
        System.out.println();
        //test the registry cleanup method
        registry.clear();
        System.out.println(registry);
        //refill the registry
        registry.add(new User("1", "Vovan"));
        registry.add(new User("2", "Vovan"));
        registry.add(new User("3", "Andy"));
        registry.add(new User("4", "VVP"));
        //test for other methods
        System.out.println(registry.getByKey("2").getName());
        System.out.println(registry.getByName("Vovan"));
        System.out.println(registry.size());


    }


}
