package ru.turing.courses.lesson3.filippov;

import java.util.Objects;

public class YandexTaxi extends Record {

    protected int yandexRubles;

    public YandexTaxi(String id, String info, int yandexRubles) {
        super(id, info);
        this.yandexRubles = yandexRubles;
    }

    public int getYandexRubles() {
        return yandexRubles;
    }



    @Override
    public String getRecord() {
        return "Id:" + getId() + "\nPhone number:" + info + "\nYandex Rubels: " + yandexRubles;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getYandexRubles());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof YandexTaxi yandexTaxi))//yandexTaxi это переменная в которую происходит приведение переменной o
            return false;//instanceof проверяет явл ли о экземплярем класса YandexTAxi
        return  Objects.equals(getInfo(), yandexTaxi.getInfo()) && (getYandexRubles()==yandexTaxi.getYandexRubles());
        //я так понимаю Object.equals он подстратвает сравнения для любого типа данных условно он понимает что getInfo это стринг и сравнивает как строки ?
    }
}
