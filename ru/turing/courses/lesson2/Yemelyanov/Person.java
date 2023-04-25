package ru.turing.courses.lesson2.Yemelyanov;


import java.time.LocalDate;

public class Person {
    private LocalDate dateOfBirth;
    private String adress;

    Person(LocalDate dateOfBirth, String adress){ //Конструктор с параметрами: адрес(строкой) и дата рождения
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
    }

    public void setAdress(String adress){ //Сеттер для адреса
        this.adress = adress;
    }

    public String getAdress(){
        return adress;
    } //Геттер для адреса

    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    } //Геттер для дня рождения

}
