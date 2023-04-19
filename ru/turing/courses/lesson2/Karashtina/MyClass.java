package ru.turing.courses.lesson2.Karashtina;

public class MyClass {
    public static void main(String[] args) {
        // Вторая реализация интерфейса
        Studying studyingStudent = new Student("Математика");
        studyingStudent.study();
        ((Student) studyingStudent).passExam(true);
    }
}
