package ua.edu.ucu.apps.lab74.flowers;

import lombok.Getter;

@Getter
public abstract class Item {
    private String description;
    public abstract double getPrice();
}
