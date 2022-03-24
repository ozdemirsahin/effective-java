package com.example.staticfactory;

public class Car {

    public Car() {

    }

    public static Car getInstance(String type){
        if("BMW".equals(type))
            return new BMV();
        else if("Mercedes".equals(type))
            return new Mercedes();
        else
            return new Car();
    }
}
