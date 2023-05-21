package ru.turing.courses.lesson5.Filippov;

public class MainHw5 {
    public static int[] bubbleSortInt(int[] array) {
        Boolean checkSwap = true;
        int i = 0;
        int temp;
        System.out.print("Сортировка пузырьком для массива с int\nИсходный массив: ");
        for (int t : array) {
            System.out.print(t + ",");
        }
        System.out.println();
        while (i < array.length && checkSwap) {
            System.out.print(i + 1 + ")");
            checkSwap = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    checkSwap = true;
                }
            }
            for (int t : array) {
                System.out.print(t + " ");
            }
            System.out.println();
            i++;
        }
        System.out.print("Отсортированный массив: ");
        for (int t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
        return array;
    }

    ;

    public static String[] bubbleSortString(String[] array) {
        Boolean checkSwap = true;
        String temp;
        int size = array.length;
        int i = 0;
        System.out.print("Сортировка пузырьком для массива с String\nИсходный массив: ");
        for (String t : array) {
            System.out.print("'" + t + "',");
        }
        System.out.println();
        for (int t = 0; t < size; t++) {
            if (array[t] == null) {
                while (size != 0 && array[size - 1] == null && size - 1 != t) {
                    size--;
                }
                if (size - 1 != t && size != 0) {
                    array[t] = array[size - 1];
                    array[size - 1] = null;
                    size--;
                } else {
                    size--;
                }
            }
        }
        while (i < size && checkSwap) {
            System.out.print(i + 1 + ")");
            checkSwap = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    checkSwap = true;
                }
            }
            for (String t : array) {
                System.out.print("'" + t + "' ");
            }
            System.out.println();
            i++;
        }
        System.out.print("Отсортированный массив: ");
        for (String t : array) {
            System.out.print("'" + t + "' ");
        }
        System.out.println();
        return array;
    }

    public static BankUsers[] bubbleSortBankUsers(BankUsers[] array, int key) {
        Boolean checkSwap = true;
        BankUsers temp;
        int size = array.length;
        int i = 0;
        System.out.print("Сортировка пузырьком для массива классов\nИсходный массив: ");
        for (BankUsers t : array) {
            System.out.print("[" + t.getId() + "," + t.getAmountOfMoney() + "," + t.getAge() + "] ");
        }
        System.out.println();
        for (int t = 0; t < size; t++) {
            if (array[t] == null) {
                while (size != 0 && array[size - 1] == null && size - 1 != t) {
                    size--;
                }
                if (size - 1 != t && size != 0) {
                    array[t] = array[size - 1];
                    array[size - 1] = null;
                    size--;
                } else {
                    size--;
                }
            }
        }
        while (i < size && checkSwap) {
            System.out.print(i + 1 + ")");
            checkSwap = false;
            for (int j = 0; j < size - i - 1; j++) {
                switch (key) {
                    case 0:
                        if (array[j].getId() > array[j + 1].getId()) {
                            checkSwap = true;
                        }
                        break;
                    case 1:
                        if (array[j].getAmountOfMoney() > array[j + 1].getAmountOfMoney()) {
                            checkSwap = true;
                        }
                        break;
                    case 2:
                        if (array[j].getAge() > array[j + 1].getAge()) {
                            checkSwap = true;
                        }
                        break;
                    default:
                        System.out.println("Неверный ключ(0<=key<3)\n");
                        return array;
                }
                if (checkSwap) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;

                }
            }
            for (BankUsers t : array) {
                System.out.print("[" + t.getId() + "," + t.getAmountOfMoney() + "," + t.getAge() + "] ");
            }
            System.out.println();
            i++;
        }
        System.out.print("Отсортированный массив: ");
        for (BankUsers t : array) {
            System.out.print("[" + t.getId() + "," + t.getAmountOfMoney() + "," + t.getAge() + "] ");
        }
        System.out.println();
        return array;
    }

    ;

    public static void main(String[] args) {

        int[] array1 = {1, 3, 3, 12, 310, -10, 0, 123, 32};
        array1 = bubbleSortInt(array1);
        String[] array2 = {"Один", "пятьдесят", "Три", null, "Много", "Мало", "Мяу", "1", "Сто", "Два"};
        array2 = bubbleSortString(array2);
        String[] array3 = {null, null, null, null, null};
        array3 = bubbleSortString(array3);
        String[] array4 = {null, "bla", "meow", "woof", "Muuuu", null, "GG"};
        array4 = bubbleSortString(array4);
        String[] array5 = {null, "meow", "bla", null, "Muuuu", null};
        array5 = bubbleSortString(array5);
        BankUsers[] array7 = new BankUsers[5];
        array7[0] = new BankUsers(123, 3120, 19);
        array7[1] = new BankUsers(3333, 123312.13, 33);
        array7[2] = new BankUsers(12333, 312120, 19);
        array7[3] = new BankUsers(12300, 3120.123, 29);
        array7[4] = new BankUsers(112233, 100000, 31);
        bubbleSortBankUsers(array7, 0);
        bubbleSortBankUsers(array7, 1);
        bubbleSortBankUsers(array7, 2);
        try {
            bubbleSortBankUsers(null, 2);
        } catch (NullPointerException e) {
            e=new NullPointerException("Вы подали на вход null\n");
            System.out.println(e.getMessage());
        }
    }
}
