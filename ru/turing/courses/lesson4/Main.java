package ru.turing.courses.lesson4;

public class Main {
    public static void main(String[] args) {

        // ��������� ���������� ����� � ������ Gender, ����� �� ������� User Interface

        // ���������� ��������
        Gender maleGender = Gender.ofName("MALE");
        Gender femaleGender = Gender.ofName("FEMALE");

        Gender maleLowerCaseCharacter = Gender.ofName("male");
        Gender femaleLowerCaseCharacter = Gender.ofName("female");

        Gender maleGenderByChar = Gender.ofShortNameRepr('M');
        Gender femaleGenderByChar = Gender.ofShortNameRepr('F');

        // ���������� ��������
        Gender nullGender = Gender.ofName(null);
        Gender falseNameGender = Gender.ofName("Attack helicopter");
        Gender falseCharReprName = Gender.ofShortNameRepr('\n');
    }
}
