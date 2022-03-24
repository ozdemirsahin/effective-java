package com.example.staticfactory;

public class Test {
    public static void main(String[] args) {

        Boolean result =Boolean.valueOf("1");
        Car car=Car.getInstance("Mercedes");
        Car car1=Car.getInstance("Mercedes");

        System.out.println(car.hashCode());
        System.out.println(car1.hashCode());



    }
}
