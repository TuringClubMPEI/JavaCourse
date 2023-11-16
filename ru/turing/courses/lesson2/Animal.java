package ru.turing.courses.lesson2;

public abstract class Animal {
  public boolean isQuick;
  private String name;
  private int weight;
  private int age;

  public Animal(String name, int weight, int age, boolean isQuick) {
    this.name = name;
    this.weight = weight;
    this.age = age;
  }
  public void getDescription(){
    System.out.println("This animal is " + name + ", it's age is " + age + ". His weight is " + weight);
    if (isQuick = true){
      System.out.println("and " + name + " is very quick");
    }else{
      System.out.println("and " + name + " is very slow");
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }


  public abstract boolean isQuick();

  public abstract void setQuick(boolean quick);
}
