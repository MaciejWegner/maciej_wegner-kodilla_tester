package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {


    private DeliveryService deliveryService;
    private NotificationService notificationService;

    public ShippingCenter(DeliveryService deliveryService, NotificationService notificationService){
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }


    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}

//    private DeliveryService deliveryService = new DeliveryService();
//    private NotificationService notificationService = new NotificationService();
//
//    public void sendPackage(String address, double weight) {
//        if (deliveryService.deliverPackage(address, weight)) {
//            notificationService.success(address);
//        } else {
//            notificationService.fail(address);
//        }
//    }
//}