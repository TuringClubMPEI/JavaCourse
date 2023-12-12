package ru.turing.courses.lesson4;

public class Main {
    public static void main(String[] args) {

        // эксепшены реализовал сразу в классе Gender, чтобы не портить User Interface

        // позитивные сценарии
        Gender maleGender = Gender.ofName("MALE");
        Gender femaleGender = Gender.ofName("FEMALE");

        Gender maleLowerCaseCharacter = Gender.ofName("male");
        Gender femaleLowerCaseCharacter = Gender.ofName("female");

        Gender maleGenderByChar = Gender.ofShortNameRepr('M');
        Gender femaleGenderByChar = Gender.ofShortNameRepr('F');

        // негативные сценарии
        Gender nullGender = Gender.ofName(null);
        Gender falseNameGender = Gender.ofName("Attack helicopter");
        Gender falseCharReprName = Gender.ofShortNameRepr('\n');
    }
}
