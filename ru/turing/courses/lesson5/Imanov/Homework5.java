package ru.turing.courses.lesson5.Imanov;
import java.util.Arrays;
import java.util.UUID;

public class Homework5 {
    public static void main(String[] args){
        try {
            int[] intArray = {3, 2, 1};
            String[] stringArray = {"111", null, "1", "11"};
            ScarfPlayer[] scarfArray = {
                    new ScarfPlayer(52, 100, 5L),
                    null,
                    new ScarfPlayer(52, 101, 1L),
                    new ScarfPlayer(52, 100, 1L)
            };

            ArraySorter.sort(intArray);
            ArraySorter.sort(stringArray);
            ArraySorter.sort(scarfArray);

            Arrays.stream(intArray).forEach(System.out::println);
            Arrays.stream(stringArray).forEach(System.out::println);
            Arrays.stream(scarfArray).forEach(System.out::println);


        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
