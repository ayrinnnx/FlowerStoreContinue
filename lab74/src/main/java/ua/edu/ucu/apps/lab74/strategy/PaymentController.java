package ua.edu.ucu.apps.lab74.strategy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @GetMapping("/credit_card")
    String getCreditCard() {
        return "Using Credit Card Payment";
    }

    @GetMapping("/paypal")
    String getPayPal() {
        return "Using PayPal Payment";
    }

}
