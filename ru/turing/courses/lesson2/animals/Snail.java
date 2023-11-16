package ru.turing.courses.lesson2.animals;

public class Snail extends Animal { //улитка
    String colorOfShell; //цвет её раковины
    int countOfDroppedShells; //кол-во зброшенных улиткой раковин

    public Snail( String colorOfShell, int countOfDroppedShells) {
        super("Листочки", "Место, где сыро и много листочков)");//поля супер класса для свех улиток одинаковые
        this.colorOfShell = colorOfShell;
        this.countOfDroppedShells = countOfDroppedShells;
    }

    @Override
    public void makeSounds(){ //определяем абстрактный метод суперкласса
        System.out.println("'Молча размышляет о тайнах мироздания (и листочках)'");
    }

    public String getColorOfShell() {
        return colorOfShell;
    }

    public void setColorOfShell(String colorOfShell) {
        this.colorOfShell = colorOfShell;
    }

    public int getCountOfDroppedShells() {
        return countOfDroppedShells;
    }

    public void setCountOfDroppedShells(int countOfDroppedShells) {
        this.countOfDroppedShells = countOfDroppedShells;
    }
}
