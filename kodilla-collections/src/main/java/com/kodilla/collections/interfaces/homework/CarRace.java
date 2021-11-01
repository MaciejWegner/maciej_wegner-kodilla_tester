package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
Ford ford=new Ford();
Opel opel=new Opel();
Toyota toyota=new Toyota();
CarRace carRace=new CarRace();
        System.out.println(carRace.doRace(toyota));
        System.out.println(carRace.doRace(opel));
        System.out.println(carRace.doRace(ford));
    }
    public int doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        return car.getSpeed();
    }

}
