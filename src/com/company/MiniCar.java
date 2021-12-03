package com.company;

public class MiniCar implements Car{
    @Override
    public void drive() {
        System.out.println("Маленькая машина едит");
    }

    @Override
    public void brake() {

        System.out.println("Маленькая машина остановилась");
    }

    @Override
    public void turn() {
        System.out.println("Маленькая машина изменила направление");
    }

    @Override
    public void openDoors() {
        System.out.println("Маленькая машина открыла двери");
    }
    public void changeMotor() {
        System.out.println("Маленькая машина сменила мотор");
    }

}
