package ua.edu.ucu.apps.lab74.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {

    @GetMapping("/DHL")
    String getPayPal() {
        return "Using DHL Delivery";
    }

    @GetMapping("/post")
    String getCreditCard() {
        return "Using Post Delivery";
    }
}
