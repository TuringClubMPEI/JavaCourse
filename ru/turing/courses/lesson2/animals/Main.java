package ru.turing.courses.lesson2.animals;

public class Main {
    public static void main(String[] args) {

        Cat myCat = new Cat("Whiskers", 3, "Gray", "Short-haired");
        Dog myDog = new Dog("Buddy", 2, "Brown", "Labrador");

        myCat.eat();
        myCat.sleep();

        myDog.eat();
        myDog.sleep();


        myCat.meow();
        myDog.bark();
    }
}
