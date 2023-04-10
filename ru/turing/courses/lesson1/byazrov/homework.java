package ru.turing.courses.lesson1.byazrov;
import java.time.YearMonth;
import java.util.Scanner;

//Не сделал обработку некорректного ввода, принимает ввод только по образцу из ДЗ

public class homework {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Введите своё ФИО: ");
        person.setFio();
        System.out.println("Введите свой адрес: ");
        person.setAddress();
        System.out.println("Введите свою дату рождения: ");
        person.setBirthDate();


        person.getFio();
        person.getAddress();
        System.out.println("Количество прожитых лет пользователя " + person.getFirstName() + ' ' + person.getSecondName() + ' ' + person.getOtchestvo() + ": " + person.getYearAge());
        System.out.println("Количество прожитых месяцев пользователя " + person.getFirstName() + ' ' + person.getSecondName() + ' ' + person.getOtchestvo() + ": " + person.getMonthAge());
    }
}

class Person {
    private String firstName;
    private String secondName;
    private String otchestvo;

    private int birthDay;
    private int birthMonth;
    private int birthYear;

    private String country;
    private String city;
    private String street;
    private String house;
    private String flat;


    void setFio() {                                //Ввод ФИО
        Scanner input = new Scanner(System.in);
        String fioLine = input.nextLine();
        String[] fio = fioLine.split(" ");
        firstName = fio[0];
        secondName = fio[1];
        otchestvo = fio[2];
    }

    void getFio() {                               //возврат информации о ФИО пользователя
        System.out.println(firstName);
        System.out.println(secondName);
        System.out.println(otchestvo);
    }

    String getFirstName() {      //возврат имени
        return firstName;
    }

    String getSecondName() {     //возврат фамилии
        return secondName;
    }

    String getOtchestvo() {      //возврат отчества
        return otchestvo;
    }

    void setBirthDate() {                                            //ввод даты рождения пользователя и присвоение полям
        Scanner input = new Scanner(System.in);                     //класса соответсвующие значения
        String birthDateLine = input.nextLine();
        String[] birthDate = birthDateLine.split("\\.");
        birthDay = Integer.parseInt(birthDate[0]);
        birthMonth = Integer.parseInt(birthDate[1]);
        birthYear = Integer.parseInt(birthDate[2]);
    }

    int getMonthAge() {                                                                                       //функция возврата количества прожитых полных месяцев пользователя
        return (YearMonth.now().getMonthValue() - birthMonth + (YearMonth.now().getYear() - birthYear) * 12);   //Вывод сделал целочисленным, а не void, как в остальных методах, без особой причины
    }

    int getYearAge() {                                          //функция возврата количества прожитых полных лет пользователя
        return (YearMonth.now().getYear() - birthYear);         //Вывод сделал целочисленным, а не void, как в остальных, без особой причины
    }

    void setAddress() {                                             //Ввод адреса пользователя
        Scanner input = new Scanner(System.in);
        String addressLine = input.nextLine();
        String[] addressMass = addressLine.split(", ");
        String[] address = new String[5];
        int it = 0;

        for (String massElem : addressMass) {
            String[] addressCluster = massElem.split(": ");           //<- Я здесь не выносил объявление ссылки на массив специально
            address[it] = addressCluster[1];                                //Вопрос насколько в целом тормозит программу многократное объявление переменной/ссылки в цикле
            ++it;                                                           //и выносят ли нормальные люди это объявление за цикл или нет?
        }                                                                   //И еще вопрос, память, выделенная под массивы/переменные/ссылки, объявленные в теле
                                                                            //цикла/метода, освобождается же при выходе из них?

        country = address[0];               //В целом лучше было адрес записывать в специально созданный массив под него или нормально записывать в поля отдельные как я сделал?
        city = address[1];
        street = address[2];
        house = address[3];
        flat = address[4];
    }

    void getAddress() {                        //Вывод информации об адресе пользователя
        System.out.println("Адрес пользователя " + firstName + ' ' + secondName + ' ' + otchestvo + ": \n" + country + '\n' + city + '\n' + street + '\n' + house + '\n' + flat);
    }
}
