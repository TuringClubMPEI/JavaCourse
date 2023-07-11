package ru.turing.courses.lesson5.Filippov;
public class MainHw5 {
    public static void main(String[] args) {

        int[] array1 = {1, 3, 3, 12, 310, -10, 0, 123, 32};
        System.out.print("Сортировка пузырьком для массива с int\nИсходный массив: ");
        for (int number : array1) {
            System.out.print(number + ",");
        }
        System.out.println();
        array1 = Sorting.bubbleSortInt(array1);
        System.out.print("Отсортированный массив: ");
        for (int number : array1) {
            System.out.print(number + " ");
        }
        System.out.println("\n");
        String[] array2 = {"Один", "пятьдесят", "Три", null, "Много", "Мало", "Мяу", "1", "Сто", "Два"};
        System.out.print("Сортировка пузырьком для массива с String\nИсходный массив: ");
        for (String str : array2) {
            System.out.print("'" + str + "',");
        }
        System.out.println();
        array2 = Sorting.bubbleSortString(array2);
        System.out.print("Отсортированный массив: ");
        for (String str : array2) {
            System.out.print("'" + str + "' ");
        }
        System.out.println("\n");
        String[] array3 = {null, null, null, null, null};
        System.out.print("Сортировка пузырьком для массива с String\nИсходный массив: ");
        for (String str : array3) {
            System.out.print("'" + str + "' ");
        }
        System.out.println();
        array3 = Sorting.bubbleSortString(array3);
        System.out.print("Отсортированный массив: ");
        for (String str : array3) {
            System.out.print("'" + str + "' ");
        }
        System.out.println("\n");
        String[] array4 = {null, "bla", "meow", "woof", "Muuuu", null, "GG"};
        System.out.print("Сортировка пузырьком для массива с String\nИсходный массив: ");
        for (String str : array4) {
            System.out.print("'" + str + "' ");
        }
        System.out.println();
        array4 = Sorting.bubbleSortString(array4);
        System.out.print("Отсортированный массив: ");
        for (String str : array4) {
            System.out.print("'" + str + "' ");
        }
        System.out.println("\n");
        String[] array5 = {null, "meow", "bla", null, "Muuuu", null};
        System.out.print("Сортировка пузырьком для массива с String\nИсходный массив: ");
        for (String str : array5) {
            System.out.print("'" + str + "' ");
        }
        System.out.println();
        array5 = Sorting.bubbleSortString(array5);
        System.out.print("Отсортированный массив: ");
        for (String str : array5) {
            System.out.print("'" + str + "' ");
        }
        System.out.println("\n");
        BankUser[] array7 = new BankUser[5];
        array7[0] = new BankUser(123, 3120, 19);
        array7[1] = new BankUser(3333, 123312.13, 33);
        array7[2] = new BankUser(12333, 312120, 19);
        array7[3] = new BankUser(12300, 3120.123, 29);
        array7[4] = new BankUser(112233, 100000, 31);
        System.out.print("Сортировка пузырьком для массива классов\nИсходный массив: ");
        for (BankUser user : array7) {
            System.out.print("[" + user.getId() + "," + user.getAmountOfMoney() + "," + user.getAge() + "] ");
        }
        System.out.println();
        Sorting.bubbleSortBankUsers(array7, 0);
        System.out.print("Отсортированный массив: ");
        for (BankUser user : array7) {
            System.out.print("[" + user.getId() + "," + user.getAmountOfMoney() + "," + user.getAge() + "] ");
        }
        System.out.println("\n");
        System.out.print("Сортировка пузырьком для массива классов\nИсходный массив: ");
        for (BankUser user : array7) {
            System.out.print("[" + user.getId() + "," + user.getAmountOfMoney() + "," + user.getAge() + "] ");
        }
        System.out.println();
        Sorting.bubbleSortBankUsers(array7, 1);
        System.out.print("Отсортированный массив: ");
        for (BankUser user : array7) {
            System.out.print("[" + user.getId() + "," + user.getAmountOfMoney() + "," + user.getAge() + "] ");
        }
        System.out.println("\n");
        System.out.print("Сортировка пузырьком для массива классов\nИсходный массив: ");
        for (BankUser user : array7) {
            System.out.print("[" + user.getId() + "," + user.getAmountOfMoney() + "," + user.getAge() + "] ");
        }
        System.out.println();
        Sorting.bubbleSortBankUsers(array7, 2);
        System.out.print("Отсортированный массив: ");
        for (BankUser user : array7) {
            System.out.print("[" + user.getId() + "," + user.getAmountOfMoney() + "," + user.getAge() + "] ");
        }
        System.out.println("\n");

        System.out.print("Сортировка пузырьком для массива классов\nИсходный массив: ");
        for (BankUser user : array7) {
            System.out.print("[" + user.getId() + "," + user.getAmountOfMoney() + "," + user.getAge() + "] ");
        }
        System.out.println();
        Sorting.bubbleSortBankUsers(null, 2);
        System.out.print("Отсортированный массив: ");
        for (BankUser user : array7) {
            System.out.print("[" + user.getId() + "," + user.getAmountOfMoney() + "," + user.getAge() + "] ");
        }
        System.out.println("\n");
    }
}
