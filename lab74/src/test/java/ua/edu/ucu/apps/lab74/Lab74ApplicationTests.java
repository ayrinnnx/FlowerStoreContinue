package ua.edu.ucu.apps.lab74;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ua.edu.ucu.apps.lab74.flowers.Flower;
import ua.edu.ucu.apps.lab74.flowers.FlowerColor;
import ua.edu.ucu.apps.lab74.flowers.FlowerType;
import ua.edu.ucu.apps.lab74.flowers.Order;
import ua.edu.ucu.apps.lab74.strategy.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.lab74.strategy.PayPalPaymentStrategy;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Lab74ApplicationTests {

	@Test
	void testPayment() {
		Flower romashka = new Flower(1.0, 13.0, FlowerColor.BLUE, FlowerType.ROMASHKA);
		Flower cactus = new Flower(330.0, 0.0, FlowerColor.GREEN, FlowerType.CACTUS);

		CreditCardPaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
		PayPalPaymentStrategy payPalPaymentStrategy = new PayPalPaymentStrategy();
		Order order = new Order();
		order.addItem(cactus);

		assertTrue(creditCardPaymentStrategy.pay(order.calculateTotalPrice()));

		order.addItem(romashka);
		assertTrue(payPalPaymentStrategy.pay(order.calculateTotalPrice()));

	}

}
