package ru.turing.courses.lesson4.privalov;

public class Main {
    public static void main(String[] args) {

        //отрабатываем методы поиска гендера

        // позитивные сценарии
        Gender maleGender = Gender.ofName("MALE");
        Gender femaleGender = Gender.ofName("FEMALE");

        Gender maleLowerCaseCharacter = Gender.ofName("male");
        Gender femaleLowerCaseCharacter = Gender.ofName("female");

        Gender maleGenderByChar = Gender.ofShortNameRepr('M');
        Gender femaleGenderByChar = Gender.ofShortNameRepr('F');


        //проверяем выброс исключений
        try {
            // негативные сценарии
            Gender nullGender = Gender.ofName(null);
            Gender falseNameGender = Gender.ofName("Attack helicopter");
            Gender falseCharReprName = Gender.ofShortNameRepr('\n');
        } catch(GenderNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
