package ru.turing.courses.lesson2.Gasin;

/**
 * Студент университета
 */
public class UniversityStudent implements Studying {
    /**
     * Количество литров пива в собственности
     */
    private int litersOfBeer;

    public UniversityStudent(int litersOfBeer) {
        this.litersOfBeer = litersOfBeer;
        if (this.litersOfBeer < 5) {
            this.litersOfBeer = 5;
        }
    }

    /**
     * Отметить экзамен
     */
    private void celebrateExam() {
        for (int i = 0; i < litersOfBeer; i++) {
            System.out.println("Это мой " + (i + 1) + " литр пива за сданную сессию");
        }

        System.out.println("Завтра повторим");
    }


    @Override
    public void study() {
        if (litersOfBeer == 0) {
            System.out.println("Ало мам скинь денег");
            litersOfBeer = 5;
        }

        // Произошло распитие
        litersOfBeer--;
    }

    @Override
    public void passExam(boolean passed) {
        if (passed) {
            celebrateExam();
        } else {
            if (litersOfBeer < 20) {
                litersOfBeer = 20;
            }
        }
    }
}
