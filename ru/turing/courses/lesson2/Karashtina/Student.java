package ru.turing.courses.lesson2.Karashtina;

public class Student implements Studying {

    // Определяем поле класса
    protected String Subject;

    // Создаем конструктор класса
    public Student(String Subject) {
        this.Subject = Subject;
    }

    // Получаем доступ к данным уже созданного поля
    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    // Переопределяем методы интерфейса
    @Override
    public void study() {
        System.out.println("Я изучаю предмет " + Subject);
    }

    @Override
    public void passExam(boolean passed) {
        if (passed) {
            System.out.println("Студент сдал экзамен по предмету " + Subject);
        } else {
            System.out.println("Студент не сдал экзамен по предмету " + Subject);
        }
    }
}

