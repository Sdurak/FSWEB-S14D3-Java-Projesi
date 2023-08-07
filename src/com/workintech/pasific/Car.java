package com.workintech.pasific;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
//        this.engine= true;  //bunları set ile yazabiliriz
//        this.wheels= 4;
        setEngine(true);
        setWheels(4);
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public String startEngine(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "the car is braking";
    }

    //toString
//    @Override
//    public String toString() {
//        return "Car{" +
//                "engine=" + engine +
//                ", cylinders=" + cylinders +
//                ", name='" + name + '\'' +
//                ", wheels=" + wheels +
//                '}';
//    }

//    toString 2.yol
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name + "\n");
        builder.append("Cylinders: " + cylinders + "\n");
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) { //this bu sınıfın objesi
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;  //getclassla o classın sınıfı aynı değilse false dön
        return ((Car) o).cylinders == this.cylinders && ((Car) o).name.equals(this.name);
//        Car car = (Car) o;
//        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        return ((Car) o).cylinders == this.cylinders && ((Car) o).name.equals(this.name);
////      Car car = (Car) o; burası return kodu ile aynı.
////      return cylinders == car.cylinders && name.equals(car.name);
//    }

}
