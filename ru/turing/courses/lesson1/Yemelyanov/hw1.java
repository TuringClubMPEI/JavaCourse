package ru.turing.courses.lesson1.Yemelyanov;
import java.net.SocketOption;
import java.util.Scanner;


public class hw1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fio;
        String dateOfBirth;
        String[] date; String adress; String[] ad;
        int day, mon, year;
        System.out.println("Введите ваши данные (ФИО), дату рождения: ");

//Ввожу ФИО и возраст
        fio = input.nextLine();
        dateOfBirth = input.nextLine();
        date = dateOfBirth.split("\\.");

        System.out.print("Введите адрес: ");
        adress = input.nextLine();
        ad = adress.split(", ");
//Может я тупой просто, но, видимо, тут пословно происходит замена в массиве строк
        ad[0] = ad[0].replace("страна:", "");
        ad[1] = ad[1].replace("город:", "г.");
        ad[2] = ad[2].replace("улица:", "ул.");
        ad[3] = ad[3].replace("дом:", "д.");
        ad[4] = ad[4].replace("квартира:", "кв.");

        day = Integer.parseInt(date[0]); //Привожу строку к числу - день
        mon = Integer.parseInt(date[1]); //Привожу строку к числу - месяц
        year = Integer.parseInt(date[2]); //Привожу строку к числу - год

//Домашку я сел писать 08.04.2023 - от этой даты отталкиваются мои расчеты, так как делать дополнительный ввод и проверку мне было лень))
//Рассчет возраста и кол-ва прожитых месяцев - с помощью оператора ветвления я сравниваю, совпадают ли месяц и день с введенными : если нет, возраст уменьшается на 1, и количество месяцов тоже
        int age = 0;
        if (mon <= 4 && day <= 8 ){
            age = 2023-year;
        }
        else if (year == 2023){ // Защита от того, что введенный год равен 2023, чтобы не произошло age = -1
            age = 0;
        }
        else{
            age = 2023-year - 1;
        }
        int ageMon = 0;
        if (2023 == year && mon < 4){
            if (day < 8){
                ageMon = age*12 + 4 - mon - 1;
            }
            else{
                ageMon = age*12 + 4 - mon;
            }
        }

        else if (2023 == year && mon > 4){
            if (8 > day){
                ageMon = 666;
            }
            else{
                ageMon = 666;
            }
        }

        else if (year < 2023){
            if (day < 8){
                ageMon = age*12 + 4 + (12 - mon) - 1;
            }
            else{
                ageMon = age*12 + 4 + (12 - mon);
            }
        }

        System.out.println("=========== ИНФОКАРТОЧКА О ГРАЖДАНИНЕ ============");

        System.out.println("Текущий возраст: " + age);
        System.out.println("Кол-во прожитых месяцев: " + ageMon);

        for(String adr : ad){ //Вывожу адрес с новой строчки
            System.out.println(adr);
        }
    }
}

