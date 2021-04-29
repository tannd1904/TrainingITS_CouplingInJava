package com.example.demoTightCoupling;

public class DemoTightCoupling {
    public static void main(String[] args) {
        Machine machine = new Machine(1);

        ControllerRoom controllerRoom = new ControllerRoom(machine);
        controllerRoom.manageMachine();
    }
}
