package ru.turing.courses.lesson4;

public class Main {
    public static void main(String[] args) {
        try {
            // позитивные сценарии
            Gender maleGender = Gender.ofName("MALE");
            Gender femaleGender = Gender.ofName("FEMALE");

            Gender maleLowerCaseCharacter = Gender.ofName("male");
            Gender femaleLowerCaseCharacter = Gender.ofName("female");

            Gender maleGenderByChar = Gender.ofShortNameRepr('M');
            Gender femaleGenderByChar = Gender.ofShortNameRepr('F');

            Gender maleGenderByCharCharacter = Gender.ofShortNameRepr('m');
            Gender femaleGenderByCharCharacter = Gender.ofShortNameRepr('f');

            // негативные сценарии
            Gender nullGender = Gender.ofName(null);
            Gender falseNameGender = Gender.ofName("Attack helicopter");
            Gender falseCharReprName = Gender.ofShortNameRepr('\n');
        } catch (IllegalGenderException e) {
            System.out.println("Попытка создания нового гендера: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
