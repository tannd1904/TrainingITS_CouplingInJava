package com.example.demoLooseCoupling;

public class DemoLooseCoupling {
    public static void main(String[] args) {
        IMachine machine = new Machine(1);

        ControlRoom cr = new ControlRoom(machine);
        cr.manageMachine();
    }
}
