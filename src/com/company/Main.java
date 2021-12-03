package com.company;

public class Main {

    public static void main(String[] args) {
        Car[] cars = {new MiniCar(), new MaxiCar()};
        for (Car auto : cars) {
            System.out.println("----------------------");
            auto.drive();
            auto.turn();
            auto.brake();
            auto.openDoors();
            if (auto instanceof MiniCar miniCar) {
                miniCar.changeMotor();
            }
            if (auto instanceof MaxiCar maxiCar) {
                maxiCar.changeColor();
            }

        }

    }
}
