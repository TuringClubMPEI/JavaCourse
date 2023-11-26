package ru.turing.courses.lesson4;

public class Main {
    public static void main(String[] args) {

        //todo реализовать с учетом выбросов эксепшнов следующие кейсы

        try {
            Gender maleGender = Gender.ofName("MALE");
            Gender femaleGender = Gender.ofName("FEMALE");

            Gender maleLowerCaseCharacter = Gender.ofName("male");
            Gender femaleLowerCaseCharacter = Gender.ofName("female");

            Gender maleGenderByChar = Gender.ofShortNameRepr('M');
            Gender femaleGenderByChar = Gender.ofShortNameRepr('F');

        } catch (NullPointerException | GenderNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Gender nullGender = Gender.ofName(null);

        } catch (NullPointerException | GenderNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Gender falseNameGender = Gender.ofName("Attack helicopter");

        } catch (NullPointerException | GenderNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Gender falseCharReprName = Gender.ofShortNameRepr('\n');

        } catch (NullPointerException | GenderNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
