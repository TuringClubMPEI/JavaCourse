/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.time.Period;
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
        String date = in.nextLine();
        //разбиваем дату по "." в массив строк
        String[] dateWords = date.split("\\.");
        //Составляем новую строку-дату для преобразования в LocalDate объект
        date = dateWords[2] + "-" + dateWords[1] + "-" + dateWords[1];
        LocalDate newDate = LocalDate.parse(date);
        //ввод адреса
        System.out.println("Введите свой адрес одной строкой (в формате 'страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24)'");
        String address = in.nextLine();
        //Разбиваем адрес по ","
        String[] addressWords = address.split(", ");
        //Получаем кол-во полных лет между текущей датой и датой рождения
        int age = Period.between(newDate, LocalDate.now()).getYears();
        //Получаем кол-во полных месяцев между текущей датой и датой рождения
        int month = Period.between(newDate, LocalDate.now()).getMonths();
        //Вывод результата
        System.out.println("Количество полных лет: ");
        System.out.println(age);
        System.out.println("Количество полных месяцев: ");
        System.out.println(month);
        System.out.println("Краткий формат адреса:");
        //В массиве строк с разбиением адреса, каждый элемент разбиваем по разделителю ": " и выводим второй элемент
        for (String word : addressWords) {
            System.out.println(word.split(": ")[1]);
        }
        //Закрываем поток
        in.close();
    }
}
