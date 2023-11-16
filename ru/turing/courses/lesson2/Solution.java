package ru.turing.courses.lesson2;

public class Solution {

  public static void main(String[] args) {
    Turtle turtle = new Turtle("turtle", 15, 5, false);
    Hare hare = new Hare("hare", 10, 4, true);
    hare.getDescription();
    turtle.getDescription();
  }
}
