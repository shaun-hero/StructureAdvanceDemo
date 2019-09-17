package com.company.jxp.designpattern;

/**
 * 车
 */
public class Car implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private String name;
    private CarWheel carWheel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarWheel getCarWheel() {
        return carWheel;
    }

    public void setCarWheel(CarWheel carWheel) {
        this.carWheel = carWheel;
    }


    public static class Builder {
        private Car car;

        public Builder(Car car) {
            this.car = car;
        }

        public Builder buildeName(String name) {
            car.name = name;
            return this;
        }

        public Car build() {
            return car;
        }
    }


    public static class CarWheel {
        private String wheelName;

        public String getWheelName() {
            return wheelName;
        }

        public void setWheelName(String wheelName) {
            this.wheelName = wheelName;
        }
    }

    public Car(String name, CarWheel carWheel) {
        this.name = name;
        this.carWheel = carWheel;
    }

    public Car() {
    }

    public String run() {
        return "跑起来了";
    }
}
