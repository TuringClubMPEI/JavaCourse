package ru.turing.courses.lesson3;

public class Solution {
    public static void main(String[] args) {
        //creating new registry
        Registry<User> registry = new Registry<>();
        //adding some users
        registry.add(new User("1","Vovan"));
        registry.add(new User("2","Vovan"));
        registry.add(new User("3","Andy"));
        registry.add(new User("4","VVP"));
        //printing current registry for comparison
        System.out.println(registry);
        //removing by key to see changes in registry
        registry.removeByKey("3");
        System.out.println(registry);
        //removing by value..
        registry.removeByValue("Vovan");
        System.out.println(registry);
        //test the registry cleanup method
        registry.clear();
        System.out.println(registry);
        //refill the registry
        registry.add(new User("1","Vovan"));
        registry.add(new User("2","Vovan"));
        registry.add(new User("3","Andy"));
        registry.add(new User("4","VVP"));
        //test for other methods
        System.out.println(registry.getByKey("2").getValue());
        System.out.println(registry.getByName("Vovan"));
        System.out.println(registry.size());


    }


}
