package ru.turing.courses.lesson2;

import ru.turing.courses.lesson2.animals.Animal;
import ru.turing.courses.lesson2.animals.bird;
import ru.turing.courses.lesson2.animals.cat;

public class main {
        public static void main(String[] args) {
            Solution.Human chelick = new Solution.Human(20, "Daniil", true, "Russia", "Moscow", "Krasnokazarmennaya",
                    14, 0);
            System.out.println(chelick.months());
            chelick.adress();
            Animal catAnimal = new cat("cat",true,3,false,"none","sfinks");
            catAnimal.isDangerous();
            catAnimal.makeSound();
            Animal vorobeiAnimal = new bird("vorobei",false,1,true,true,"chirik-chirik");
            vorobeiAnimal.makeSound();



    }
}
