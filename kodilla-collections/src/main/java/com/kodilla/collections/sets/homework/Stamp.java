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


//    Utw??rz w nim klas?? StampsApplication z metod?? main. B??dziemy w niej tworzyli kolekcj?? znaczk??w pocztowych. Je??eli jaki?? znaczek posiadamy w kilku egzemplarzach, to chcemy, aby w naszym obiekcie kolekcji wyst??pi?? tylko raz.
//        Utw??rz klas?? Stamp reprezentuj??c?? znaczek pocztowy. Klasa powinna mie?? pola na nazw?? oraz wymiary znaczka, a tak??e informacj?? o tym, czy znaczek jest ostemplowany czy nie.
//        Wewn??trz metody main stw??rz kolekcj?? znaczk??w (typu HashSet).
//        Sprawd??, czy do kolekcji nie da si?? doda?? kilka razy takiego samego znaczka.