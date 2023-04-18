package ru.turing.courses.lesson2.Yemelyanov;

public class MichailGorshenev extends Animal{

    private String name;
    private String gorshokClass;

    public MichailGorshenev(String name, String gorshokClass, int penisLength, String color){ //Конструктор с параметрами
        this.name = name;
        this.gorshokClass = gorshokClass;
        this.penisLength = penisLength;
        this.color = color;
    }

    @Override
    public void getSound(){
        System.out.println("Панки хой! Горшок живой!!");
    }

    @Override
    public void classifyAnimal(){
        System.out.println("Является человеком ");
    }
    public void setGorshokClass(String gorshokClass){
        this.gorshokClass = gorshokClass;
    }

    public String getGorshokClass() {
        return gorshokClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
     public void getPenisLength(){
        System.out.println("Длина дрына Горшка - " + penisLength + "см, но на самом деле он безграничен! Панки хой!");
    }
}
