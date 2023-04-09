package ru.turing.courses.lesson1.Imanov;
import java.util.Scanner;

// SNP :)

public class Homework1 {

    private static final int YEAR = 2023;
    private static final int MONTH = 4;
    private static final int DAY = 8;
    // Задача1: полных лет и полных месяцев
    public static void getFullAge(String fio, String birthday){
        int[] birthdayArray = new int[3];// страшно такое делать после С++ (выделение памяти под массив интов)
        String[] StringBirthdayArray = birthday.split("\\."); // дата рождения разделяется по точке

        //заносятся данные в массив birthdayArray (преобразуются из типа String в тип int)
        for (int i = 0; i < birthdayArray.length; ++i){
            birthdayArray[i] = Integer.valueOf(StringBirthdayArray[i]);
        }

        // вычисление количества полных лет и если в этом году уже был день рождения, то добавление еще одного года
        int fullYears = YEAR - birthdayArray[2] - 1;
        if (MONTH > birthdayArray[1]) {
            fullYears++;
        } else if (MONTH == birthdayArray[1] && birthdayArray[0] >= DAY) {
            fullYears++;
        }

        // вычисление количества полных месяцев
        int fullMonths = fullYears * 12;

        // обработка двух разных ситуации
        // 1) год в котором был день рождения еще не закончился (блок if)
        // 2) год в котором был день рождения закончился и наступил следующий (блок else)
        if (MONTH >= birthdayArray[1]) {
            fullMonths += DAY >= birthdayArray[0] ? MONTH - birthdayArray[1] : MONTH - birthdayArray[1] - 1;
        } else {
            fullMonths += DAY >= birthdayArray[0] ? 12 - (birthdayArray[1] - MONTH) : 12 - (birthdayArray[1] - MONTH) - 1;
        }

        System.out.println(fio + ',' + " вам: " + '\n' + "полных лет: " + fullYears +
                '\n' +"полных месяцeв: " + fullMonths);
    }

    // Задача2: приведение места жительства к нужному виду
    public static void getAddress(String userAddress){
        // разделение адреса по ": "
        String[] splitAdress = userAddress.split(",");
        // префиксы для вывода информации
        String[] prefixes = {"", "Г. ", "Ул. ", "д. ", "кв. "};

        System.out.println("Вы проживаете по адресу: ");

        // в каждой строке вырезается нужная информация с помощью метода substring и выводится на экран
        for (int i = 0; i < splitAdress.length; ++i){
            String output =  splitAdress[i].substring(splitAdress[i].indexOf(":") + 2);;
            System.out.println(prefixes[i] + output);
        }
    }

    // решение всей домашней работы
    public static void solution(String fio, String birthday, String userAddress){
        getFullAge(fio, birthday);
        getAddress(userAddress);
    }

    // можно (и вообще лучше сделать так) было конечно сделать так, чтобы не нужно было подтверждать постоянно корректность пройденных тестов, но я так не сделал
    public static boolean testExamplesPassed(){
        solution("Путин Владимир Владимирович",
                "07.10.1952",
                "страна: Россия, город: Москва, улица: самая крутая, дом: самый крутой, квартира: 777");
        solution("Java Turing Turingвич",
                "29.03.2023",
                "страна: Россия, город: Москва, улица: Красноказарменная, дом: 14, квартира: 007");
        solution("F I O",
                "07.07.0007",
                "страна: страна, город: город, улица: улица, дом: дом, квартира: квартира");
        solution("тут дополнительный тест: записана дата DAY.MONTH.YEAR-1 ",
                "08.04.2022",
                "страна: страна, город: город, улица: улица, дом: дом, квартира: квартира");

        Scanner scanner = new Scanner(System.in);
        System.out.println("все хорошо с тестами? y/n: ");
        String answer = scanner.nextLine();
        return answer.equals("y");
    }

    public static void main(String[] args) {
        // запуск тестов перед запуском основной программы
        if (testExamplesPassed()) {
            // запрос и ввод данных
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите ФИО: ");
            String fio = scanner.nextLine();
            System.out.print("Введите дату рождения в формате дд.мм.гггг: ");
            String birthday = scanner.nextLine();
            System.out.print("Введите адрес проживания в формате" +
                    " страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24: ");
            String userAddress = scanner.nextLine();

            solution(fio, birthday, userAddress);// запуск решения с заданными данными
        } else {
            System.out.println("кто-то не умеет писать код"); // :(
        }
    }
}
