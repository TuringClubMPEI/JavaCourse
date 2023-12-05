package ru.turing.courses.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //todo вставить сюда сортировки пузырьком, сделать для каждой свой метод
        // пузырек для типа int[]
        Scanner in = new Scanner(System.in);
        System.out.print("Введите массив: ");
        String[] Array = in.nextLine().split(" ");
        int[] mas = new int[Array.length];
        for (int i = 0; i < mas.length; i++){
            mas[i] = Integer.parseInt(Array[i]);
        }
        for (int i = 0; i < mas.length; i++){
            for (int j = 0; j < mas.length - i - 1 ; j++){
                if (mas[j] > mas[j + 1]){
                    int value = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = value;
                }
            }
        }
        for (var value : mas) {
            System.out.print(value + " ");
        }
        //todo
        // тип String[]
        System.out.print("\nВведите массив: ");
        String[] stringArray = in.nextLine().split("");
        stringArray[0] = null;
        stringArray[1] = null;
        stringArray[2] = null;
        stringArray[3] = null;
        stringArray[4] = null;
        stringArray[7] = null;
        stringArray[8] = null;
        stringArray[9] = null;
        stringArray[10] = null;
        for (int i = 0; i < stringArray.length; i++){
            for (int j = 0; j < stringArray.length -1 - i; j++){
                try {
                    assert false;
                    if (stringArray[j].compareTo(stringArray[j + 1]) > 0){
                        String string = stringArray[j];
                        stringArray[j] = stringArray[j + 1];
                        stringArray[j + 1] = string;
                    }
                } catch (NullPointerException e) {
                    if (stringArray[j] == null && stringArray[j + 1] == null){
                        String string = stringArray[stringArray.length - 1 - j];
                        stringArray[stringArray.length - 1 - j] = stringArray[j];
                        stringArray[j] = string;
                        string = stringArray[stringArray.length - 2 - j];
                        stringArray[stringArray.length - 2 - j] = stringArray[j + 1];
                        stringArray[j + 1] = string;
                    }
                    else if (stringArray[j] == null){
                        String string = stringArray[stringArray.length - 1 - j];
                        stringArray[stringArray.length - 1 - j] = stringArray[j];
                        stringArray[j] = string;
                    }
                    else if (stringArray[j + 1] == null){
                        String string = stringArray[stringArray.length - 1 - j];
                        stringArray[stringArray.length - 1 - j] = stringArray[j + 1];
                        stringArray[j + 1] = string;
                    }

                }
            }
        }
        for (var value : stringArray) {
            System.out.print(value + ' ');
        }

        //todo
        // мой класс
        // сортировка по id
        System.out.println("\n\nСортировка по id:");
        User rick = new User(121562632, "King", 'S');
        User sarah = new User(987654321, "Sarah", 'J');
        User john = new User(555555555, "John", 'L');
        User alice = new User(123456789, "Alice", 'M');
        User bob = new User(933354321, "Bob", 'K');
        User emily = new User(543210987, "Emily", 'R');
        User david = new User(112233445, "David", 'F');
        User[] dataBase = {rick, sarah, john, alice, bob, emily, david};
        for (int i = 0; i < dataBase.length; i++){
            for (int j = 0; j < dataBase.length - 1 - i; j++){
                if (dataBase[j].getId() > dataBase[j + 1].getId()){
                    User user = dataBase[j];
                    dataBase[j] = dataBase[j + 1];
                    dataBase[j + 1] = user;
                }
            }
        }
        for (var user : dataBase){
            user.printUser();
        }

        System.out.println("\nСортировка по name:");
        // todo сортировка по name
        for (int i = 0; i < dataBase.length; i++){
            for (int j = 0; j < dataBase.length - 1 - i; j++){
                if (dataBase[j].getName().compareTo(dataBase[j + 1].getName()) > 0){
                    User user = dataBase[j];
                    dataBase[j] = dataBase[j + 1];
                    dataBase[j + 1] = user;
                }
            }
        }

        for (var user : dataBase){
            user.printUser();
        }

        System.out.println("\nСортировка по symbol");
        for (int i = 0; i < dataBase.length; i++){
            for (int j = 0; j < dataBase.length - 1 - i; j++){
                if (dataBase[j].getSymbol() > dataBase[j + 1].getSymbol()){
                    User user = dataBase[j];
                    dataBase[j] = dataBase[j + 1];
                    dataBase[j + 1] = user;
                }
            }
        }

        for (var user : dataBase){
            user.printUser();
        }
    }
}
