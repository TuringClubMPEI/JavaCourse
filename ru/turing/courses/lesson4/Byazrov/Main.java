package ru.turing.courses.lesson4.Byazrov;

public class Main {
    public static void main(String[] args) {

        // позитивные сценарии
        Gender maleGender = Gender.ofName("MALE");
        Gender femaleGender = Gender.ofName("FEMALE");

        Gender maleLowerCaseCharacter = Gender.ofName("male");
        Gender femaleLowerCaseCharacter = Gender.ofName("female");

        Gender maleGenderByChar = Gender.ofShortNameRepr('M');
        Gender femaleGenderByChar = Gender.ofShortNameRepr('F');

        // негативные сценарии
        try {
            Gender nullGender = Gender.ofName(null);
        } catch (GenderNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Gender falseNameGender = Gender.ofName("Attack helicopter");
        } catch (GenderNotFoundException e){
            System.out.println((e.getMessage()));
        }

        try {
            Gender falseCharReprName = Gender.ofShortNameRepr('\n');
        } catch (GenderNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
