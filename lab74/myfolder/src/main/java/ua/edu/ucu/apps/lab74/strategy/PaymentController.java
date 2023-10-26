package ua.edu.ucu.apps.lab74.strategy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @GetMapping("/credit_card")
    String getCreditCard(@RequestParam double price) {
        CreditCardPaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
        if (creditCardPaymentStrategy.pay(price)){
            return "Using Credit Card Payment";
        }
        return "Can not pay";
    }

    @GetMapping("/paypal")
    String getPayPal(@RequestParam double price) {
        PayPalPaymentStrategy payPalPaymentStrategy = new PayPalPaymentStrategy();
        if (payPalPaymentStrategy.pay(price)){
            return "Using Pay Pal Payment";
        }
        return "Can not pay";
    }

}
