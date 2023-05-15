package ru.turing.courses.lesson4.Yemelyanov;

public class Homework4 {
    public static void main(String[] args) {

        // позитивные сценарии
        Gender maleGender = Gender.ofName("MALE");
        Gender femaleGender = Gender.ofName("FEMALE");

        Gender maleLowerCaseCharacter = Gender.ofName("male");
        Gender femaleLowerCaseCharacter = Gender.ofName("female");

        Gender maleGenderByChar = Gender.ofShortNameRepr('M');
        Gender femaleGenderByChar = Gender.ofShortNameRepr('F');

        Gender tigerGender = Gender.ofName("TIGER");
        Gender tigerGenderByChar = Gender.ofShortNameRepr('T');

        Gender winxGender = Gender.ofName("FAIRY");
        Gender winxGenderByChar = Gender.ofShortNameRepr('W');

        // негативные сценарии
        try{
            Gender nullGender = Gender.ofName(null);
            Gender falseNameGender = Gender.ofName("Attack helicopter");
            Gender falseCharReprName = Gender.ofShortNameRepr('\n');
            Gender unknownNameGender = Gender.ofName("INDIAN");
            Gender fuckYouGender = Gender.ofName("Go fuck yourself man");
        } catch(UnknownGenderException e){
            System.out.println(e.getMessage());
        }
    }
}
