package ru.turing.courses.lesson5;

import java.util.Comparator;
import java.util.Objects;

public class F1Car implements Comparable<F1Car> {
    private Long id;
    private String team;
    private int numberOfWins;

    public F1Car(Long id, String team, int numberOfWins) {
        this.id = id;
        this.team = team;
        this.numberOfWins = numberOfWins;
    }

    public Long getId() {
        return id;
    }

    public String getTeam() {
        return team;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        F1Car f1Car = (F1Car) o;
        return numberOfWins == f1Car.numberOfWins && Objects.equals(id, f1Car.id) && Objects.equals(team, f1Car.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, team, numberOfWins);
    }

    @Override
    public String toString() {
        return "F1Car{" +
                "id=" + id +
                ", team='" + team + '\'' +
                ", numberOfWins=" + numberOfWins +
                '}';
    }

    @Override
    public int compareTo(F1Car o) {
        return Comparator.comparing(F1Car::getId)
                .thenComparing(F1Car::getNumberOfWins)
                .compare(this, o);
    }

}
