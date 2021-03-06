package com.java.designpatterns.strategy;

import org.junit.Test;

import java.math.BigDecimal;

public class StrategyTest {

    @Test
    public void test() {
        ShoppingCard shoppingCard = new ShoppingCard();
        shoppingCard.add(new Item("Hadi", 2, BigDecimal.valueOf(1800L)));

        PaymentStrategy paypalPaymentStrategy =
                new PaypalPayment("rahnemon2011@gmail.com", "123");
        shoppingCard.pay(paypalPaymentStrategy);

        PaymentStrategy creditCardPaymentStrategy =
                new CreditCardPayment("Hadi","382-382-486-239","123", "2020");
        shoppingCard.pay(creditCardPaymentStrategy);
    }
} 