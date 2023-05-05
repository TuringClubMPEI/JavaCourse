package ru.turing.courses.lesson5.Imanov;

/**
 * ScarfPlayer - игрок в косынку
 *
 * @author itimur
 */

public class ScarfPlayer {
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
}
