package ua.edu.ucu.apps.lab74.flowers;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.lab74.delivery.Delivery;
import ua.edu.ucu.apps.lab74.strategy.Payment;

import java.util.ArrayList;

@Getter
@Setter
public class Order {
    private ArrayList<Item> items = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;

    public double calculateTotalPrice() {
        double totPrice = 0;
        for (Item item : items) {
            totPrice += item.getPrice();
        }
        return totPrice;
    }

    public void processOrder() {
        payment.pay(calculateTotalPrice());
        delivery.deliver(items);
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (this.items.get(i) == item) {
                this.items.remove(i);
                break;
            }
        }
    }

}
