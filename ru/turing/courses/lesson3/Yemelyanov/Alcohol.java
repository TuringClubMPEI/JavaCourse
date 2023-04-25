package ru.turing.courses.lesson3.Yemelyanov;

public abstract class Alcohol {
    protected String itemId;
    protected String itemName;

    Alcohol(String itemName) {
        this.itemName = itemName;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }
}
