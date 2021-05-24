package com.sample.test.demo.constants;


public enum PizzaOrderFormLabels {
	PIZZA_ORDER_FORM("Pizza Order Form"),
    PIZZA_1("Pizza 1"),
    TOPPINGS_1("Toppings 1"),
    TOPPINGS_2("Toppings 2"),
    QUANTITY("Quantity"),
    COST("Cost"),
    PICKUP_INFORMATION("PICKUP INFORMATION"),
    NAME("Name*"),
    EMAIL("Email"),
    PHONE("Phone*"),
    PAYMENT_INFORMATION("PAYMENT INFORMATION"),
    CREDITDCARD("Credit Card"),
    CASHONPICKUP("Cash on Pickup"),
    PLACEORDER("Place Order"),
    RESET("Reset");

    private String displayName;

    private PizzaOrderFormLabels(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
