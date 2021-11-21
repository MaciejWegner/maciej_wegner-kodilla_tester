package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class WarehouseTestSuite {

    @Test
    public void shouldAddOrder() {
//        given
        Warehouse warehouse = new Warehouse();
        Order order = new Order("1");
//        when
//        then
        warehouse.addOrder(order);
    }

    @Test
    public void shouldGetOrder() throws OrderDoesntExistException {
//        given
        Warehouse warehouse = new Warehouse();
        Order order = new Order("7");
//        when
        //        then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("88"));
    }
    @Test
    public void testGetNumber() {
        Order order = new Order("1");
        order.getNumber();
        System.out.println(order);
    }
}

