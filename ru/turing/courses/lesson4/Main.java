package ru.turing.courses.lesson4;

public class Main {
    public static void main(String[] args) {

        //todo реализовать с учетом выбросов эксепшнов следующие кейсы

        // позитивные сценарии
        try {
            Gender maleGender = Gender.ofName("MALE");
            Gender femaleGender = Gender.ofName("FEMALE");

            Gender maleLowerCaseCharacter = Gender.ofName("male");
            Gender femaleLowerCaseCharacter = Gender.ofName("female");

            Gender maleGenderByChar = Gender.ofShortNameRepr('M');
            Gender femaleGenderByChar = Gender.ofShortNameRepr('F');

            System.out.println(maleGender);
            System.out.println(femaleGender);
            System.out.println(maleLowerCaseCharacter);
            System.out.println(femaleLowerCaseCharacter);

            System.out.println(maleGenderByChar);
            System.out.println(femaleGenderByChar);

        } catch (GenderException e) {
            System.out.println("Error: " + e);
//            throw new RuntimeException(e);
        }


        // Everything works fine




        // негативные сценарии
        try {
            Gender falseNameGender = Gender.ofName("Attack helicopter");
            Gender nullGender = Gender.ofName(null);
            Gender falseCharReprName = Gender.ofShortNameRepr('\n');
        } catch (GenderException | NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("-----------");
            System.out.println("Program finished");
        }
    }
}
