package ru.turing.courses.lesson2;

public class Hare extends Animal {

  private boolean isQuick = true;

  public Hare(String name, int weight, int age, boolean isQuick) {
    super(name, weight, age, isQuick);
    this.isQuick = isQuick;
  }

  @Override
  public boolean isQuick() {
    return isQuick;
  }

  @Override
  public void setQuick(boolean quick) {
    isQuick = quick;
  }
}
