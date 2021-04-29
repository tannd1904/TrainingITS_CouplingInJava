package com.example.demoLooseCoupling;

public class ControlRoom {
    IMachine machine;

    public ControlRoom(IMachine machine) {
        this.machine = machine;
    }

    public void manageMachine() {
        this.machine.start();
    }
}
