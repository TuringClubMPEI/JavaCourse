package ru.turing.courses.lesson2.animals;

import java.util.Objects;

public class Snail extends Animal {
    String colorOfShell;
    int countOfDroppedShells;

    /**
     * Конструктор класа Snail.
     *
     * @param colorOfShell цвет ракушки данной улитки.
     * @param countOfDroppedShells кол-во сброшенных ракушек данной улитки.
     */
    public Snail(String colorOfShell, int countOfDroppedShells) {
        super("Листочки", "Место, где сыро и много листочков)");
        this.colorOfShell = colorOfShell;
        this.countOfDroppedShells = countOfDroppedShells;
    }

    /**
     * Абстрактный метод суперкласса, который необходимо переопределить.
     */
    @Override
    public void makeSounds() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Snail snail = (Snail) o;
        return countOfDroppedShells == snail.countOfDroppedShells && Objects.equals(colorOfShell, snail.colorOfShell);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), colorOfShell, countOfDroppedShells);
    }
}
