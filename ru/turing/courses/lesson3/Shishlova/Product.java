package ru.turing.courses.lesson3.Shishlova;

public class Product extends NamedObject {
    private double price;

    public Product(String name, double price) {
        super(name);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name='" + this.getName() + "', price=" + price + "}";
    }
}