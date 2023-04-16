package ru.turing.courses.lesson2.Imanov.Animal;
import java.util.Objects;

public class Lama extends Animal {
    // так уш вышло что самцы лам в схватке за даму ламу могут повредить репродуктивную систему соперника
    boolean balls;

    // конструктор
    public Lama(String name, int age, Gender sex, int mood, boolean balls){
        super(name, age, sex, mood);
        // промолчу... (Простите пожалуйста)
        if (sex != Gender.MALE) {
            this.balls = false;
        } else {
            this.balls = balls;
        }
    }

    // геттер и сеттер
    public boolean isBalls() {
        return balls;
    }

    public void setBalls(boolean balls) {
        if (sex != Gender.MALE) {
            this.balls = false;
        } else {
            this.balls = balls;
        }
    }

    // переопределенные функции-члены класса из абстрактного родителя
    @Override
    public void voice() {
        System.out.println("Я Лама");
    }

    @Override
    public void sleep() {
        if (this.mood + 1  <= 100) {
            this.mood += 1;
        } else {
            this.mood = 100;
        }
    }

    // ламы плюются
    public void spit(){
        if (this.mood + 5  <= 100) {
            this.mood += 5;
        } else {
            this.mood = 100;
        }
    }


    // переопределенные функции-члены класса из Object
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lama lama = (Lama) o;
        return age == lama.age && mood == lama.mood && Objects.equals(name, lama.name)
                && sex == lama.sex && balls == lama.balls;
    }

    @Override
    public int hashCode() {
        return Objects.hash(balls);
    }
}
