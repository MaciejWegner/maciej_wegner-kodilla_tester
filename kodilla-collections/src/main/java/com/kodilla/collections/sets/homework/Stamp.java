package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private int width;
    private int hight;
    private boolean stamped;

    public Stamp(String stampName, int width, int hight, boolean stamped) {
        this.stampName = stampName;
        this.width = width;
        this.hight = hight;
        this.stamped = stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return width == stamp.width &&
                hight == stamp.hight &&
                stamped == stamp.stamped &&
                Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, width, hight, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + stampName + '\'' +
                ", width=" + width +
                ", hight=" + hight +
                ", stamped=" + stamped +
                '}';
    }
}

//package com.kodilla.collections.sets;
//
//        import java.util.Objects;
//
//public class Order {
//    private String orderNumber;
//    private String productName;
//    private double quantity;
//
//    public Order(String orderNumber, String productName, double quantity) {
//        this.orderNumber = orderNumber;
//        this.productName = productName;
//        this.quantity = quantity;
//    }
//
//    public String getOrderNuber() {
//        return orderNumber;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public double getQuantity() {
//        return quantity;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if (o == null || getClass() != o.getClass())
//            return false;
//        com.kodilla.collections.sets.Order order = (com.kodilla.collections.sets.Order) o;
//        return Double.compare(order.quantity, quantity) == 0
//                && Objects.equals(orderNumber, order.orderNumber)
//                && Objects.equals(productName, order.productName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(orderNumber, productName, quantity);
//    }
//
//    @Override
//    public String toString(){
//        return "Order{" + "orderNumber='" + orderNumber + '\'' + ", productName='"
//                + productName + '\'' + ", quantity=" + quantity + '}';
//    }
//}


//    Utwórz w nim klasę StampsApplication z metodą main. Będziemy w niej tworzyli kolekcję znaczków pocztowych. Jeżeli jakiś znaczek posiadamy w kilku egzemplarzach, to chcemy, aby w naszym obiekcie kolekcji wystąpił tylko raz.
//        Utwórz klasę Stamp reprezentującą znaczek pocztowy. Klasa powinna mieć pola na nazwę oraz wymiary znaczka, a także informację o tym, czy znaczek jest ostemplowany czy nie.
//        Wewnątrz metody main stwórz kolekcję znaczków (typu HashSet).
//        Sprawdź, czy do kolekcji nie da się dodać kilka razy takiego samego znaczka.