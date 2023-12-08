package ru.turing.courses.lesson4;

public class Main {
    public static void main(String[] args) {

        /*https://www.youtube.com/watch?v=JKLrn_0XNOU*/

        Gender maleGender = Gender.ofName("MALE");
        System.out.println(maleGender);
        Gender femaleGender = Gender.ofName("FEMALE");
        System.out.println(femaleGender);

        Gender maleLowerCaseCharacter = Gender.ofName("male");
        System.out.println(maleLowerCaseCharacter);
        Gender femaleLowerCaseCharacter = Gender.ofName("female");
        System.out.println(femaleLowerCaseCharacter);

        Gender maleGenderByChar = Gender.ofShortNameRepr('M');
        System.out.println(maleGenderByChar);
        Gender femaleGenderByChar = Gender.ofShortNameRepr('F');
        System.out.println(femaleGenderByChar);

       try {
           Gender nullGender = Gender.ofName(null);
           Gender falseNameGender = Gender.ofName("Attack helicopter");
           Gender falseCharReprName = Gender.ofShortNameRepr('\n');
       }catch (GenderDoesNotExist e){
           System.out.println(e.getMessage());
       }
    }
}
