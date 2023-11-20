package ru.turing.courses.lesson3;
import ru.turing.courses.lesson2.animals.Person;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Registry<Integer, Person> registry = new Registry<>();
        String regexBirthday = "dd.MM.yyyy";
        String strBirthday;
        String regexAddress = "^страна: .+, город: .+, улица: .+, дом: \\d{2}, квартира: \\d{2}$";
        String address = "страна: Россия, город: Москва, улица: 3, дом: 12, квартира: 13"; //здесь все наши общажники из реестра
        String name, surname, secondName;
        Integer key;
        Integer choiceAction = 0;
        while (choiceAction != 8) {
            System.out.println("Выбирете команду:\n1-Добавить новую запись;" +
                    "\n2-Удалить запись по ID;" +
                    "\n3-Найти запись по ID;" +
                    "\n4-Найти все записи с именем;" +
                    "\n5-Вывести все записи в реестре;" +
                    "\n6-Очистить реестр;"+
                    "\n7-Удалить по значению.");
            choiceAction = in.nextInt();
            switch (choiceAction) {
                case 1: { //добавление нового человека в реестр
                    System.out.println("Введите ФИО:");
                    surname = in.next();
                    name = in.next();
                    secondName = in.next();
                    do {
                        System.out.println("Введите дату рождения:");
                        strBirthday = in.next();
                    } while (Pattern.matches(regexBirthday, strBirthday));
                    System.out.println("Введите ID человека в реестре:");
                    key = in.nextInt();
                    Person resident = new Person(name, surname, secondName, strBirthday, regexBirthday, address, regexAddress);
                    if (registry.add(key, resident) == null) {
                        System.out.println("Запись добавлена(такого ID не было)!");
                    } else {
                        System.out.println("Запись обновлена(по такому ID уже была запись)!");
                    }
                    break;
                }
                case 2: { //удалить по ключу
                    System.out.println("Введите ID человека в реестре:");
                    key = in.nextInt();
                    if (registry.removeByKey(key) == null) {
                        System.out.println("Записи с таким ID нет!");
                    } else {
                        System.out.println("Запись с таким ID успешно удалена!");
                    }
                    break;
                }
                case 3: { //достать значение по ключу
                    System.out.println("Введите ID человека в реестре:");
                    key = in.nextInt();
                    Person foundPerson = registry.getByKey(key);
                    if (foundPerson == null) {
                        System.out.println("Записи с таким ID нет в реестре!");
                    } else {
                        foundPerson.printPerson(regexBirthday, regexAddress);
                    }
                    break;
                }
                case 4: { //достать значение по имени
                    System.out.println("Введите имя человека в реестре:");
                    name = in.next();
                    Set<Person> foundPersons = registry.getByName(name);
                    if (foundPersons == null) {
                        System.out.println("Ни одной записи с таким ID нет в реестре!");
                    } else {
                        System.out.println("Все найденные записи с этим именем:");
                        for (Person found : foundPersons) {
                            found.printPerson(regexBirthday, regexAddress);
                        }
                    }
                    break;
                }
                case 5: { //вывести все записи в реестре
                    registry.printStorage(regexBirthday, regexAddress);
                    break;
                }
                case 6: { //очистить весь реестр
                    registry.clear();
                    break;
                }
                case 7:{ //удаление всех записей об человеке
                    System.out.println("Введите ФИО:");
                    surname = in.next();
                    name = in.next();
                    secondName = in.next();
                    do {
                        System.out.println("Введите дату рождения:");
                        strBirthday = in.next();
                    } while (Pattern.matches(regexBirthday, strBirthday));
                    Person resident = new Person(name, surname, secondName, strBirthday, regexBirthday, address, regexAddress);
                    List<Integer> founded = registry.removeByValue(resident);
                   if(!founded.isEmpty()){
                       System.out.println("Удалены записи с ID:");
                       founded.stream().forEach(item -> System.out.println(item));
                   }
                   else {
                       System.out.println("Таких записей нет!");
                   }
                    break;
                }
                default:
                    System.out.println("Нет такой команды!");
                    break;
            }
        }
    }
}
