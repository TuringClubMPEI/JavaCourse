package ru.turing.courses.lesson2.Karashtina;

public class MyClass {
    public static void main(String[] args) {
        // Вторая реализация интерфейса
        Student studyingStudent = new Student("Математика");
        studyingStudent.study();
        studyingStudent.passExam(true);
    }
}
