/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

public class Main
{
    public static void main(String[] args) {
        //Открываем поток
        Scanner in = new Scanner(System.in);
        //Ввод ФИО
        System.out.println("Пожалуйста, введите своё ФИО");

        System.out.println("Фамилия: ");
        String secondName = in.nextLine();

        System.out.println("Имя: ");
        String name = in.nextLine();

        System.out.println("Отчество: ");
        String surname = in.nextLine();

        //Ввод Даты Рождения
        System.out.println("Введите свою дату рождения в формате дд.мм.гггг: ");
        String birthDateString = in.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthDateLocalDate = LocalDate.parse(birthDateString, formatter);

        //ввод адреса
        System.out.println("Введите свой адрес одной строкой (в формате 'страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24)'");
        String address = in.nextLine();

        //Разбиваем адрес по ","
        String[] addressWords = address.split(", ");

        //Получаем кол-во полных лет между текущей датой и датой рождения
        var period = Period.between(birthDateLocalDate, LocalDate.now());
        int age = period.getYears();

        //Получаем кол-во полных месяцев между текущей датой и датой рождения
        int month = Period.between(birthDateLocalDate, LocalDate.now()).getMonths();

        //Вывод результата
        System.out.println("Количество полных лет: ");
        System.out.println(age);

        System.out.println("Количество полных месяцев: ");
        System.out.println( ChronoUnit.MONTHS.between(
                YearMonth.from(birthDateLocalDate),
                YearMonth.from(LocalDate.now())));

        System.out.println("Краткий формат адреса:");
        //В массиве строк с разбиением адреса, каждый элемент разбиваем по разделителю ": " и выводим второй элемент
        for (String word : addressWords) {
            String[] separetedData = word.split(": ");

            if(separetedData[0].equals ("страна")){
                System.out.println(separetedData[1]);
            }
            if(separetedData[0].equals ("город")){
                System.out.println("г." + separetedData[1]);
            }
            if(separetedData[0].equals ("улица")){
                System.out.println("ул." + separetedData[1]);
            }
            if(separetedData[0].equals ("дом")){
                System.out.println("д." + separetedData[1]);
            }
            if(separetedData[0].equals ("квартира")){
                System.out.println("кв." + separetedData[1]);
            }
        }
    }
}
