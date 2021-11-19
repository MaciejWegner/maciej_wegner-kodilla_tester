package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

public class OrderTest  {

    @Test
    public void testGetNumber() {
        Order order = new Order("1");
        order.getNumber();
    }
}