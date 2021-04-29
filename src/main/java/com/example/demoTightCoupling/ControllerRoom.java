package com.example.demoTightCoupling;

public class ControllerRoom {

    Machine machine;

    public ControllerRoom(Machine m) {
        this.machine = m;
    }

    public void manageMachine() {
        machine.start();
    }
}
