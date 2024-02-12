package ru.turing.courses.lesson5;

import java.util.*;
import static ru.turing.courses.lesson5.Student.bubbleSort;

public class Main {
    public static void main(String[] args) {
        System.out.println("Пример сортировки пузырьком для массива int[]");
        //объявляем и инициализируем массив
        int[] intArray = {1, 5, 4, 3, 7};
        System.out.println("Исходный массив: "+Arrays.toString(intArray));
        bubbleSort( intArray);
        System.out.println("После выполнения сортировки: "+Arrays.toString(intArray));

        System.out.println("Пример сортировки пузырьком для массива String[] по длине строки");
        //объявляем и инициализируем массив
        //no one could properly understand information
        String[] strArray = {"properly", "information", "could", "no","understand","one"};
        System.out.println("Исходный массив: "+Arrays.toString(strArray));
        bubbleSort( strArray);
        System.out.println("После выполнения сортировки: "+Arrays.toString(strArray));

        System.out.println("Пример сортировки пузырьком для массива String[] по длине строки.Предусмотреть случай, когда элемент списка - null. Такие нужно складывать в конец");
        //объявляем и инициализируем массив
        //no one could properly understand information
        String[] strArray2 = {"Thursday",null, "Monday",  "Sunday","Tuesday",null,"Wednesday","Friday","Saturday"};
        System.out.println("Исходный массив: "+Arrays.toString(strArray2));
        bubbleSort( strArray2);
        System.out.println("После выполнения сортировки: "+Arrays.toString(strArray2));

        List<Student> students = new ArrayList<Student>();
        System.out.println("Исходные данные");
        students.add(new Student(Long.valueOf(6), "Olga", "8-999-111-22-33"));
        students.add(new Student(Long.valueOf(3), "Lena", "8-991-121-22-33"));
        students.add(new Student(Long.valueOf(2), "Tanya", "8-996-771-22-33"));
        students.add(new Student(Long.valueOf(4), "Natasha", "8-999-100-02-03"));
        students.add(new Student(Long.valueOf(1), "Ivan", "8-906-771-22-33"));
        students.add(new Student(Long.valueOf(5), "Peter", "8-992-100-02-03"));
        System.out.println(Arrays.toString(students.toArray()));
        System.out.println("После выполнения сортировки по id: ");
        Collections.sort(students, Student.COMPARE_BY_ID);
        System.out.println(Arrays.toString(students.toArray()));
        System.out.println("После выполнения сортировки по name: ");
        Collections.sort(students, Student.COMPARE_BY_NAME);
        System.out.println(Arrays.toString(students.toArray()));
        System.out.println("После выполнения сортировки по phone: ");
        Collections.sort(students, Student.COMPARE_BY_PHONE);
        System.out.println(Arrays.toString(students.toArray()));

        /** Подумать, что лучше всего сделать, если входной массив = null
        Предлагаю создать исключение; методы сортировки массивов могут выбросить эксепшны**/
        intArray = null;
        try{
            bubbleSort(intArray);
        }
        catch (NullArrayException e){
            System.out.println("Обработка случая, когда входной массив = null");
        }
        strArray = null;
        try{
            bubbleSort(strArray);
        }
        catch (NullArrayException e){
            System.out.println("Обработка случая, когда входной массив = null");
        }
    }
}
