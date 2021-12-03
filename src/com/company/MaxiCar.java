package com.company;

public class MaxiCar implements Car{
    @Override
    public void drive() {
        System.out.println("Большая машина едит");
    }

    @Override
    public void brake() {

        System.out.println("Большая машина остановилась");
    }

    @Override
    public void turn() {
        System.out.println("Большая машина изменила направление");
    }

    @Override
    public void openDoors() {
        System.out.println("Большая машина машина открыла двери");
    }
    public void changeColor() {
        System.out.println("Большая машина сменила цвет");
    }

}
