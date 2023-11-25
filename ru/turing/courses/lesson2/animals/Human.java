package ru.turing.courses.lesson2.animals;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    private String date;
    private String name;
    private boolean sex;
    private String adress;


    public Human(String date, String name, boolean sex, String adress) {
        this.date = date;
        this.name = name;
        this.sex = sex;
        this.adress = adress;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setDge(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    //adress print method
    public void adress(String adress) {
        String[] parts = adress.split(",");
        for (String i : parts) {
            System.out.print(i + " ");
        }
    }

    public void livedYearMonths(String date) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date birthDate = null;
        Date date2 = new Date();
        try {
            birthDate = format.parse(date);

        } catch (Exception e) {
            e.printStackTrace();
        }
        long diff = date2.getTime() - birthDate.getTime();
        long yearTime = 365L * 24L * 60L * 60L * 1000L;
        int livedYears = (int) (diff / (yearTime));
        int livedMonths = (int) (diff / (30L * 24L * 60L * 60L * 1000L));
        System.out.println("You've lived for " + livedYears + " years and " + livedMonths + " months.");
    }
}

