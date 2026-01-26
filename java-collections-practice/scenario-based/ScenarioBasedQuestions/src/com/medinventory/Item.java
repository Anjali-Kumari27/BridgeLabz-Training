package com.medinventory;

import java.util.Objects;

public class Item<T> {
    T type;           // Medicine, SurgicalTool etc.
    String itemID;
    String itemName;
    int quantity;
    String expiryDate;  // dd-MM-yyyy

    public Item(T type, String itemID, String itemName, int quantity, String expiryDate) {
        this.type = type;
        this.itemID = itemID;
        this.itemName = itemName;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item<?> item = (Item<?>) o;
        return Objects.equals(itemID, item.itemID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemID);
    }
}

