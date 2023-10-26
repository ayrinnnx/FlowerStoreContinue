package ua.edu.ucu.apps.lab74.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import ua.edu.ucu.apps.lab74.flowers.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {

    @Override
    @GetMapping("/api/delivery/DHL")
    public String deliver(List<Item> items) {
        return "DHL Delivery";
    }
}
