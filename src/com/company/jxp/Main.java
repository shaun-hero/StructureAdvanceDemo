package com.company.jxp;

import com.company.jxp.designpattern.Car;
import com.company.jxp.designpattern.CarFactory;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = CarFactory.getCarInstance();
        Car.CarWheel carWheel1 = new Car.CarWheel();
        carWheel1.setWheelName("小轮胎");
        car1.setCarWheel(carWheel1);
        car1.setName("小汽车1");
        car1.run();
        System.out.println(car1.getName() + " " + car1.getCarWheel().getWheelName() + " " + car1.run());
        Car car2 = (Car) CarFactory.getCarInstance().clone();
        Car.CarWheel carWheel2 = new Car.CarWheel();
        carWheel2.setWheelName("大轮胎");
        car2.setName("小汽车2");
        car2.setCarWheel(carWheel2);
        car2.run();
        System.out.println(car1.getName() + " " + car1.getCarWheel().getWheelName() + " " + car1.run());
    }
}
