package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DeliveryService deliveryService = new MacDeliveryService();
        NotificationService notificationService = new MacNotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);

        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}


//    public static void main(String[] args) {
//        ShippingCenter shippingCenter = new ShippingCenter();
//        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
//    }
//}