package ru.turing.courses.lesson4;

public class Main {
    public static void main(String[] args) {

        //todo реализовать с учетом выбросов эксепшнов следующие кейсы

        try {
            // позитивные сценарии
            Gender maleGender = Gender.ofName("MALE");
            Gender femaleGender = Gender.ofName("FEMALE");

            Gender maleLowerCaseCharacter = Gender.ofName("male");
            Gender femaleLowerCaseCharacter = Gender.ofName("female");

            Gender maleGenderByChar = Gender.ofShortNameRepr('M');
            Gender femaleGenderByChar = Gender.ofShortNameRepr('F');

        } catch (NullPointerException e) {
            System.out.println("Null input");
        } catch (GenderNotFoundException e) {
            System.out.printf("Test 1: %s%n", e.getMessage());
        }

        try {
            // негативные сценарии
            Gender nullGender = Gender.ofName(null);
            Gender falseNameGender = Gender.ofName("Attack helicopter");
            Gender falseCharReprName = Gender.ofShortNameRepr('\n');

        } catch (NullPointerException e) {
            System.out.println("Null input");
        } catch (GenderNotFoundException e) {
            System.out.printf("Test 2: %s%n", e.getMessage());
        }
    }
}
