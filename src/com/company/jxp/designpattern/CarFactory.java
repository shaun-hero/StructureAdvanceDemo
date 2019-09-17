package com.company.jxp.designpattern;

/**
 * 车工厂模式
 * 单例模式
 */
public class CarFactory {
    private static Car car;

    public static Car getCarInstance() {
        if (car == null) {
            car = new Car();
            car = new Car.Builder(car).buildeName("我是builder出来的").build();
        }
        return car;
    }
}
