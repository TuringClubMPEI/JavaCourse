package ru.turing.courses.lesson3.Yemelyanov;

public class Vodka extends Alcohol{
    private String countryProducer;

    public Vodka(String vodkaType, String itemName, String countryProducer){
        super(vodkaType, itemName);
        this.countryProducer = countryProducer;
    }

    public void setCountryProducer(String countryProducer) {
        this.countryProducer = countryProducer;
    }

    public String getCountryProducer() {
        return countryProducer;
    }
}
