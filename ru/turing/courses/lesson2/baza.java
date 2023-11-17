package ru.turing.courses.lesson2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;


public class baza {
    private String im, fam, otch, adr;
    private LocalDate Data;

    public String getIm() {
        return im;
    } //геты

    public String getFam() {
        return fam;
    }

    public String getOtch() {
        return otch;
    }

    public void setFIO(String fam, String im, String otch) {//ввод фио
        this.fam = fam;
        this.im = im;
        this.otch = otch;
    }

    public boolean setData(String date, String regex) {//ввод даты и смена её формата
        DateTimeFormatter Form = DateTimeFormatter.ofPattern(regex);//задание формата строки
        try {
            this.Data = LocalDate.parse(date, Form);//перевод строки с форматом в дату
            return true;
        } catch (DateTimeException exception) {
            return false;
        }
    }

    public boolean setAdr(String Sadr, String regex) {//ввод адреса
        if (Pattern.matches(regex, Sadr)) {//если строка соответсвует щаблону, то сохраняем её
            this.adr = Sadr;
            return true;
        } else {
            return false;
        }
    }

    public int getmonth() {//вывод всех прожитых месяцев
        LocalDate now = LocalDate.now();//нынешняя дата
        Period otl = Period.between(this.Data, now);//нахождение разницы
        return otl.getMonths() + 12 * otl.getYears();
    }

    public int getyears() {//вывод всех прожитых лет
        LocalDate now = LocalDate.now();//нынешняя дата
        Period otl = Period.between(this.Data, now);//нахождение разницы
        return otl.getYears();
    }

    //^страна: .+, город: .+, улица: .+, дом: \\d+, квартира: \\d+$
    public String razd() {//вывод сокращенного адреса
        String s = "\n";//выводимая строка
        int index = 8;//индекс текущего символа(начинается с первой буквы страны)
        var c = this.adr.charAt(index);//текущий символ
        while (c != ',') {//цикл для записи страны
            s += c;
            index++;
            c = adr.charAt(index);
        }
        s += "\nг.";
        index = this.adr.indexOf("город:")+7;//переводим индекс на первую букву города
        c = this.adr.charAt(index);
        while (c != ',') {//цикл для записи страны
            s += c;
            index++;
            c = this.adr.charAt(index);
        }
        s += "\nул.";
        index = this.adr.indexOf("улица:")+7;//переводим индекс на первую букву улицы
        c = this.adr.charAt(index);
        while (c != ',') {//цикл для записи города
            s += c;
            index++;
            c = this.adr.charAt(index);
        }
        s += "\nд.";
        index = this.adr.indexOf("дом:")+5;//переводим индекс на первую цифру номера дома
        c = this.adr.charAt(index);
        while (c != ',') {//цикл для записи дома
            s += c;
            index++;
            c = this.adr.charAt(index);
        }
        s += "\nкв.";
        index = this.adr.indexOf("квартира:")+10;//переводим индекс на первую цифру номера квартиры
        c = this.adr.charAt(index);
        while (c != ',') {//цикл для записи квартиры
            s += c;
            index++;
            if(index==this.adr.length())
                break;
            c = this.adr.charAt(index);
        }
        s += '\n';
        return s;
    }
}
