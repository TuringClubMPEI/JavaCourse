package ru.turing.courses.lesson5;

public class User {
    private String name;
    private long id;
    private int age;

    User(String name, long id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    User() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
