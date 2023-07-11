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
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Gender femaleGender = Gender.ofName("MALE");
            System.out.println("Gender:"+femaleGender);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Gender maleLowerCaseCharacter = Gender.ofName("Male");
            System.out.println("Gender:"+maleLowerCaseCharacter);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Gender femaleLowerCaseCharacter = Gender.ofName("female");
            System.out.println("Gender:"+femaleLowerCaseCharacter);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Gender maleGenderByChar = Gender.ofShortNameRepr('M');
            System.out.println("Gender:"+maleGenderByChar);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Gender femaleGenderByChar = Gender.ofShortNameRepr('F');
            System.out.println("Gender:"+femaleGenderByChar);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
        //негативные сценарии
        try{
            Gender nullGender = Gender.ofName(null);
        }catch(NotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Gender falseNameGender = Gender.ofName("Attack helicopter");
        }catch (NotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            Gender falseCharReprName = Gender.ofShortNameRepr('\n');
        }catch (NotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}

