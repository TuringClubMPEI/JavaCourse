package ru.turing.courses.lesson4;

public class Main {
    public static void main(String[] args) {
        try {
            Gender maleGender = Gender.ofName("MALE");
            Gender femaleGender = Gender.ofName("FEMALE");

            Gender maleLowerCaseCharacter = Gender.ofName("male");
            Gender femaleLowerCaseCharacter = Gender.ofName("female");

            Gender maleGenderByChar = Gender.ofShortNameRepr('M');
            Gender femaleGenderByChar = Gender.ofShortNameRepr('F');
            Gender nullGender = Gender.ofName(null);
            Gender falseNameGender = Gender.ofName("Attack helicopter");
            Gender falseCharReprName = Gender.ofShortNameRepr('\n');
        }
        catch (NullPointerException e){
            System.out.println("У всех усть один из ДВУХ гендеров!");
        }
        catch (GenderNotFoundException e){
            System.out.println("Гендеров есть только ДВА!");
        }
    }
}
