package ru.turing.courses.lesson3.Yemelyanov;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vodka vodka = (Vodka) o;
        return itemId.equals(vodka.itemId) &&
                itemName.equals(vodka.itemName) &&
                Objects.equals(countryProducer, vodka.countryProducer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryProducer, itemId, itemName);
    }
}
