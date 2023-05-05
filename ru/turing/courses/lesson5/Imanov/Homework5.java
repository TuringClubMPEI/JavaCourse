package ru.turing.courses.lesson5.Imanov;
import java.util.Arrays;
// SNP

public class Homework5 {
    public static void main(String[] args){
            Integer[] intArray = {3, 2002, 1};
            String[] stringArray = {"в прекрасном городе Тамбов...", null, "В ", "2002 году, "};
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
            Arrays.stream(stringArray).forEach(System.out::print);
            System.out.println();
            Arrays.stream(scarfArray).forEach(System.out::println);
    }
}
