package ru.turing.courses.lesson3;


import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Registry<Student> studentRegistry = new Registry<>();

        Student alice = new Student("Alice", 20);
        Student bob = new Student("Bob", 22);
        Student charlie = new Student("Charlie", 21);

        studentRegistry.add(alice.GetName(), alice);
        studentRegistry.add(bob.GetName(), bob);
        studentRegistry.add(charlie.GetName(), charlie);

        Student student1 = studentRegistry.getByKey(alice.GetName());

        System.out.println("Student 1: " + student1);


        Student removedStudent = studentRegistry.removeByKey(bob.GetName());
        System.out.println("Removed Student: " + removedStudent);

        // Удаляем студентов по значению (возможно, у нас есть несколько студентов с одинаковым возрастом)
        List<String> removedKeys = studentRegistry.removeByValue(new Student("", 21));
        System.out.println("Removed Students with age 21, Keys: " + removedKeys);

        // Получаем всех студентов с именем "Alice"
        List<Student> studentsWithNameAlice = studentRegistry.getByName("Alice");
        System.out.println("Students with name Alice: " + studentsWithNameAlice);

        // Печатаем размер
        System.out.println("Registry Size: " + studentRegistry.size());

        // Проверяем наличие ключа
        System.out.println("Contains key 'Alice': " + studentRegistry.containsKey("Alice"));

        // Проверяем наличие значения
        System.out.println("Contains value with age 20: " + studentRegistry.containsValue(new Student("", 20)));

        // Очищаем реестр
        studentRegistry.clear();

        // Печатаем размер реестра после очистки
        System.out.println("Registry Size after clear: " + studentRegistry.size());
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String GetName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}