package ru.turing.courses.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        //Количество полных лет, количество полных месяцев
        int countYear,countMonth;
        //Ввод ФИО пользователя
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ФИО: ");
        String name = console.nextLine();
        while (name.length()==0) {
            System.out.println("Введена пустая строка. Введите повторно ФИО.");
            name = console.nextLine();
        }
        //Ввод даты рождения - рассматриваю ситуацию, когда нет некорректного ввода
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите дату рождения: ");
        String getDate= reader.readLine();
        //массив date содержит день, месяц, год
        int[] date= Arrays.stream(getDate.split("\\.")).mapToInt(Integer::parseInt).toArray();
        //текущая дата
        LocalDateTime currentDateTime = LocalDateTime.now();
        //разница между годами
        int difYears=currentDateTime.getYear()-date[2];
        //разница между месяцами
        int difMonths=currentDateTime.getMonthValue()-date[1];
        //разница между днями
        int difDays=currentDateTime.getDayOfMonth()-date[0];
        //Расчет количества полных лет, количества полных месяцев
        countYear=difYears;
        countMonth=difYears*12+difMonths;
        //особенности при расчете количества полных лет, количества полных месяцев
        if(difDays<0){
            if(( countYear==0)&&( difMonths!=0))
                countMonth -= 1;
            if(( countYear!=0)&&(countMonth!=0)) {
                countMonth -= 1;
                countYear-=1;
            }
            if(( countYear!=0)&&(countMonth==0))
                countYear-=1;
        }
        System.out.println("Количество полных лет = "+countYear);
        System.out.println("Количество полных месяцев = "+countMonth);
        System.out.println("Введите адрес: (напр, страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24)");
        //чтение адреса
        String getAddress= reader.readLine();
        //строка преобразуется в массив слов
        String[] data=getAddress.split(": |, ");
        //вывод адреса
        System.out.println(data[1]+"\n"+"г. "+data[3]+"\nул. "+data[5]+"\nд. "+data[7]+"\nкв. "+data[9]);
    }
}
