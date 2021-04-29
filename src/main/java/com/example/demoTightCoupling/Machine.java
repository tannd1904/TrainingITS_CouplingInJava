package com.example.demoTightCoupling;

public class Machine {
    private int id;

    public Machine(int id) {
        this.id = id;
    }

    public void start() {
        System.out.println("Machine " + this.id + " Running");
    }
}
