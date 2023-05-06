package ru.turing.courses.lesson5.Imanov;

import java.util.Objects;

/**
 * ScarfPlayer - игрок в косынку
 *
 * @author itimur
 */

public class ScarfPlayer implements Comparable<ScarfPlayer> {
    private Long id;
    private int age;
    private int numberOfWins;


    public ScarfPlayer(int age, int numberOfWins, Long id){
        if (age < 50) {
            throw new IllegalArgumentException("wrong age for scarf player");
        }

        this.age = age;
        this.numberOfWins = numberOfWins;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "age: " + age + '\n' +
                "numberOfWins: " + numberOfWins + '\n'+
                "id: " + id + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScarfPlayer that = (ScarfPlayer) o;
        return age == that.age && numberOfWins == that.numberOfWins && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, numberOfWins);
    }

    @Override
    public int compareTo(ScarfPlayer o) {
        if (o == null) {
            return -1;
        }

        if (!Objects.equals(this.getId(), o.getId())){
            return (int) (this.getId() - o.getId());
        }

        if (this.getNumberOfWins() != o.getNumberOfWins()){
            return this.getNumberOfWins() - o.getNumberOfWins();
        }

        if (this.getAge() != o.getAge()){
            return this.getAge() - o.getAge();
        }

        return 0;
    }


}
