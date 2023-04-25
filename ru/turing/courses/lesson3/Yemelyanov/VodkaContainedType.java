package ru.turing.courses.lesson3.Yemelyanov;

public class VodkaContainedType extends Alcohol{

    public VodkaContainedType(String vodkaType, String itemName){
        super(itemName);
        this.itemId = vodkaType;
    }
}
