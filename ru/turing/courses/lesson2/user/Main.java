package ru.turing.courses.lesson2.user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Ввод ФИО пользователя
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ФИО: ");
        String fio = console.nextLine();
        while (fio.length() == 0) {
            System.out.println("Введена пустая строка. Введите повторно ФИО.");
            fio = console.nextLine();
        }
        //Ввод даты рождения - рассматриваю ситуацию, когда нет некорректного ввода
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите дату рождения: ");
        String getDate= reader.readLine();
        //массив date содержит день, месяц, год
        int[] date= Arrays.stream(getDate.split("\\.")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Введите адрес: (напр, страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24)");
        //чтение адреса
        String getAddress= reader.readLine();
        //строка преобразуется в массив слов
        String[] address=getAddress.split(": |, ");
        User user1 = new User(fio, date[2],date[1],date[0],address[1],address[3],address[5],Integer.parseInt(address[7]),Integer.parseInt(address[9]));

        System.out.println("Количество полных лет = "+user1.getCountYears());
        System.out.println("Количество полных месяцев = "+user1.getCountMonths());
        System.out.println(user1.toString());

    }
}
