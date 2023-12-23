package ru.turing.courses.lesson5;


public class Main {
    public static void main(String[] args) {
        //todo вставить сюда сортировки пузырьком, сделать для каждой свой метод
        int[] integer_mass = new int[]{8, 4, 9, 15, 26, -1, 0};
        bubbleSort(integer_mass);

        System.out.println("---------");
        System.out.println();

        String[] string_mass = new String[] {"abc", "efghj", null, "."};
        bubbleSort(string_mass);

        System.out.println("---------");
        System.out.println();


        User nicky = new User("Nicky", 1111110000, 18);
        User mark_tsukenberg = new User("Mark Tsukenberg", 10010, 35); // возможно ему и не 35, я хз
        User anon = new User("Somebody", 9999999, 23);
        User hacker = new User("Hacker", 22222, 999);


        User[] user_mass = new User[] {nicky, mark_tsukenberg, anon, hacker};

        bubbleSortUserAge(user_mass);

        System.out.println("---------");
        System.out.println();

        bubbleSortId(user_mass);

        System.out.println("---------");
        System.out.println();

        bubbleSortName(user_mass);


    }

    // использовать перегрузку методов для разных типов данных
    public static void bubbleSort(int[] a) {
        System.out.println("massive before sort: ");
        printMass(a);
        boolean flag = false;

        while (!flag) {
            flag = true;
            for (int i = 1;i < a.length;i++) {
                if (a[i] < a[i - 1]) {
                    int tmp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = tmp;
                    flag = false;
                }
            }
        }

        System.out.println("massive after bubble sort: ");
        printMass(a);
    }




    public static void bubbleSort(String[] a) {
        System.out.println("massive before sort: ");
        printMass(a);

        boolean flag = false;

        while (!flag) {
            flag = true;
            for (int i = 1; i < a.length;i++) {
                if (a[i - 1] == null && a[i] != null) {
                    String tmp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = tmp;
                }
                else if (a[i - 1] != null && a[i] != null && (a[i].length() < a[i - 1].length())) {
                    String tmp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = tmp;
                    flag = false;
                }
            }
        }
        System.out.println("massive after bubble sort: ");
        printMass(a);
    }


    public static void bubbleSortUserAge(User[] a) {
        System.out.println("massive before sort: ");
        printMass(a);

        boolean flag = false;

        UserAgeComparator comp = new UserAgeComparator();

        while (!flag) {
            flag = true;
            for (int i = 1; i < a.length;i++) {
                if (comp.compare(a[i - 1], a[i]) > 0) {
                    User tmp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = tmp;
                    flag = false;
                }
            }
        }
        System.out.println("massive after bubble sort: ");
        printMass(a);
    }

    public static void bubbleSortId(User[] a) {
        System.out.println("massive before sort: ");
        printMass(a);

        boolean flag = false;

        UserIdComparator comp = new UserIdComparator();

        while (!flag) {
            flag = true;
            for (int i = 1; i < a.length;i++) {
                if (comp.compare(a[i - 1], a[i]) > 0) {
                    User tmp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = tmp;
                    flag = false;
                }
            }
        }

        System.out.println("massive after bubble sort: ");
        printMass(a);
    }

    public static void bubbleSortName(User[] a) {
        System.out.println("massive before sort: ");
        printMass(a);

        boolean flag = false;

        UserIdComparator comp = new UserIdComparator();

        while (!flag) {
            flag = true;
            for (int i = 1; i < a.length;i++) {
                if (comp.compare(a[i - 1], a[i]) > 0) {
                    User tmp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = tmp;
                    flag = false;
                }
            }
        }

        System.out.println("massive after bubble sort: ");
        printMass(a);
    }

    public static void printMass(int[] a) {
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void printMass(String[] a) {
        for (String i : a)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void printMass(User[] a) {
        for (User i : a)
            System.out.print(i + " ");
        System.out.println();

    }
}
