package ru.turing.courses.lesson2.animals;

public class Lion extends Animal {
    private boolean workInCircus;

    public Lion(String name, int legs, String sex, int age, boolean workInCircus) {
        super(name, legs, sex, age);
        this.workInCircus = workInCircus;
    }

    public boolean isWorkInCircus() {
        return workInCircus;
    }

    @Override
    public void run() {
        System.out.println("Лев нападает");
        ;
    }

    @Override
    public void makeSound() {
        System.out.println("Рааар");
        ;
    }

    public void setWorkInCircus(boolean workInCircus) {
        this.workInCircus = workInCircus;
    }

    public void LionMakeTrick(boolean workInCircus) {
        if (workInCircus) {
            System.out.println("Лев открыл рот и ждет пока туда засунут голову");
        }
    }
}

