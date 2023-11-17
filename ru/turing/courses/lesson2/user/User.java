package ru.turing.courses.lesson2.user;
import java.time.LocalDateTime;

public class User {
    //ФИО пользователя
    private String fio;
    //дата рождения пользователя - 3 поля
//год
    private int bYear;
    //месяц
    private int bMonth;
    //день
    private int bDay;

    //адрес пользователя
    private String country;
    private String town;
    private String street;
    private int home;
    private int flat;

    public User(String fio, int bYear, int bMonth, int bDay, String country, String town, String street, int home, int flat) {
        this.bYear = bYear;
        this.bMonth = bMonth;
        this.bDay = bDay;
        this.fio = fio;
        this.country = country;
        this.town = town;
        this.street = street;
        this.home = home;
        this.flat = flat;
    }

    //метод расчета кол-ва полных лет
    public int getCountYears() {
        //текущая дата
        LocalDateTime currentDateTime = LocalDateTime.now();
        //разница между годами
        int difYears = currentDateTime.getYear() - bYear;
        //разница между месяцами
        int difMonths = currentDateTime.getMonthValue() - bMonth;
        //разница между днями
        int difDays = currentDateTime.getDayOfMonth() - bDay;
        //Расчет количества полных лет, количества полных месяцев
        int countYear = difYears;
        //Расчет количества полных лет
        countYear=difYears;
        //особенности при расчете количества полных лет, количества полных месяцев
        if(difDays>0){
            if(( countYear!=0)&&(difMonths<0))
                countYear-=1;
        }
        if(difDays<=0){
            if(( countYear!=0)&&(difMonths<0))
                countYear-=1;
            if(( countYear!=0)&&(difMonths==0))
                countYear -= 1;
        }
        return countYear;
    }

    //метод расчета кол-ва полных месяцев
    public int getCountMonths() {
        //текущая дата
        LocalDateTime currentDateTime = LocalDateTime.now();
        //разница между годами
        int difYears = currentDateTime.getYear() - bYear;
        //разница между месяцами
        int difMonths = currentDateTime.getMonthValue() - bMonth;
        //разница между днями
        int difDays = currentDateTime.getDayOfMonth() - bDay;
        //Расчет количества полных лет, количества полных месяцев
        int countMonth = difYears * 12 + difMonths;
        //Расчет количества полных лет, количества полных месяцев
        countMonth=difYears*12+difMonths;
        //особенности при расчете количества полных лет, количества полных месяцев
        if(difDays<=0){
            if(( difYears==0)&&(difMonths>0))
                countMonth -= 1;
            if(( difYears!=0)&&(difMonths<0))
                countMonth -= 1;
            if(( difYears!=0)&&(difMonths>0))
                countMonth -= 1;
            if(( difYears==0)&&(difMonths<0))
                countMonth -= 1;
            if(( difYears!=0)&&(difMonths==0))
                countMonth -= 1;
        }
        return countMonth;
    }
    //подправила под ответ
    @Override
    public String toString() {
        return country+"\n"+"г. "+town+"\nул. "+street+"\nд. "+home+"\nкв. "+flat;
    }
}
