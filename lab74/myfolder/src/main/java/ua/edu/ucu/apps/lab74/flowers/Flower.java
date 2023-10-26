package ua.edu.ucu.apps.lab74.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class Flower extends Item{
    private double price;
    private double sepalLength;
    private FlowerColor color;
    private FlowerType flowerType;

    public Flower(Flower otherFlower) {
        this.price = otherFlower.price;
        this.sepalLength = otherFlower.sepalLength;
        this.color = otherFlower.color;
        this.flowerType = otherFlower.flowerType;
    }

    public String getColor() {
        return color.toString();
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
