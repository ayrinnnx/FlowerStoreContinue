package ua.edu.ucu.apps.lab74.delivery;

import ua.edu.ucu.apps.lab74.flowers.Item;

import java.util.List;

public interface Delivery {
    String deliver(List<Item> items);
}
