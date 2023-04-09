package ru.turing.courses.lesson1.Imanov;
import java.util.Scanner;

public class SNP {
    static final int YEAR = 2023;
    static final int MONTH = 4;
    static final int DAY = 8;
    public static void Solution(String F_I_O, String birthday, String user_address){
        // Задача1: полных лет и полных месяцев
        int[] birthday_array = new int[3];// страшно такое делать после С++ (выделение памяти под массив интов)

        // занесение данных в массив birthday_array (преобразование из типа String в тип int)
        int index = 0;
        for (String data :  birthday.split("\\.")){
            birthday_array[index] = Integer.valueOf(data);
            ++index;
        }

        // вычисление количества полных лет и если в этом году уже был день рождения, то добавление еще одного года
        int full_years = YEAR - birthday_array[2] - 1;
        if (MONTH > birthday_array[1]) full_years++;
        else if (MONTH == birthday_array[1] && birthday_array[0] >= DAY) full_years++;

        // вычисление количества полных месяцев
        int full_months = full_years * 12;

        // обработка двух разных ситуации
        // 1) год в котором был день рождения еще не закончился (блок if)
        // 2) год в котором был день рождения закончился и наступил следующий (блок else)
        if (MONTH >= birthday_array[1])
            full_months += DAY >= birthday_array[0] ? MONTH - birthday_array[1] :  MONTH - birthday_array[1] - 1;
        else
            full_months += DAY >= birthday_array[0] ? 12 - (birthday_array[1] - MONTH) : 12 - (birthday_array[1] - MONTH) - 1;

        System.out.println(F_I_O + ',' + " вам: " + '\n' + "полных лет: " + full_years +
                '\n' +"полных месяцeв: " + full_months);


        // Задача2: приведение места жительтсва к нужному виду
        // разделяю адрес по ": "
        String[] split_adress = user_address.split(": ");
        // префиксы для вывода информации
        String[] prefix = {"", "Г. ", "Ул. ", "д. "};

        System.out.println("Вы проживаете по адресу: ");

        // в каждой строке вырезаю нужную информацию с помощью метода substring и вывожу на экран
        // индексация с 1 так как нулевая строка не содержит нужной нам информации
        for (int i = 1; i < 5; ++i){
            String output =  split_adress[i].substring(0, split_adress[i].indexOf(","));;
            System.out.println(prefix[i - 1] + output);
        }
        // последнюю строку обрабатываю отдельно, так как в ней не будет символа ','
        System.out.println("Кв " + split_adress[5]);
    }

    // можно (и вообще лучше сделать так) было конечно сделать так, чтобы не нужно было подтверждать постоянно корректность пройденных тестов, но я так не сделал
    public static boolean Test(){
        Solution("Путин Владимир Владимирович",
                "07.10.1952",
                "страна: Россия, город: Москва, улица: самая крутая, дом: самый крутой, квартира: 777");
        Solution("Java Turing Turingвич",
                "29.03.2023",
                "страна: Россия, город: Москва, улица: Красноказарменная, дом: 14, квартира: 007");
        Solution("F I O",
                "07.07.0007",
                "страна: страна, город: город, улица: улица, дом: дом, квартира: квартира");
        Solution("тут дополнительный тест: записана дата DAY.MONTH.YEAR-1 ",
                "08.04.2022",
                "страна: страна, город: город, улица: улица, дом: дом, квартира: квартира");

        Scanner scanner = new Scanner(System.in);
        System.out.println("все хорошо с тестами? y/n: ");
        String answer = scanner.nextLine();
        return answer.equals("y");
    }

    public static void main(String[] args) {
        // запуск тестов перед запуском основной программы
        if (Test()) {
            // запрос и ввод данных
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите ФИО: ");
            String F_I_O = scanner.nextLine();
            System.out.print("Введите дату рождения в формате дд.мм.гггг: ");
            String birthday = scanner.nextLine();
            System.out.print("Введите адрес проживания в формате" +
                    " страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24: ");
            String user_address = scanner.nextLine();

            Solution(F_I_O, birthday, user_address);// запуск решения с заданными данными
        }
        else
            System.out.println("кто-то не умеет писать код"); // :(
    }
}
