package ru.turing.courses.lesson5;

public class stringFormater {
    /**
     * �������� ����������, ����� ������ ������ ���� ������ � ��������������� �������.
     * �������� (�� ��������):
     *      0.  null ������ �������� ����, ��� null �� ����� ���������� - ������ ������.
     *      1.  ������� ���������. �� ������ ������� ������ �������� ������, � ������� ������
     *          ������, ������������ �� ���������������� ������� ������ ������, ��� ������ � ������� ������� ���������.
     *      2.  ������ ������. �� ������ ������� ��������� ����� � ������� ���������� ��������.
     * @param a - ������ ������
     * @param b - ������ ������
     * @return  true - ���� ��������� �������� ������� a � b
     *          false - ���� ������ ������� a � b �� ���������
     */
    public static boolean greaterThen(String a, String b) {
        boolean ans = false;
        if (a == null) {
            return b != null;
        }
        for (int i = 0; i < Math.min(a.length(), b.length()) && !ans; i++) {
            ans = a.charAt(i) > b.charAt(i);
        }
        if (!ans) {
            return a.length() > b.length();
        }
        return ans;
    }
}
