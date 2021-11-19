package com.kodilla.exception.homework;

public class OrderDoesntExistException extends NullPointerException
{

}
//    W pakiecie com.kodilla.exception.homework utwórz:
//
//        Klasę wyjątku OrderDoesntExistException, dziedziczącą z klasy Exception. ok
//        Klasę Order, posiadającą pole String number, oraz konstruktor i gettery. ok
//        Klasę Warehouse, która będzie przechowywała kolekcję zamówień.
//        Napisz metody addOrder(Order order) – dodającą zamówienie do kolekcji
//        oraz metodę Order getOrder(String number), która wyszuka w kolekcji zamówienie
//        o podanym numerze (użyj Stream) i je zwróci. W przypadku braku zamówienia
//        w kolekcji rzuć wyjątkiem stworzonym w kroku pierwszym.
//        Klasę WarehouseApp z metodą main. W metodzie main dodaj kilka zamówień
//        do hurtowni przy pomocy metody addOrder(), a następnie spróbuj wyszukać jakieś
//        nieistniejące zamówienie. Przygotuj odpowiednią obsługę błędów.
