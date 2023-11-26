package ru.turing.courses.lesson3.VersionA;

// Guest может быть любым животным
public interface Guest {
    void attend(Animal animal);
    void attend(Panda panda);
    void attend(Stork stork);
}
