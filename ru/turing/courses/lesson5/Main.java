package ru.turing.courses.lesson5;


public class Main {
    public static void main(String[] args) {
        intBubbleSort();
        stringBubbleSort();
        myClassBubbleSort("name");
        myClassBubbleSort("age");
        myClassBubbleSort("id");

    }

    //на вход поступает поле по которому нужно сортировать
    private static void myClassBubbleSort(String sortBy) throws NullPointerException {
        /*Student student1 = new Student("Matveeey", 19, 555L);
        Student student2 = new Student("Kirill", 21, 1010L);
        Student student3 = new Student("Misha", 23, 333L);*/

        //создание массива
        Student[] students = null;

        //Проверка массива на все null
        if (students == null) {
            throw new NullPointerException("Массив не может состоять только из null");
        }

        //вывод массива
        System.out.println("Исходный массив: ");
        for (Student s :
                students) {
            System.out.println(s);
        }

        if (sortBy.equals("name")) {
            //студенты с самым длинным именем будут в конце
            System.out.println('\n' + "Сортирую массив по имени..." + '\n');
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 1; i < students.length; i++) {
                    if (students[i - 1].getName().length() > students[i].getName().length()) {
                        Student tmp = new Student("", 1, 1L);
                        tmp = students[i - 1];
                        students[i - 1] = students[i];
                        students[i] = tmp;
                        isSorted = false;
                    }
                }
            }

            //вывод отсортированного массива
            System.out.println("Отсортированный массив:");
            for (Student s :
                    students) {
                System.out.println(s);
            }
            System.out.println('\n');

            //студенты с самым большим возрастом будут в конце массива
        } else if (sortBy.equals("age")) {
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 1; i < students.length; i++) {
                    if (students[i - 1].getAge() > students[i].getAge()) {
                        Student tmp = new Student("", 1, 1L);
                        tmp = students[i - 1];
                        students[i - 1] = students[i];
                        students[i] = tmp;
                        isSorted = false;
                    }
                }
            }

            //вывод отсортированного массива
            System.out.println('\n' + "Сортирую массив по возрасту..." + '\n');
            System.out.println("Отсортированный массив: ");
            for (Student s :
                    students) {
                System.out.println(s);
            }
            System.out.println('\n');

            //студенты с самым больщим айди будут в конце массива
        } else if (sortBy.equals("id")) {
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 1; i < students.length; i++) {
                    if (students[i - 1].getId() > students[i].getId()) {
                        Student tmp = students[i - 1];
                        students[i - 1] = students[i];
                        students[i] = tmp;
                        isSorted = false;
                    }
                }
            }

            //вывод отсортированного массива
            System.out.println('\n' + "Сортирую массив по id..." + '\n');
            for (Student s :
                    students) {
                System.out.println(s);
            }
            System.out.println('\n');
        }
    }

    private static void stringBubbleSort() throws NullPointerException {
        /*String[] array = {null, "aa", null,"b", null,"cccc", "ddd", null, null};*/
        String[] array = null;
        if (array == null) {
            throw new NullPointerException("нельзя так");
        }
        System.out.println("Сортировка строчного массива: ");

        //вывод  массива
        for (String s :
                array) {
            System.out.println(s);
        }

        //остортирую массив так, чтобы все null'ы были в конце
        String[] newArray = new String[array.length];
        int i = 0;
        int counter = 0;
        for (String partOfArray :
                array) {
            if (partOfArray != null) {
                newArray[i] = partOfArray;
                i++;
                counter++;
            }
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int k = 1; k < counter; k++) {
                if (newArray[k - 1].length() > newArray[k].length()) {
                    String tmp = newArray[k - 1];
                    newArray[k - 1] = newArray[k];
                    newArray[k] = tmp;
                    isSorted = false;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        //вывод отсортированного массива
        for (String s :
                newArray) {
            System.out.println(s);
        }
        System.out.println("");
        return;
    }

    private static void intBubbleSort() {
        System.out.println("Сортировка целочисленного массива: ");
        int[] array = {2, 6, 1, 5};

        //вывод массива
        for (int tmp :
                array) {
            System.out.print(tmp + " ");
        }
        System.out.println("");
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = tmp;
                    isSorted = false;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        //вывод отсортированного массива
        for (int tmp :
                array) {
            System.out.print(tmp + " ");
        }
        System.out.println("");
        return;
    }
}
