package ru.turing.courses.lesson4.Imanov;

import ru.turing.courses.lesson4.Imanov.gender.Gender;
import ru.turing.courses.lesson4.Imanov.gender.GenderException;

public class Homework4 {
    public static void main(String[] args){
        try {
            // позитивные сценарии
            Gender maleGender = Gender.ofName("MALE");
            Gender femaleGender = Gender.ofName("FEMALE");

            Gender maleLowerCaseCharacter = Gender.ofName("male");
            Gender femaleLowerCaseCharacter = Gender.ofName("female");

            Gender maleGenderByShortName = Gender.ofShortNameRepr("M");
            Gender femaleGenderByShortName = Gender.ofShortNameRepr("F");


            Gender maleGenderBуId = Gender.ofId(2);
            Gender femaleGenderById = Gender.ofId(3);

            // негативные сценарии
            Gender nullId = Gender.ofId(null);
            Gender negativeId = Gender.ofId(-69);
            Gender nullGender = Gender.ofName(null);
            Gender falseNameGender = Gender.ofName("Attack helicopter");
            Gender falseCharReprName = Gender.ofShortNameRepr("\n");

        } catch(GenderException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
