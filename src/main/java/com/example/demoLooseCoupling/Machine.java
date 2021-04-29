package com.example.demoLooseCoupling;

public class Machine implements IMachine {
    private int id;

    public Machine(int id) {
        this.id = id;
    }

    @Override
    public void start() {
        System.out.println("Machine "+ this.id + " Running");
    }
}
