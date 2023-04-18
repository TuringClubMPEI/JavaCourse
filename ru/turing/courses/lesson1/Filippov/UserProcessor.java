package ru.turing.courses.lesson1.Filippov;

public class UserProcessor {
    private String fio;
    private String date;
    private String address;

    public String getFio() {
        return this.fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public String getShortAddress() {
        String[] addressSplit = address.split("((: )|:|,)");//разделим либо ":", либо ",", либо ": "
        return (addressSplit[1] + "\nг. " + addressSplit[3] + "\nул. " + addressSplit[5] + "\nд. " + addressSplit[7] + "\nкв. " + addressSplit[9]);
    }

    public String getCountAge() {
        String[] dataSplit = date.split("\\.");//создаем массив из дня месяца и года
        int year = Integer.parseInt(dataSplit[2]);//переводим из типа стринг в тип инт
        int months = Integer.parseInt(dataSplit[1]);//аналогично
        String ageString = "";
        if ((year == 2023) & (months > 4)) {
            ageString = "Ошибка";
        } else {
            year = 2023 - year - 1;//считаем года
            months = 12 - months + 4;//+4 т.к. сейчас апрель ;)считаем месяцы
            if (months >= 12) {//проверка чтобы не писать 12 месяцев
                year++;
                months = months - 12;
            }
            //пусть я родился 20.03.2020, 4-ый месяц, я еще не прожил, поэтому 12-months+4
            ageString = Integer.toString(year) + " лет(года) " + Integer.toString(months) + " месяцев(месяца)";
        }
        return ageString;

    }
}


