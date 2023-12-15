package ru.turing.courses.lesson5;

public class stringFormater {
    /**
     * Предикат определяет, какая строка должна идти раньше в отсортированном массиве.
     * Критерии (по важности):
     *      0.  null строка проходит выше, при null на обоих параметрах - ничего делаем.
     *      1.  Таблица кодировки. На первой позиции должна остаться строка, у которой первый
     *          символ, отличающийся от соответствующего символа другой строки, идёт раньше в таблице текущей кодировки.
     *      2.  Размер строки. На первой позиции останется слово с меньшим количество символов.
     * @param a - первая строка
     * @param b - вторая строка
     * @return  true - если требуется поменять местами a и b
     *          false - если менять местами a и b не требуется
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
