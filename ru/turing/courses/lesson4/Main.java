package ru.turing.courses.lesson4;


public class Main {
    public static void main(String[] args) {

        //todo реализовать с учетом выбросов эксепшнов следующие кейсы

        // позитивные сценарии
        GenderEnum maleGender = GenderEnum.ofName("MALE");
        System.out.println(maleGender);
        GenderEnum femaleGender = GenderEnum.ofName("FEMALE");
        System.out.println(femaleGender);

        GenderEnum maleLowerCaseCharacter = GenderEnum.ofName("male");
        System.out.println(maleLowerCaseCharacter);
        GenderEnum femaleLowerCaseCharacter = GenderEnum.ofName("female");
        System.out.println(femaleLowerCaseCharacter);

        GenderEnum maleGenderByChar = GenderEnum.ofShortNameRepr('M');
        System.out.println(maleGenderByChar);
        GenderEnum femaleGenderByChar = GenderEnum.ofShortNameRepr('F');
        System.out.println(femaleGenderByChar);

        // негативные сценарии
        try {
            GenderEnum nullGender = GenderEnum.ofName(null);
            GenderEnum falseNameGender = GenderEnum.ofName("Attack helicopter");
            GenderEnum falseCharReprName = GenderEnum.ofShortNameRepr('\n');
        }
        catch (GenderNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
