package ru.turing.courses.lesson4;

public class Main {
    public static void main(String[] args) {
        //todo реализовать с учетом выбросов эксепшнов следующие кейсы

        // позитивные сценарии
        Gender maleGender = Gender.ofName("MALE");
        Gender femaleGender = Gender.ofName("FEMALE");

        Gender maleLowerCaseCharacter = Gender.ofName("male");
        Gender femaleLowerCaseCharacter = Gender.ofName("female");

        Gender maleGenderByChar = Gender.ofShortNameRepr('M');
        Gender femaleGenderByChar = Gender.ofShortNameRepr('F');

        // негативные сценарии
        try{
            Gender nullGender = Gender.ofName(null);
        }catch (GengerNameNotFoundException e){
            System.out.println("Обработка случая, когда недопустимое наименование пола");
        }
        catch (NullGenderException e){
            System.out.println("Обработка случая, когда значение входного данного null");
        }

        try{
        Gender falseNameGender = Gender.ofName("Attack helicopter");
        }catch (GengerNameNotFoundException e){
            System.out.println("Обработка случая, когда недопустимое наименование пола");
        }catch (NullGenderException e){
            System.out.println("Обработка случая, когда значение входного данного null");
        }

        try{
        Gender falseCharShortName = Gender.ofShortNameRepr('\n');
        }catch (GengerShortNameNotFoundException e){
            System.out.println("Обработка случая, когда недопустимое символьное представление пола");
        }catch (NullGenderException e){
            System.out.println("Обработка случая, когда значение входного данного null");
        }
    }
}
