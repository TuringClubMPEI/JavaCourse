package ru.turing.courses.lesson4.filippov;

import javax.naming.NoInitialContextException;

public class Main {
    public static void main(String[] args) {

        //todo реализовать с учетом выбросов эксепшнов следующие кейсы
//    MALE("Male", 'M', "Мужской пол"),
        // позитивные сценарии

        try {
            Gender maleGender = Gender.ofName("FEMALE");
            System.out.println("Gender:"+maleGender);
        } catch (NotFoundError e) {
            System.out.println(e.reasonOfMistake());
        }
        try {
            Gender femaleGender = Gender.ofName("MALE");
            System.out.println("Gender:"+femaleGender);
        } catch (NotFoundError e) {
            System.out.println(e.reasonOfMistake());
        }
        try {
            Gender maleLowerCaseCharacter = Gender.ofName("Male");
            System.out.println("Gender:"+maleLowerCaseCharacter);
        } catch (NotFoundError e) {
            System.out.println(e.reasonOfMistake());
        }
        try {
            Gender femaleLowerCaseCharacter = Gender.ofName("female");
            System.out.println("Gender:"+femaleLowerCaseCharacter);
        } catch (NotFoundError e) {
            System.out.println(e.reasonOfMistake());
        }
        try {
            Gender maleGenderByChar = Gender.ofShortNameRepr('M');
            System.out.println("Gender:"+maleGenderByChar);
        } catch (NotFoundError e) {
            System.out.println(e.reasonOfMistake());
        }
        try {
            Gender femaleGenderByChar = Gender.ofShortNameRepr('F');
            System.out.println("Gender:"+femaleGenderByChar);
        } catch (NotFoundError e) {
            System.out.println(e.reasonOfMistake());
        }
        //негативные сценарии
        try{
            Gender nullGender = Gender.ofName(null);
        }catch(NotFoundError e) {
            System.out.println(e.reasonOfMistake());
        }
        try {
            Gender falseNameGender = Gender.ofName("Attack helicopter");
        }catch (NotFoundError e){
            System.out.println(e.reasonOfMistake());
        }
        try {
            Gender falseCharReprName = Gender.ofShortNameRepr('\n');
        }catch (NotFoundError e){
            System.out.println(e.reasonOfMistake());
        }
    }
}

